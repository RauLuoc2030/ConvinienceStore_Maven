package BUS;

import java.util.ArrayList;
import java.util.List;

import DAO_Hibernate.MucLuongDAO;
import DTO.MucLuongDTO;

public class MucLuongBUS {
    private List<MucLuongDTO> list_MucLuongDTOs;
    /**
     * Xử lý các lệnh trong database
     */
    private MucLuongDAO mucLuongDAO;

    /**
     * @return the list_MucLuongDTOs
     */
    public List<MucLuongDTO> getList_SanPhamDTOs() {
        return list_MucLuongDTOs;
    }

    /**
     * @param list_MucLuongDTOs the list_MucLuongDTOs to set
     */
    public void setList_SanPhamDTOs(List<MucLuongDTO> list_MucLuongDTOs) {
        this.list_MucLuongDTOs = list_MucLuongDTOs;
    }

    public MucLuongBUS() {
        list_MucLuongDTOs = new ArrayList<>();
        mucLuongDAO = new MucLuongDAO();
        list_MucLuongDTOs = mucLuongDAO.readDB();
    }

    /**
     * Thêm 1 Mức lương vào danh sách và database
     * 
     * @param mucLuongDTO
     * @return true nếu thành công
     * @throws Exception
     */
    public Boolean them(MucLuongDTO mucLuongDTO) throws Exception {
        if (mucLuongDAO.them(mucLuongDTO)) {
            list_MucLuongDTOs.add(mucLuongDTO);
            return true;
        }
        return false;
    }

    /**
     * Xóa 1 Mức lương khỏi danh sách và database
     * 
     * @param mucLuongDTO
     * @return true nếu thành công
     * @throws Exception
     */
    public Boolean xoa(MucLuongDTO mucLuongDTO) throws Exception {
        if (mucLuongDAO.xoa(mucLuongDTO)) {
            // Duyệt từng phần tử của list_MucLuongDTOs
            for (MucLuongDTO sp : list_MucLuongDTOs) {
                if (sp.getMaMLString().equals(mucLuongDTO.getMaMLString())) {
                    list_MucLuongDTOs.remove(sp);
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Sửa thông tin của 1 Mức lương trong danh sách và database
     * 
     * @param mucLuongDTO
     * @return true nếu thành công
     * @throws Exception
     */
    public Boolean sua(MucLuongDTO mucLuongDTO) throws Exception {
        if (mucLuongDAO.sua(mucLuongDTO)) {
            // Duyệt từng phần tử của list_MucLuongDTOs
            for (int i = 0; i < list_MucLuongDTOs.size(); i++) {
                if (list_MucLuongDTOs.get(i).getMaMLString().equals(mucLuongDTO.getMaMLString())) {
                    list_MucLuongDTOs.set(i, mucLuongDTO);
                    return true;
                }
            }
        }

        return false;
    }

    public MucLuongDTO tim(String keyword) {
        return mucLuongDAO.tim(keyword);
    }

}
