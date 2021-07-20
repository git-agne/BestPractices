package prova.java.structural_patterns.decorator.good;

public class Main
{
    public static void main(String[] args) {

        Employee e = new EmployeeBasic();
        System.out.println(e.getRoles());
        e = new AdministrativeManager(e);
        System.out.println(e.getRoles());
        e = new ProjectManager(e);
        System.out.println(e.getRoles());



        //Employee e = new ProjectManager(new AdministrativeManager(new EmployeeBasic()));
        //System.out.println(e.getRoles());
    }
}
