import java.util.LinkedList;
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        LinkedList<Integer> average = new LinkedList<>();
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap so phan tu trong day so nguyen : ");
        int n = sc.nextInt();
        int num;
        for(int i = 0; i < n; i++){
            System.out.println("Nhap phan tu thu [ " + i + " ] : ");
            num = sc.nextInt();
            average.add(num);
        }
        System.out.println("Day so nguyen vua nhap : ");
        System.out.println(average);
        int avg = 0;
        int count=0;
        for(int i = 0; i < average.size(); i++){
            if(average.get(i)%2==0){
                avg += average.get(i);
                count++;
            }
        }
        System.out.println("Trung binh cua cac so chan co trong day cac so nguyen : "+ (double) avg/count);
        sc.close();
    }
}
