import java.util.Scanner;

public class THH450Student extends THH450Person {
    public int msv;
    public String lop;
    @Override
    public void nhapthongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap msv : ");
        msv = sc.nextInt();
        System.out.println("Nhap ten lop : ");
        lop = sc.nextLine();
    }
    @Override
    public void xuatthongtin(){
        System.out.println("Msv : "+msv+", lop : "+lop);
    }
}
