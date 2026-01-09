
class Solution:
    def MaxOneCountRow(self,arr):
        maxCount=0
        index=-1
        for i in range(0,len(arr)):
            currentCount=0
            for j in range(0,len(arr[0])):
                if (arr[i][j]==1):
                    currentCount=currentCount+1
            if (currentCount>maxCount):
                maxCount=currentCount
                index=i
        return (index,maxCount)

mat=[[1,0,0],[1,0,1],[1,1,1]]
obj=Solution()
result=obj.MaxOneCountRow(mat)
print(result)
