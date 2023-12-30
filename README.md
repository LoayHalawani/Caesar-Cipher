# Description
In cryptography, a Caesar cipher, also known as Caesar's cipher, the shift cipher, Caesar's code, or Caesar shift, is one of the simplest and most widely known encryption techniques. It is a type of substitution cipher in which each letter in the plaintext is replaced by a letter of some fixed number of positions down the alphabet. The method is named after Julius Caesar, who used it in his private correspondence. The encryption step performed by a Caesar cipher is often incorporated as part of more complex schemes. As with all single-alphabet substitution ciphers, the Caesar cipher is easily broken and in modern practice offers essentially no communications security.

# Note
This implementation takes a letter instead of an integer as key. A key of "A" or "a" indicates a shift value of 0..., and a key of "Z" or "z" indicates a shift value of 25 respectively. Numbers, special characters, and spaces are kept as is after encryption or decryption.

# Prerequisites
- The latest version of Java/JDK.
- The latest version of Java Compiler (JAVAC).
- Any text editor.

# Compile & Execute
1. Open any terminal.
2. Navigate to the path of the downloaded Java file.
3. To compile the Java code, run 'javac CaeserCipher.java'.
4. To execute the compiled Java code, run 'java CaeserCipher'.
