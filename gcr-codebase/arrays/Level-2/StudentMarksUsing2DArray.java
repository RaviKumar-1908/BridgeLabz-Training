//create a class StudentMarksUsing2DArray to calculate percentage and grade
import java.util.Scanner;
class StudentMarksUsing2DArray{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        //taking number of students
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        //creating 2D array to store marks of physics, chemistry and maths
        double[][] marks = new double[students][3];
        double[] percentage = new double[students];
        String[] grade = new String[students];

        //taking input marks from user
        for(int index = 0; index < students; index++){
            System.out.print("Enter physics marks: ");
            marks[index][0] = sc.nextDouble();
            System.out.print("Enter chemistry marks: ");
            marks[index][1] = sc.nextDouble();
            System.out.print("Enter maths marks: ");
            marks[index][2] = sc.nextDouble();

            if(marks[index][0] < 0 || marks[index][1] < 0 || marks[index][2] < 0){
                System.out.println("Invalid marks, enter again");
                index--;
                continue;
            }

            //calculating percentage using 2D array
            percentage[index] =
                (marks[index][0] + marks[index][1] + marks[index][2]) / 3;

            //calculating grade based on percentage
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

        //displaying marks, percentage and grade
        for(int index = 0; index < students; index++){
            System.out.println(
                marks[index][0] + " " +
                marks[index][1] + " " +
                marks[index][2] + " " +
                percentage[index] + " " +
                grade[index]
            );
        }

        sc.close();
    }
}
