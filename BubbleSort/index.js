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
