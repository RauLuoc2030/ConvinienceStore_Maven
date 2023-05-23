package DAO_Hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import DTO.KhoDTO;

public class KhoDAO {
    Session session;

    /**
     * Lấy thông tin từ Database
     * 
     * @param condition
     * @param orderBy
     * @return Danh sách Lô hàng
     */
    public List<KhoDTO> readDB(String condition, String orderBy) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<KhoDTO> khoDTOs = null;

        try {
            String queryString = "from KhoDTO";

            if (condition != null && !condition.isEmpty()) {
                queryString += " where " + condition;
            }

            if (orderBy != null && !orderBy.isEmpty()) {
                queryString += " order by " + orderBy;
            }

            Query<KhoDTO> query = session.createQuery(queryString, KhoDTO.class);
            khoDTOs = query.list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return khoDTOs;
    }

    /**
     * Override lại phương thức readDB() cho TH truyền vào một tham số Condition
     * 
     * @param condition
     * @return readDB(condition, null)
     */
    public List<KhoDTO> readDB(String condition) {
        return readDB(condition, null);
    }

    /**
     * Override lại phương thức readDB() cho TH không truyền vào tham số
     * 
     * @return readDB(null, null)
     */
    public List<KhoDTO> readDB() {
        return readDB(null, null);
    }

    /**
     * Thêm một Lô hàng mới đã có thông tin vào CSDL
     * 
     * @param khoDTO
     * @return True nếu thành công
     */
    public boolean them(KhoDTO khoDTO) {
        boolean result = false;
        session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();

            KhoDTO newKhoVan = new KhoDTO();
            newKhoVan.setMaLoHangString(khoDTO.getMaLoHangString());
            newKhoVan.setNgayNhapDate(khoDTO.getNgayNhapDate());
            // newKhoVan.setNgayXuatDate(khoDTO.getNgayXuatDate());
            // newKhoVan.setTenCHXuatKhoString(khoDTO.getTenCHXuatKhoString());

            session.save(newKhoVan);
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
     * Xóa một Lô hàng khỏi CSDL
     * 
     * @param khoDTO
     * @return True nếu thành công
     * @throws Exception và rollback Transaction
     */
    public boolean xoa(KhoDTO khoDTO) {
        boolean result = false;
        session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            session.delete(khoDTO); // xóa đối tượng KhoDTO khỏi database

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
     * @param khoDTO
     * @return
     * @throws Exception
     */
    public boolean sua(KhoDTO khoDTO) {
        boolean result = false;
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            session.update(khoDTO); // sửa thông tin đối tượng KhoDTO trong database

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

    public KhoDTO tim(String keyword) {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Query<KhoDTO> query = session.createQuery("FROM KhoDTO WHERE MaLoHang = :keyword LIKE :searchKeyword",
                KhoDTO.class);
        query.setParameter("keyword", keyword);
        query.setParameter("searchKeyword", "%" + keyword + "%");

        KhoDTO sanPham = query.uniqueResult();

        session.getTransaction().commit();
        return sanPham;
    }
}
