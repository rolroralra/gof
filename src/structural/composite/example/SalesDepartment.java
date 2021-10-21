package structural.composite.example;

/**
 * Created by Gebruiker on 5/1/2018.
 */
public class SalesDepartment implements Department {

    private Integer id;
    private String name;

    public SalesDepartment(Integer id, String name) {
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
        return "SalesDepartment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
