'''
Given an array of integers of size N, find maximum sum of k consecutive elements
eg. array = [80, -50, 90, 100] , k = 2
'''


def maxSum(arr, window_size):
    arraySize = len(arr)
    if window_size > arraySize:
        print('Invalid operation.')
        return -1
    window_sum = sum(array[i] for i in range(window_size))
    max_sum = window_sum

    for i in range(arraySize - window_size):
        window_sum = window_sum - array[i] + array[i + window_size]
        max_sum = max(max_sum, window_sum)
    return max_sum


array = [80, -50, 90, 100]
print(maxSum(array, 2))  # 190
