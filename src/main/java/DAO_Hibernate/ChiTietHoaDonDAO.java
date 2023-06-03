package DAO_Hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import DTO.ChiTietHoaDonDTO;

public class ChiTietHoaDonDAO {
    Session session;

    public List<String> getSanPhamListByMaHoaDon(String maHoaDon) {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        // Tạo câu truy vấn để lấy danh sách sản phẩm trong lô hàng
        String hql = "SELECT ch.maSP FROM ChiTietHoaDonDTO ch WHERE ch.maHoaDon = :maHoaDon";
        Query<String> query = session.createQuery(hql, String.class);
        query.setParameter("maHoaDon", maHoaDon);

        // Thực hiện truy vấn và lấy danh sách sản phẩm
        List<String> sanPhamList = query.getResultList();

        session.getTransaction().commit();

        return sanPhamList;
    }

    /**
     * Thêm một Chi tiết hóa đơn mới đã có thông tin vào CSDL
     * 
     * @param chiTietHoaDonDTO
     * @return True nếu thành công
     * @throws Exception và rollback Transaction
     */
    public boolean them_optimized(ChiTietHoaDonDTO chiTietHoaDonDTO) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(chiTietHoaDonDTO);
            session.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
