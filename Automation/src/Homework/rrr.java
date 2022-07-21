string is sequnce of chactor but is it not a primitive type..

when is create a string in java it actually creates an object of type stirng.

stirng is immutable object which means that it cannot be change once is it created.abstract


************String method *****

toLowerCase();
toUpperCase();
length();
CharAt();
equals();
equalIgnorecase();
splite();
trim();
contain();
replace();
substring();
concat();
indexOf();


oops

oops stand for object oriented programming languages.

- object oriented programming is about createting object that containe both data and methods.

- oop provider a clear structure for the program.

- oop make it possible to create full reuseable application with less code and shorter devepment time.


opps concept

1. class, object, and constructor

2. Inheritance

3. Encapsulation

4.polymorphims

5. abtraction (abtraction and interaaface)

Object ---------------

object is an insntace of a class.
object is a real word entity.
object occupies memory.
object consist states and behaviours.

syntax --
   
   ClassName objectName = New className();
		
  Note : New -> (Allocate memory for an object)
         ClassName() -> consructor
         
Class -----------------

Class is a collection of a object.
class is ject a blueprint.
class does not occupie a memory.
class contain states and behaviours of an object.

synatx --
   
    Class ClassName
    
    {
        	 
        	 data member
        	 funation
        	 constructor
    }
         
Cunstructor ------------------------------------------------------

1. A Cunstructor in java is a special method that is used to initialize objects.
2. The Cunstructor is callled when an object of aclass is created.
3. a Cunstructor is a bloack of code similer to the methoed.
4. it does not has any returs types.

Two type of Cunstructor
1. No Argument Cunstructor or default Cunstructor

2. Perameterized Cunstructor

Cunstructor overloading : The Cunstructor overloading can be defined as the concept of having more then one Cunstructor with diffrent parameters so that every Cunstructor 
can perform a different task.

this (keyword) :
	this keyword is a reference cariable which refers current class object.
	

Qus - Create a class to print the area of a  square and rectangle. the class has two method with the same name but 
differet namber of parameters. the method for printing area of a rectangle has two parameters which are length and 
breadth respectively while the other method for printing area of square has one parameter which is side of square.

	Class Shape
	{
		
		void area(l, b) 
		{
			
			
		}
		void area(s) 
		{
			
			
		}
	
	}

Inheritance -  in java is amachanism in which one object acquires all the properties and behaviours of a other class (perent class), it is an important part of oops (object orinted programming language).

we use "extends" keyword for inheritance in java.

Types of Inheritance

-> Single Inheritance => When a class inherits another class, if is khnown as a single Inheritance.
  
       A
       |
       *
       B (B + A)
 
-> multilevel Inheritance - in multilevel Inheritance, aderived class will be inheriting a base class and as the derived class also base class to other class.

-> When a class inherite onther derive class is khonw as a multilevel Inheritance.

      A
      |
      *
      B (B + A)
      |
      *
      c (c + B + A)
      
- Hierarchical inheritance - When two or more class inherite a single class it is knows as Hierarchical inheritance.


      A 
     _|__
    |   |
    B   C (A + C) && (A + B)
     
     
- Multiple inheritance - iN multiple inheritance one class can have then one superclass and inherit features from all parent classes.

- Note: java does not support multiple inheritance but we can archive this by useing interface.
 
     A    B
     |    | 
     ------
       | 
       C (C + A)(C + B)
       
- hybrid inheritance (through interfaces) : it is a milx of two or more of the above types of inheritance.

- Note: java does not support hybrid inheritance but we can archive this by useing interface.

        A
       / \ 
      /   \
     B    C
     \   /
      \ / 
       D
Access Modifire (private public protected and defuals)
keyword - super and final
Encapsulation in java 






Abstraction

- abstaraction is a porcess of hading the implimention details and showing only finctionality to the user.

- it show only essential things to the user and hides the internal details for ex : sending SMS you type the text abs ssend the message you don't khow the internal about the "
message sendind details.

- A abstaract class whilch is declared as abstarct with an abstarct keyword.
- it can have abstarct and non-abstarct methods.
- it cannot be intantiated.
- it can have constactores.

- abstaract method - method without body.


- Interfacce in java

- An Interfacce in java is a blueprint of a class. it has static constacr and abstarct methods.
- it is used to archive abstarction and mutiple inheritance in java.

Syntax :
	interface <interface_name>
{
	
  declare constant,
  method that abstract,
  by default
	
	
}

Keyword used....

class to class extend
class to interface Impliments
interface to interface extend 

 Abstarct V/S interface.
 
 Abstarct class can have Abstarct and non-Abstarct methods.
 Abstarct class does not support multiple inheritance.
 Abstarct class can provide the implementation of interface.
 Abstarct  keyword is used to declare class.
 
 interface can have only abstarct methods. since java 8 it canhave default and static methods also.
 interface supports multiples inheritances.
 interfacce has only static and final variable.
 interfacce can not provide the implementation of Abstarct class.
      




 