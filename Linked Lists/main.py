class Node:
  def __init__(self,data):
    self.data = data
    self.next = None
    

One = Node(10)
Tow = Node(20)
Three  = Node(30)
Four = Node(40)

One.next = Tow
Tow.next = Three 
Three.next = Four

curennt = One

arr = []

while curennt :
  print(curennt.data, end="|")
  arr.append(curennt.data)
  curennt = curennt.next
print(f"\nlist -> {arr} ")
print(f"set -> {set(arr)} ")
print(f"tuple -> {tuple(arr)} ")