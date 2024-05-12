package BaiTapChuong3.BaiTapKeThua;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    public float chieucao;
    public HinhTru(){
        ten = "Hinh Tru";   
    }
    public void nhapChieuCao(){
        Scanner sc = new Scanner(System.in);
        super.NhapBK();
        System.out.print("Nhap chieu cao : ");
        chieucao = sc.nextFloat();
        sc.close();
    }
    public void tinhTheTich(){
        TheTich = Pi * bk * bk *chieucao;
    }
}
