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
