import java.util.*;

/**
 * You will write code to find the index of an element, target, in a sorted array, arr, by the following rules:
 * 1) Set low to 0 and high to arr. length-1
 * 2) If low > high, then the search ends and should return -1. Otherwise, find the index of the middle, mid, of arr[low] and arr[high].
 * 3) If arr[mid] = target, then the search is complete and return mid.
 * 4) If arr[mid] < target, then the target must be to the right of arr[mid] so set low=mid+1 and repeat step 2.
 * 5) If arr[mid] > target, then the target must be to the left of arr[mid] so set high=mid-1 and repeat step 2.
 * 
 * Your assignment:
 * 1) Complete the binary search method using a loop
 * 2) Complete the recursive binary search method
 * 3) Complete the binary search method for Arraylists.
 * 4) Complete the binary search method using a loop for Strings.
 * 5) Test each method twice (an element in the array and an element not in the array) in the main method
 * 6) I should be able to compile and run your code and see each output annotated. For example: 
 * Here is my array: [1, 6, 7, 9, 15, 20]
 * The looped binary search method found 7 at index 2.
 * The looped binary search method did not find 8 and returned -1.
 * ...
 */

public class Main {

    public static void main(String[] args) {
        
        int[] arr = {1,6,7,9,15,20};
        System.out.println(binSearchLoop(arr, 7));
        System.out.println(binSearchLoop(arr, 8));
        System.out.println();
        
        System.out.println(binSearchRecursive(arr, 7));
        System.out.println(binSearchRecursive(arr, 8));
        System.out.println();

        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(6);
        lst.add(7);
        lst.add(9);
        lst.add(15);
        System.out.println(binSearchList(lst, 7));
        System.out.println(binSearchList(lst, 8));
        System.out.println();
        
        String[] arry = {"Hello","Hi","hello","hi"};
        System.out.println(binSearchString(arry, "hello"));
        System.out.println(binSearchString(arry, "hey"));
    }
    
    /* 1) Complete the binary search method using a loop
    * @param arr    sorted array of ints
    * @param target target to search for in array
    * @return       index of target, -1 if target not found
    *
    */
    public static int binSearchLoop(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;
        while (low<=high) { 
            int mid = (low+high)/2;
            
            if (arr[mid] == target)
                return mid;
            
            else if (arr[mid] < target)
                low = mid+1; //number must be on the right side of the mid
            
            else 
                high = mid -1; //arr[mid]>target, number must be on the left side of the mid
        }
        return -1;
    }
    
    /* Call this method in the main for the recursive method. It will set the low
    * and high to the first and last indicies of the array automatically.
    * @param arr    sorted array of ints
    * @param target target to search for in array
    * @return       index of target, -1 if target not found
    */
    public static int binSearchRecursive(int[] arr, int target) {
        return binSearchRec(arr, target, 0, arr.length-1);
    }
    
    /* 2) Complete the recursive binary search method
    * @param arr    sorted array of ints
    * @param target target to search for in array
    * @param low    left index of the subarray
    * @param high   right index of the subarray
    * @return       index of target, -1 if target not found
    */
    public static int binSearchRec(int[] arr, int target, int low, int high) {
        while (low<=high) { 
            int mid = (low+high)/2;
            
            if (arr[mid] == target)
                return mid;
            
            else if (arr[mid] < target)
                return binSearchRec(arr, target, mid+1, high); //number must be on the right side of the mid
            
            else 
                return binSearchRec(arr, target, low, mid-1); //arr[mid]>target, number must be on the left side of the mid
        }
        return -1;
    }
    
    /* 3) Complete the binary search method for Arraylists.
    * @param lst    sorted arraylist of Integers
    * @param target target to search for in arraylist
    * @return       index of target, -1 if target not found
    */
    public static int binSearchList(ArrayList<Integer> lst, int target) {
        int low = 0;
        int high = lst.size()-1;
        while (low<=high) { 
            int mid = (low+high)/2;
            
            if (lst.get(mid) == target)
                return mid;
            
            else if (lst.get(mid) < target)
                low = mid+1; //number must be on the right side of the mid
            
            else 
                high = mid -1; //arr[mid]>target, number must be on the left side of the mid
        }
        return -1;
    }
    
    /* 4) Complete the binary search method using a loop for Strings.
    * @param arr    sorted array of Strings
    * @param target target to search for in array
    * @return       index of target, -1 if target not found
    */
    public static int binSearchString (String[] arr, String target) {
        int low = 0;
        int high = arr.length-1;
        while (low<=high) { 
            int mid = (low+high)/2;
            
            if (arr[mid].equals(target))
                return mid;
            
            else if (arr[mid].compareTo(target)<0)//if first word is less than second word, you would get a negative number
                low = mid+1; //number must be on the right side of the mid
            
            else 
                high = mid -1; //arr[mid]>target, number must be on the left side of the mid
        }
        return -1;
    }
}
