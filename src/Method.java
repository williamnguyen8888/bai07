import java.util.ArrayList;
import java.util.List;

public class Method {
    List<CanBo> cbnvList = new ArrayList<>();

    public void add(CanBo canBo) {
        cbnvList.add(canBo);
    }

    public void read() {
        for (CanBo canBo : cbnvList) {
            System.out.println(canBo.toString());
        }
    }

    public void salararyThan8m() {
        for (CanBo canBo : cbnvList) {
            if (canBo instanceof CBGV){
                canBo = (CBGV) canBo;
                if (((CBGV) canBo).getRealSalary() >= 8000000){
                    System.out.println(canBo.toString());
                }
            }
        }
    }

}
