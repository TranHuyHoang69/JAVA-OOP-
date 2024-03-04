import java.util.Scanner;

public class Employee {
    public String ten;
    public String chucvu;
    public double LuongTheoNgay;
    public int NgayCong;
    public int tuoi;
    public double Luong;
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten : ");
        ten = sc.nextLine();
        System.out.print("Nhap chuc vu cua ban : ");
        chucvu = sc.nextLine();
        System.out.print("Nhap nam sinh cua ban : ");
        tuoi =sc.nextInt();
        System.out.print("Nhap tien cong tren ngay : ");
        LuongTheoNgay = sc.nextDouble();
        System.out.print("Nhap so ngay cong cua ban : ");
        NgayCong = sc.nextInt();
        sc.close();
    }
    public double tinhLuong(){
        Luong = LuongTheoNgay*NgayCong;
        return Luong;
    }
    public int tinhTuoi(){
        tuoi = 2024 - tuoi;
        return tuoi;
    }
    public void in(){
        System.out.println("Ho va ten : "+ten);
        System.out.println("Tuoi : "+tuoi);
        System.out.println("Chuc vu : "+chucvu);
        System.out.println("Luong : "+Luong);
    }

}
