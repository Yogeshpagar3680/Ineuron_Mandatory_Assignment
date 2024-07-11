package question7;

import java.util.Scanner;

/**
 * Create a Java program that implements a binary search algorithm. The program
 * should accept user input for the target value and search for it in a sorted array. The
 * program should return the index of the target value if found or a message if not
 * found.
 */
public class BinarySearchExample {

    public void binarySearch(int arr[], int first, int last, int key){
         int mid = (first + last)/2;

         while (first <= last){
             if(arr[mid] < key){
                 first = mid + 1;
             }
             else if(arr[mid] == key){
                 System.out.println("Element is found at index : " + mid);
                 break;
             }
             else {
                 last = mid - 1;
             }
             mid = (first + last)/2;
         }
         if(first > last)
             System.out.println("Element is not found!");
    }
}
class LaunchBinarySearch{
    public static void main(String[] args) {

        BinarySearchExample b = new BinarySearchExample();

        int arr[] = {10,20,30,40,50};
        System.out.println("Please enter key : ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int last = arr.length-1;

        b.binarySearch(arr, 0, last, key);
    }
}
