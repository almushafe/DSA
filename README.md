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
```
## 📌 C# Code Example
```C#
using System;
namespace HelloWorld
{
	public class Program
	{
		public static void Main(string[] args)
		{
			int[] arr = {34,2,100,5,9,7};
			BubbleSort.Sort(arr);
			print(arr);
			 
			
		}
		public static void print(int[] arr)
		{
		  for (int k = 0; k<arr.Length; k++)
		  {
		    Console.Write(arr[k]+" ");
		  }
		}
	}
	
	public class BubbleSort
	{
	  public static void Sort(int[] arr)
	  {
	    int n = arr.Length;
	    for (int i=0; i < n-1; i++)
	    {
	    for (int j = 0; j<n-i-1 ; j++)
	    {
	      if (arr[j] > arr[j+1])
	      {
	        int swap = arr[j];
	        arr[j] = arr[j+1];
	        arr[j+1] = swap;
	        
	      }
	    }
	    }
	  }
	}
}
```
## 📌 Ruby Code Example
```Ruby
class BubbleSort
  def initialize arr
    @arr = arr
  end 
  
  def sort
    n = @arr.length 
    for i in 0...(n-1)
      for j in 0...(n-i-1)
        if @arr[j] > @arr[j+1]
          # swap = @arr[j]
          # @arr[j] = @arr[j+1]
          # @arr[j+1] = swap
          @arr[j],@arr[j+1]=@arr[j+1],@arr[j]
        end
      end
    end
    return @arr
  end
end


arr = [89,2,90,4,1,0]
a = BubbleSort.new arr
# a.sort
print a.sort
```
## 📌 Rust Code Example
```Rust

fn BubbleSort(arr : &mut [i64]){
  let n = arr.len();
  for i in 0..n-1{
    for j in 0..n-i-1{
      if arr[j] > arr[j+1]{
        let mut swap = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = swap;
      }
    }
  }
}


fn main(){
  let mut arr = [23,45,9,1,2,0];
  BubbleSort(&mut arr);
  println!("Sort Array : {:?}",arr);
}
```
## 📌 Go Code Example
```Go
package main
import ("fmt")

func BubbleSort(arr []int ){
  n := len(arr)
  for i := 0; i<n-1 ; i++{
    for j := 0; j<n-i-1; j++{
      if arr[j]> arr[j+1]{
        arr[j],arr[j+1] = arr[j+1] , arr[j]
      }
    }
  }
}

func main(){
  arr := []int{24,6,0,1,34,69,2}
  BubbleSort(arr)
  fmt.Println(arr)
}
```
## 📌 Kotlin Code Example
```kotlin
class BubbleSort {
  var arr = arrayOf<Int>()
  
  fun Sort(){
    val n = arr.size
    for (i in 0 until n-1){
      for (j in 0 until n-i-1){
        if (arr[j] < arr[j+1]){
          val swap = arr[j]
          arr[j] = arr[j+1]
          arr[j+1] = swap
        }
      }
    }
  }
}




fun main(){
  val list1 = BubbleSort()
  
  list1.arr = arrayOf(78,2,35,6,223,0,1)
  list1.Sort()
  println(list1.arr.joinToString(","))
}
```
## 📌 PHP Code Example
```PHP
<?php 

function BubbleSort($arr){
  $n = sizeof($arr);
  for ($i = 0; $i<$n-1; $i++){
    for ($j = 0; $j < $n-$i-1; $j++){
      if ($arr[$j] > $arr[$j+1]){
        $swap = $arr[$j];
        $arr[$j] = $arr[$j+1];
        $arr[$j+1] = $swap;
      }
    }
  }
  return $arr;
  
  echo $n ;
}
$arr = array(78,9,2,19,0,1);
$sortarr = BubbleSort($arr);
// print_r ($arr);
print_r ($sortarr);

?>
```
## 📌 Scala Code Example
```Scala
object Main {
  
  def BubbleSort(arr : Array[Int]){
    val n = arr.length
    for (i <- 0 until n-1){
      for (j <- 0 until n-i-1){
        if (arr(j) > arr(j+1)){
          val swap = arr(j)
          arr(j) = arr(j+1)
          arr(j+1) = swap
        }
      }
    }
  }
  
  
	def main(args: Array[String]): Unit = {
	  var arr = Array(78,9,76,2,1,4)
	  BubbleSort(arr)
	  arr.foreach(println)
	  
	
	}
}
```
## 📌 java script Code Example
```javaScript
class BubbleSort{
  constructor(arr){
    this.arr = arr.slice();
  }
  Sort(){
    const n = this.arr.length;
    for (let i = 0; i< n-1 ; i++){
      for (let j = 0; j<n-i-1;j++){
        if (this.arr[j] > this.arr[j+1] ){
          const swap = this.arr[j];
          this.arr[j] = this.arr[j+1];
          this.arr[j+1] = swap;
          
        }
      }
    }
    return this.arr;
  }
}




let arr = [78,3,20,9,1,0,5]
const arr1 = new BubbleSort(arr);
console.log(arr1.Sort())

