# Array_and_ArrayList

This repository contains Java programs demonstrating operations on arrays and ArrayLists, including separating even and odd numbers, finding the smallest distance between neighboring numbers, and converting between arrays and ArrayLists.

## Features
- Separates even and odd numbers into different arrays.
- Finds two neighboring numbers with the smallest difference.
- Converts an array into an ArrayList and vice versa.

## File Structure
- **EvenOddArrays.java** – Separates even and odd numbers into different arrays.
- **SmallestDistance.java** – Finds two neighboring numbers with the smallest difference.
- **ArrayConversion.java** – Converts an array into an ArrayList and vice versa.

## Methods
### **1. EvenOddArrays.java**
- **main(String[] args)** – Accepts user input, separates even and odd numbers, and prints them.
  ```java
  if (num % 2 == 0) even.add(num);
  else odd.add(num);
### **2. SmallestDistance.java**
- **findSmallestDistanceIndex(int[] arr)** – Finds two neighboring numbers with the smallest difference and returns the index of the first number.
  
  ```java
  int diff = Math.abs(arr[i + 1] - arr[i]);
### **3. ArrayConversion.java**
- **Convert Array to ArrayList**
  
  ```java
  ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
- **Convert ArrayList back to Array**
  
  ```java
  String[] newArray = arrayList.toArray(new String[0]);

## Requirements
-Java (JDK) installed
-Basic Java knowledge
