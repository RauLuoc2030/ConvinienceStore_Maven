package DAO_Hibernate;

import org.hibernate.Session;
import org.hibernate.query.Query;



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
}

