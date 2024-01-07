package javaOOPsProject2;
/*
We have to calculate the average of marks obtained in three subjects by
student A and by student B. Create class 'Marks' with an abstract method
'getPercentage' that will return the average percentage of marks. Provide
implementation of abstract methods in classes 'A' and 'B'. The constructor of
student A takes the marks in three subjects as its parameters and the marks
in four subjects as its parameters for student B. Test your code

 */
public abstract class Marks {
    abstract double getPercentage();
}
class StudentA extends Marks{
    private int biologyMarks;
    private int historyMarks;
    private int englishMarks;

    public StudentA(int biologyMarks, int historyMarks, int englishMarks) {
        this.biologyMarks = biologyMarks;
        this.historyMarks = historyMarks;
        this.englishMarks = englishMarks;
    }

    @Override
    double getPercentage() {
        int totalMarks=biologyMarks+historyMarks+englishMarks;
        double avrPercentage = totalMarks/3.0;
        return avrPercentage;
    }
}
class StudentB extends Marks{
    private int biologyMarks;
    private int historyMarks;
    private int englishMarks;
    private int mathMarks;

    public StudentB(int biologyMarks, int historyMarks, int englishMarks, int mathMarks) {
        this.biologyMarks = biologyMarks;
        this.historyMarks = historyMarks;
        this.englishMarks = englishMarks;
        this.mathMarks = mathMarks;
    }

    @Override
    double getPercentage() {
        int totalMarks= biologyMarks+historyMarks+englishMarks+mathMarks;
        double avrPercentage=  totalMarks/4.0;
        return avrPercentage;
    }
}

