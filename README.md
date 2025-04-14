# Java-Theory
A complete Java learning repository covering p01_basics to advanced topics including OOP, data structures, GUI, and database connectivity. Perfect for beginners and developers to explore Java with clear examples and structured modules for hands-on learning.

## 🔹 p01_Basics
### 🔹 L01_HelloWorld.java
The **HelloWorld.java** program is the simplest Java application that introduces the basic structure of a Java program. It contains a class, a `main` method, and a print statement.

This program uses `System.out.println` to display text on the console, making it the first step in understanding Java syntax and execution. It helps beginners get familiar with how Java programs are written and run.

### .....................................................

### 🔹L02_CommandLineArguments.java
The **CommandLineArguments.java** program demonstrates how to pass and handle command-line arguments in Java. Command-line arguments are values provided when executing the program from the terminal or command prompt.

This program takes arguments as an array (`args[]`), iterates through them using a loop, and prints each argument to the console. It is useful for handling user inputs without requiring interactive input during runtime.

### .....................................................

### 🔹L03_SingleAndMultiLineComments.java
This program demonstrates how to use single-line and multi-line comments in Java.

- **Single-line comments** are used to comment out a single line of code. They begin with `//` and everything after `//` on that line is treated as a comment.  
  In the example, `// THIS IS SINGLE LINE COMMENTS` is a single-line comment.

- **Multi-line comments** are used to comment out multiple lines of code. They begin with `/*` and end with `*/`.  
  In the example, `/* THIS PART IS ALLOCATED FOR MULTI LINE COMMENTS */` is a multi-line comment that can span multiple lines.

### .....................................................

### 🔹L04_VariablesInJava.java
This program demonstrates the use of different types of variables in Java.

#### 🔹Variable Types Used:
- **String** → Stores text values (e.g., `"Dilakshan"`).
- **int** → Stores integer values (e.g., `25`).
- **float** → Stores decimal values (e.g., `25.25f`).
- **char** → Stores a single character (e.g., `'M'`).
- **boolean** → Stores `true` or `false` values (e.g., `true`).

#### 🔹Program Functionality:
- Declares and initializes different types of variables.
- Prints the values of these variables to the console using `System.out.println()`.

This program helps understand how different data types are used in Java for storing and handling information.

### .....................................................

### 🔹L05_TypeCasting.java

This program demonstrates **Type Casting** in Java, which is the process of converting one data type into another.

#### 🔹Types of Type Casting:
1. **Widening Casting (Automatic Type Conversion)**
- Converts a smaller data type into a larger one automatically.
- Order: `byte -> short -> char -> int -> long -> float -> double`
- Example: Converting an `int` to a `double`.

2. **Narrowing Casting (Explicit Type Conversion)**
- Converts a larger data type into a smaller one manually using type casting.
- Order: `double -> float -> long -> int -> char -> short -> byte`
- Example: Converting a `double` to an `int`.

#### 🔹Program Functionality:
- Demonstrates **widening casting** by converting an `int` to a `double`.
- Demonstrates **narrowing casting** by converting a `double` to an `int`.
- Prints the original and converted values to the console.

This program helps in understanding how type conversion works in Java and when to use explicit or implicit casting.

### .....................................................

### 🔹L06_ArithmeticOperators.java

This program demonstrates the use of **arithmetic operators** in Java. Arithmetic operators are used to perform mathematical operations on numeric values.

#### 🔹Arithmetic Operators Used:
1. **Addition (`+`)** → Adds two numbers.
2. **Subtraction (`-`)** → Subtracts one number from another.
3. **Multiplication (`*`)** → Multiplies two numbers.
4. **Division (`/`)** → Divides one number by another (quotient).
5. **Modulus (`%`)** → Returns the remainder of division.

#### 🔹Program Functionality:
- Declares and initializes two integer variables.
- Performs arithmetic operations using these operators.
- Prints the results to the console.

This program helps understand basic mathematical operations in Java and how to apply them in real-world scenarios.

### .....................................................

