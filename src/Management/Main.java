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
public class Main {
    public static void remove_by_id(ArrayList<Student> s) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap id muon xoa: ");
    int k = sc.nextInt();
    
    Iterator<Student> iterator = s.iterator();
    while (iterator.hasNext()) {
        Student st = iterator.next();
        if (check_id(k, st)) {
            iterator.remove();
            System.out.println("Xoa thanh cong!");
            }
        }
    }   

public static boolean check_id(int k, Student s) {
    return k == s.id;
}
    public static void add(ArrayList<Student> s){
        Student st = new Student();
        st.Input();
        for(Student var : s){
            while(check_id(var.id, st )!= false){
            System.out.println("Id da ton tai!!");
            st.Input();
        }
        }
        s.add(st);
    }
    public static void show(ArrayList<Student> s){
        for(Student st:s){
            st.Output();
        }
    }
    public static void show_by_total(ArrayList<Student> s){
        Comparator<Student> totalComparator = new Comparator<Student>(){
            @Override
            public int compare(Student s1, Student s2) {
                return Float.compare(s1.Total(),s2.Total() );
            }
        };
        Collections.sort(s,totalComparator);
        //nếu muốn sắp xếp theo thứ tự giảm dần thì làm như sau: 
        //Comparator<Student> totalComparator = new Comparator<Student>(){
            //@Override
            //public int compare(Student s1, Student s2) {
                //return Float.compare(s2.Total(),s1.Total() );//thay doi dong nay
            //}
        //};
        show(s);
    }
    public static void search_by_id(ArrayList<Student> s){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id thi sinh muon tim kiem: ");
        int k = sc.nextInt();
        for(Student st : s){
            if(k == st.id){
                System.out.println("====KET QUA====");
                st.Output();
            }
        }
        int dem = s.size();
        for(Student st : s){
            if(k != st.id){
                dem--;
            }
        }
        if(dem == 0){
            System.out.println("Id khong ton tai!");
        }
    }
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        //menu 
        do{
            System.out.println("1. Nhap them 1 thi sinh.");
            System.out.println("2. Hien thi danh sach thi sinh.");
            System.out.println("3. Xoa thi sinh bang id.");
            System.out.println("4. Hien thi danh sach thi sinh sap theo tong diem.");
            System.out.println("5. Tim kiem theo id.");
            System.out.println("6. Thoat.");
            System.out.println("=====");
            System.out.print("Lua chon cua ban: ");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice){
                case 1 -> add(s);
                case 2 -> show(s);
                case 3 -> remove_by_id(s);
                case 4 -> show_by_total(s);
                case 5 -> search_by_id(s);
                case 6 -> System.exit(0);
                default -> System.out.println("Error choice!");
            }
        }while(choice != 6);
    }
}
