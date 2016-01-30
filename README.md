### Taller Java

- Download JDK and JRE


Progress: Video:10 Minute: 0

-----
Philosophy:
- Based on C / C++
- POO (Reutilization)
- Good practices on coding
- Developing more fast than C++

Why is important:
- Most used language programming
- Who uses ?
    Google / Amazon / Financial companies
- There are carrers
- Is used for android

Java:
- Burned 1991 
- Was made for James Goslin
- Sun Microsystem
- Reason: to comunicate devices and run in any platform

In 2009:
- Sun was sold to Oracle, so Oracle now is the owner of Java.

Java is a high level language:
- Simple
- Object oriented
- Distribuided --- Network ambiance --- http
- Multithread
- Neutral Architecture --- We can used in any OS
- Portable --- You can used the software developed in any platforms
- High performance --- Is compiled and interpreted (but here is important to define data types in the variables).
- Secure --- All language have vulnerabilities, but this one is packaged.

Philosophy: WRITE ONCE RUN ANYWERE
The code we developed has to be prepared to used in any platform.

Versions:
Java EE: Enterprise Edition - Web systems
Java SE: Standard Edition --- Desktop applications / Model and controller /  
Java ME: Micro Edition ------ Before android was for cell phones like blackberry

----

Oracle University:

https://education.oracle.com/
[Certifications](https://education.oracle.com/pls/web_prod-plq-dad/db_pages.getpage?page_id=653&get_params=p_id:212#tabs-2-2 "Certifications")

----

First Part: Java Standard Edition

Components:
JDK: Java Development Kit ------ Kit of tools, classes to develop.
JRE: Java Runtime Environment -- Virtual machine that traduce the .class files.

To verify if is installed:
$ java
$ java -version
$ javac

If in the last sentences you saw command not found and you are in windows
is probably because you have to configurate the environment variables.

You have to check where the java was installed 
(could be in C:\Program Files\Java\jdk...\bin). Is posible that in windows 10 is automatically.

Programming Phases:
1. Generate Java Sources (make files .java)

2. Using javac to generate .class:
    $ javac MyFile.java
   This generate the *byte code* (.class).
   If you check the .class file you will see the first two words:
   cafe babe --- Some people asume that to the logo of cup of cafe
    
3. After that use JVM:
    $ java MyFile
   Note: Without extensions.

----

Why main() ???

The main function is the entry point of a Java application.

The word main is a reserve word for Java language.

----

IDE -- Integrated Development Environment:

- Editor
- Compilator
- Debuger
- IGU generator

----

Package:

- A package is a system folder.
- Is similar to domains in the name:
    com.company.projectname
  Example:
    com.omaryahir.miproyecto

Some datatypes:
- byte   -128 - 127
- short  -32,768 - 32,767 (2 bytes)
- int    -2,147,483,648 - 2,147,483,647 (4 bytes)
- long   -9,223,372,038,854,775,808 - 9,223,372,038,854,775,807