### 🔹L07_ArithmeticAssignmentOperators.java
This program demonstrates the use of **arithmetic assignment operators** in Java. These operators perform arithmetic operations and assign the result to the variable in a single step.

#### 🔹Arithmetic Assignment Operators Used:
1. **Addition Assignment (`+=`)** → Adds a value to the variable (`a += 10` is equivalent to `a = a + 10`).
2. **Subtraction Assignment (`-=`)** → Subtracts a value from the variable (`a -= 10` is equivalent to `a = a - 10`).
3. **Multiplication Assignment (`*=`)** → Multiplies the variable by a value (`a *= 10` is equivalent to `a = a * 10`).
4. **Division Assignment (`/=`)** → Divides the variable by a value (`a /= 10` is equivalent to `a = a / 10`).
5. **Modulus Assignment (`%=`)** → Finds the remainder and assigns it (`a %= 10` is equivalent to `a = a % 10`).

#### 🔹Program Functionality:
- Declares and initializes an integer variable.
- Performs arithmetic assignment operations on the variable.
- Prints the updated value after each operation.

This program helps understand how assignment operators simplify arithmetic calculations in Java.

### .....................................................

### 🔹L08_RelationalOperators.java
This program demonstrates the use of **relational operators** in Java. Relational operators are used to compare values and return a boolean result (`true` or `false`).

#### 🔹Relational Operators Used:
1. **Equal to (`==`)** → Checks if two values are equal.
2. **Not equal to (`!=`)** → Checks if two values are not equal.
3. **Less than (`<`)** → Checks if the first value is smaller than the second.
4. **Greater than (`>`)** → Checks if the first value is larger than the second.
5. **Less than or equal to (`<=`)** → Checks if the first value is smaller than or equal to the second.
6. **Greater than or equal to (`>=`)** → Checks if the first value is larger than or equal to the second.

#### 🔹Program Functionality:
- Declares and initializes two integer variables.
- Compares these values using relational operators.
- Prints the boolean results (`true` or `false`) for each comparison.

This program helps in understanding how relational operators work and their importance in decision-making (e.g., `if` conditions) in Java.

### .....................................................

### 🔹L09_LogicalOperators.java
This program demonstrates the use of **logical operators** in Java. Logical operators are used to combine multiple conditions and return a boolean result (`true` or `false`).

#### 🔹Logical Operators Used:
1. **Logical AND (`&&`)** → Returns `true` if **both** conditions are true.
- Example: `(m1 >= 35 && m2 >= 35)` → Checks if both `m1` and `m2` are greater than or equal to 35.
2. **Logical OR (`||`)** → Returns `true` if **at least one** condition is true.
- Example: `(m1 >= 35 || m2 >= 35)` → Checks if either `m1` or `m2` is greater than or equal to 35.

#### 🔹Program Functionality:
- Declares and initializes two integer variables.
- Uses logical operators to evaluate conditions based on given values.
- Prints the boolean results (`true` or `false`) for each logical operation.

This program helps in understanding how logical operators work and how they are used in **decision-making** (e.g., `if` conditions) in Java.

### .....................................................

### 🔹L10_ConditionalOperators.java
This program demonstrates the use of the **conditional (ternary) operator** in Java. The ternary operator is a shorthand for `if-else` statements and is used to make quick decisions based on a condition.

### .....................................................

### 🔹L11_UnaryOperators.java
This program demonstrates the use of **unary operators** in Java. Unary operators operate on a single operand and are commonly used for **incrementing, decrementing, and negation**.

#### 🔹Unary Operators Used:
1. **Increment Operator (`++`)**
- **Post-increment (`a++`)** → Returns the current value, then increments.
- **Pre-increment (`++a`)** → Increments first, then returns the new value.

2. **Decrement Operator (`--`)**
- **Post-decrement (`a--`)** → Returns the current value, then decrements.
- **Pre-decrement (`--a`)** → Decrements first, then returns the new value.

#### 🔹Program Functionality:
- Declares and initializes an integer variable.
- Applies **increment (`++`)** and **decrement (`--`)** operators in both pre and post forms.
- Prints the values to observe how these operators affect the variable.

