package BaiTapChuong4.Sets;
import java.util.Scanner;
public class StudentSet {
    public String fullname;
    public  int age;
    public void In(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap ho va ten : ");
        fullname = sc.nextLine();
        System.out.println("Nhap tuoi : ");
        age=sc.nextInt();
    }
    public void Out(){
        System.out.println("Ten: "+fullname+", tuoi : "+age);
    } 
    public void setFullname(String fullname){
        this.fullname=fullname;
    }
    public String getFullname(){
        return fullname;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
