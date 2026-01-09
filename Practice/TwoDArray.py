arr=[]
row=3
clmn=3
# Initalize the array elements 
print("Initialize the array elements")
for i in range(row):
    temp=[]
    for j in range(clmn):
        ele=int(input(f"Data[{i}][{j}]="))
        temp.append(ele)
    arr.append(temp)
# Display the array elements 
print("Array Elements are=")
for i in range(0,len(arr)):
    for  j in range(0,len(arr[0])):
        print(arr[i][j],end=" ")
    print()
