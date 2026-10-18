public class FullTime extends Employee{
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public FullTime(){super();}
    public FullTime(String id, String name, double baseSalary, double bonus){
        super(id, name, baseSalary);
        this.bonus=bonus;
    }
    @Override
    public double caculateSalary(){
        return super.getBaseSalary() + bonus;
    }
}
