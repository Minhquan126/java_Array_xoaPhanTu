import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap phan tu can xoa :");
        String name = scanner.nextLine();
        int index = 0;
        String[] listStudent = {"quan", "ngan", "lam", "khoa"};
        String[] newList = new String[4];
        for (int i = 0; i < listStudent.length; i++) {
            if (listStudent[i].equals(name)) {
continue;
            } else {
                newList[i] = listStudent[i];
            }
            System.out.println("newList :" + newList[i]);
        }
    }
}
