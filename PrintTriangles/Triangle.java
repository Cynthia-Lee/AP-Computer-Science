
public class Triangle {
    public static char ch;
    
    /**Use this method to print a blank space
    * 
    **/
    public static void printSpace() {
        System.out.print(" ");
    }
    
    /**Use this method to print the static class variable ch
    * 
    **/
    public static void printChar() {
        System.out.println(ch);
    }
    
    /**Use this method to print a left aligned right triangle
    * @param length the length of the side of the triangle (how many rows)
    **/
    public static void printLeftTriangle(int length) {
        for(int i = 0; i<length; i++) { //vertical
            System.out.println("");
                for(int j=0; j<=i;j++) { //the amount of ch that is printed, is dependent on i
                    System.out.print(ch+" ");
                }
        }
    }
    
    /**Use this method to print a right aligned right triangle
    * @param length the length of the side of the triangle (how many rows)
    **/
    public static void printRightTriangle(int length) {
        for(int i = 0; i<length; i++) { //vertical
            System.out.println("");
                for(int l=2*(length-i); l>2;  l=l-1) {
                    printSpace();
                }
                        for(int j=0; j<=i;j++) { //the amount of ch that is printed, is dependent on i
                        System.out.print(ch+" ");
                    }
                }    
        }
    
    
    /**Use this method to print a center aligned isosceles triangle
    * @param length the number of rows
    **/
    public static void printCenterTriangle(int length) {
           for(int i = 0; i<length; i++) { //vertical
            System.out.println("");
                for(int l=length-i; l>1;  l=l-1) {
                    printSpace();
                }
                        for(int j=0; j<=i;j++) { //the amount of ch that is printed, is dependent on i
                        System.out.print(ch+" ");
                    }
                }    
        }

    /**Use this method to print a flipped center aligned isosceles triangle
    * @param length the number of rows
    **/
    public static void printFlipCenterTriangle(int length) {
        for(int i = 0; i<length; i++) { //vertical
            System.out.println("");
                for(int l=0; l<length-(length-i);  l++) {
                    printSpace();
                }
                        for(int j=length; j>i; j--) { //the amount of ch that is printed, is dependent on i
                        System.out.print(ch+" ");
                    }
                }    
    }
    
    /**Use this method to print a diamond
    * @param length the number of rows in the top triangle of the diamond
    **/
    public static void printDiamond(int length) {
          for(int i = 1; i<length; i++) { //vertical
            System.out.println("");
                for(int l=length+1-i; l>1;  l=l-1) {
                    printSpace();
                }
                        for(int j=0; j<i;j++) { //the amount of ch that is printed, is dependent on i
                        System.out.print(ch+" ");
                    }
                }    
         printFlipCenterTriangle(length);       
        }
    
}
