package prova.java.structural_patterns.decorator.bad;

public class Employee implements IEmployee
{
    private String role;

    public Employee(String role) {
        this.role = role;
    }

    @Override
    public void getRole() {
        System.out.print("Sono un dipendente ");
    }
}

class Main
{
    public static void main(String[] args) {
        //Employee e = new Employee("Impiegato");
        //Employee e2 = new Employee("Bubez");

        IEmployee ie = new ProjectManager("XX");
        ie.getRole();

    }
}
