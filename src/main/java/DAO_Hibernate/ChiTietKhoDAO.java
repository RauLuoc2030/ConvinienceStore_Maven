package DAO_Hibernate;

import org.hibernate.Session;
import org.hibernate.procedure.ProcedureCall;
import org.hibernate.query.Query;

import DTO.ChiTietKhoDTO;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.ParameterMode;

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

    public void insertLoHang(ChiTietKhoDTO chiTietKhoDTO) throws SQLException{
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        ProcedureCall procedureCall = session.createStoredProcedureCall("THEM_CHITIETKHO");

        // Đăng ký các tham số và thiết lập giá trị
        procedureCall.registerParameter("MALH1", String.class, ParameterMode.IN).bindValue(chiTietKhoDTO.getMaLoHang());
        procedureCall.registerParameter("MASP1", String.class, ParameterMode.IN).bindValue(chiTietKhoDTO.getMaSP());
        procedureCall.registerParameter("SOLUONG", Integer.class, ParameterMode.IN).bindValue(chiTietKhoDTO.getSoLuong());

        // Thực hiện stored procedure
        // ProcedureOutputs procedureOutputs = procedureCall.getOutputs();
        // ResultSetOutput resultSetOutput = (ResultSetOutput)
        // procedureOutputs.getCurrent();
        procedureCall.execute();

        session.getTransaction().commit();
    }
}
