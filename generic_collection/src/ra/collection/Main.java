package ra.collection;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // thêm phần tử vào list
        list.add("Nguyên Văn A");
        list.add("Nguyêễn Văn B");
        list.add("Nguyễn Văn C");
        list.add("Nguyễn Văn D");
        // xóa phần tử
        list.remove("Nguyên Văn A");
        list.remove(1);
        // lấy về kích thước của list
        System.out.println(list.size());
        list.set(1,"Nguyễn Văn Đê");
        for (String item : list) {
            System.out.println(item);
        }
    }
}
