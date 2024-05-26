import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks obtained in each subject below:");
        System.out.print("Marks obtained in Mathematics--->");
        int marksMaths=sc.nextInt();
        System.out.print("Marks obtained in Professional Communication in English--->");
        int marksPCE=sc.nextInt();
        System.out.print("Marks obtained in Chemistry--->");
        int marksChemistry=sc.nextInt();
        System.out.print("Marks obtained in Mechanics--->");
        int marksMechanics=sc.nextInt();
        System.out.print("Marks obtained in Introduction to Computing--->");
        int marksCS=sc.nextInt();

        int totalMarks=marksMaths+marksPCE+marksChemistry+marksMechanics+marksCS;
        System.out.println("The total marks obtained by the student is--->"+totalMarks);

         
        double averagePercentage=totalMarks/5.0;
        System.out.println("The average Percentage obtained by the student is--->"+averagePercentage);

        String gradeAssigned;
        if (averagePercentage>90) {
            gradeAssigned="A+";
        }
        else if (averagePercentage>80) {
            gradeAssigned="A";
        }
        else if (averagePercentage>70) {
           gradeAssigned="B"; 
        }
        else if (averagePercentage>60) {
            gradeAssigned="C";
        }
        else if (averagePercentage>50) {
            gradeAssigned="D";
        }
        else if (averagePercentage>40) {
            gradeAssigned="E";
        }
        else {
            gradeAssigned="FAIL";
        }

        System.out.println("Grade accumulated by the student on the basis of averagePercentage is: "+gradeAssigned);

        sc.close();
    }
}
