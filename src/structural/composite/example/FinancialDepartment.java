package structural.composite.example;


public class FinancialDepartment implements Department {

    private Integer id;
    private String name;

    public FinancialDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printDepartmentName() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "FinancialDepartment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
