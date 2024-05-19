import java.util.LinkedHashMap;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        LinkedHashMap<String,SinhVienBai5> danhsachSV = new LinkedHashMap<>();
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien : ");
       int n = sc.nextInt();
       sc.nextLine();
        for(int i = 0;i < n;i++){
           System.out.println("Nhap ma sinh vien : ");
           String msv = sc.nextLine();
           System.out.println("Nhap ho va ten : ");
           String hoten = sc.nextLine();
           System.out.println("Nhap ten lop : ");
           String lop = sc.nextLine();
           SinhVienBai5 sv = new SinhVienBai5(hoten, lop, msv);
           danhsachSV.put(msv, sv);
        }
        System.out.println("Nhap ten lop can tim : ");
        String tenlop = sc.nextLine();
        System.out.println("Danh sach cac sinh vien trong lop "+tenlop+" : ");
        for(SinhVienBai5 sv : danhsachSV.values()){
            if(sv.getLop().equals(tenlop)){
                System.out.println("Ho va ten : "+ sv.getHoten()+", MSV : "+sv.getMsv());
            }
        }
        System.out.println("Nhap ma sinh vien can tim : ");
        String MSV =sc.nextLine();
        if(danhsachSV.containsKey(MSV)){
            SinhVienBai5 sv = danhsachSV.get(MSV);
            System.out.println("Ho va ten : "+sv.getHoten()+", Lop : "+sv.getLop());
        }else{
            System.out.println("Khong tim thay sinh vien :( ");
        }
        sc.close();
    }
}
