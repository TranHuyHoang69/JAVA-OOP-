import java.util.Scanner;

public class BAITAPTRANG90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        char kytu;
        System.out.println("Nhap vao 1 chuoi ky tu bat ky : ");
        chuoi=sc.nextLine();
        System.out.println("Cac ky tu trong chuoi la ");
        for(int i=0;i<chuoi.length();i++){
            kytu=chuoi.charAt(i);
            System.out.println("Ky tu thu " + i + " la : " + kytu);
        }
        sc.close();
    }
}
