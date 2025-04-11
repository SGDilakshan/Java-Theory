# Java-Theory
A complete Java learning repository covering basics to advanced topics including OOP, data structures, GUI, and database connectivity. Perfect for beginners and developers to explore Java with clear examples and structured modules for hands-on learning.

## 🔹 Basics
### 🔹 1_HelloWorld.java
The **HelloWorld.java** program is the simplest Java application that introduces the basic structure of a Java program. It contains a class, a `main` method, and a print statement.

This program uses `System.out.println` to display text on the console, making it the first step in understanding Java syntax and execution. It helps beginners get familiar with how Java programs are written and run.

### .....................................................

### 🔹2_CommandLineArguments.java
The **CommandLineArguments.java** program demonstrates how to pass and handle command-line arguments in Java. Command-line arguments are values provided when executing the program from the terminal or command prompt.

This program takes arguments as an array (`args[]`), iterates through them using a loop, and prints each argument to the console. It is useful for handling user inputs without requiring interactive input during runtime.

### .....................................................

### 🔹3_SingleAndMultiLineComments.java
This program demonstrates how to use single-line and multi-line comments in Java.

- **Single-line comments** are used to comment out a single line of code. They begin with `//` and everything after `//` on that line is treated as a comment.  
  In the example, `// THIS IS SINGLE LINE COMMENTS` is a single-line comment.

- **Multi-line comments** are used to comment out multiple lines of code. They begin with `/*` and end with `*/`.  
  In the example, `/* THIS PART IS ALLOCATED FOR MULTI LINE COMMENTS */` is a multi-line comment that can span multiple lines.

### .....................................................

### 🔹4_VariablesInJava.java
This program demonstrates the use of different types of variables in Java.

#### 🔹 Variable Types Used:
- **String** → Stores text values (e.g., `"Dilakshan"`).
- **int** → Stores integer values (e.g., `25`).
- **float** → Stores decimal values (e.g., `25.25f`).
- **char** → Stores a single character (e.g., `'M'`).
- **boolean** → Stores `true` or `false` values (e.g., `true`).

#### 🔹 Program Functionality:
- Declares and initializes different types of variables.
- Prints the values of these variables to the console using `System.out.println()`.

This program helps understand how different data types are used in Java for storing and handling information.

### .....................................................

### 🔹5_TypeCasting.java

This program demonstrates **Type Casting** in Java, which is the process of converting one data type into another.

#### 🔹 Types of Type Casting:
1. **Widening Casting (Automatic Type Conversion)**
- Converts a smaller data type into a larger one automatically.
- Order: `byte -> short -> char -> int -> long -> float -> double`
- Example: Converting an `int` to a `double`.

2. **Narrowing Casting (Explicit Type Conversion)**
- Converts a larger data type into a smaller one manually using type casting.
- Order: `double -> float -> long -> int -> char -> short -> byte`
- Example: Converting a `double` to an `int`.

#### 🔹 Program Functionality:
- Demonstrates **widening casting** by converting an `int` to a `double`.
- Demonstrates **narrowing casting** by converting a `double` to an `int`.
- Prints the original and converted values to the console.

This program helps in understanding how type conversion works in Java and when to use explicit or implicit casting.

### .....................................................

### 🔹6_ArithmeticOperators.java

This program demonstrates the use of **arithmetic operators** in Java. Arithmetic operators are used to perform mathematical operations on numeric values.

#### 🔹 Arithmetic Operators Used:
1. **Addition (`+`)** → Adds two numbers.
2. **Subtraction (`-`)** → Subtracts one number from another.
3. **Multiplication (`*`)** → Multiplies two numbers.
4. **Division (`/`)** → Divides one number by another (quotient).
5. **Modulus (`%`)** → Returns the remainder of division.

#### 🔹 Program Functionality:
- Declares and initializes two integer variables.
- Performs arithmetic operations using these operators.
- Prints the results to the console.

This program helps understand basic mathematical operations in Java and how to apply them in real-world scenarios.

### .....................................................

### 🔹7_ArithmeticAssignmentOperators.java
This program demonstrates the use of **arithmetic assignment operators** in Java. These operators perform arithmetic operations and assign the result to the variable in a single step.

#### 🔹 Arithmetic Assignment Operators Used:
1. **Addition Assignment (`+=`)** → Adds a value to the variable (`a += 10` is equivalent to `a = a + 10`).
2. **Subtraction Assignment (`-=`)** → Subtracts a value from the variable (`a -= 10` is equivalent to `a = a - 10`).
3. **Multiplication Assignment (`*=`)** → Multiplies the variable by a value (`a *= 10` is equivalent to `a = a * 10`).
4. **Division Assignment (`/=`)** → Divides the variable by a value (`a /= 10` is equivalent to `a = a / 10`).
5. **Modulus Assignment (`%=`)** → Finds the remainder and assigns it (`a %= 10` is equivalent to `a = a % 10`).

#### 🔹 Program Functionality:
- Declares and initializes an integer variable.
- Performs arithmetic assignment operations on the variable.
- Prints the updated value after each operation.

This program helps understand how assignment operators simplify arithmetic calculations in Java.

### .....................................................

### 🔹8_RelationalOperators.java
This program demonstrates the use of **relational operators** in Java. Relational operators are used to compare values and return a boolean result (`true` or `false`).

