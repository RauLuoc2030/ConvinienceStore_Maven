

//import DTO.KhachHangDTO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import DAO_Hibernate.HibernateUtil;
import DTO.KhachHangDTO;

//import DTO.KhachHangDTO;
public class TestHibernate {

    public static void main(String[] args) {
        // Tạo đối tượng
        DTO.KhachHangDTO kh = new DTO.KhachHangDTO();
        // kh.setSDTKHString("09876543");
        // kh.settenKHString("Loc");

        // Tạo SessionFactory
        SessionFactory factory = HibernateUtil.getSessionFactory();

        /*
         * Tạo Session và bắt đầu Transaction mới
         * Trong Hibernate, khi thực hiện một thao tác chèn dữ liệu thì bắt buộc phải mở
         * Transaction
         */
        Session session = factory.openSession();
        kh = session.get(KhachHangDTO.class, "09876543");
        System.out.println(kh.toString());
        // session.getTransaction().begin();

        // Lưu đối tượng vào database
        // session.persist(kh);
        // Xóa toàn bộ dữ liệu trong bảng
        // session.createQuery("DELETE FROM KhachHangDTO").executeUpdate();
        // Kết thúc Transaction và đóng Session
        // session.getTransaction().commit();
        session.close();
    }
    // public static void main(String[] args) {
    //
    //
    //
    // // Tạo SessionFactory
    // SessionFactory factory = HibernateUtil.getFactory();
    //
    // // Tạo Session và bắt đầu Transaction mới
    // Session session = factory.openSession();
    // Transaction transaction = session.beginTransaction();
    //
    // // Lưu đối tượng vào database
    // session.save(kh);
    //
    // // Kết thúc Transaction và đóng Session
    // transaction.commit();
    // session.close();
    // }
}
