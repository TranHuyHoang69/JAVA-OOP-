package BaiTapChuong3.BaiTapTrang79.util.model;

public class NhanVien {
    protected String ten;
    protected long luong;
    public NhanVien(){

    }
    public NhanVien(String ten){
        this.ten = ten;
    }
    public String LoaiNhanVien(){
        return "";
    }
    public void XuatThongTin(){
        System.out.println("Nhan vien : "+ten + " chuc vu "+LoaiNhanVien()+" luong "+luong+" VND");
    }
}
