package DAO_Hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import DTO.MucLuongDTO;

public class MucLuongDAO {
    Session session;

    /**
     * Lấy thông tin từ Database
     * 
     * @param condition
     * @param orderBy
     * @return Danh sách Mức lương
     */
    public List<MucLuongDTO> readDB(String condition, String orderBy) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<MucLuongDTO> mucLuongDTOs = null;

        try {
            String queryString = "from MucLuongDTO";

            if (condition != null && !condition.isEmpty()) {
                queryString += " where " + condition;
            }

            if (orderBy != null && !orderBy.isEmpty()) {
                queryString += " order by " + orderBy;
            }

            Query<MucLuongDTO> query = session.createQuery(queryString, MucLuongDTO.class);
            mucLuongDTOs = query.list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return mucLuongDTOs;
    }

    /**
     * Override lại phương thức readDB() cho TH truyền vào một tham số Condition
     * 
     * @param condition
     * @return readDB(condition, null)
     */
    public List<MucLuongDTO> readDB(String condition) {
        return readDB(condition, null);
    }

    /**
     * Override lại phương thức readDB() cho TH không truyền vào tham số
     * 
     * @return readDB(null, null)
     */
    public List<MucLuongDTO> readDB() {
        return readDB(null, null);
    }

    /**
     * Thêm một Mức lương mới đã có thông tin vào CSDL
     * 
     * @param MucLuongDTO
     * @return True nếu thành công
     * @throws Exception và rollback Transaction
     */
    public boolean them(MucLuongDTO mucLuongDTO) throws Exception {
        boolean result = false;
        session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();

            MucLuongDTO newKhachHang = new MucLuongDTO();

            newKhachHang.setMaMLString(mucLuongDTO.getMaMLString());
            newKhachHang.setLuongInt(mucLuongDTO.getLuongInt());

            session.save(newKhachHang);
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
     * Xóa một Mức lương khỏi CSDL
     * 
     * @param mucLuongDTO
     * @return True nếu thành công
     * @throws Exception và rollback Transaction
     */
    public boolean xoa(MucLuongDTO mucLuongDTO) throws Exception {
        boolean result = false;
        session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            session.delete(mucLuongDTO); // xóa đối tượng MucLuongDTO khỏi database

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
     * Sửa một Mức lương có trong CSDL
     * 
     * @param mucLuongDTO
     * @return
     * @throws Exception
     */
    public boolean sua(MucLuongDTO mucLuongDTO) throws Exception {
        boolean result = false;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            session.update(mucLuongDTO); // sửa thông tin đối tượng MucLuongDTO trong database

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

    public MucLuongDTO tim(String keyword) {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Query<MucLuongDTO> query = session
                .createQuery("FROM MucLuongDTO WHERE MaML = :keyword OR Luong LIKE :searchKeyword", MucLuongDTO.class);
        query.setParameter("keyword", keyword);
        query.setParameter("searchKeyword", "%" + keyword + "%");

        MucLuongDTO sanPham = query.uniqueResult();

        session.getTransaction().commit();
        return sanPham;
    }
}
