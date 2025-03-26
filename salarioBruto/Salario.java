public class Salario {

    public double netSalary, grossSalary, tax, percentage;
    public String name;


    public double netSalary(){
        netSalary = grossSalary - tax;
        return netSalary;
    }

    public void IncreaseSalary(double percentage) {
        //this.percentage += percentage;
        grossSalary = grossSalary + (grossSalary * (percentage / 100.0));

    }
    
    @Override
    public String toString() {
        return name
            + ", "
            + "$"
            + String.format("%.2f", grossSalary);
    }
}
