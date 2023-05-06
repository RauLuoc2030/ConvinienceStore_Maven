package DTO;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "KHACHHANG")
public class KhachHangDTO implements Serializable {
    @Id
    @Column(name = "SDTKH")
    private String SDTKHString;

    @Column(name = "TENKH")
    private String tenKHString;

    /**
     * @param sDTKHString
     * @param tenKHString
     */
    public KhachHangDTO(String sDTKHString, String tenKHString) {
        SDTKHString = sDTKHString;
        this.tenKHString = tenKHString;
    }

    /**
     *
     */
    public KhachHangDTO() {
    }

    /**
     * @return the SDTKHString
     */
    public String getSDTKHString() {
        return SDTKHString;
    }

    /**
     * @param sDTKHString the sDTKHString to set
     */
    public void setSDTKHString(String sDTKHString) {
        SDTKHString = sDTKHString;
    }

    /**
     * @return the tenKHString
     */
    public String gettenKHString() {
        return tenKHString;
    }

    /**
     * @param tenKHString the tenKHString to set
     */
    public void settenKHString(String tenKHString) {
        this.tenKHString = tenKHString;
    }

    @Override
    public String toString() {
        return "KhachHangDTO [SDTKHString=" + SDTKHString + ", tenKHString=" + tenKHString + "]";
    }

    // @Override
    // public String toString() {
    // return "KhachHangDTO [SDTKHString=" + SDTKHString + ", tenKHString=" +
    // tenKHString + "]";
    // }
}
