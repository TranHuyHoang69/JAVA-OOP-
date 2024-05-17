package BaiTapChuong4.Map;

import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
public class TreeMapSwap {
    public static void main(String[] args) {
        TreeMap<Integer,Double> treeMapSwap = new TreeMap<>();
        treeMapSwap.put(1,5.3d);
        treeMapSwap.put(6, 55.86d);
        treeMapSwap.put(2, 12.4d);
        treeMapSwap.put(3, 653d);
        treeMapSwap.put(4,44.4d);
        System.out.println("Cac phan tu trong treeMap : ");
        Set<Map.Entry<Integer,Double>> setTreeMap = treeMapSwap.entrySet();
        System.out.println(setTreeMap);
        treeMapSwap.replace(2, 12d);
        treeMapSwap.replace(3, 653d, 666d);
        System.out.println("Cac phan tu cua treeMap sau khi swap : ");
        System.out.println(setTreeMap);
    }
}
