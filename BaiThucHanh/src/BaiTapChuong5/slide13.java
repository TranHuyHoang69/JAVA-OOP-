package BaiTapChuong5;

public class slide13 {
    static void validate(int age){
        try{
            if(age<18){
                throw new ArithmeticException("Not valid");
            }else{
                System.out.println("Welcome");
            }
        }catch(ArithmeticException e ){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        validate(15);
        System.out.println("Rest of the code ");
    }
}