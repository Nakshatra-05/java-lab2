# Array_and_ArrayList

This repository contains Java programs demonstrating the conversion between arrays and ArrayLists with user input.

## Features
- Accepts user input for an array.
- Converts an array into an ArrayList and vice versa.
- Displays the results in the console.

## File Structure
- **ArrayConversion.java** – Implements array and ArrayList conversion.

## Methods
- **main(String[] args)** – Entry point, handles user input and conversions.
- **Convert Array to ArrayList**  
  ```java
  ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
- **Convert ArrayList back to Array**  
  ```java
String[] newArray = arrayList.toArray(new String[0]);
- **How to run**  
  ```java
javac ArrayConversion.java
java ArrayConversion

## Requirements
-Java (JDK) installed
-Basic Java knowledge
