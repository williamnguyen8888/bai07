public class CBGV extends CanBo {
    private String specialize;
    private int bonus;
    private int monetaryFine;
    private int normalSalary;
    private int realSalary;

    public CBGV() {

    }

    public CBGV(int id, String name, String birthDay, String gender, String specialize, int bonus, int monetaryFine, int normalSalary, int realSalary) {
        super(id, name, birthDay, gender);
        this.specialize = specialize;
        this.bonus = bonus;
        this.monetaryFine = monetaryFine;
        this.normalSalary = normalSalary;
        this.realSalary = realSalary;
    }

    public String getSpecialize() {
        return specialize;
    }

    public int getBonus() {
        return bonus;
    }

    public int getMonetaryFine() {
        return monetaryFine;
    }

    public int getNormalSalary() {
        return normalSalary;
    }

    public int getRealSalary() {
        return realSalary;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void setMonetaryFine(int monetaryFine) {
        this.monetaryFine = monetaryFine;
    }

    public void setNormalSalary(int normalSalary) {
        this.normalSalary = normalSalary;
    }

    public void setRealSalary(int realSalary) {
        this.realSalary = realSalary;
    }

    @Override
    public String toString() {
        return super.toString() +
                "specialize='" + specialize + '\'' +
                ", bonus=" + bonus +
                ", monetaryFine=" + monetaryFine +
                ", normalSalary=" + normalSalary +
                ", realSalary=" + realSalary+
                '}';
    }
}
