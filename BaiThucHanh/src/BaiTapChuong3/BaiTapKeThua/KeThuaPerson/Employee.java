package BaiTapChuong3.BaiTapKeThua.KeThuaPerson;

import java.util.Scanner;

public class  Employee extends Person {
    public String manv;
    public String chucvu;
    public long luong;
    public void nhapthongtin(){
        Scanner sc = new Scanner(System.in);
        super.in();
        System.out.print("Nhap ma nhan vien : ");
        manv = sc.nextLine();        
    }
    public void xuatthongtin(){
        super.out();
        System.out.print("\nChu vu : "+chucvu);
        System.out.print("\nMa nhan vien : "+manv);
        System.out.print("\nLuong : "+luong);
    }
}
