/**
 *  
 * 1  In the Student class, complete the three constructors, one that will take a String to initialize the student name, and an int array 
 *    that will initialize their test scores, a constructor that will initialize just the name and a blank array of scores, and a
 *    default constructor that will set the string to "" and the array of zeroes.
 * 2  Increment the static variable for the student count every time a constructor is called.
 * 3  Complete the setter and getter methods for student name and test score.
 * 4  Complete the getTestAverage method that will calculate the avarage for each student.
 * 5  Complete the getStudentInfo method that will print the student's name, their average, and all their test scores.
 
 * 6  Complete the constructor of the gradebook class that takes one int variable which sets the number of students in the class.
 * 7  In the gradebook class, complete the getClassAverage method that will calculate the class average for each test. Also complete the getClassMin and
 *    getClassMax methods to find the high and low scores on each test. 
 
 * 8  In the main method, instantiate a new gradebook. Add  at least 3 students to it.  Assign them names and two test scores each
 *    by using each of the different constructors and appropriate setter methods.
 * 9  Use your getTestAverage method to find the avarage of each student. Use the getClassAverage method
 *    to find the class average for each test. Get the max and min grade for each test.
 * 10 Add a third test grade for each student.  Recalculate their averages, the class average, and the max and min for this test.
 * 
 */

public class Main {

    public static void main(String[] args) {
        Gradebook teacher = new Gradebook(3);

        teacher.gradebook[0] = new Student();
        teacher.gradebook[0].setName("Duster");
        teacher.gradebook[0].setScore(90,0);
        teacher.gradebook[0].setScore(91,1);
        teacher.gradebook[1] = new Student("Ness");
        teacher.gradebook[1].setScore(100,0);
        teacher.gradebook[1].setScore(100,1);
        teacher.gradebook[2] = new Student("Lucas",new int[]{96,99,0,0,0,0,0,0,0,0});
        
    
        
        System.out.println("Student 1 test average: "+teacher.gradebook[0].getTestAverage());
        System.out.println("Student 2 test average: "+teacher.gradebook[1].getTestAverage());
        System.out.println("Student 3 test average: "+teacher.gradebook[2].getTestAverage());
        
        System.out.println("Test 1 class average: "+teacher.getClassAverage(0));
        System.out.println("Test 2 class average: "+teacher.getClassAverage(1));

        System.out.println("Test 1 lowest class score: "+teacher.getClassMin(0));
        System.out.println("Test 2 lowest class score: "+teacher.getClassMin(1));
        
        System.out.println("Test 1 highest class score: "+teacher.getClassMax(0));
        System.out.println("Test 2 highest class score: "+teacher.getClassMax(1));
        
        teacher.gradebook[0].setScore(92,2);
        teacher.gradebook[1].setScore(100,2);
        teacher.gradebook[2].setScore(98,2);
        System.out.println();
        System.out.println("Third test scores added.");
        System.out.println();
        
        System.out.println("Student 1 test average: "+teacher.gradebook[0].getTestAverage());
        System.out.println("Student 2 test average: "+teacher.gradebook[1].getTestAverage());
        System.out.println("Student 3 test average: "+teacher.gradebook[2].getTestAverage());
        System.out.println("Test 3 class average: "+teacher.getClassAverage(2));
        
        System.out.println("Test 3 lowest class score: "+teacher.getClassMin(2));
        System.out.println("Test 3 highest class score: "+teacher.getClassMax(2));
    }
}
