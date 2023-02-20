
class Animal{  
String color="white";  
}  
class Dog extends Animal{  
String color="black";  
void Color(){  
System.out.println(color);//prints color of Dog class  
System.out.println(super.color);//prints color of Animal class  
}  
}  
class SuperclassEx{  
public static void main(String args[]){  
Dog d=new Dog();  
d.Color();  
}}  