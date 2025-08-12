
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
