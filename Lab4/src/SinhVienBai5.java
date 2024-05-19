import java.util.Scanner;

public class SinhVienBai5 {
    private String msv;
    private String hoten;
    private String lop;
    Scanner sc = new Scanner(System.in);
    public SinhVienBai5(String hoten,String lop,String msv){
        this.hoten=hoten;
        this.lop=lop;
        this.msv=msv;
    }
    public String getHoten(){
        return hoten;
    }
    public String getLop(){
        return lop;
    }
    public String getMsv(){
        return msv;
    }
}
