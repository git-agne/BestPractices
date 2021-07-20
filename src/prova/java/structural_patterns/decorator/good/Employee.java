package prova.java.structural_patterns.decorator.good;

public interface Employee {

    String getRoles();

}

class EmployeeBasic implements Employee {

    @Override
    public String getRoles() {
        return "Employee";
    }

}

class EmployeeDecorator implements Employee {

    private Employee employee;

    public EmployeeDecorator(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getRoles() {
        return this.employee.getRoles();
    }
}

class ProjectManager extends EmployeeDecorator {

    public ProjectManager(Employee employee) {
        super(employee);
    }

    @Override
    public String getRoles() {
        return super.getRoles()+", Project Manager";
    }

}

class AdministrativeManager extends EmployeeDecorator {

    public AdministrativeManager(Employee employee) {
        super(employee);
    }

    @Override
    public String getRoles() {
        return super.getRoles()+", Administrative Manager";
    }

}
