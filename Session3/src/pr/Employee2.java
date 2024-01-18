package pr;

public class Employee2
{
   
    private static int totalSalary = 0;

    private static int empNo=0;
    private double salary;

    public Employee2(int salary) 
    {
        this.salary = salary;
        totalSalary += salary;
        this.empNo=empNo;
        empNo++;
    }

    public static void displayTotalSalary() 
    {
        System.out.println("Total employees are : " + empNo);
        System.out.println("Total salary of all employee: " + totalSalary);
    }

    public static void main(String[] args) 
    {
        Employee2 emp1 = new Employee2(67890);
        Employee2 emp2 = new Employee2(64446);

        displayTotalSalary();
    }
}
