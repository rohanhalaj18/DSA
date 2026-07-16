# DSA Practice in Java

This repository contains Java programs for practicing data structures, algorithms, and core Java concepts. The code is organized by topic so each file can be compiled and run independently while learning or revising.

## Active Development

**This repository is still being updated every day with new problems, examples, and improvements.**

## Topics Covered

- `arrays/` - Array problems such as rotation, frequency counting, two pointer patterns, sliding window, palindrome checks, and moving zeroes.
- `Basic_maths_problem/` - Basic math problems such as digit counting, reversing numbers, palindrome numbers, and Euclidean algorithm.
- `Patterns/` - Pattern-printing practice programs.
- `Sorting/` - Sorting algorithms including bubble sort, selection sort, and insertion sort.
- `Java collection framework/` - Examples for Java collection interfaces such as `List` and `Set`.

### Arrays

| File | Problem |
| --- | --- |
| `Reversearray.java` | Reverse the elements of an array. |
| `Check_if_array_sorted.java` | Check whether an array is sorted in non-decreasing order. |
| `Move_zero.java` | Move all zeros to the end while keeping order of non-zeros. |
| `Move_zero_and_one.java` | Segregate zeros and ones (Dutch flag style). |
| `Count_frequency.java` | Count the frequency of each element in an array. |
| `PalindromArray.java` | Check if an array is a palindrome. |
| `Twopointer.java` | Solve a problem using the two pointer technique. |
| `SlidingWindow.java` | Solve a problem using the sliding window technique. |
| `Left_Rotate.java` | Left rotate an array by one (or d) positions. |
| `Second_Smallest_and_Second_Largest_Element.java` | Find the second smallest and second largest elements. |

### Basic Math Problems

| File | Problem |
| --- | --- |
| `CountDigits.java` | Count the number of digits in an integer. |
| `ReverseNumber.java` | Reverse the digits of a number. |
| `Palindrome.java` | Check whether a number is a palindrome. |
| `Euclidean.java` | Compute GCD using the Euclidean algorithm. |

### Sorting

| File | Algorithm |
| --- | --- |
| `BubbleSort.java` | Bubble sort implementation. |
| `SelectionSort.java` | Selection sort implementation. |
| `InsertionSort.java` | Insertion sort implementation. |

### Java Collection Framework

| File | Topic |
| --- | --- |
| `ListInterface.java` | Usage of the `List` interface and its implementations. |
| `SetInterface.java` | Usage of the `Set` interface and its implementations. |
| `MapInterface.java` | Usage of the `Map` interface and its implementations. |

### Patterns

Practice programs printing star/number patterns (first through seventh).

## Learning Path

Suggested order for working through the repository:

1. `Basic_maths_problem/` - Warm up with simple math and loops.
2. `Patterns/` - Get comfortable with nested loops.
3. `arrays/` - Build core array manipulation and two pointer/sliding window intuition.
4. `Sorting/` - Learn and compare classic sorting algorithms.
5. `Java collection framework/` - Move from raw arrays to built-in collections.

## Contribution / Practice Tips

- Try to implement each problem yourself before reading the solution.
- After coding, test with your own inputs to verify edge cases (empty input, single element, duplicates).
- Keep file names and public class names identical so `javac` compiles cleanly.

## Requirements

- Java JDK installed
- A terminal or code editor such as VS Code

Check your Java installation:

```bash
java --version
javac --version
```

## How to Run a Program

Each Java file is a standalone program. Move into the folder that contains the file, compile it, and run the class.

Example:

```bash
cd arrays
javac Move_zero.java
java Move_zero
```

For files inside folders with spaces, wrap the folder name in quotes:

```bash
cd "Java collection framework"
javac SetInterface.java
java SetInterface
```

## Repository Structure

```text
DSA/
+-- arrays/
+-- Basic_maths_problem/
+-- Java collection framework/
+-- Patterns/
+-- Sorting/
+-- .gitignore
+-- README.md
+-- opencode.json
```

## Notes

- Compiled `.class` files are ignored by Git.
- Temporary editor files such as `tempCodeRunnerFile.java` are not part of the main practice programs.
- File names and class names should match when compiling Java programs.

## Purpose

The goal of this repository is to build strong fundamentals in problem solving, Java syntax, and common DSA patterns through hands-on practice.
