//Question 1: Create a class "Employee" with fields id (int), name (String), department (String), and salary (double). Encapsulate these fields. Write two methods: one to calculate the average salary of all employees, and another to check if a given department exists.

package BasicOOPsQuestions;
import java.util.Scanner;
import java.util.ArrayList;
public class Question1 {
    public static void main(String[] Args){
        Scanner n = new Scanner(System.in);
        System.out.print("Enter the numbers you want to create objects: ");
        int num = n.nextInt();
        ArrayList<Employee> arr = new ArrayList<>();
        for(int i=0; i<num; i++){
            System.out.print("Enter the ID: ");
            int id = n.nextInt();
            n.nextLine();
            System.out.print("Enter the name: ");
            String name = n.nextLine();
            System.out.print("Enter the department name: ");
            String department = n.nextLine();
            System.out.print("Enter the salary: ");
            double salary = n.nextDouble();

            Employee s = new Employee(id, name, department, salary);
            arr.add(s);
        }
        for(Employee i : arr){
            System.out.println(i.toString());
        }
        n.nextLine();
        System.out.print("Enter department name to search: ");
        String dept = n.nextLine();
        System.out.println("Department " + dept + "is available: " + checkDept(arr, dept));
        System.out.println("Average salary is " + calculateAverageSalary(arr));
        n.close();
    }
    public static boolean checkDept(ArrayList<Employee> arr, String dept){
        for(Employee i: arr){
            if(i.getDepartment().equals(dept))  return true;
        }
        return false;
    }
    public static double calculateAverageSalary(ArrayList<Employee> arr){
        double sum = 0;
        for(Employee i: arr){
            sum = sum + i.getSalary();
        }
        return sum/arr.size();
    }
}

class Employee{
    private final int id;
    private final String name;
    private final String department;
    private final double salary;

    Employee(int id, String name, String department, double salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getDepartment(){
        return this.department;
    }
    public double getSalary(){
        return this.salary;
    }

    @Override
    public String toString() {
        return "Employee{id=" + this.id + ", name='" + this.name + "', department='" + this.department + "', salary=" + this.salary + "}";
    }

}