### .....................................................

### 🔹L12_BitwiseAndShiftOperators.java
This program demonstrates the use of **bitwise and shift operators** in Java. These operators perform operations at the **binary level**, manipulating individual bits of integers.

#### 🔹Bitwise Operators Used:
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

#### 🔹Program Functionality:
- Declares two integer variables.
- Performs **bitwise operations** (`&`, `|`, `^`, `~`) on them.
- Prints the results to observe how **bitwise operators** work.

### .....................................................

### 🔹L13_ScannerClassExample.java
This program demonstrates how to use the **`Scanner`** class in Java to obtain input from the user and perform a simple mathematical calculation with **floating-point numbers**.

#### 🔹Scanner Methods Used:
- **`scanner.nextFloat()`**: This method is used to read floating-point numbers from the user.
- Other common methods include **`nextInt()`**, **`nextDouble()`**, **`nextLine()`**, and **`next()`**, which are used to read different data types and strings.

#### 🔹Scanner Class Methods Overview:
- **`nextInt()`**: Reads an integer input.
- **`nextDouble()`**: Reads a double input.
- **`nextLine()`**: Reads an entire line of input as a string.
- **`next()`**: Reads the next token (word) as a string.
- **`hasNext()`**: Checks if there is another token to read.

#### 🔹Key Concepts:
- **Creating a Scanner object**: `Scanner scanner = new Scanner(System.in);` allows the program to get input from the user.
- **Mathematical Calculation**: The formula `(a + b)^2 = a^2 + b^2 + 2ab` is used here to demonstrate how floating-point arithmetic works.
- **Closing the Scanner**: It’s important to call `scanner.close()` when done to release the resources.

#### 🔹Other Usage of Scanner Class:
- `Scanner` can be used to read input not only from the console but also from other sources like files or strings.
- It’s useful for parsing various types of data, such as numbers, strings, and lines of text.

This program is a simple illustration of reading input, performing a calculation, and outputting the result in Java.

### .....................................................

## 🔹p02_Control Structures
### 🔹L14_IFStatement.java
This program demonstrates the use of the **`if`** statement in Java to check a condition and execute a block of code based on the result.

#### 🔹 Key Concepts:
- **`if` Statement**:  
  The `if` statement checks whether a given condition is true. If the condition is true, the code block inside the `if` statement executes.

- **`Scanner` Class**:  
  The program uses the `Scanner` class to take input from the user, which is stored in the `age` variable.

#### 🔹 Additional Notes:
- If the user enters an age less than 18, the program does not print anything, as there is no `else` clause.
- **`Scanner` class methods** like `nextInt()` are used to read numerical input.
- The program could be extended with an `else` statement to provide feedback for users who are under 18.

This program is a basic demonstration of how the **`if`** statement can be used to check conditions and control the flow of a program.

### .....................................................

### 🔹L15_IFELSEStatement.java
This program demonstrates how to use the **`if-else`** statement in Java for conditional logic. The primary goal of the program is to determine whether a given year is a **leap year** or not, based on the Gregorian calendar rules.

#### 🔹 Key Concepts:
- **Leap Year Logic**:  
  A **leap year** is defined as:
  - A year that is divisible by **4**, but not divisible by **100**, unless it is also divisible by **400**. This rule ensures that the leap year calculation accounts for the additional day in February once every four years, except for centuries that are not divisible by 400.

- **Using `if-else`**:  
  The `if-else` statement is employed to execute one block of code when a condition is true and another when the condition is false. In this program, the `if` block checks whether the year satisfies the leap year conditions, and the `else` block handles the case where the year does not meet the criteria for being a leap year.

- **User Input**:  
  The program utilizes the **`Scanner` class** to gather input from the user. This allows the user to enter the year they wish to evaluate, making the program dynamic and interactive.

#### 🔹Importance of Conditional Logic:
- Conditional statements like **`if-else`** help control the flow of a program based on whether specific conditions are true or false. This makes it possible to create programs that can adapt to different inputs or situations, such as determining if a year is a leap year or not.

