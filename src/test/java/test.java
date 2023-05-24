import javax.persistence.*;

@Entity
@Table(name = "NGUOIDUNG")
public class NguoiDungDTO implements Serializable {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MANV")
    private String maNVString;

    public String getMaNVString() {
        return maNVString;
    }

    public void setMaNVString(String maNVString) {
        this.maNVString = maNVString;
    }

    // Khai báo mối quan hệ One-to-One với NHANVIEN
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaNV")
    private NhanVienDTO nhanVienDTO;

    public NhanVienDTO getNhanVienDTO() {
        return nhanVienDTO;
    }

    public void setNhanVienDTO(NhanVienDTO nhanVienDTO) {
        this.nhanVienDTO = nhanVienDTO;
    }
}

@Entity
@Table(name = "NHANVIEN")
public class NhanVienDTO {
    @Id
    @Column(name = "MANV")
    private String maNVString;

    // One-to-one relationship with NGUOIDUNG entity, using MaNV as foreign key
    @OneToOne(mappedBy = "nhanVienDTO", fetch = FetchType.LAZY)
    private NguoiDungDTO nguoiDungDTO;

    public NguoiDungDTO getNguoiDungDTO() {
        return nguoiDungDTO;
    }

    public void setNguoiDungDTO(NguoiDungDTO nguoiDungDTO) {
        this.nguoiDungDTO = nguoiDungDTO;
    }

    public String getMaNVString() {
        return maNVString;
    }

    public void setMaNVString(String maNVString) {
        this.maNVString = maNVString;
    }
}

public class NhanVienDAO {
    Session session;

    public NguoiDungDTO tim(String keyword) {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Query<NguoiDungDTO> query = session
                .createQuery("FROM NguoiDungDTO WHERE MaNV = :keyword",
                        NguoiDungDTO.class);
        query.setParameter("keyword", keyword);
        // query.setParameter("searchKeyword", "%" + keyword + "%");

        NguoiDungDTO sanPham = query.uniqueResult();

        session.getTransaction().commit();
        return sanPham;
    }
}