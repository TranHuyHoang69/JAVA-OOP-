package BaiTapChuong3.BaiTapKeThua.KeThuaPerson;

import java.util.Scanner;

public class Person {
    public String ten;
    public String tuoi;
    public String gioitinh;
    public void in(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten : ");
        ten = sc.nextLine();
        System.out.print("Nhap tuoi : ");
        tuoi = sc.nextLine();
        System.out.print("Nhap gioi tinh : ");
        gioitinh = sc.nextLine();
        sc.close();
    }
    public void out(){
        System.out.print(ten + " "+ tuoi + " tuoi gioi tinh "+gioitinh );
    }
}
