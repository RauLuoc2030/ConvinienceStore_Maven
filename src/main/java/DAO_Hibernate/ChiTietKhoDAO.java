package DAO_Hibernate;

import org.hibernate.Session;
import org.hibernate.query.Query;

import DTO.ChiTietKhoDTO;

import java.util.List;

public class ChiTietKhoDAO {
    Session session;

    public List<String> getSanPhamListByMaLoHang(String maLoHang) {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        // Tạo câu truy vấn để lấy danh sách sản phẩm trong lô hàng
        String hql = "SELECT ck.maSP FROM ChiTietKhoDTO ck WHERE ck.maLoHang = :maLoHang";
        Query<String> query = session.createQuery(hql, String.class);
        query.setParameter("maLoHang", maLoHang);

        // Thực hiện truy vấn và lấy danh sách sản phẩm
        List<String> sanPhamList = query.getResultList();

        session.getTransaction().commit();

        return sanPhamList;
    }

    // Các phương thức khác của ChiTietKhoDAO...
    /**
     * Thêm một Chi tiết kho mới đã có thông tin vào CSDL
     * 
     * @param chiTietKhoDTO
     * @return True nếu thành công
     * @throws Exception và rollback Transaction
     */
    public boolean them_optimized(ChiTietKhoDTO chiTietKhoDTO) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(chiTietKhoDTO);
            session.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
