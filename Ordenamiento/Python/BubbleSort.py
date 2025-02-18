# Bubble Sort

def bubbleSort(arr):
	n = len(arr)

	swapped = True
	while swapped:
		swapped = False

		for i in range(n-1):

			if arr[i] > arr[i+1]:
				arr[i], arr[i+1] = arr[i+1], arr[i]
				swapped = True
	return arr

arr = [64,34,25,12,22,11,90]
print(bubbleSort(arr))


# Insertion Sort
