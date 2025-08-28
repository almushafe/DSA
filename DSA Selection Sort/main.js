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
