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
