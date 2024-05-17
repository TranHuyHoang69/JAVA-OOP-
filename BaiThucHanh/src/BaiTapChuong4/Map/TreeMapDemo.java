package BaiTapChuong4.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map;
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, Character> treeMap = new TreeMap<Integer, Character>();
        treeMap.put(1, 'A');
        treeMap.put(8, 'H');
        treeMap.put(2, 'B');
        treeMap.put(3, 'C');
        treeMap.put(4, 'D');
        treeMap.put(5, 'E');
        Set<Map.Entry<Integer,Character>> setTreeMap = treeMap.entrySet();
        System.out.println("Cac entry cua TreeMap : ");
        System.out.println(setTreeMap);   
    }
}
