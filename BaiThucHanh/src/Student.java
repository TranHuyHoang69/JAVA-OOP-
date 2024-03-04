import java.util.Scanner;
public class Student {
    public String name;
    public int age;
    public String id;
    public String major; 
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten : ");
        name = sc.nextLine();
        System.out.print("Nhap chuyen nganh : ");
        major = sc.nextLine();
        System.out.print("Nhap ma sinh vien : ");
        id = sc.nextLine();
        System.out.print("Nhap nam sinh : ");
        age = sc.nextInt();
        sc.close();
    }
    public int tinhTuoi(){
        age = 2024-age;
        return age;
    }
    public void in(){
        System.out.println("Ho va ten : "+name);
        System.out.println("Tuoi : "+age);
        System.out.println("MSV : "+id);
        System.out.println("Chuyen nganh : "+ major);
    }
    
}
