// Creating a class StudentsGrade to calculate marks, percentage and grade

import java.util.Scanner;

class StudentsGrade {

    // Creating a method to generate random 2-digit marks for students
    public static int[][] generatePCMScores(int students) {

        int[][] marks = new int[students][3];

        for (int i = 0; i < students; i++) {
            marks[i][0] = (int)(Math.random() * 90) + 10; 
            marks[i][1] = (int)(Math.random() * 90) + 10; 
            marks[i][2] = (int)(Math.random() * 90) + 10; 
        }
        return marks;
    }

    // Creating a method to calculate total, average and percentage
    public static double[][] calculateResults(int[][] marks) {

        double[][] result = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    // Creating a method to find grade 
    public static String getGrade(double percentage) {

        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R";
    }

    // Creating a method to display the scorecard
    public static void displayScoreCard(int[][] marks, double[][] result) {

        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i][0] + "\t" +marks[i][1] + "\t" +marks[i][2] + "\t" +result[i][0] + "\t" +result[i][1] + "\t" +result[i][2] + "\t" +getGrade(result[i][2]));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
	
	//taking user's input
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
	
	//calling funcitons and storing results
        int[][] marks = generatePCMScores(students);
        double[][] results = calculateResults(marks);
	
	//displaying result
        displayScoreCard(marks, results);

        sc.close();
    }
}
