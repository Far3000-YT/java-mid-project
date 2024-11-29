package base;

public class Employee {
    private final int NumberEmp;
    private final String HiringDate;
    
    public Employee(int numberEmp, String hiringDate) {
        NumberEmp = numberEmp;
        HiringDate = hiringDate;
    }

    public String getRole() {
        return "Employee [NumberEmp=" + NumberEmp + ", HiringDate=" + HiringDate + "]";
    }
}
