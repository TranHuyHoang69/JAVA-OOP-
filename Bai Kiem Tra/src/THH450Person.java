import java.util.Scanner;

public class THH450Person {
    public String hoten;
    public int tuoi;
    public long cccd;
    public void nhapthongtin(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap ho va ten : ");
        hoten = sc.nextLine();
        System.out.println("Nhap tuoi : ");
        tuoi=sc.nextInt();
        System.out.println("Nhap so can cuoc nhan dan : ");
        cccd = sc.nextLong();
    }
    public void xuatthongtin(){
        System.out.println("Ho ten : "+hoten);
        System.out.println("Tuoi : "+tuoi);
        System.out.println("Cccd : "+cccd);
    }
    public static void main(String[] args) {
        THH450Person ps = new THH450Person();
        ps.nhapthongtin();
        ps.xuatthongtin();
    }
}
