Interview Question:-

1. string vs stringbuffer vs stringbuilder
--- Answer : If a string is going to remain constant throughout the program, then use the String class object because a String object is immutable.
   If a string can change (for example: lots of logic and operations in the construction of the string) and will only be accessed from a single thread, using a StringBuilder is good enough.
   If a string can change and will be accessed from multiple threads, use a StringBuffer because StringBuffer is synchronous, so you have thread-safety.
   If you don’t want thread-safety than you can also go with StringBuilder class as it is not synchronized.
2. this() and super() can not used together in constructor...why?... how it work internally ?
3. Proper defination for encapsulation | inheritance | polymorphisum
4. typescript convert their compiler to go lang 
byte code is platform independent 
5. javac classname.java // complier and java class name.java // run file
6. find real time used for runtime polymorphism
7. SOLID Principl
8. PUT vs PATCH differences...( put: update whole object and patch update only specific field)
