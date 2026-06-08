import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student{
    private int id;
    private String name;
    private int age;
    private double gpa;
    private static int countStudent;
    private static final double MIN_GPA = 0.0d;
    private static final double MAX_GPA = 4.0d;

    public Student(String name, int age, double gpa){
        this.id = countStudent++;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public void printInfor(){
        System.out.printf("Mã sinh viên: %d\n", this.id);
        System.out.printf("Tên sinh viên: %s\n", this.name);
        System.out.printf("Tuổi sinh viên: %d\n", this.age);
        System.out.printf("Điểm sinh viên: %.1f\n", this.gpa);
    }
}

public class Bai3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        for(int i=0; i<3; i++){
            list.add(new Student(sc.nextLine(), Integer.parseInt(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        for(var x : list){
            x.printInfor();
        }
    }
}
