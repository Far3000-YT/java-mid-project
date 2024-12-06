package base;

public abstract class Employee extends Person {
    private String numberEmp;
    private String hiringDate;

    public Employee(String ID, String name, String address, String contact, String numberEmp, String hiringDate) {
        super(ID, name, address, contact);
        this.numberEmp = numberEmp;
        this.hiringDate = hiringDate;
    }

    public abstract String getRole();
}
