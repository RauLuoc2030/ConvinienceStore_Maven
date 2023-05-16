package DTO;

import javax.persistence.Column;
import javax.persistence.Id;

public class MucLuongDTO {
    @Id
    @Column(name = "MAML")
    private String maMLString;

    @Column(name = "LUONG")
    private Integer luongInt;

    /**
     * @param maMLString
     * @param luongInt
     */
    public MucLuongDTO(String maMLString, Integer luongInt) {
        this.maMLString = maMLString;
        this.luongInt = luongInt;
    }

    /**
     * 
     */
    public MucLuongDTO() {
    }

    /**
     * @return the maMLString
     */
    public String getMaMLString() {
        return maMLString;
    }

    /**
     * @param maMLString the maMLString to set
     */
    public void setMaMLString(String maMLString) {
        this.maMLString = maMLString;
    }

    /**
     * @return the luongInt
     */
    public Integer getLuongInt() {
        return luongInt;
    }

    /**
     * @param luongInt the luongInt to set
     */
    public void setLuongInt(Integer luongInt) {
        this.luongInt = luongInt;
    }

    @Override
    public String toString() {
        return "MucLuongDTO [maMLString=" + maMLString + ", luongInt=" + luongInt + "]";
    }
}
