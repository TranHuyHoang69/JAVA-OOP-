package BaiTapChuong5;

public class Slide12 {
    public static void main(String[] args) {
        try{
            int data = 123;
            if(data % 2 !=0){
                System.out.println(data+" is odd number ");
            }
        }catch(ArithmeticException e){
            System.out.println(e);
        }finally{
            System.out.println("Finally block is always executed");
        }
        System.out.println("Rest of the code ");
    }
}
