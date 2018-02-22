/**
 * 1) Set the static variable ch to '#'
 * 2) Create a left aligned right triangle of '#' of length 8
 * 3) Set the static variable ch to '@'
 * 4) Create a right aligned right triangle of '@' of length 10
 * 5) Set the static variable ch to '*'
 * 6) Create an centered isosceles triangle of '*' in which the number of rows is 12
 * 7) Set the static variable ch to any other character
 * 8) Create a diamond
 */

public class Main {

    public static void main(String[] args) {
        Triangle.ch = '#';
        Triangle.printLeftTriangle(8);
        System.out.println(" ");
        
        Triangle.ch = '@';
        Triangle.printRightTriangle(10);
        System.out.println(" ");
        
        Triangle.ch = '*';
        Triangle.printCenterTriangle(12);
        System.out.println(" ");
        
        Triangle.ch = '&';
        Triangle.printDiamond(5);
    }
}
