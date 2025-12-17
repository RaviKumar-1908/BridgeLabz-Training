// creating a class PensDistribution to find non-distributed pens
class PensDistribution{
    public static void main(String[] args){
        //Taking a variable to store total pen available
        int pens = 14;

        //Taking a variable to store total students
        int students = 3;

        //Displaying the result
        System.out.println("The Pen per student is " + (pens / students) + " and the remaining pen not distributed is " + (pens % students));


    }
}