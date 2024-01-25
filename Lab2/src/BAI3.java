import java.util.Scanner;
public class BAI3{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho va ten ");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi ");
        int age = sc.nextInt();
        if(age<16){
            System.out.println("Ban "+ name + " o do tuoi vi thanh nien ");
        }else{if(age>=18){
            System.out.println("Ban "+ name + " da gia ");
        }else{
            System.out.println("Ban "+ name + " o do tuoi truong thanh ");
        }
        }
        sc.close();
    }
}