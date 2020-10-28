import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Method method = new Method();
        Menu menu = new Menu();

        do {
            System.out.println("1.Thêm nhân viên mới");
            System.out.println("2.Sửa thông tin");
            System.out.println("3.Xóa");
            System.out.println("4.CBGV có thực lĩnh hơn 8tr");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    CanBo canBo = menu.addCBNV();
                    method.add(canBo);
                    method.read();
                    break;
                case 4:
                    method.salararyThan8m();
            }
        } while (true);
    }
}
