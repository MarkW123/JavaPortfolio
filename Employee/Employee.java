
package Employee;

/**
 *
 * author:  Mark Williams
 * date:    December 2018
 * program description: An employee has a name, current salary and the 
 * salary can be raised.
 */



public class Employee {
    
    private String name;
    private double salary;
    private double raise;
    
    
    public Employee(String employeeName, double currentSalary)
    {
        name = employeeName;
        salary = currentSalary;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    public void raiseSalary(double byPercent)
    {
        raise = byPercent;
        salary = salary + salary*raise;
    }
}
