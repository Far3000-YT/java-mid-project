package base;

public class Person {
    private final int id;
    private final String name;
    private final String adress;
    private final String mail;

    public Person(int id, String name, String adress, String mail) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.mail = mail;
    }

    public String getInfos() {
        return "person [id=" + id + ", name=" + name + ", adress=" + adress + ", mail=" + mail + "]";
    }
}