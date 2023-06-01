package DTO;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.*;

// Kỹ thuật sử dụng Annotation để cấu hình Hibernate
// @Entity để xác định đây là một Persistent class
// @Table Thể hiện mapping giữa các Table
// name thể hiện tên của bảng ở dưới CSDL
// -> Chỉ định lớp SanPhamDTO chính là lớp đại diện cho bảng SANPHAM trong CSDL
@Entity
@Table(name = "SANPHAM")
public class SanPhamDTO implements Serializable {
    @Id // @Id dùng để xác định thuộc tính nào là khóa chính dưới CSDL
    // @GeneratedValue(strategy = GenerationType.IDENTITY) // Tự động tạo khóa chính
    @Column(name = "MASP") // Tên trường dưới CSDL
    private String maSPString;

    @Column(name = "TENSP")
    private String tenSPString;

    @Column(name = "GIASP")
    private Integer giaInt;

    @Column(name = "SOLUONG")
    private Integer soLuongSPInt;

    @Column(name = "PHANLOAI")
    private String phanLoaiString;

    @Column(name = "NSX")
    private Date NSXDate;

    @Column(name = "HSD")
    private Date HSDDate;

    @Column(name = "MOTA")
    private String moTaString;

    @Column(name = "GIAGIAM")
    private Integer giaGiamInt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaLoHang")
    private KhoDTO kho;
    /**
     * Constructor
     */
    public SanPhamDTO() {
    }

    /**
     * @param maSPString            Lưu thông tin mã sản phẩm
     * @param tenSPString
     * @param giaInt
     * @param soLuongSPInt
     * @param phanLoaiString
     * @param nSXDate
     * @param hSDDate
     * @param moTaString
     * @param thongTinChiTietString
     * @param giaGiamInt
     */
    public SanPhamDTO(String maSPString, String tenSPString, int giaInt, int soLuongSPInt,
            String phanLoaiString, String nSXDate, String hSDDate, String moTaString, int giaGiamInt) {
        this.maSPString = maSPString;
        this.tenSPString = tenSPString;
        this.phanLoaiString = phanLoaiString;
        this.moTaString = moTaString;
        this.giaInt = giaInt;
        this.giaGiamInt = giaGiamInt;
        this.giaGiamInt = giaGiamInt;
        this.soLuongSPInt = soLuongSPInt;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        try {
            this.NSXDate = formatter.parse(nSXDate);
        } catch (ParseException e) {
            System.out.println("Cannot convert String to Date");
        }

        try {
            this.HSDDate = formatter.parse(hSDDate);
        } catch (ParseException e) {
            System.out.println("Cannot convert String to Date");
        }
    }

    /**
     * @return the soLuongSPInt
     */
    public Integer getSoLuongSPInt() {
        return soLuongSPInt;
    }

    /**
     * @param soLuongSPInt the soLuongSPInt to set
     */
    public void setSoLuongSPInt(Integer soLuongSPInt) {
        this.soLuongSPInt = soLuongSPInt;
    }

    /**
     * @return the maSPString
     */
    public String getMaSPString() {
        return maSPString;
    }

    /**
     * @param maSPString the maSPString to set
     */
    public void setMaSPString(String maSPString) {
        this.maSPString = maSPString;
    }

    /**
     * @return the tenSPString
     */
    public String getTenSPString() {
        return tenSPString;
    }

    /**
     * @param tenSPString the tenSPString to set
     */
    public void setTenSPString(String tenSPString) {
        this.tenSPString = tenSPString;
    }

    /**
     * @return the phanLoaiString
     */
    public String getPhanLoaiString() {
        return phanLoaiString;
    }

    /**
     * @param phanLoaiString the phanLoaiString to set
     */
    public void setPhanLoaiString(String phanLoaiString) {
        this.phanLoaiString = phanLoaiString;
    }

    /**
     * @return the moTaString
     */
    public String getMoTaString() {
        return moTaString;
    }

    /**
     * @param moTaString the moTaString to set
     */
    public void setMoTaString(String moTaString) {
        this.moTaString = moTaString;
    }

    /**
     * @return the giaInt
     */
    public Integer getGiaInt() {
        return giaInt;
    }

    /**
     * @param giaInt the giaInt to set
     */
    public void setGiaInt(Integer giaInt) {
        this.giaInt = giaInt;
    }

    /**
     * @return the nSXDate
     */
    public Date getNSXDate() {
        return NSXDate;
    }

    /**
     * @param nSXDate the nSXDate to set
     */
    public void setNSXDate(String nSXDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        try {
            this.NSXDate = formatter.parse(nSXDate);
        } catch (ParseException e) {
            System.out.println("Cannot convert String to Date");
        }
    }

    /**
     * @return the hSDDate
     */
    public Date getHSDDate() {
        return HSDDate;
    }

    /**
     * @param hSDDate the hSDDate to set
     */
    public void setHSDDate(String hSDDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        try {
            this.HSDDate = formatter.parse(hSDDate);
        } catch (ParseException e) {
            System.out.println("Cannot convert String to Date");
            e.printStackTrace();
        }
    }

    /**
     * @param nSXDate the nSXDate to set
     */
    public void setNSXDate(Date nSXDate) {
        NSXDate = nSXDate;
    }

    /**
     * @param hSDDate the hSDDate to set
     */
    public void setHSDDate(Date hSDDate) {
        HSDDate = hSDDate;
    }

    /**
     * @return the giaGiamInt
     */
    public Integer getGiaGiamInt() {
        return giaGiamInt;
    }

    /**
     * @param giaGiamInt the giaGiamInt to set
     */
    public void setGiaGiamInt(Integer giaGiamInt) {
        this.giaGiamInt = giaGiamInt;
    }

    @Override
    public String toString() {
        return "SanPhamDTO [maSPString=" + maSPString + ", tenSPString=" + tenSPString + ", giaInt=" + giaInt
                + ", soLuongSPInt=" + soLuongSPInt + ", phanLoaiString=" + phanLoaiString + ", NSXDate=" + NSXDate
                + ", HSDDate=" + HSDDate + ", moTaString=" + moTaString + ", giaGiamInt=" + giaGiamInt + "]";
    }

}
/*
 * CREATE OR REPLACE TRIGGER TRG_GENERATE_MASP
 * BEFORE INSERT ON SANPHAM
 * FOR EACH ROW
 * DECLARE
 * V_LAST_MASP VARCHAR(20);
 * V_NEXT_MASP VARCHAR(20);
 * BEGIN
 * BEGIN
 * -- Lấy mã sản phẩm cuối cùng từ bảng SANPHAM
 * SELECT MaSP INTO V_LAST_MASP
 * FROM SANPHAM
 * ORDER BY MaSP DESC
 * FETCH FIRST 1 ROW ONLY;
 * EXCEPTION
 * WHEN NO_DATA_FOUND THEN
 * V_LAST_MASP := NULL;
 * END;
 * 
 * -- Tạo mã sản phẩm tiếp theo
 * IF V_LAST_MASP IS NULL THEN
 * V_NEXT_MASP := 'SP1';
 * ELSE
 * V_NEXT_MASP := 'SP' || TO_CHAR(TO_NUMBER(SUBSTR(V_LAST_MASP, 3)) + 1);
 * END IF;
 * 
 * -- Gán mã sản phẩm mới vào cột MaSP
 * :NEW.MaSP := V_NEXT_MASP;
 * END;
 */