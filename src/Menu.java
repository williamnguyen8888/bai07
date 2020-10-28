import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public CBGV addCBNV() {
        CBGV cbgv = new CBGV();
        System.out.println("Mời bạn nhập id CBGV");
        cbgv.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Mời bạn nhập tên CBGV");
        cbgv.setName(scanner.nextLine());
        System.out.println("Mời bạn nhập ngày tháng năm sinh với định dạng yyyy/mm/dd ");
        cbgv.setBirthDay(scanner.nextLine());
        System.out.println("Mời bạn nhập giới tính của CBGV " + cbgv.getName());
        cbgv.setGender(scanner.nextLine());
        System.out.println("Mời bạn nhập môn phụ trách của CBGV " + cbgv.getName());
        cbgv.setSpecialize(scanner.nextLine());
        System.out.println("Mời bạn nhập lương cứng của CBNV " + cbgv.getName());
        cbgv.setNormalSalary(Integer.parseInt(scanner.nextLine()));
        System.out.println("Mời bạn nhập số tiền thưởng tháng " + LocalDate.now().format(DateTimeFormatter.ofPattern("MM-yyyy")) + " của CBGV " + cbgv.getName());
        cbgv.setBonus(Integer.parseInt(scanner.nextLine()));
        System.out.println("Mời bạn nhập số tiền phạt tháng " + LocalDate.now().format(DateTimeFormatter.ofPattern("MM-yyyy")) + " của CBGV " + cbgv.getName());
        cbgv.setMonetaryFine(Integer.parseInt(scanner.nextLine()));

        cbgv.setRealSalary(cbgv.getNormalSalary()+ cbgv.getBonus()-cbgv.getMonetaryFine());

        return cbgv;
    }
}
