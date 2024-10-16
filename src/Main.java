class Employee {
    private String name;
    private String surname;
    private String position;
    private String email;
    private int age;

    public Employee(String name, String surname, String position, String email, int age) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.email = email;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public String getPosition(){
        return this.position;
    }
    public String getEmail(){
        return this.email;
    }
    public int getAge(){
        return this.age;
    }

    public void logIn() {
        System.out.println("----------");
        System.out.println("Zalogowano");
        System.out.println("----------\n");
    }
    public void logOff() {
        System.out.println("----------");
        System.out.println("Wylogowano");
        System.out.println("----------\n");
    }
    public void work() {
        System.out.println("-------------");
        System.out.println("Pracowanie...");
        System.out.println("-------------\n");
    }
    public void endWork() {
        System.out.println("----------------");
        System.out.println("Zakończono prace");
        System.out.println("----------------\n");
    }
}
class Manager extends Employee {
    private String department;
    private int numberOfAssignedEmployees;
    private boolean isloggedIn;

    public Manager(String name, String surname, String position, String email, int age, String department, int numberOfAssignedEmployees, boolean isloggedIn) {
        super(name, surname, position, email, age);
        this.department = department;
        this.numberOfAssignedEmployees = numberOfAssignedEmployees;
        this.isloggedIn = isloggedIn;
    }

    public void assignTask(String task) {
        System.out.println("przypisano " + task + " do pracownika " + getName() + " " + getSurname() + "\n");
    }
    public void showReport() {
        System.out.println("---Raport---");
        System.out.println("Imie: " + getName());
        System.out.println("Nazwisko: " + getSurname());
        System.out.println("Pozycja: " + getPosition());
        System.out.println("Email: " + getEmail());
        System.out.println("Wiek: " + getAge());
        System.out.println("imie: " + getName());
        System.out.println("------------\n");

    }
    public void showManagerData() {
        System.out.println("---Dane menedżera---");
        System.out.println("Dział: " + department);
        System.out.println("Liczba przypisanych pracownikow: " + numberOfAssignedEmployees);
        System.out.println("Czy jest zalogowany: " + isloggedIn);
        System.out.println("--------------------\n");
    }
}

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager("Kacper", "Jajo", "kelner", "email@gmail.com", 90, "Restauracja", 1, false);
        m.logIn();
        m.work();
        m.endWork();
        m.logOff();
        m.showReport();
        m.assignTask("sprzątanie");
        m.showManagerData();
    }
}