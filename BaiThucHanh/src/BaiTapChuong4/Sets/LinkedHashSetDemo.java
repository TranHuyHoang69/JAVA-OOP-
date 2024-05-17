package BaiTapChuong4.Sets;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> LinkedHashSet = new LinkedHashSet<String>();
        LinkedHashSet.add("Vinfast");
        LinkedHashSet.add("Mecedes");
        LinkedHashSet.add("BMW");
        LinkedHashSet.add("Toyota");
        LinkedHashSet.add("Huyndai");
        LinkedHashSet.add("Kia");
        LinkedHashSet.add("Mitsubishi");
        LinkedHashSet.add("Mazda");
        System.out.print("[");
        for(String str : LinkedHashSet){
            System.out.print(" "+ str);
        }
        System.out.println("]");
        String name;
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap phan tu can xoa : ");
        name = sc.nextLine();
        if(LinkedHashSet.contains(name)){
            LinkedHashSet.remove(name);
            System.out.println("Xoa thanh cong ");
            System.out.println("Cac phan tu con lai trong LinkedHashSet");
            for(String src : LinkedHashSet){
                System.out.println(src);
            }
        }else{
            System.out.println("Xoa khong thanh cong ");
        }
    }
}
