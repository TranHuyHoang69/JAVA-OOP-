import java.util.Scanner;

public class BAITAPTRANG81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so dong trong mang ");
        int m = sc.nextInt();
        System.out.print("Nhap so cot trong mang ");
        int n = sc.nextInt();
        int Arr[][]=new int[m][n];
        System.out.print("Nhap so phan tu trong mang ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("A[" + i + "] [" + j + "] = ");
                Arr[i][j]=sc.nextInt();
            }
        }
        int max = Arr[0][0];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(max<Arr[i][j]){
                    max=Arr[i][j];
                }
            }
        }
        System.out.print("Phan tu co gia tri lon nhat : "+ max);
        sc.close();
    }
}
