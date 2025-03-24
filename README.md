# Sprint 1_Exceptions_Level_2

📄 **Description - Exercise Statement**

This project involves creating a class called "Input" that will handle different exceptions that may arise in Java when entering data from the keyboard using the Scanner class. 

The first step is to instantiate a Scanner object, and from there, create static methods to read different data types from the keyboard. 

It is important that if any method encounters an exception, it handles it and prompts the user to enter the data again until it is correctly provided. 

All methods receive a String message to display to the user, such as "Enter your age", and return the appropriate data entered by the user, for example, a byte for the user's age.

### Methods to Implement

1. **Capturing the `InputMismatchException`:**
   - `public static byte readByte(String message);`
   - `public static int readInt(String message);`
   - `public static float readFloat(String message);`
   - `public static double readDouble(String message);`

2. **Capturing a Custom Exception from the `Exception` Class:**
   - `public static char readChar(String message);`
   - `public static String readString(String message);`
   - `public static boolean readBoolean(String message);` (returns `true` if the user enters "s", and `false` if the user enters "n").

💻 **Technologies Used**

- Java

📋 **Requirements**

- Java JDK 11 or higher

🛠️ **Installation**

1. Clone this repository:
   git clone https://github.com/ToniR90/1.2-Exceptions-Nivell2.git