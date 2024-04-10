package BaiTapChuong3.BaiTapTrang79.util.model;

import BaiTapChuong3.BaiTapTrang79.util.Configs;

public class NhanVienPartTime extends NhanVien {
    private int giolamviec;
    public NhanVienPartTime(String ten, int giolamviec){
        super(ten);
        this.giolamviec = giolamviec;
    }
    @Override
    public String LoaiNhanVien(){
        return "Nhan vien PartTime";
    }
    public void tinhluong(){
        luong = Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * giolamviec;
    }
}
