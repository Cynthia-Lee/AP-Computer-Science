public class Student{
    private String name;
    private int[] test;
    private double average;
    public static int count;
    
    public Student(){ //default constructor
       name = "";
       int[] zeros = new int[10];
       test = zeros;
       count++;
    }
    
    public Student(String nm){  //constructor for name only
       nm = name;
       int[] blank = new int[10];
       test = blank;
       count++;
    }
    
    public Student(String nm, int[] arr){ //constructor for name and scores  (careful not to change the test array size from 10 or you won't be able to add scores later)
        nm = name;
        test = arr;
        count++;
        
    }
   
   public void setName(String n){
       n = name;
   }
    
    public void setScore(int sc, int i){ //score, index of exam
       test[i]=sc;
    }
    
    public String getName(){
        return name;
    }
    
    public int getScore(int i){  //return the i'th test score of a student
        return test[i];
    }
    
    public double getTestAverage(){  //return a student's test average (careful not to average the 0's at the end of the array!!)
        double sum = 0;
        int totalTests = 0;
         for(int s = test.length-1; s>=0; s--) {
            if(test[s]==0) {
                s = s-1;
            } else {
                totalTests = s+1;
                break;
            }
        }
        for(int s = test.length-1; s>=0; s--) {
            if(test[s]==0) {
                s = s-1;
            } else {
            sum = sum+test[s];
            }
        }
        return sum/totalTests;
    }
    
     public void getStudentInfo(){  //print the student's name, their average, and all their test scores.
       System.out.println(name);
       System.out.println(getTestAverage());
       for(int i = 0; i<test.length;i++) {
           System.out.print(test[i]);
       }
    }
}
