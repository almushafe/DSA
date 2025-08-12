class BubbleSort {
  List<int> arr;
  
  BubbleSort(this.arr);
  
  List<int> Sort() {
    int n = arr.length;
    for (int i = 0; i<n-1; i++){
      for (int j = 0; j<n-i-1; j++){
        if (arr[j] > arr[j+1]){
          int swap = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = swap;
        }
      }
    }
    return arr;
    // print("Array Length : $arr");
  }
}





void main() {
  List<int> arr = [78,2,1,9,32,0,4];
  BubbleSort arr1 = BubbleSort(arr);
  print("sorted List : ${arr1.Sort()}");
}
