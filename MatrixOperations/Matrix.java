public class Matrix {
     /** Scalar multiplication of a matrix
     * @param a 2-dimension int array
     * @param scalar scalar multiplier
     * @return the scalar product of a and c as a 2-dimension int array
     * Precondition: Dimensions of a and b are the same
    */
    public static int[][] scalarMultiply(int[][]a, int scalar) {
        int[][] b = new int [a.length][a[0].length];
        
        for(int r = 0;r<a.length;r++) { //rows
			for(int c = 0; c<a[r].length;c++) { //columns	    
			    int n = scalar*a[r][c];
			    b[r][c] = n;
			} 
		}
		return b;
    }
    
    /** Addition of two matrices
     * @param a 2-dimension int array
     * @param b 2-dimension int array
     * @return the sum of a and b as a 2-dimension int array
     * Precondition: Dimensions of a and b are the same
    */
    public static int[][] add(int[][]a, int[][]b) {
        int[][] added = new int [a.length][a[0].length];
        
        //if(a.length==b.length && a[0].length==b[0].length) {
            for(int r = 0;r<a.length;r++) { //rows
    			for(int c = 0; c<a[r].length;c++) { //columns	    
    			    added[r][c]=a[r][c]+b[r][c];
    			} 
    		}
    		return added;
        //}  
    }
    
    /** Difference of two matrices
     * @param a 2-dimension int array
     * @param b 2-dimension int array
     * @return the difference of a and b as a 2-dimension int array
     * Precondition: Dimensions of a and b are the same
    */
    public static int[][] subtract(int[][]a, int[][]b) {
        int[][] sub = new int [a.length][a[0].length];
        
        //if(a.length==b.length && a[0].length==b[0].length) {
            for(int r = 0;r<a.length;r++) { //rows
    			for(int c = 0; c<a[r].length;c++) { //columns	    
    			    sub[r][c]=a[r][c]-b[r][c];
    			} 
    		}
    		return sub;
        //}  
    } 
    
    /** Multiplication of two matrices
     * @param a 2-dimension int array
     * @param b 2-dimension int array
     * @return the product of a and b as a 2-dimension int array
     * Precondition: Number of columns in a equals the number of rows in b
    */
    public static int[][] multiply(int[][]a, int[][]b) {
        int[][] mult = new int [a.length][b[0].length];
        
        //if(a[0].length==b.length) {
            for (int r = 0; r< a.length; r++) { //a rows
                for (int c = 0; c< b[0].length; c++) { //b collumns
                    for (int k = 0; k < a[0].length; k++) { //a collumns
                mult[r][c] = mult[r][c] + a[r][k] * b[k][c];
                    }
                }
            }
            return mult;
        //} 
    }
    /** Transpose of a matrix (rows become columns and columns become rows)
     * @param a 2-dimension int array
     * @return the transpose of a
    */
    public static int[][] transpose(int[][]a) {
        int[][] newArr = new int [a[0].length][a.length];   
        
        for(int r = 0;r<a.length;r++) { //rows
			for(int c = 0; c<a[r].length;c++) { //columns
			    newArr[c][r]=a[r][c];
			} 
		}
        return newArr;
    }
}
