Java provides a rich set of built-in methods for working with strings. Strings in Java are objects of the `java.lang.String` class. Here are some commonly used methods for manipulating strings along with examples:

1. **Creating and Initializing Strings:**

   ```java
   String str = "Hello, World!"; // Creates a string with the specified content.
   char[] charArray = {'H', 'e', 'l', 'l', 'o'};
   String str = new String(charArray); // Creates a string from an array of characters.
   String str = new String(charArray, 1, 3); // Creates a string from a subarray of characters.
   ```
   This creates a string with the specified content or from an array of characters. When creating a string from a subarray of characters, you specify the start index and length of the subarray [Source 0](https://www.programiz.com/java-programming/string).

2. **String Length:**

   ```java
   int length = str.length(); // Returns the length (number of characters) of the string.
   ```
   This returns the number of characters in the string [Source 11](https://www.w3schools.com/java/java_strings.asp).

3. **Accessing Characters:**

   ```java
   char ch = str.charAt(3); // Returns the character at the specified index.
   ```
   This returns the character at the specified index in the string [Source 1](https://www.javatpoint.com/methods-of-string-class).

4. **Substring:**

   ```java
   String substr = str.substring(1); // Returns a substring starting from the specified index.
   String substr = str.substring(1, 4); // Returns a substring within the specified range.
   ```
   This returns a substring starting from the specified index or within the specified range [Source 1](https://www.javatpoint.com/methods-of-string-class).

5. **Concatenation:**

   ```java
   String result = str1 + str2; // Concatenates two strings.
   String result = str.concat(otherString); // Concatenates the specified string to the end of the original string.
   ```
   This concatenates two strings together [Source 7](https://beginnersbook.com/2013/12/java-strings/).

6. **Searching and Replacing:**

   ```java
   int index = str.indexOf(substring); // Returns the index of the first occurrence of the substring.
   int lastIndex = str.lastIndexOf(substring); // Returns the index of the last occurrence of the substring.
   String replaced = str.replace(oldStr, newStr); // Replaces all occurrences of a substring with another substring.
   ```
   This returns the index of the first or last occurrence of a substring in the string, and replaces all occurrences of a substring with another substring [Source 1](https://www.javatpoint.com/methods-of-string-class).

7. **Whitespace Trimming:**

   ```java
   String trimmed = str.trim(); // Returns a new string with leading and trailing whitespace removed.
   ```
   This returns a new string with leading and trailing whitespace removed [Source 1](https://www.javatpoint.com/methods-of-string-class).

8. **Case Conversion:**

   ```java
   String uppercase = str.toUpperCase(); // Returns a new string with all characters in uppercase.
   String lowercase = str.toLowerCase(); // Returns a new string with all characters in lowercase.
   ```
   This returns a new string with all characters converted to uppercase or lowercase [Source 1](https://www.javatpoint.com/methods-of-string-class).

9. **Splitting and Joining:**

   ```java
   String[] parts = str.split("\\s+"); // Splits the string into an array of substrings using a regular expression.
   String joined = String.join(", ", strArray); // Joins an array of strings using the specified delimiter.
   ```
   This splits the string into an array of substrings using a regular expression, and joins an array of strings using the specified delimiter [Source 1](https://www.javatpoint.com/methods-of-string-class).

10. **Checking for Empty or Null:**

   ```java
   boolean isEmpty = str.isEmpty(); // Returns true if the string is empty.
   boolean isNullOrEmpty = str == null || str.isEmpty(); // Checks for null or empty string.
   ```
   This returns true if the string is empty, and checks for a null or empty string [Source 1](https://www.javatpoint.com/methods-of-string-class).

11. **String Comparison:**

   ```java
   boolean isEqual = str1.equals(str2); // Compares two strings for content equality.
   boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2); // Compares two strings for content equality ignoring case.
   int comparison = str1.compareTo(str2); // Compares two strings lexicographically
