package BUS;

import java.util.ArrayList;
import java.util.List;

import DAO_Hibernate.KhoVanDAO;
import DTO.KhoVanDTO;

public class KhoVanBUS {
    private List<KhoVanDTO> list_KhoVanDTOs;
    /**
     * Xử lý các lệnh trong database
     */
    private KhoVanDAO khoVanDAO;

    /**
     * @return the list_KhoVanDTOs
     */
    public List<KhoVanDTO> getList_KhoVanDTOs() {
        return list_KhoVanDTOs;
    }

    /**
     * @param list_KhoVanDTOs the list_KhoVanDTOs to set
     */
    public void setList_KhoVanDTOs(List<KhoVanDTO> list_KhoVanDTOs) {
        this.list_KhoVanDTOs = list_KhoVanDTOs;
    }

    public KhoVanBUS() {
        list_KhoVanDTOs = new ArrayList<>();
        khoVanDAO = new KhoVanDAO();
        list_KhoVanDTOs = khoVanDAO.readDB();
    }

    /**
     * Thêm 1 Lô hàng vào danh sách và database
     * 
     * @param khoVanDTO
     * @return true nếu thành công
     * @throws Exception
     */
    public Boolean them(KhoVanDTO khoVanDTO) throws Exception {
        if (khoVanDAO.them(khoVanDTO)) {
            list_KhoVanDTOs.add(khoVanDTO);
            return true;
        }
        return false;
    }

    /**
     * Xóa 1 Lô hàng khỏi danh sách và database
     * 
     * @param khoVanDTO
     * @return true nếu thành công
     * @throws Exception
     */
    public Boolean xoa(KhoVanDTO khoVanDTO) throws Exception {
        if (khoVanDAO.xoa(khoVanDTO)) {
            // Duyệt từng phần tử của list_KhoVanDTOs
            for (KhoVanDTO nv : list_KhoVanDTOs) {
                if (nv.getMaLoHangString().equals(khoVanDTO.getMaLoHangString())) {
                    list_KhoVanDTOs.remove(nv);
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Sửa thông tin của 1 Lô hàng trong danh sách và database
     * 
     * @param khoVanDTO
     * @return true nếu thành công
     * @throws Exception
     */
    public Boolean sua(KhoVanDTO khoVanDTO) throws Exception {
        if (khoVanDAO.sua(khoVanDTO)) {
            // Duyệt từng phần tử của list_KhoVanDTOs
            for (int i = 0; i < list_KhoVanDTOs.size(); i++) {
                if (list_KhoVanDTOs.get(i).getMaLoHangString().equals(khoVanDTO.getMaLoHangString())) {
                    list_KhoVanDTOs.set(i, khoVanDTO);
                    return true;
                }
            }
        }

        return false;
    }

}
