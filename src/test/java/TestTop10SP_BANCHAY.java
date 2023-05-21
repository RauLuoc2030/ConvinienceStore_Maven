import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import DAO_Hibernate.SanPhamDAO;
import DTO.SanPhamDTO;

public class TestTop10SP_BANCHAY {
    public static void main(String[] args) {

        // Tạo biến lưu trữ ngày 01/01/2023
        LocalDate ngay1 = LocalDate.of(2023, 1, 1);

        // Tạo biến lưu trữ ngày 31/01/2023
        LocalDate ngay31 = LocalDate.of(2023, 1, 31);

        SanPhamDAO sanPhamDAO = new SanPhamDAO();
        List<SanPhamDTO> sanPhamDTOs = new ArrayList<SanPhamDTO>();
        sanPhamDTOs = sanPhamDAO.Top10Results(ngay1, ngay31);

        for (SanPhamDTO sanPhamDTO : sanPhamDTOs) {
            sanPhamDTO.toString();
        }
    }
}
