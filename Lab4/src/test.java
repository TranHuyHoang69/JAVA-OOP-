import java.util.*;
public class test {
    public static void main(String[] args) {
        // Khai báo HashSet có kiểu dữ liệu là String
        HashSet<String> fruitsSet = new HashSet<>();

        // Thêm tên các loại trái cây từ bàn phím vào HashSet
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên các loại trái cây (nhập 'done' để kết thúc):");
        String fruitName = scanner.nextLine();
        while (!fruitName.equals("done")) {
            fruitsSet.add(fruitName);
            fruitName = scanner.nextLine();
        }

        // Hiển thị số phần tử trong HashSet vừa tạo
        System.out.println("Số lượng phần tử trong HashSet: " + fruitsSet.size());

        // Kiểm tra xem loại trái cây có tồn tại trong HashSet không
        System.out.println("Nhập tên loại trái cây để kiểm tra:");
        String checkFruit = scanner.nextLine();
        if (fruitsSet.contains(checkFruit)) {
            System.out.println("Tìm thấy " + checkFruit + " trong HashSet.");
        } else {
            System.out.println("Không tìm thấy " + checkFruit + " trong HashSet.");
        }

        // Xóa 1 loại trái cây bất kỳ và hiển thị các phần tử còn lại
        Iterator<String> iterator = fruitsSet.iterator();
        if (iterator.hasNext()) {
            String removedFruit = iterator.next();
            System.out.println("Đã xóa " + removedFruit + " khỏi HashSet.");
            iterator.remove();
        }
        System.out.println("Các phần tử còn lại trong HashSet:");
        for (String fruit : fruitsSet) {
            System.out.println(fruit);
        }

        // Tạo một List mới và thêm các phần tử vào HashSet ban đầu
        List<String> newFruitsList = new ArrayList<>();
        newFruitsList.add("Apple");
        newFruitsList.add("Banana");
        newFruitsList.add("Orange");
        fruitsSet.addAll(newFruitsList);

        // Hiển thị lại HashSet bằng Iterator
        System.out.println("HashSet sau khi thêm các phần tử từ List:");
        iterator = fruitsSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Xóa các phần tử của List có trong HashSet
        fruitsSet.removeAll(newFruitsList);

        // Hiển thị lại HashSet
        System.out.println("HashSet sau khi xóa các phần tử của List:");
        for (String fruit : fruitsSet) {
            System.out.println(fruit);
        }

        scanner.close();
    }
}


