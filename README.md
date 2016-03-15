Design patterns
=

Design patterns are the standard way of solving the commonly occuring problems.

This repository contains the reference notes and code samples for common design patterns.

Definition
-

### 1. Strategy Pattern

> It defines the family of algorithms, encapsulates each one of them, and makes them interchangeable.
 Strategy lets the algorithms changes, independently from the client uses it.

### 2. Observer Pattern

> It defines the One to Many relationship between the objects. So when one object changes its state, the dependents get notified and updated automatically.

### 3. Decorator Pattern

> It attaches additional responsibilities to an object dynamically. Decorators provide flexible alternative to subclassing for extending functionality.

### 4. Factory Method Pattern

> It defines interface for creating instances but lets the sub classes to decide which class to instantiate. Factory method lets the class to defer instantiation to its sub classes.

### 5. Abstract Factory Pattern

> It provides an interface for creating family of related / dependent objects without specifying its concrete classes.

### 6. Singleton Pattern

> It ensures that the class has only one instance to it and provides global point of access to it.

### 7. Command Pattern

> It allows you to encapsulate the requests as an object, and thereby lets you parameterize the other objects with different requests,queue or logs and support undoable operations

### 8. Adapter Pattern

> It converts the interface of a class into the interface that client expects. Adapter lets class to work together that couldn't otherwise due to incompatible interfaces.

### 9. Facade Pattern

> It provides an unified interface to set of interfaces in a subsystem. Facade defines a higher level interface that makes the subsystem easier to use.

#### 10. Template Method Pattern

> It provides skeleton for an algorithm in a method and deferring some steps in the sub classes. Template method allows sub classes to define/redefine the steps without altering the algorithm.

#### 11. Iterator Pattern

> It provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

#### 12. Composite Pattern

> It allows you to compose objects in tree structure to represent the part - whole hierarchies. composite lets the client to treat object and composites uniformly.

#### 13. State Pattern

> It allows an object to alter its behaviour when its internal state changes. The object will appear to change its class.

#### 14. Proxy Pattern

> It provides a surrogate or placeholder for another object to control access to it.

Honourable mentions
-
  These are not part of the standard design patterns but due to their wide practical usage they're worth mentioning

### 1. Simple Factory pattern

> A simple Factory class have a static/ non static method to create and return the instance.
  
### 2. Null Object pattern

> When we don't have a meaningful object ro return and also want to remove the responsibility of client to handle the NULL.
Ex: NoCommand, EmptyStatement, NoResult, etc


Design Principles
-

*These points you should always keep in back of your mind.*


1. Identify the aspects that vary from the applications and separate them from what stays same.

2. Program to supertype not for implementation

3. Favor Composition over Inheritance.

4. Strive for loosely coupled design between objects that interact.

5. Classes should be open for extension but closed for Change.

6. Depends upon abstractions not on concrete implementations. (dependency inversion principle)

7. Principle of Lease knowledge - talk only to your immediate friends.

8. Hollywood principle - Don't call us, we'll call you.

9. A class should have only one reason to change.
