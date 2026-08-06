# Binary Search on 1D Arrays

Binary Search (BS) is the fastest way to search in a **sorted** array. Instead of checking element by element (like linear search), it keeps **cutting the array in half** until it finds the answer.

## How it works (simple words)

Imagine a dictionary. You don't read page 1 to 1000 in order — you open the middle, check if your word comes before or after, and throw away half the book. That's Binary Search.

Steps:
1. Take the **middle** element of the sorted array.
2. If it's the target → done.
3. If target is **smaller** → search only the **left half**.
4. If target is **bigger** → search only the **right half**.
5. Repeat until the half is empty (target not found).

```java
int binarySearch(int[] arr, int target) {
    int low = 0, high = arr.length - 1;
    while (low <= high) {
        int mid = low + (high - low) / 2;   // safe mid (no overflow)
        if (arr[mid] == target) return mid;
        else if (arr[mid] < target) low = mid + 1;
        else high = mid - 1;
    }
    return -1; // not found
}
```

- **Time:** O(log n) — 10,00,000 elements take only ~20 steps.
- **Space:** O(1) (iterative). Recursive version uses O(log n) stack space.

### The 2 golden rules
1. Array must be **sorted** (or follow some increasing/decreasing pattern).
2. Always have a clear way to **shrink the search space** — you must move `low` or `high` every time, or you'll loop forever.

---

## Important Techniques / Patterns

### 1. The classic search
Plain sorted array, find exact element. Code above. Use case: "Does x exist? Where is it?"

### 2. First / Last Occurrence
For arrays with **duplicates**, BS tells you the *first* position where target appears (lower bound) or *last* position (upper bound - 1).

- First occurrence = lower bound of target.
- Last occurrence = upper bound of target, minus 1.
- **Use:** Count of target = `last - first + 1`. Search in rotated array, etc.

### 3. Lower Bound
Smallest index `i` such that `arr[i] >= target`. First position where you could insert target without breaking the sort.

```java
int lowerBound(int[] arr, int target) {
    int low = 0, high = arr.length, ans = arr.length;
    while (low < high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] >= target) { ans = mid; high = mid; }   // go left, but keep mid
        else low = mid + 1;
    }
    return ans;
}
```

### 4. Upper Bound
Smallest index `i` such that `arr[i] > target`. Same as lower bound but `arr[mid] > target`.

### 5. Search in Rotated Sorted Array
Array was sorted, then rotated (e.g. `[4,5,6,7,0,1,2]`). Not fully sorted, but still **two sorted halves**. Check which half is sorted using `arr[low] <= arr[mid]`, decide which half the target is in, and keep shrinking.

### 6. Search on Answers (Binary Search on Value)
The hardest but most common interview pattern. You don't search in an array — you search in a **range of possible answers** and check "is this answer possible?" with a helper function.

Use cases:
- **Square root** of a number (search 0..x for largest `m` where `m*m <= x`).
- **Koko Eating Bananas** — minimum eating speed to finish before deadline.
- **Split Array Largest Sum** — minimum largest sum when splitting into k parts.
- **Aggressive Cows** / **Magnetic Force Between Balls** — maximum minimum distance.
- **Book Allocation** — minimum maximum pages a student reads.
- **Find the smallest divisor** such that the sum stays under a threshold.

Pattern:
```
low = smallest possible answer
high = largest possible answer
while low <= high:
    mid = (low+high)/2
    if canWeDo(mid):  answer = mid; search for smaller (high = mid-1)
    else:             search for bigger (low = mid+1)
```

### 7. The mid formula (interview trap)
Always use `mid = low + (high - low) / 2`, not `(low + high) / 2`. For big numbers, `low + high` can overflow an `int`. This one line is a classic "did you learn it properly" check.

### 8. 1D to 2D
A sorted 2D matrix (rows and columns sorted) can be treated as one long sorted array:
`row = mid / cols`, `col = mid % cols`. Then normal BS.

---

## Most Important Questions

**Basic (must know):**
1. Binary search on sorted array — find element.
2. Lower bound / Upper bound.
3. First and last occurrence of an element → count of element.
4. Number of times a sorted array is rotated (find the minimum element).
5. Search in rotated sorted array (with duplicates).
6. Find peak element (element greater than both neighbours).

**Search on answers (highly asked in interviews):**
7. Square root of a number (floor value).
8. Nth root of a number.
9. Koko Eating Bananas.
10. Minimum days to make m bouquets.
11. Aggressive Cows (maximize minimum distance).
12. Book allocation / Split array largest sum.
13. Find smallest divisor given a threshold.
14. Capacity to ship packages within D days.
15. Find the smallest missing positive integer (or missing element in sorted array).

**Tricky:**
16. Find single element in a sorted array where every other appears twice.
17. Median of two sorted arrays.
18. Kth element of two sorted arrays.
19. Find floor and ceil of a target.

---

## Related Topics (linked to BS)

| Topic | Why it connects |
| --- | --- |
| Two Pointers | After sorting, BS and two pointers both exploit order; both are O(n) / O(log n) ideas. |
| Binary Search Tree (BST) | The *tree* version of binary search — each node is the "mid" of its subtree. |
| Divide and Conquer | BS is the simplest divide and conquer: split the problem in half, keep one half. |
| Sorted Data Structures | `TreeSet`/`TreeMap`, `SortedSet` in Java give lowerBound-like operations directly. |
| Binary Search on Answer | Same loop, but the "array" is a range of numbers and the check is a separate function. |

---

## Common Mistakes (avoid these)

1. **Forgetting to sort first.** BS only works on sorted arrays.
2. **Not moving low/high.** If `mid == low` can repeat, you get an infinite loop.
3. **Overflow in `low + high`.** Use `low + (high - low) / 2`.
4. **Off-by-one in bounds.** `low <= high` vs `low < high` changes which answers you find (searching for "minimum possible" needs `low < high` + `ans` tracking).
5. **Wrong starting high for "search on answers".** Think: what is the *maximum* the answer could ever be? (e.g. max element, max of array, etc.)

---

## Java Built-ins (use these, they exist)

- `Arrays.binarySearch(arr, key)` → index, or `-(insertion point) - 1` if not found.
- `Collections.binarySearch(list, key)` → same for lists.
- `TreeSet.ceiling(x)` / `floor(x)` → lower/upper bound for sets.
- `TreeMap.ceilingKey(x)` / `floorKey(x)` → for maps.

---

## One-line summary

> Sorted data → halve and conquer → O(log n). Master the *search on answer* pattern and you can solve half the binary search questions in interviews.
