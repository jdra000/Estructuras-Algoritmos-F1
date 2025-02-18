# Insertion Sort
def insertionSort(arr):
	for i in range(1, len(arr)):
		print(i)
		j = i
		while j > 0 and arr[j-1] > arr[j]:
			arr[j], arr[j-1] = arr[j-1], arr[j]
			j -= 1
	return arr

arr = [64,34,1000,25,12,22,11,90]
print(insertionSort(arr))

