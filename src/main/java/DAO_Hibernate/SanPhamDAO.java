package DAO_Hibernate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.internal.SessionImpl;
import org.hibernate.procedure.NamedParametersNotSupportedException;
import org.hibernate.procedure.ProcedureCall;
import org.hibernate.query.Query;
import org.hibernate.result.ResultSetOutput.*;
import org.hibernate.result.*;

import org.hibernate.result.*;

import DTO.SanPhamDTO;
import oracle.jdbc.OracleTypes;
import oracle.jdbc.oracore.OracleType;

public class SanPhamDAO {
    Session session;

    /**
     * Lấy thông tin từ Database
     * 
     * @param condition
     * @param orderBy
     * @return Danh sách Sản phẩm
     */
    public List<SanPhamDTO> readDB(String condition, String orderBy) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<SanPhamDTO> sanPhamDTOs = null;

        try {
            String queryString = "from SanPhamDTO";

            if (condition != null && !condition.isEmpty()) {
                queryString += " where " + condition;
            }

            if (orderBy != null && !orderBy.isEmpty()) {
                queryString += " order by " + orderBy;
            }

            Query<SanPhamDTO> query = session.createQuery(queryString, SanPhamDTO.class);
            sanPhamDTOs = query.list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return sanPhamDTOs;
    }

    /**
     * Override lại phương thức readDB() cho TH truyền vào một tham số Condition
     * 
     * @param condition
     * @return readDB(condition, null)
     */
    public List<SanPhamDTO> readDB(String condition) {
        return readDB(condition, null);
    }

    /**
     * Override lại phương thức readDB() cho TH không truyền vào tham số
     * 
     * @return readDB(null, null)
     */
    public List<SanPhamDTO> readDB() {
        return readDB(null, null);
    }

    /**
     * Thêm một Sản phẩm mới đã có thông tin vào CSDL
     * 
     * @param sanpham
     * @return True nếu thành công
     * @throws Exception và rollback Transaction
     */
    public boolean them(SanPhamDTO sanpham) {
        boolean result = false;
        session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();

            SanPhamDTO newSanPham = new SanPhamDTO();
            newSanPham.setMaSPString(sanpham.getMaSPString());
            newSanPham.setTenSPString(sanpham.getTenSPString());
            newSanPham.setGiaInt(sanpham.getGiaInt());
            newSanPham.setSoLuongSPInt(sanpham.getSoLuongSPInt());
            newSanPham.setPhanLoaiString(sanpham.getPhanLoaiString());
            newSanPham.setNSXDate(sanpham.getNSXDate());
            newSanPham.setHSDDate(sanpham.getHSDDate());
            newSanPham.setMoTaString(sanpham.getMoTaString());
            newSanPham.setThongTinChiTietString(sanpham.getThongTinChiTietString());
            newSanPham.setGiaGiamInt(sanpham.getGiaGiamInt());

            session.save(newSanPham);
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
     * Thêm một Sản phẩm mới đã có thông tin vào CSDL
     * 
     * @param sanpham
     * @return True nếu thành công
     * @throws Exception và rollback Transaction
     */
    public boolean them_optimized(SanPhamDTO sanpham) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(sanpham);
            session.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    /**
     * Xóa một Sản phẩm khỏi CSDL
     * 
     * @param sanpham
     * @return True nếu thành công
     * @throws Exception và rollback Transaction
     */
    public boolean xoa(SanPhamDTO sanpham) {
        boolean result = false;
        session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            session.delete(sanpham); // xóa đối tượng SanPhamDTO khỏi database

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
     * Sửa một Sản phẩm có trong CSDL
     * 
     * @param sanpham
     * @return
     * @throws Exception
     */
    public boolean sua(SanPhamDTO sanpham) {
        boolean result = false;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            session.update(sanpham); // sửa thông tin đối tượng SanPhamDTO trong database

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

    public SanPhamDTO tim(String keyword) {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Query<SanPhamDTO> query = session
                .createQuery("FROM SanPhamDTO WHERE MaSP = :keyword OR TenSP LIKE :searchKeyword", SanPhamDTO.class);
        query.setParameter("keyword", keyword);
        query.setParameter("searchKeyword", "%" + keyword + "%");

        SanPhamDTO sanPham = query.uniqueResult();

        session.getTransaction().commit();
        session.close();
        return sanPham;
    }

    public List<SanPhamDTO> Top10Results(LocalDate frDate, LocalDate endDate) {
        session = null;
        Transaction tx = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();

            ProcedureCall procedureCall = session.createStoredProcedureCall("TOP10SP_BANCHAY");

            // Đăng ký và thiết lập giá trị cho các tham số đầu vào
            procedureCall.registerParameter("FR_DATE", Date.class, ParameterMode.IN)
                    .bindValue(java.sql.Date.valueOf(frDate));
            procedureCall.registerParameter("END_DATE", Date.class, ParameterMode.IN)
                    .bindValue(java.sql.Date.valueOf(endDate));

            // Đăng ký tham số đầu ra
            procedureCall.registerParameter("TOP10", Class.forName("OracleTypes.CURSOR"),
                    ParameterMode.OUT);
                    
            // // Đăng ký tham số đầu ra
            // procedureCall.registerParameter("TOP10", Class.forName("oracle.jdbc.OracleTypes$REF_CURSOR"),
            //         ParameterMode.OUT);

            // Thực hiện stored procedure
            procedureCall.execute();

            // Lấy kết quả từ tham số đầu ra
            List<SanPhamDTO> sanPhamList = new ArrayList<>();
            ResultSetOutput resultSetOutput = (ResultSetOutput) procedureCall.getOutputs().getCurrent();
            sanPhamList = resultSetOutput.getResultList(); // .unwrap(ResultSet.class);
            // while (resultSet.next()) {
            // SanPhamDTO dto = new SanPhamDTO();
            // // Set values of DTO properties based on result set columns
            // sanPhamList.add(dto);
            // }

            tx.commit();
            return sanPhamList;
        } catch (/* SQLException | */ ClassNotFoundException e) {
            if (tx != null) {
                tx.rollback();
            }
            throw new RuntimeException("Error executing stored procedure", e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

}

// getResultSet()
// getNextResultSet()
// unwarp(ResultSet.class)
