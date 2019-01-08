package Employee;

/**
 *
 * author:  Mark Williams
 * date:    December 2018
 * program description: Tests the employee class
 */


public class EmployeeTester {

    public static void main(String[] args) {
        
        //create employee object
        Employee harry = new Employee("Morgan, Harry", 50000);
        harry.raiseSalary(10); //Harry gets a 10% raise
        System.out.println(harry.getName());
        System.out.println(harry.getSalary());
        

    }

}
