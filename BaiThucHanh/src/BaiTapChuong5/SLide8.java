package BaiTapChuong5;

public class SLide8 {
    public static void main(String[] args) {
        try{
             int a[] =  new int[5];
             a[5] = 30/0 ;
             a[1] = 30/5;
        }catch(ArithmeticException e){
            System.out.println("Task 1 is completed");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Task 2 is completed ");
        }catch(Exception e){
            System.out.println("common task completed ");
        }
        System.out.println("Rest of the code ");
    }
}