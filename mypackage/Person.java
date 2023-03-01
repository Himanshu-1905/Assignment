// Create a new directory on your computercalled "mypackage"
// Inside the "mypackage" directory , create two new files: "Person.java" & "Main.java"
// In Person.java , define a class called "Person" with two private instance variables: "name" (String) & "age" (int) 
// & constructor that takes two arguments (name & age) & instance variables .
// Also , than return the name and age of the person.
// In Main.java, create a new Person object with the name "Alice" and age 25.
public class Person { // class 1
	// instance variable
    private String name; 
    private int age;

    Person(String name, int age){ // constructor
    	// creating objects
        this.name = name;
        this.age = age;
        System.out.println(name);
        System.out.println(age);
    }
}
