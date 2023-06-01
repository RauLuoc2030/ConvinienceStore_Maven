package DAO_Hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

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
}
