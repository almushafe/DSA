/* 
 * Bubble Sort resources
 ____________________________
 1* https://www.programiz.com/dsa/bubble-sort#:~:text=Bubble%20sort%20is%20a%20sorting%20algorithm%20that%20compares,array%20move%20to%20the%20end%20in%20each%20iteration.  // Programize
 2* https://www.geeksforgeeks.org/dsa/bubble-sort-algorithm/ // GeeksForGeeks
 3* https://www.tutorialspoint.com/data_structures_algorithms/bubble_sort_algorithm.htm // Tutorialspoint
 4* https://www.tutorialkart.com/algorithms/bubble-sort-algorithm/ // tutorialkart
 5* https://www.guru99.com/bubble-sort.html // Guru99
 6* https://www.w3schools.in/data-structures/sorting-techniques/bubble-sort-algorithm // W3Schools
 7* https://youcademy.org/bubble-sort-step-by-step/ // Youcadeny
 8* https://www.freecodecamp.org/news/bubble-sort-algorithm-in-java-cpp-python-with-example-code/ // FreeCodeCamp
 9* https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/visualize/ // HackerEarth
 10* https://www.wscubetech.com/resources/dsa/bubble-sort // WsCubeTech
 11* https://en.wikipedia.org/wiki/Bubble_sort // Wikipedia
 12* https://www.w3schools.com/dsa/dsa_algo_bubblesort.php // W3Schools
 */

// import java.lang.reflect.Array;
import java.util.*;

public class BubbleSort{
    public static int[] bubble_Sort(int[] arr){
        // System.out.print(Arrays.toString(arr));
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j< n-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
        
        }return arr;
        // System.out.print(n);
    }
    public static void main(String[] args){
        System.out.print("Run This Code ... ");
        int[] stored = bubble_Sort(new int[]{90,20,50,70});
        System.out.print(Arrays.toString(stored));
    }
} 