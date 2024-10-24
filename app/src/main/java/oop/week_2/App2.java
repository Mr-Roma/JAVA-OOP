package oop.week_2;


public class App2 {
    public static void main(String[] args) {
        StudyProgram sp1 = new StudyProgram();
        StudyProgram sp2 = new StudyProgram();
        
        sp1.setName("Informatics");
        sp2.setName("Software Engineering");
        
        Student s1 = new Student();
        Student s2 = new Student();
        
        s1.setName("Heritsan Yuniawan");
        s2.setName("Nugroho Rahmanto");
        s1.setSP(sp1);
        s2.setSP(sp2);
        
        
        System.out.println("Student 1: ")   ;
        s1.displayStudent();
        
        System.out.println("Student 2: ");
        s2.displayStudent();
    }
}