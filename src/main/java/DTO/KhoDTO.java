package DTO;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "KHOVAN")
public class KhoDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MALOHANG")
    private String maLoHangString;

    @Column(name = "NGAYNHAP")
    private Date ngayNhapDate;

    @Column(name = "NGAYXUAT")
    private Date ngayXuatDate;

    /**
     * Lưu trữ thông tin tên của cửa hàng được nhận sản phẩm từ kho (có nhiều cửa
     * hàng tiện lợi)
     */
    @Column(name = "TENCH")
    private String tenCHXuatKhoString;

    /**
     *
     */
    public KhoDTO() {
    }

    /**
     * @param maLoHangString
     * @param ngayNhapDate
     * @param ngayXuatDate
     * @param tenCHXuatKhoString
     */
    public KhoDTO(String maLoHangString, Date ngayNhapDate, Date ngayXuatDate, String tenCHXuatKhoString) {
        this.maLoHangString = maLoHangString;
        this.ngayNhapDate = ngayNhapDate;
        this.ngayXuatDate = ngayXuatDate;
        this.tenCHXuatKhoString = tenCHXuatKhoString;
    }

    /**
     * @return the maLoHangString
     */
    public String getMaLoHangString() {
        return maLoHangString;
    }

    /**
     * @param maLoHangString the maLoHangString to set
     */
    public void setMaLoHangString(String maLoHangString) {
        this.maLoHangString = maLoHangString;
    }

    /**
     * @return the ngayNhapDate
     */
    public Date getNgayNhapDate() {
        return ngayNhapDate;
    }

    /**
     * @param ngayNhapDate the ngayNhapDate to set
     */
    public void setNgayNhapDate(Date ngayNhapDate) {
        this.ngayNhapDate = ngayNhapDate;
    }

    /**
     * @return the ngayXuatDate
     */
    public Date getNgayXuatDate() {
        return ngayXuatDate;
    }

    /**
     * @param ngayXuatDate the ngayXuatDate to set
     */
    public void setNgayXuatDate(Date ngayXuatDate) {
        this.ngayXuatDate = ngayXuatDate;
    }

    /**
     * @return the tenCHXuatKhoString
     */
    public String getTenCHXuatKhoString() {
        return tenCHXuatKhoString;
    }

    /**
     * @param tenCHXuatKhoString the tenCHXuatKhoString to set
     */
    public void setTenCHXuatKhoString(String tenCHXuatKhoString) {
        this.tenCHXuatKhoString = tenCHXuatKhoString;
    }

    @Override
    public String toString() {
        return "KhoVanDTO [maLoHangString=" + maLoHangString + ", ngayNhapDate=" + ngayNhapDate + ", ngayXuatDate="
                + ngayXuatDate + ", tenCHXuatKhoString=" + tenCHXuatKhoString + "]";
    }

}
