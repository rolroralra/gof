package structural.composite.example;


import org.junit.jupiter.api.Test;

public class CompositeDemo {

    @Test
    public void main() {
        Department salesDepartment = new SalesDepartment(1, "Sales department");
        Department financialDepartment = new FinancialDepartment(2, "Financial department");

        HeadDepartment headDepartment = new HeadDepartment(3, "Head department");

        headDepartment.addDepartMent(salesDepartment);
        headDepartment.addDepartMent(financialDepartment);

        HeadDepartment masterDepartment = new HeadDepartment(4, "Master department");
        masterDepartment.addDepartMent(headDepartment);

        headDepartment.printDepartmentName();

        System.out.println();

        masterDepartment.printDepartmentName();
    }
}
