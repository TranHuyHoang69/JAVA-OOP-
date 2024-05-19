import java.util.*;
public class Bai4 {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten cac loai trai cay : ");
        while(true){
            String fr = sc.nextLine();
            if(fr.isEmpty()){
                break;
            }
            fruits.add(fr);
        }
        System.out.println("Danh sach cac loai trai cay vua nhap : ");
        System.out.println(fruits);
        System.out.println("Nhap ten loai trai cay muon kiem tra : ");
        String tc = sc.nextLine();
        if(fruits.contains(tc)){
            System.out.println(tc+" co trong danh sach");
        }else{
            System.out.println(tc+" khong tim thay trong danh sach");
        }
        Iterator<String> iterator = fruits.iterator();
        if(iterator.hasNext()){
            String del = iterator.next();
            System.out.println("Xoa thanh cong "+del+" khoi danh sach");
            iterator.remove();
        }
        System.out.println("Danh sach moi : ");
        System.out.println(fruits);
        List<String> listFruits = new ArrayList<>();
        System.out.println("Nhap 1 danh sach trai cay moi : ");
        while(true){
            String newfr = sc.nextLine();
            if(newfr.isEmpty()){
                break;
            }
            listFruits.add(newfr);
        }
        fruits.addAll(listFruits);
        System.out.println("Tong hop 2 danh sach vua nhap : ");
        iterator = fruits.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        fruits.removeAll(listFruits);
        System.out.println("Danh sach ban dau : ");
        for(String fruit : fruits){
            System.out.println(fruit);
        }
        sc.close();
    }
}
