package BaiTapChuong3.BaiTapKeThua;

import java.util.Scanner;

public class HinhTron extends HINHHOC {
    float bk;
    public HinhTron(){
        ten = "Hinh Tron";
    }
    public void NhapBK(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh : ");
        bk = sc.nextFloat();
}
    public void TinhChuVi(){
        ChuVi = Pi * 2 * bk;
    }
    public void TinhDienTich(){
        DienTich = Pi * bk * bk;
    }
    
}
