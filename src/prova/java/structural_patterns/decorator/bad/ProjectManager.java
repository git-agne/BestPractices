package prova.java.structural_patterns.decorator.bad;

public class ProjectManager extends Employee
{
    public ProjectManager(String role) {
        super(role);
    }

    @Override
    public void getRole() {
        super.getRole();
        System.out.print("e sono un project manager");
    }
}
