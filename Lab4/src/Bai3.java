import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
class SinhVien{
    public String hoten;
    public float diem;
    public SinhVien(String hoten,float diem){
        this.hoten=hoten;
        this.diem=diem;
    }
    public String toString(){
        return "Ho ten : "+hoten+", Diem :  "+diem;
    }
}
public class Bai3 {
    public static void main(String[] args) {
        LinkedList<SinhVien> LLSV = new LinkedList<>();
        HashMap<String,SinhVien> HMSV = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Nhap ho va ten : ");
            String hoten = sc.nextLine();
            if(hoten.isEmpty()){
                break;
            }
            System.out.println("Nhap diem : ");
            float diem = sc.nextFloat();
            sc.nextLine();
            SinhVien sv = new SinhVien(hoten, diem);
            LLSV.add(sv);
            HMSV.put(hoten, sv);
        }
        int count = 0;
        for(SinhVien sv : HMSV.values()){
            if(sv.diem<=5){
                count++;
            }
        }
        System.out.println("Danh sach "+count+" sinh vien phai thi lai : ");
        for(SinhVien sv : HMSV.values()){
            if(sv.diem<=5){
                System.out.println(sv);
            }
        }
        float max = LLSV.get(0).diem;
        for(SinhVien sv : LLSV){
            if(sv.diem>max){
                max = sv.diem;
                }
            }
        System.out.println("Sinh vien co so diem cao nhat : ");
        for(SinhVien sv : LLSV){
            if(sv.diem==max){
                System.out.println(sv);
            }
        }
        System.out.println("Nhap ten sinh vien muon tim : ");
        String name = sc.nextLine();
        if(HMSV.containsKey(name)){
            System.out.println(HMSV.get(name));
        }
        sc.close();

    }
}
