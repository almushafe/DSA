#  1
# ______________________________________________________________________________________________________________
# stack = []

# # Push 

# stack.append('A')
# stack.append('B')
# stack.append('C')
# print(f"Stack : {stack}")


# # Pop

# element = stack.pop()
# print(f"Pop : {element}")


# # Peek

# topElement = stack[-1]
# print(f"Peek : {topElement}")

# # is Empty 

# isEmpty = not bool(stack)
# print(f"Is empty : {isEmpty}")

# # Size 
# print(f"Size : {len(stack)}")

# 2
# ___________________________________________________________________________________________________________

# class Stack :
#     def __init__(self):
#         self.stack = []

#     def push(self,element):
#         self.stack.append(element)

#     def pop(self):
#         if self.isEmpty():
#             return "Stack is Empty "
#         return self.stack.pop()
#     def peek(self):
#         if self.isEmpty():
#             return "Stack is Empty"
#         return self.stack[-1]
    
#     def isEmpty(self):
#         return len(self.stack) == 0
    
#     def size(self):
#         return len(self.stack)
    
# # create Stack 

# if __name__ == "__main__":
#     StackYou = Stack()

#     for names in ["Bahi","Zaid","Saad","Ali","Khalid"]:
#         StackYou.push(names)

#     print(f"Stack : {StackYou.stack}")

#     print(f"Pop : {StackYou.pop()}")

#     print(f"Peek : {StackYou.peek()}")

#     print(f"Is Empty : {StackYou.isEmpty()}")

#     print(f"Size : {StackYou.size()}")





# Stack Implementation using Linked Lists
# ____________________________________________~~~~~~~~~~~~~~~~~````````````````````````````````````````^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^


