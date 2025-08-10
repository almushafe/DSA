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
