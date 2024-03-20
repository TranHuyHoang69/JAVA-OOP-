package BaiTapKeThua.KeThuaPerson;

import java.util.Scanner;

public class FullTime extends Employee {
    public int ngaycong;
    public FullTime(){
        chucvu = "Nhan vien FullTime";
        luong = 1200000;
    }
    public void nhapluong(){
        Scanner sc = new Scanner(System.in);
        super.nhapthongtin();
        System.out.print("Nhap so ngay cong : ");
        ngaycong = sc.nextInt();
        sc.close();
    }
    public void tinhluong(){
        this.luong = luong*ngaycong;
    }
}
