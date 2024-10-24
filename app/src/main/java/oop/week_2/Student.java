package oop.week_2;


public class Student{
    private String name;
    private StudyProgram sp;
    
    
    //Setter Name
    public void setName(String name){
        this.name = name;
    }
    
    //Setter Study Program
    public void setSP(StudyProgram sp){
        this.sp = sp;
    }
    
    //Getter Name
    public String getName(){
        return this.name;
    }
    
    //Getter StudyProgram
    public String getSP(){
        return this.sp.getName();
    }
    
    public void displayStudent(){
        System.out.println("Student: " + this.name);
        System.out.println("Study Program: " + this.name);
    }
}