import java.util.Scanner;

public class BAI9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi=sc.nextLine();
        int sokytuthuong = 0;
        int sokytuhoa = 0 ;
        int so = 0;
    for(int i=0;i<chuoi.length();i++){
        char kytu=chuoi.charAt(i);
        if(Character.isLowerCase(kytu)){
            sokytuthuong++; 
        }
        if(Character.isUpperCase(kytu)){
            sokytuhoa++;
        }
        if(Character.isDigit(kytu)){
            so++;
        }
    }
    System.out.println("So ky tu thuong la : "+sokytuthuong);
    System.out.println("So ky tu hoa la "+sokytuhoa);
    System.out.println("So la "+so);
    sc.close();
    }
}
