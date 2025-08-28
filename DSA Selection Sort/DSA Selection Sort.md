### Cpp Code exapmle


```C++
#include <iostream>
using namespace std;

class Slection {
  public:
    void Sort(int arr[],int n){
      for (int i = 0 ; i<n-1;i++){
        
        int min_index = i;
        
        for (int j = i+1; j<n; j++){
          if (arr[j] < arr[min_index]){
             min_index = j;
            int swap = arr[i];
            arr[i] = arr[min_index] ;
            arr[min_index] = swap;
          }
        }
      }
    }
};
int main() 
{
    int arr[] = {7,1,0,21,3,5};
    int size = sizeof(arr)/sizeof(arr[0]);
    Slection array;
    array.Sort(arr,size);
    for (int i=0; i<size; i++){
      cout << arr[i] << " ";
    }
    
    return 0;
}


```

### js Code exapmle

```js
class Sort {
  constructor(){
    this.namearr = null;
  }
  
  Sorting(){
    let n = this.namearr.length;
    for (let i = 0; i < n ; i++){
        let min_index = i;
      for (let j = i+1; j< n ; j++){
        if (this.namearr[j] < this.namearr[min_index]){
            min_index = j;
        }
        let temp = this.namearr[i];
        this.namearr[i] = this.namearr[min_index];
        this.namearr[min_index] = temp;
      }
      
    }
  }
}

srtg = new Sort()

srtg.namearr = [64, 34, 25, 5, 22, 11, 90, 12]

srtg.Sorting()

console.log(srtg.namearr)


