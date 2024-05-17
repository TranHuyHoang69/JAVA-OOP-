package BaiTapChuong4.Sets;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        int number;
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(5);
        treeSet.add(12);
        treeSet.add(69);
        treeSet.add(122);
        treeSet.add(21);
        treeSet.add(2004);
        Scanner sc = new Scanner(System.in);
        System.out.println("Cac phan tu trong TreeSet : ");
        System.out.println(treeSet);
        System.out.println("Nhap phan tu muon them vao : ");
        number = sc.nextInt();
        if(treeSet.contains(number)){
           System.out.println("Phan tu "+number+" da ton tai");
        }else{
            treeSet.add(number);
            System.out.println("Them phan tu thanh cong");
            System.out.println("Cac phan tu trong TreeSet : ");
            System.out.println(treeSet);        }
    }
}