- The program highlights how basic control structures like **`if-else`** can be used in a practical scenario (e.g., leap year determination), showing their usefulness in day-to-day programming tasks.

### .....................................................

### 🔹L16_ELSEIFLadder.java
This program demonstrates the use of the **`else-if`** ladder in Java to assign grades based on a student's average marks.

#### 🔹Key Concepts:
- **`else-if` Ladder**:  
  The `else-if` ladder is used when there are multiple conditions to check in a sequence. The program checks each condition one by one, starting from the first `if` and then moving through the `else-if` statements until one of the conditions evaluates to true. If none of the conditions are true, the final `else` block executes.

- **Conditional Grade Assignment**:  
  Based on the student's average marks (input by the user), the program assigns a grade. The conditions are as follows:
  - **Grade A**: For marks between **90** and **100**.
  - **Grade B**: For marks between **80** and **89**.
  - **Grade C**: For marks between **70** and **79**.
  - **Grade D**: For marks between **60** and **69**.
  - **Grade E**: For marks below **60**.

- **User Input**:  
  The program uses the **`Scanner`** class to take input from the user for the average marks, allowing for dynamic input during execution.

- **Flow Control**:  
  The `else-if` ladder helps streamline the process of checking multiple conditions and performing actions based on each possible outcome, making the code more readable and efficient when handling several related conditions.

This program is an example of how **`else-if`** structures are helpful for handling multiple conditions in a clear and structured manner.

### .....................................................

### 🔹L17_NestedIfExample.java
This program demonstrates the use of **nested `if`** statements in Java. It checks a person's eligibility for insurance based on their marital status, gender, and age.

#### 🔹Key Concepts:
- **Nested `if` Statements**:  
  A **nested `if`** statement occurs when one `if` statement is placed inside another. This allows for more complex decision-making, as the program first checks a primary condition and then evaluates additional conditions inside the first block.

- **Marital Status Check**:  
  The program first checks if the person is unmarried (`U` or `u`) or married (`M` or `m`).
  - If unmarried, the program asks for gender and age to determine eligibility for insurance.
  - If married, the program directly determines eligibility without checking gender or age.

- **Eligibility Criteria**:
  - **Unmarried Males**: Eligible for insurance if their age is **30 or older**.
  - **Unmarried Females**: Eligible for insurance if their age is **25 or older**.
  - **Married Individuals**: Always eligible for insurance, regardless of gender or age.

- **User Input**:  
  The program uses **`Scanner`** to get inputs for marital status, gender, and age from the user, which are then processed to decide if the person is eligible for insurance.

- **Flow Control**:  
  The program demonstrates how complex decisions can be made by nesting `if` statements to check multiple conditions before arriving at a final conclusion.

This program shows how **nested `if` statements** allow for multiple layers of decision-making based on different factors.

### .....................................................

### 🔹L18_SwitchStatement.java
This program demonstrates the use of the **`switch`** statement in Java, a control structure that allows for multi-way branching based on a variable's value.

#### 🔹Key Concepts:
- **Switch Statement**:  
  The `switch` statement is used to execute one of many code blocks based on the value of a variable. It compares the value of the variable (in this case, `choice`) to different `case` labels, and executes the code associated with the matching `case`.

- **Basic Operations**:  
  The program allows the user to choose an operation (addition, subtraction, multiplication, division) by entering a number from the menu (1-4). After the user selects an operation, the program prompts them to input two numbers, and then performs the corresponding arithmetic operation.

- **Case Labels**:
  - **Case 1**: Performs **addition** of two numbers.
  - **Case 2**: Performs **subtraction** of two numbers.
  - **Case 3**: Performs **multiplication** of two numbers.
  - **Case 4**: Performs **division** of two numbers.
  - **Default Case**: If the user enters a number that is not between 1 and 4, it prints `"Invalid Selection"`.

