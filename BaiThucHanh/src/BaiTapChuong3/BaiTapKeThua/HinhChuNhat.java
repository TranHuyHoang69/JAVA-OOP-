package BaiTapChuong3.BaiTapKeThua;

import java.util.Scanner;

public class HinhChuNhat extends HINHHOC {
    public float dai;
    public float rong;
    public HinhChuNhat(){
        ten = "Hinh Chu Nhat ";
    }
    public void nhapChieuDai(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai : ");
        dai = sc.nextFloat();
        sc.close();
    }
    public void nhapChieuRong(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu rong : ");
        rong = sc.nextFloat();
        sc.close();
    }
    public void TinhChuVi(){
        ChuVi = (dai+rong)*2;
    }
    public void TinhDienTich(){
        DienTich = dai*rong;
    }
}