#### 🔹 Relational Operators Used:
1. **Equal to (`==`)** → Checks if two values are equal.
2. **Not equal to (`!=`)** → Checks if two values are not equal.
3. **Less than (`<`)** → Checks if the first value is smaller than the second.
4. **Greater than (`>`)** → Checks if the first value is larger than the second.
5. **Less than or equal to (`<=`)** → Checks if the first value is smaller than or equal to the second.
6. **Greater than or equal to (`>=`)** → Checks if the first value is larger than or equal to the second.

#### 🔹 Program Functionality:
- Declares and initializes two integer variables.
- Compares these values using relational operators.
- Prints the boolean results (`true` or `false`) for each comparison.

This program helps in understanding how relational operators work and their importance in decision-making (e.g., `if` conditions) in Java.

### .....................................................

### 🔹9_LogicalOperators.java
This program demonstrates the use of **logical operators** in Java. Logical operators are used to combine multiple conditions and return a boolean result (`true` or `false`).

#### 🔹 Logical Operators Used:
1. **Logical AND (`&&`)** → Returns `true` if **both** conditions are true.
- Example: `(m1 >= 35 && m2 >= 35)` → Checks if both `m1` and `m2` are greater than or equal to 35.
2. **Logical OR (`||`)** → Returns `true` if **at least one** condition is true.
- Example: `(m1 >= 35 || m2 >= 35)` → Checks if either `m1` or `m2` is greater than or equal to 35.

#### 🔹 Program Functionality:
- Declares and initializes two integer variables.
- Uses logical operators to evaluate conditions based on given values.
- Prints the boolean results (`true` or `false`) for each logical operation.

This program helps in understanding how logical operators work and how they are used in **decision-making** (e.g., `if` conditions) in Java.

### .....................................................

### 🔹10_ConditionalOperators.java
This program demonstrates the use of the **conditional (ternary) operator** in Java. The ternary operator is a shorthand for `if-else` statements and is used to make quick decisions based on a condition.

### .....................................................

### 🔹11_UnaryOperators.java
This program demonstrates the use of **unary operators** in Java. Unary operators operate on a single operand and are commonly used for **incrementing, decrementing, and negation**.

#### 🔹 Unary Operators Used:
1. **Increment Operator (`++`)**
- **Post-increment (`a++`)** → Returns the current value, then increments.
- **Pre-increment (`++a`)** → Increments first, then returns the new value.

2. **Decrement Operator (`--`)**
- **Post-decrement (`a--`)** → Returns the current value, then decrements.
- **Pre-decrement (`--a`)** → Decrements first, then returns the new value.

#### 🔹 Program Functionality:
- Declares and initializes an integer variable.
- Applies **increment (`++`)** and **decrement (`--`)** operators in both pre and post forms.
- Prints the values to observe how these operators affect the variable.

### .....................................................

### 🔹12_BitwiseAndShiftOperators.java
This program demonstrates the use of **bitwise and shift operators** in Java. These operators perform operations at the **binary level**, manipulating individual bits of integers.

#### 🔹 Bitwise Operators Used:
1. **Bitwise AND (`&`)**
- Performs **AND** operation between corresponding bits.
- Example: `25 & 45`

2. **Bitwise OR (`|`)**
- Performs **OR** operation between corresponding bits.
- Example: `25 | 45`

3. **Bitwise XOR (`^`)**
- Performs **XOR** operation between corresponding bits.
- Example: `25 ^ 45`
- Returns `1` if bits are different, otherwise `0`.

4. **Bitwise NOT (`~`)**
- Inverts all bits (1 → 0, 0 → 1).
- Example: `~25` (Computes the **two’s complement**).

#### 🔹 Program Functionality:
- Declares two integer variables.
- Performs **bitwise operations** (`&`, `|`, `^`, `~`) on them.
- Prints the results to observe how **bitwise operators** work.

### .....................................................

### 🔹13_ScannerClassExample.java
This program demonstrates how to use the **`Scanner`** class in Java to obtain input from the user and perform a simple mathematical calculation with **floating-point numbers**.

#### 🔹 Scanner Methods Used:
- **`scanner.nextFloat()`**: This method is used to read floating-point numbers from the user.
- Other common methods include **`nextInt()`**, **`nextDouble()`**, **`nextLine()`**, and **`next()`**, which are used to read different data types and strings.

#### 🔹 Scanner Class Methods Overview:
- **`nextInt()`**: Reads an integer input.
- **`nextDouble()`**: Reads a double input.
- **`nextLine()`**: Reads an entire line of input as a string.
- **`next()`**: Reads the next token (word) as a string.
- **`hasNext()`**: Checks if there is another token to read.

#### 🔹 Key Concepts:
- **Creating a Scanner object**: `Scanner scanner = new Scanner(System.in);` allows the program to get input from the user.
- **Mathematical Calculation**: The formula `(a + b)^2 = a^2 + b^2 + 2ab` is used here to demonstrate how floating-point arithmetic works.
- **Closing the Scanner**: It’s important to call `scanner.close()` when done to release the resources.

#### 🔹 Other Usage of Scanner Class:
- `Scanner` can be used to read input not only from the console but also from other sources like files or strings.
- It’s useful for parsing various types of data, such as numbers, strings, and lines of text.

This program is a simple illustration of reading input, performing a calculation, and outputting the result in Java.

### .....................................................