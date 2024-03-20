package BaiTapChuong2;
import java.util.Scanner;
public class BAITAPTRANG40 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap ngay(1->7):");
        int ngay = sc.nextInt();
        switch(ngay){
            case 1:System.out.println("Hom nay la thu 2");break;
            case 2:System.out.println("Hom nay la thu 3");break;
            case 3:System.out.println("Hom nay la thu 4");break;
            case 4:System.out.println("Hom nay la thu 5");break;
            case 5:System.out.println("Hom nay la thu 6");break;
            case 6:System.out.println("Hom nay la thu 7");break;
            case 7:System.out.println("Hom nay la chu nhat");break;
            default:System.out.println("So ngay trong tuan sai");
        }
        sc.close();
    }
}
