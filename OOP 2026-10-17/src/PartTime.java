public class PartTime extends Employee{
    private int hours;
    private double rate;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    public PartTime(){super();}
    public PartTime(String id, String name, int hours, double rate){
        super(id,name, 0);
        this.hours=hours;
        this.rate=rate;
    }

    @Override
    public double caculateSalary(){
        return hours*rate;
    }
}
