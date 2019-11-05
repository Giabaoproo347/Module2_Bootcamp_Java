import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Khai báo mảng kiểu thông thường
        String[] sdtudents = new String[5];
        sdtudents[0] = "Tùng";

        // Khai báo kiểu Array list, <String> : kiểu dữ liệu
        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("Tùng");
        studentList.add("Nam");
        studentList.add("Bách");

        // Thêm "ĐỨc vào vị trí 0
        studentList.add(0, "Đức");

        // Xóa phần tử tại vị trí 1
        studentList.remove(1);

        // In ra màn hình:
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
        studentList.remove(1);

        // Cách khác để in
        Iterator iterable = studentList.iterator();
        while (iterable.hasNext())// kiểm tra xem còn phần tử ko
        {
            System.out.println(iterable.next());
        }

        // Mảng đa chiều
        ArrayList<ArrayList<String>> mutilDimension = new ArrayList<>();
        ArrayList<String> firstArray = new ArrayList<>();
        firstArray.add("Tùng");
        firstArray.add("nam");
        mutilDimension.add(firstArray);

        ArrayList<String> secondaryArr = new ArrayList<>();
        secondaryArr.add("Đức");
        secondaryArr.add("Bách");

        mutilDimension.add(secondaryArr);

        for (int x = 0; x < mutilDimension.size(); x++) {
            System.out.println("multiDemention");
            ArrayList<String> currentArr = mutilDimension.get(x);
            for(int y = 0; y < currentArr.size();y++) {
                System.out.println(currentArr.get(y));
            }
    }





    }
}
