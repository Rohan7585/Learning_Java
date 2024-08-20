//Question: You have to create a class "Student" with id(int), name(String), age(int), marks(int) and you have to encasulate these. Now you have to create 2 method to find the maximum aged student and anoyher one for check a given id.
//package OOPs;
import java.util.ArrayList;
import java.util.Scanner;

public class Student_question{
    public static void main(String[] Args){
        Scanner n = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int num = n.nextInt();
        ArrayList<student> arr = new ArrayList<>();
        for(int i=0; i<num; i++){
            System.out.print("Enter the ID: ");
            int id = n.nextInt();
            n.nextLine();
            System.out.print("Enter the name: ");
            String name =n.nextLine();
            System.out.print("Enter the age: ");
            int age = n.nextInt();
            System.out.print("nter the marks: ");
            int marks = n.nextInt();
            student s = new student(id, name, age, marks);
            arr.add(s);
        }

        System.out.println("The most aged student: ");
        student maxAged = maxAgeStudent(arr);
        System.out.println("Student ID: " + maxAged.getID());
        System.out.println("Student name: " + maxAged.getName());
        System.out.println("Student age: " + maxAged.getAge());
        System.out.println("Student marks: " + maxAged.getNarks());

        System.out.println("Enter an ID to search: ");
        int id = n.nextInt();
        student searchedID = searchID(arr, id);
        if(searchedID == null){
            System.out.println("Entered ID is not found.");
        }
        else{
            System.out.println("Student ID: " + searchedID.getID());
            System.out.println("Student name: " + searchedID.getName());
            System.out.println("Student age: " + searchedID.getAge());
            System.out.println("Student marks: " + searchedID.getNarks());
        }
        n.close();
    }
    public static student maxAgeStudent(ArrayList<student> ls){
        int maxAge = ls.get(0).getAge();
        student result = ls.get(0);
        for(student i: ls){
            if(maxAge<i.getAge()){
                maxAge = i.getAge();
                result = i;
            }
        }
        return result;
    }
    public static student searchID(ArrayList<student> ls, int id) {
        for(student i : ls){
            if(i.getID() == id) return i;
        }
        return null;
    }
}

class student{
    private int id;
    private String name;
    private int age;
    private int marks;

    //Constructors
    student(int id, String name, int age, int marks){
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public int getID(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public int getNarks(){
        return this.marks;
    }
}