- **Break Statement**:  
  The `break` statement is used to terminate the `switch` block once a case is executed. Without it, the program would continue checking the remaining cases, leading to undesired results.

- **User Input**:  
  The program uses **`Scanner`** to take user input for both the operation choice and the numbers to perform calculations on.

- **Error Handling**:  
  Although this program handles invalid choices via the default case, there is no explicit handling for **division by zero**, which could cause an error if the user enters zero when performing the division operation.

This program highlights how a **`switch` statement** simplifies decision-making when there are multiple choices based on a single variable, making the code cleaner and easier to read.

### .....................................................

### 🔹L19_GroupSwitchStatement.java
This program demonstrates the use of **grouped `case` labels** within a `switch` statement in Java. It checks whether a given character is a vowel or not.

#### 🔹Key Concepts:
- **Grouped `case` Labels**:  
  In a `switch` statement, multiple `case` labels can be grouped together to execute the same block of code for different values. In this case, the vowels (both uppercase and lowercase) are grouped together to print that the character is a vowel.

- **Switch Statement**:  
  The `switch` statement is used to evaluate a variable (`c`) and compare it against multiple `case` labels. If a match is found, the code under the corresponding `case` label is executed.

- **Vowels Check**:  
  The program checks if the entered character is a vowel (either lowercase or uppercase) by using the grouped `case` labels. If the character is a vowel, it prints the message indicating the character is a vowel. If the character is not a vowel, it falls to the `default` case and prints that the character is not a vowel.

- **Break Statement**:  
  Each `case` group ends with a `break` statement to ensure the switch statement exits once a match is found and the corresponding code is executed.

- **User Input**:  
  The program uses **`Scanner`** to take user input for a character and then checks whether the character is a vowel.

- **Default Case**:  
  The `default` case handles the situation where the entered character is not a vowel and prints an appropriate message.

This program shows how **grouped `case` labels** in a `switch` statement can simplify code when multiple values need to trigger the same behavior.

### .....................................................

## 🔹p03_Loops
### 🔹L20_WhileLoop.java
This program demonstrates the use of a **while loop** in Java. It repeatedly prints numbers from 1 up to a user-defined limit.

#### 🔹Key Concepts:
- **While Loop**:  
  A **while loop** repeatedly executes a block of code as long as a specified condition is true. In this case, the loop continues to run as long as `i` is less than or equal to the `limit` provided by the user.

- **Condition Checking**:  
  The loop starts by checking if the condition `i <= limit` is true. If true, the block of code inside the loop is executed. After each iteration, the value of `i` is incremented (`i++`) to ensure progress towards meeting the exit condition.

- **User Input**:  
  The program uses the `Scanner` class to take an integer input (`limit`) from the user, which determines how many times the loop will run.

- **Output**:  
  The program prints numbers starting from 1 up to the value of `limit`. The numbers are printed one by one on each iteration of the loop.

- **Exit Condition**:  
  Once `i` exceeds the `limit`, the loop condition becomes false (`i > limit`), causing the loop to stop executing.

This program illustrates how a **while loop** can be used to execute a set of instructions repeatedly based on a dynamic condition.

### .....................................................

### 🔹L21_DoWhileLoop.java
This program demonstrates the use of a **do-while loop** in Java. It prints even numbers starting from 2 up to a user-defined limit.

#### 🔹Key Concepts:
- **Do-While Loop**:  
  A **do-while loop** is similar to a **while loop**, but with a key difference: the block of code inside the `do` section is executed at least once, even if the condition is false at the first check. After executing the block once, it checks the condition in the `while` part. If the condition is true, it will repeat the loop. This ensures the loop runs at least once.

- **Condition Checking**:  
  In this case, the loop continues to execute as long as the condition `i <= limit` holds true. The value of `i` starts at 2, and it is incremented by 2 in each iteration (to print even numbers only). The loop will stop when `i` exceeds the user-defined `limit`.

- **User Input**:  
  The program takes an integer input (`limit`) from the user, which specifies the upper bound for the loop. The user decides how many even numbers they want to print.

