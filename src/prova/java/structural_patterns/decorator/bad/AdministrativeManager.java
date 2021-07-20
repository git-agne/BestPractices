package prova.java.structural_patterns.decorator.bad;

public class AdministrativeManager extends Employee
{
    public AdministrativeManager(String role) {
        super(role);
    }

    @Override
    public void getRole() {
        super.getRole();
        System.out.print("e sono un administrative manager");
    }
}
