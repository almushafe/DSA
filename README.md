# Bubble Sort Resources

1. [Programiz](https://www.programiz.com/dsa/bubble-sort#:~:text=Bubble%20sort%20is%20a%20sorting%20algorithm%20that%20compares,array%20move%20to%20the%20end%20in%20each%20iteration.)
2. [GeeksForGeeks](https://www.geeksforgeeks.org/dsa/bubble-sort-algorithm/)
3. [Tutorialspoint](https://www.tutorialspoint.com/data_structures_algorithms/bubble_sort_algorithm.htm)
4. [Tutorialkart](https://www.tutorialkart.com/algorithms/bubble-sort-algorithm/)
5. [Guru99](https://www.guru99.com/bubble-sort.html)
6. [W3Schools (India)](https://www.w3schools.in/data-structures/sorting-techniques/bubble-sort-algorithm)
7. [Youcademy](https://youcademy.org/bubble-sort-step-by-step/)
8. [FreeCodeCamp](https://www.freecodecamp.org/news/bubble-sort-algorithm-in-java-cpp-python-with-example-code/)
9. [HackerEarth Visualizer](https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/visualize/)
10. [WsCubeTech](https://www.wscubetech.com/resources/dsa/bubble-sort)
11. [Wikipedia](https://en.wikipedia.org/wiki/Bubble_sort)
12. [W3Schools (Global)](https://www.w3schools.com/dsa/dsa_algo_bubblesort.php)

# 🔄 Bubble Sort in Java

Bubble Sort ek **simple sorting algorithm** hai jo repeatedly adjacent elements ko compare karta hai aur agar woh galat order mein hon to unhein swap karta hai. Yeh process har iteration mein array ke largest unsorted element ko end tak pohcha deta hai — is liye ise "bubble" sort kaha jata hai, jaise bubble surface par aata hai.

---

## 📌 Java Code Example

```java
import java.util.*;

public class BubbleSort {
    public static int[] bubble_Sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.print("Run This Code ... ");
        int[] stored = bubble_Sort(new int[]{90, 20, 50, 70});
        System.out.print(Arrays.toString(stored));
    }
}

```
## 📌 C++ Code Example
```C++
#include <iostream>
#include <string>
using namespace std;
class BubbleSort {
public:

void sorting(int arr[], int size ) {
    int n = size;
    for (int i = 0; i<n-1; i++){
        for (int j = 0; j < n-i-1; j++){
            if (arr[j]>arr[j+1]){
                int swap = arr[j];
                arr[j] = arr[j+1];
                arr[j+1]= swap;
            }
        }
     }
 }
};


int main(){
    BubbleSort s;
    int arr[] = {10,2,3,456,63,7};
    int size = sizeof(arr)/sizeof(arr[0]);
    s.sorting(arr,size);
    cout << "Ascending sorted array: ";
     for (int k = 0; k<size ; k++){
         cout << arr[k] << " ";
    }
    cout << endl;
       
}
```
## 📌 Lua Code Example
```Lua


function BubbleSort(arr)
  local n = #arr
  for i = 1, n-1 do
    for j = 1 , n-i do
      if arr[j] > arr[j+1] then
        swap = arr[j]
        arr[j] = arr[j+1]
        arr[j+1] = swap
      end
    end
  end
end


local arr = {2,34,9,1,798,7}
BubbleSort(arr)

for i = 1,#arr do 
  io.write(arr[i].." ")
end

