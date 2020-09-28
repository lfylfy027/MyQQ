'''
Binary Search
Step 1: Initialize 2 pointers, start at beginning of array, end at the end of the array。
Step 2: Find the element at the middle of the 2 pointers
Step 3:If element at the middle is bigger than our goal, set end pointer to the middle
Step 4:If element at the middle is smaller than our goal,set start pointer to middle +1

eg. arrary:[1,2,3,4,5,6]
target = 6
'''

def binarySearch(arr, target):
    left = 0
    right = len(arr) - 1

    while left <= right:
        mid = (left+right)//2

        if arr[mid] == target:
            return  mid
        elif arr[mid] > target:
            right = mid
        elif arr[mid] < target:
            left = mid + 1
        else:
            right = mid -1
    return -1

array = [1, 2, 3, 4, 5, 6]
result = binarySearch(array, 5)

if result != -1:
    print("Element is present at the index %d" %result)
else:
    print("Element is not present in the array.")