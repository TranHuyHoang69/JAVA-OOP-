 package BaiTapChuong4.Map;

import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
        hm.put(100, "Mo");
        hm.put(101, "Dia");
        hm.put(102, "Chat");
        for(Map.Entry<Integer,String> h:hm.entrySet()){
                System.out.println(h.getKey()+" "+h.getValue());
        }
        System.out.println("Before invoking remove method: "+hm);
        hm.remove(101);
        hm.put(69, "Non");
        System.out.println("After invoking remove method: "+hm);
    }
}