- **Output**:  
  The program prints even numbers starting from 2 up to the specified limit. The loop continues to print numbers until the condition `i <= limit` becomes false.

- **Exit Condition**:  
  When `i` becomes greater than the `limit`, the loop terminates, and no further numbers are printed.

This program showcases the use of a **do-while loop** to handle situations where you want to execute a block of code at least once, regardless of the condition, and then repeatedly execute it while a condition is true.

### .....................................................

### 🔹L22_ForLoop.java
This program demonstrates the use of a **for loop** in Java. It prints numbers from 1 to a user-defined limit.

#### 🔹Key Concepts:
- **For Loop**:  
  The **for loop** is a control structure that allows you to repeat a block of code a fixed number of times. It consists of three parts:
  1. **Initialization**: The loop counter (`i`) is initialized (in this case, `i = 1`).
  2. **Condition**: The loop runs as long as the condition (`i <= limit`) is true.
  3. **Increment**: After each iteration, the loop counter is incremented (`i++`).

- **User Input**:  
  The program takes an integer input (`limit`) from the user, which specifies the number of iterations the loop should run.

- **Output**:  
  The program prints the numbers starting from 1 up to the specified `limit`. Each number is printed on a new line.

- **Exit Condition**:  
  The loop stops when the value of `i` exceeds the `limit`, which causes the condition `i <= limit` to become false.

This program demonstrates the use of a **for loop** to execute a block of code a set number of times, making it ideal for situations where the number of iterations is known beforehand.

### .....................................................

### 🔹L23_EnhancedForLoop.java
This program demonstrates the use of an **enhanced for loop** (also known as the **foreach loop**) in Java to iterate through an array.

#### 🔹Key Concepts:
- **Enhanced For Loop**:  
  The **enhanced for loop** simplifies the iteration over arrays or collections. Instead of using a traditional `for` loop with an index, it directly accesses each element in the array or collection. In this case, the loop iterates over the `numbers` array.

### .....................................................

### 🔹L24_NestedForLoop.java
This program demonstrates the use of a **nested for loop** in Java to print a pattern of asterisks (`*`).

#### 🔹Key Concepts:
- **Nested For Loop**:  
  A **nested for loop** refers to placing one `for` loop inside another. The outer loop controls the number of rows, and the inner loop controls the number of columns or elements printed in each row. In this program, the outer loop controls the number of lines, and the inner loop controls the number of asterisks printed in each line.

### .....................................................

## 🔹L25_BreakAndContinue.java
### `break` Statement:
- Immediately **exits the loop** when a condition is met.
- The remaining iterations are skipped.

### `continue` Statement:
- **Skips the current iteration** and moves to the next one.
- The loop continues executing normally.

### Example Behavior:
- `break` stops the loop early.
- `continue` skips specific iterations but keeps the loop running.

### .....................................................

## 🔹 L26_Factorial.java
### ✨ Summary:
- Reads an integer input from the user.
- Uses a `for` loop to calculate the factorial.
- Displays the final result.

### 📌 Key Points:
- `Scanner` is used to get user input.
- Factorial is calculated by multiplying numbers from `1` to `n`.
- Example: For input `5`, output will be `120`.

### .....................................................

## 🔹 L27_SumAndAverageOfNumbers.java
### ✨ Summary:
- Reads a limit `n` from the user.
- Accepts `n` numbers as input.
- Calculates the **sum** and **average** of those numbers.

### 📌 Key Points:
- `Scanner` is used to read both the limit and the individual numbers.
- A `for` loop collects and adds each number to the `sum`.
- Average is calculated using `sum / n`.

### .....................................................

## 🔹 L28_FibonacciSeries.java

### ✨ Summary:
- Prints the first `n` numbers of the **Fibonacci series**.
- Fibonacci series is a sequence where each number is the sum of the two preceding ones.

### 📌 Key Points:
- Takes a number `n` as input using `Scanner`.
- Uses a `for` loop to generate and print the Fibonacci sequence.
- Starts with `a = -1` and `b = 1` so the first term becomes `0`.

### .....................................................