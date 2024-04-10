
import BaiTapChuong3.BaiTapTrang79.util.Configs;
import BaiTapChuong3.BaiTapTrang79.util.model.NhanVienFullTime;
import BaiTapChuong3.BaiTapTrang79.util.model.NhanVienPartTime;
public class App {
    public static void main(String[] args) {
        NhanVienFullTime sep = new NhanVienFullTime("Tran Huy Hoang");
        sep.setLoaiChucVu(Configs.NHAN_VIEN_SEP);
        NhanVienFullTime linh1 = new NhanVienFullTime("Nguyen Xuan Huy",2);
        linh1.setLoaiChucVu(Configs.NHAN_VIEN_LINH);
        NhanVienFullTime linh2 = new NhanVienFullTime("Vu Viet Cuong ", 4);
        linh2.setLoaiChucVu(Configs.NHAN_VIEN_LINH);
        NhanVienPartTime thoivu = new NhanVienPartTime("Trieu Nguyen Tai ", 120);
        sep.tinhluong();
        linh1.tinhluong();
        linh2.tinhluong();
        thoivu.tinhluong();
        sep.XuatThongTin();
        linh1.XuatThongTin();
        linh2.XuatThongTin();
        thoivu.XuatThongTin();

    }
}