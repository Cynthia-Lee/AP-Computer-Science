**
 * 1) Complete the 5 methods of the Matrix class
 * 2) In your main method, declare and initialize matrices to test each method
 * 3) Test each method and Print out each result
 * 4) Challenge: Add methods in the Matrix class to test whether or not you can
 *    add or subtract two matrices
 *    Challenge: Add methods in the Matrix class to test whether or not you can
 *    multiply two matrices
 *    Challenge: Make your code work intuitively with the two methods above
 *    (Ex: Print out "cannot add these matrices" if you cannot add the matrices.)
 */

public class Main {

    public static void main(String[] args) {
        int[][]a={{3,4,3}, {2,7,8}};
        int[][]b={{1,2,3}, {4,5,6}};
        
        int[][]ex1={{0,2}, {-2,-5}};
        int[][]ex2={{6,-6}, {3,0}};
        
        printArr(a);
        System.out.println();
        printArr(Matrix.scalarMultiply(a,2));
        System.out.println();
        printArr(Matrix.add(a,b));
        System.out.println();
        printArr(Matrix.subtract(a,b));        
        System.out.println();
        printArr(Matrix.multiply(ex1,ex2));
        System.out.println();
        printArr(Matrix.transpose(a));
        
        System.out.println();
        printArr(Matrix.add(a,ex1));
        System.out.println();
        printArr(Matrix.subtract(a,ex1));
        System.out.println();
        printArr(Matrix.multiply(a,ex2));
    }
    
    
    
    public static void printArr(int[][]a) {
			for(int r = 0;r<a.length;r++) { //rows
				for(int c = 0; c<a[r].length;c++) { //columns	    
				       System.out.print(a[r][c]+ " ");
				} 
				System.out.println(" ");
			}
		}
}


