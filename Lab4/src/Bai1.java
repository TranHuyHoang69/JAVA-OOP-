import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrListInt = new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap so phan tu co trong day so nguyen : ");
        int n=sc.nextInt();
        int num;
        for(int i=0;i<n;i++){
            System.out.println("Nhap phan tu thu [ "+i+" ] : ");
            num = sc.nextInt();
            arrListInt.add(num);
        }
        System.out.println("Cac phan tu vua nhap : ");
        System.out.println(arrListInt);
        int max=arrListInt.get(0);
        for(int i = 0 ; i < arrListInt.size(); i++ ){
            if(max<arrListInt.get(i)){
                max = arrListInt.get(i);
            }
        }
        System.out.println("So nguyen lon nhat : "+ max);
        System.out.println("Nhap vao phan tu ban muon xoa : ");
        int del = sc.nextInt();
        ArrayList<Integer> arrDel = new ArrayList<>();
        arrDel.add(del);
        arrListInt.removeAll(arrDel);
        System.out.println("Day cac so nguyen sau khi xoa : ");
        System.out.println(arrListInt);
        System.out.println("Day cac so nguyen theo thu tu tang dan : ");
        arrListInt.sort((o1, o2) -> o1 - o2);
        System.out.println(arrListInt);
        System.out.println("Day co nguyen theo thu tu giam dan : ");
        arrListInt.sort((o1,o2)-> o2 - o1);
        System.out.println(arrListInt);
        sc.close();
    }
}
