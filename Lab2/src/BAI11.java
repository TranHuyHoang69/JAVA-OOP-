import java.util.Scanner;

public class BAI11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Nhap so phan tu trong mang : ");
            n=sc.nextInt();
        }while(n<=0);
        int Arr[]=new int[n];
        System.out.println("Nhap phan tu trong mang");
        for(int i =0;i<n;i++){
            Arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(Arr[i]>Arr[j]){
                    int temp = Arr[i];
                    Arr[i]=Arr[j];
                    Arr[j]=temp;
                }
            }
        }
        System.out.println("Sap xep theo thu tu tang dan la : ");
        for(int i=0;i<n;i++){
            System.out.print(Arr[i]+ " " );
        }
        sc.close();
    }
}
