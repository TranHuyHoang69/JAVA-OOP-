package BaiTapChuong5;

public class Slide11 {
    public static void main(String[] args) {
        try{
            int data = 34/2;
            System.out.println(data);
        }catch(NullPointerException e ){
            System.out.println(e);
        }finally{
            System.out.println("Finally always blocked ");
        }
        System.out.println("Rest of the code ");
    }
}
