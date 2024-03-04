import java.util.Scanner;

public class HinhTron {
    final float pi = 3.14f;
    public float bk;
    public float chuVi;
    public float dienTich;
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap R = ");
        bk = sc.nextFloat();
        sc.close();
    }
    public void tinhChuVi(){
        chuVi = 2*pi*bk;
    }
    public void tinhdienTich(){
        dienTich = pi*bk*bk;
    }
    public void in(){
        System.out.print("\nChu vi = "+chuVi);
        System.out.print("\nDien tich = "+dienTich);
    }

}
