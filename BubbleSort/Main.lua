

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
