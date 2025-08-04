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
