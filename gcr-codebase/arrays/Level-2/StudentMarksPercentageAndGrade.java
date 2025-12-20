//create a class StudentMarksPercentageAndGrade
import java.util.Scanner;
class StudentMarksPercentageAndGrade{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        //taking number of students
        int students = sc.nextInt();

        double[] percentage = new double[students];
        String[] grade = new String[students];

        //taking input and calculating result
        for(int index = 0; index < students; index++){
            double physics = sc.nextDouble();
            double chemistry = sc.nextDouble();
            double maths = sc.nextDouble();

            if(physics < 0 || chemistry < 0 || maths < 0){
                index--;
                continue;
            }

            percentage[index] = (physics + chemistry + maths) / 3;

            if(percentage[index] >= 80)
                grade[index] = "Level 4, above agency-normalized standards";
            else if(percentage[index] >= 70)
                grade[index] = "Level 3, at agency-normalized standards";
            else if(percentage[index] >= 60)
                grade[index] = "Level 2, below, but approaching agency-normalized standards";
            else if(percentage[index] >= 50)
                grade[index] = "Level 1, well below agency-normalized standards";
            else if(percentage[index] >= 40)
                grade[index] = "Level 1-, too below agency-normalized standards";
            else
                grade[index] = "Remedial standards";
        }

        //displaying result
        for(int index = 0; index < students; index++){
            System.out.println(percentage[index] + " " + grade[index]);
        }

        sc.close();
    }
}
