package BaiTapKeThua.KeThuaPerson;

import java.util.Scanner;

public class PartTime extends Employee {
    public long sogiocong;
    public PartTime(){
        chucvu = "Nhan vien PartTime";
        luong = 120000;
    }
    public void nhapcong(){
        Scanner sc = new Scanner(System.in);
        super.nhapthongtin();
        System.out.print("Nhap so gio lam : ");
        sogiocong = sc.nextLong();
        sc.close();
    }
    public void tinhluong(){
        this.luong = luong * sogiocong;
    }
}
