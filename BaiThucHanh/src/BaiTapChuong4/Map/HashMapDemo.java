package BaiTapChuong4.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("1 + 1 ", " 2");
        hashMap.put("6 + 9 ", " 15");
        hashMap.put("10 + 11 ", " 21");
        hashMap.put("20 + 22 ", " 42"); 
        hashMap.put("9 + 10 ", " 21");
        Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet(); 
        System.out.println("Cac entry trong HashMap : ");
        System.out.println(setHashMap);
    }
}
