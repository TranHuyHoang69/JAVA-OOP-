package BaiTapChuong5;

public class Slide9 {
    public static void main(String[] args) {
        try{
            try{
                System.out.println("Thuc hien phep chia ");
                int b = 40 / 0 ;
            }catch(ArithmeticException e){
                System.out.println(e);
            }
            try{
                int a[] = new int[4];
                a[4]=7;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println( e);
            }
            System.out.println("Khoi lenh khac ");
        }catch(Exception e){
            System.out.println("xu ly ngoai le ");
        }
        System.out.println("Tiep tuc chuong trinh");
    }
}
