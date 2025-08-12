class BubbleSort
  def initialize arr
    @arr = arr
  end 
  
  def sort
    n = @arr.length 
    for i in 0...(n-1)
      for j in 0...(n-i-1)
        if @arr[j] > @arr[j+1]
          # swap = @arr[j]
          # @arr[j] = @arr[j+1]
          # @arr[j+1] = swap
          @arr[j],@arr[j+1]=@arr[j+1],@arr[j]
        end
      end
    end
    return @arr
  end
end


arr = [89,2,90,4,1,0]
a = BubbleSort.new arr
# a.sort
print a.sort
