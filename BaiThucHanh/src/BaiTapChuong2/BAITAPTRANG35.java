import java.util.Scanner;
public class BAITAPTRANG35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thu nhat : ");
        double a = sc.nextDouble();
        System.out.println("Nhap so thu hai");
        double b = sc.nextDouble();
        if(a<b){
            System.out.println("So lon nhat la : "+ b);
        }else{
                System.out.println("So lon nhat la : " + a);
            }
        sc.close();
    }
}
