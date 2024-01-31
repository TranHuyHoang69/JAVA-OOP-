import java.util.Scanner;

public class BAI10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi ;
        do{
            System.out.println("Nhap 1 chuoi khong qua 80 ky tu : ");
            chuoi = sc.nextLine();
        }while(chuoi.length()>80);
        System.out.println("Nhap 1 ky tu can tim : ");
        char kytu=sc.next().charAt(0);
       int dem =0;
       for(int i=0;i<chuoi.length();i++){
        if(kytu==chuoi.charAt(i)){
            dem++;
        }
       }
       System.out.println("Ky tu "+kytu+" xuat hien trong chuoi "+dem+" lan ");
       sc.close();
    
}
}
