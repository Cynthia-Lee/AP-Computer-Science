public class Gradebook{
    public Student[] gradebook ;
    
    public Gradebook( int n){ // constructor for n students
        gradebook = new Student[n];
    }
    
    public double getClassAverage( int t){  //calculate the class average for the t'th test
        double sum = 0;
        for(int i = 0; i<gradebook.length;i++){
            sum = sum + gradebook[i].getScore(t);
        }
        return sum/Student.count;
    }
    
    public int getClassMin( int t){  //return the lowest score on the t'th test
        int min = gradebook[0].getScore(t);
        for (int x=0; x<gradebook.length; x++ ) {
            if (min > gradebook[x].getScore(t)) {  
                min = gradebook[x].getScore(t);  
            }                    
        }
        return min;
    }
        
    public int getClassMax(int t){  //return the highest score on the t'th test
        int max = gradebook[0].getScore(t);
        for (int x=0; x<gradebook.length; x++ ) {
            if (max < gradebook[x].getScore(t)) {  
                max = gradebook[x].getScore(t);  
            }  
        }    
        return max;
    }
    
   
    
    
}
