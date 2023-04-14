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
public class Student extends Person{
    private int address;
    private float diemuutien;

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public float getDiemuutien() {
        return diemuutien;
    }

    @Override
    public void Input(){
        Scanner sc = new Scanner(System.in);
        try{
            super.Input();
            System.out.print("Address: ");
            address = sc.nextInt();
            if(address == 1){
                diemuutien = (float)0.5;
            }
            else if(address == 2){
                diemuutien = (float)1;
            }
            else 
                diemuutien = 0;
        }catch(Exception e){
            System.out.print("Error Input: " + e.getMessage());
            Input();
        }
    }
    @Override
    public float Total(){
        return super.Total() + diemuutien;
    }
    @Override
    public void Output(){
        super.Output();
        Formatter f = new Formatter();
        f.format("%-5d %-5s %-5s",address,String.format("%.2f",diemuutien),String.format("%.2f",Total()));
        System.out.println(f.toString());
        f.close();
    }
}
