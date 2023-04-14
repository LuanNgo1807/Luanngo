/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Management;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class Person {
    public int id;
    protected String name;
    protected int age;
    protected float math;
    protected float physical;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getMath() {
        return math;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public float getPhysical() {
        return physical;
    }

    public void setPhysical(float physical) {
        this.physical = physical;
    }

    public float Total(){
        return math + physical;
    }
    //khởi tạo không đối:
    public Person(){
        
    }
    public Person(int id,String name, int age){    
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
            System.out.print("Id: ");
            id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Age: ");
            age = sc.nextInt();
            sc.nextLine();
            System.out.print("Math: ");
            math = sc.nextFloat();
            sc.nextLine();
            System.out.print("Physical: ");
            physical = sc.nextFloat();
            sc.nextLine();
    }
    public void Output(){
        Formatter f = new Formatter();
        f.format("%-5d %-10s %-5d %-5s %-5s",id, name ,
                age,String.format("%.2f",math), String.format("%.2f",physical));
        System.out.print(f.toString());
    }
}
