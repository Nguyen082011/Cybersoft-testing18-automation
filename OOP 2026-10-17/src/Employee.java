abstract public class Employee {
    private String id;
    private String name;
    private Double baseSalary;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Employee(){}
    public Employee(String id, String name, double baseSalary){
        this.id=id;
        this.name=name;
        this.baseSalary=baseSalary;
    }
//    do tính lương mổi class khác nhau nên define hàm tính lương
//    thuôc dạng abstract
    abstract public double caculateSalary();
}
