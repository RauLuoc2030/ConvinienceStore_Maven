package DAO_Hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import DTO.NhanVienDTO;

public class NhanVienDAO {
    Session session;

    /**
     * Lấy thông tin từ Database
     * 
     * @param condition
     * @param orderBy
     * @return Danh sách Nhân viên
     */
    public List<NhanVienDTO> readDB(String condition, String orderBy) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<NhanVienDTO> nhanVienDTOs = null;

        try {
            String queryString = "from NhanVienDAO";

            if (condition != null && !condition.isEmpty()) {
                queryString += " where " + condition;
            }

            if (orderBy != null && !orderBy.isEmpty()) {
                queryString += " order by " + orderBy;
            }

            Query<NhanVienDTO> query = session.createQuery(queryString, NhanVienDTO.class);
            nhanVienDTOs = query.list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return nhanVienDTOs;
    }

    /**
     * Override lại phương thức readDB() cho TH truyền vào một tham số Condition
     * 
     * @param condition
     * @return readDB(condition, null)
     */
    public List<NhanVienDTO> readDB(String condition) {
        return readDB(condition, null);
    }

    /**
     * Override lại phương thức readDB() cho TH không truyền vào tham số
     * 
     * @return readDB(null, null)
     */
    public List<NhanVienDTO> readDB() {
        return readDB(null, null);
    }

    /**
     * Thêm một Nhân viên mới đã có thông tin vào CSDL
     * 
     * @param nhanVienDTO
     * @return True nếu thành công
     */
    public boolean them(NhanVienDTO nhanVienDTO) {
        boolean result = false;
        session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();

            NhanVienDTO newNhanVien = new NhanVienDTO();

            newNhanVien.setMaNVString(nhanVienDTO.getMaNVString());
            newNhanVien.setHoTenNVString(nhanVienDTO.getHoTenNVString());
            newNhanVien.setHoTenNVString(nhanVienDTO.getHoTenNVString());
            newNhanVien.setSDTNVString(nhanVienDTO.getSDTNVString());
            newNhanVien.setCCCDNVString(nhanVienDTO.getCCCDNVString());
            newNhanVien.setDiaChiNVString(nhanVienDTO.getDiaChiNVString());
            newNhanVien.setChucVuNVString(nhanVienDTO.getChucVuNVString());
            newNhanVien.setNgaySinhNVDate(nhanVienDTO.getNgaySinhNVDate());
            newNhanVien.setLuongNVInt(nhanVienDTO.getLuongNVInt());

            session.save(newNhanVien);
            session.getTransaction().commit();
            result = true;

        } catch (Exception ex) {
            if (session != null) {
                session.getTransaction().rollback();
            }
            ex.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return result;
    }

    /**
     * Xóa một Nhân viên khỏi CSDL
     * 
     * @param nhanVienDTO
     * @return True nếu thành công
     * @throws Exception và rollback Transaction
     */
    public boolean xoa(NhanVienDTO nhanVienDTO) {
        boolean result = false;
        session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            session.delete(nhanVienDTO); // xóa đối tượng NhanVienDTO khỏi database

            transaction.commit(); // commit transaction
            result = true;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback(); // rollback transaction nếu có lỗi xảy ra
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return result;
    }

    /**
     * Sửa một Nhân viên có trong CSDL
     * 
     * @param nhanVienDTO
     * @return
     * @throws Exception
     */
    public boolean sua(NhanVienDTO nhanVienDTO) {
        boolean result = false;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            session.update(nhanVienDTO); // sửa thông tin đối tượng NhanVienDTO trong database

            transaction.commit(); // commit transaction
            result = true;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback(); // rollback transaction nếu có lỗi xảy ra
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return result;
    }

    public NhanVienDTO tim(String keyword) {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Query<NhanVienDTO> query = session
                .createQuery("FROM NhanVienDTO WHERE MaNV = :keyword OR TenNV LIKE :searchKeyword", NhanVienDTO.class);
        query.setParameter("keyword", keyword);
        query.setParameter("searchKeyword", "%" + keyword + "%");

        NhanVienDTO sanPham = query.uniqueResult();

        session.getTransaction().commit();
        return sanPham;
    }
}
