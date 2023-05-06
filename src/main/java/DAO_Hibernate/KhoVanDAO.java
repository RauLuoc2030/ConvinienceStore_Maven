package DAO_Hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import DTO.KhoVanDTO;

public class KhoVanDAO {
    Session session;

    /**
     * Lấy thông tin từ Database
     * 
     * @param condition
     * @param orderBy
     * @return Danh sách Lô hàng
     */
    public List<KhoVanDTO> readDB(String condition, String orderBy) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<KhoVanDTO> khoVanDTOs = null;

        try {
            String queryString = "from KhoVanDTO";

            if (condition != null && !condition.isEmpty()) {
                queryString += " where " + condition;
            }

            if (orderBy != null && !orderBy.isEmpty()) {
                queryString += " order by " + orderBy;
            }

            Query<KhoVanDTO> query = session.createQuery(queryString, KhoVanDTO.class);
            khoVanDTOs = query.list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return khoVanDTOs;
    }

    /**
     * Override lại phương thức readDB() cho TH truyền vào một tham số Condition
     * 
     * @param condition
     * @return readDB(condition, null)
     */
    public List<KhoVanDTO> readDB(String condition) {
        return readDB(condition, null);
    }

    /**
     * Override lại phương thức readDB() cho TH không truyền vào tham số
     * 
     * @return readDB(null, null)
     */
    public List<KhoVanDTO> readDB() {
        return readDB(null, null);
    }

    /**
     * Thêm một Lô hàng mới đã có thông tin vào CSDL
     * 
     * @param khoVanDTO
     * @return True nếu thành công
     */
    public boolean them(KhoVanDTO khoVanDTO) {
        boolean result = false;
        session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();

            KhoVanDTO newKhoVan = new KhoVanDTO();
            newKhoVan.setMaLoHangString(khoVanDTO.getMaLoHangString());
            newKhoVan.setNgayNhapDate(khoVanDTO.getNgayNhapDate());
            newKhoVan.setNgayXuatDate(khoVanDTO.getNgayXuatDate());
            newKhoVan.setTenCHXuatKhoString(khoVanDTO.getTenCHXuatKhoString());

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
     * @param khoVanDTO
     * @return True nếu thành công
     * @throws Exception và rollback Transaction
     */
    public boolean xoa(KhoVanDTO khoVanDTO) {
        boolean result = false;
        session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            session.delete(khoVanDTO); // xóa đối tượng KhoVanDTO khỏi database

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
     * @param khoVanDTO
     * @return
     * @throws Exception
     */
    public boolean sua(KhoVanDTO khoVanDTO) {
        boolean result = false;
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            session.update(khoVanDTO); // sửa thông tin đối tượng KhoVanDTO trong database

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
