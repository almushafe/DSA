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
