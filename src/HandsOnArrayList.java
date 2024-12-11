import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class HandsOnArrayList {
    ArrayList<String> students = new ArrayList<>();

    public void addStudent(Student student) {
        try{
            students.add(String.valueOf(student));
            System.out.println( "added: " + student);
        }catch(Exception e){
            System.out.println("failed to add" + e.getMessage());
        }
    }

    public void displayStudent() {
        System.out.println("\n Student List: ");
        try{
            Iterator<String> iterator = students.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }

        }catch(Exception e){
            System.out.println("failed to display" + e.getMessage());
        }


    }
    public void sortStudent() {
        ArrayList<String> students = new ArrayList<>(List.of("Bea","Anthony","Ethan","Cardel","Deshawn" ));
        System.out.println("Original list" + students);
        Collections.sort(students);
        System.out.println("Sorted list" + students);
    }
    public void removeStudent(Student student) {
        boolean removed = students.remove(String.valueOf(student));
        try{
            if(removed){
                System.out.println( "removed: " + student);
            }else{
                System.out.println( "not removed: " + student);
            }
        }catch(Exception e){
            System.out.println("failed to remove" + e.getMessage());
        }
    }


    }





