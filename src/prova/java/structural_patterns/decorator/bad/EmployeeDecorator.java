package prova.java.structural_patterns.decorator.bad;

public class EmployeeDecorator implements IEmployee
{
    protected IEmployee iEmployee;

    public EmployeeDecorator(IEmployee IEmployee) {
        this.iEmployee = IEmployee;
    }

    @Override
    public void getRole() {
        this.iEmployee.getRole();
    }
}
