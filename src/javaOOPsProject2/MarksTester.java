package javaOOPsProject2;

public class MarksTester {
    public static void main(String[] args) {
        StudentA a = new StudentA(85,90,86);
        a.getPercentage();
        System.out.println("The average percentage of marks for student A are: "+a.getPercentage()+"%");
        StudentB b= new StudentB(90,88,89,90);
        System.out.println("The average percentage of marks for student B are: "+b.getPercentage()+"%");
    }
}
