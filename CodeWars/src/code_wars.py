def merge_arrays(arr1, arr2):
    arr_unsorted = []
    for item in arr1:
        arr_unsorted.append(item)
    for item in arr2:
        arr_unsorted.append(item)
    unique_arr = set(arr_unsorted)
    return list(sorted(unique_arr))

print(merge_arrays([0, 35, 36, 37, 6, 7, 8, 9, 10, 38], [-20, 39, 40, 50, -10, 25, -5, 62]))