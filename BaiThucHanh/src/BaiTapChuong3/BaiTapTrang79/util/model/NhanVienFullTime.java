package BaiTapChuong3.BaiTapTrang79.util.model;
import BaiTapChuong3.BaiTapTrang79.util.Configs;

public class NhanVienFullTime extends NhanVien {
    private int ngaylamthem ;
    private int loaichucvu;
    public NhanVienFullTime(String ten){
       this.ten = ten;
    }
    public NhanVienFullTime(String ten, int ngaylamthem){
        this.ten = ten;
        this.ngaylamthem = ngaylamthem;
    }
    public void setLoaiChucVu(int loaichucvu){
        this.loaichucvu = loaichucvu;
    }
    @Override
    public String LoaiNhanVien(){
        return "Nhan vien FullTime";
    }
    public void tinhluong(){
        long LuongCoBan = (loaichucvu == Configs.NHAN_VIEN_LINH)
         ? Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH
         : Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP;
        luong = LuongCoBan+ngaylamthem*Configs.LUONG_LAM_THEM_MOI_NGAY; 
    }

    
}