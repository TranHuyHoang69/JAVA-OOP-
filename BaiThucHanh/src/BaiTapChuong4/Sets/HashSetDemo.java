package BaiTapChuong4.Sets;
import java.util.HashSet;
import java.util.Scanner;
public class HashSetDemo {
    public static void main(String[] args) {
        String name ;
        HashSet<String> hset = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        hset.add("Iphone 15 pro max");
        hset.add("Samsung galaxy s22 ultra");
        hset.add("Oppo Reno 8");
        hset.add("Xiaomi redmi 12");
        hset.add("Vivo x90");
        hset.add("Huawei pura 70");
        hset.add("Realme q3 pro");
        hset.add("Lenovo thinkpad");
        hset.size();
        System.out.println("Cac phan tu trong HashSetString : ");
        System.out.println(hset);
        System.out.println("Nhap cac phan tu can xoa ");
        name = sc.nextLine();
        if(hset.contains(name)){
            hset.remove(name);
            System.out.println("Xoa thanh cong ");
            System.out.println("Cac phan tu con lai trong HashSetString : ");
            System.out.println(hset);
        }else{
            System.out.println("Xoa khong thanh cong ");
        }
    }
}
