package DAO_Hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import DTO.HoaDonDTO;

public class HoaDonDAO {

    Session session;

    /**
     * Lấy thông tin từ Database
     * 
     * @param condition
     * @param orderBy
     * @return Danh sách Hóa đơn
     */
    public List<HoaDonDTO> readDB(String condition, String orderBy) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<HoaDonDTO> hoaDonDTOs = null;

        try {
            String queryString = "from HoaDonDTO";

            if (condition != null && !condition.isEmpty()) {
                queryString += " where " + condition;
            }

            if (orderBy != null && !orderBy.isEmpty()) {
                queryString += " order by " + orderBy;
            }

            Query<HoaDonDTO> query = session.createQuery(queryString, HoaDonDTO.class);
            hoaDonDTOs = query.list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return hoaDonDTOs;
    }

    /**
     * Override lại phương thức readDB() cho TH truyền vào một tham số Condition
     * 
     * @param condition
     * @return readDB(condition, null)
     */
    public List<HoaDonDTO> readDB(String condition) {
        return readDB(condition, null);
    }

    /**
     * Override lại phương thức readDB() cho TH không truyền vào tham số
     * 
     * @return readDB(null, null)
     */
    public List<HoaDonDTO> readDB() {
        return readDB(null, null);
    }

    /**
     * Thêm một Hóa đơn mới đã có thông tin vào CSDL
     * 
     * @param hoaDonDTO
     * @return True nếu thành công
     */
    public boolean them(HoaDonDTO hoaDonDTO) {
        boolean result = false;
        session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();

            HoaDonDTO newHoaDon = new HoaDonDTO();
            newHoaDon.setMaHDString(hoaDonDTO.getMaHDString());
            newHoaDon.setNgayMuaHangHDDate(hoaDonDTO.getNgayMuaHangHDDate());
            newHoaDon.setMaNVString(hoaDonDTO.getMaNVString());
            newHoaDon.setSDTKHString(hoaDonDTO.getSDTKHString());
            newHoaDon.setHinhThucThanhToanHDString(hoaDonDTO.getHinhThucThanhToanHDString());

            session.save(newHoaDon);
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
     * Xóa một Hóa đơn khỏi CSDL
     * 
     * @param hoaDonDTO
     * @return True nếu thành công
     * @throws Exception và rollback Transaction
     */
    public boolean xoa(HoaDonDTO hoaDonDTO) {
        boolean result = false;
        session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            session.delete(hoaDonDTO); // xóa đối tượng HoaDonDTO khỏi database

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
     * Sửa một Hóa đơn có trong CSDL
     * 
     * @param khoVanDTO
     * @return
     * @throws Exception
     */
    public boolean sua(HoaDonDTO hoaDonDTO) {
        boolean result = false;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            session.update(hoaDonDTO); // sửa thông tin đối tượng HoaDonDTO trong database

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

}