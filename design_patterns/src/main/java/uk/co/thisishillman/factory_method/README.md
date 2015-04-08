Factory Method Design Pattern
===

###### Purpose

The Factory Method design pattern defines an interface for creating an object, but lets implementing subclasses decide what types of objects to actually instantiate. The Factory Method is also commonly used to facilitate the use of other design patterns.

###### When to use

Use the Factory Method design pattern when a class...

+ can't anticipate the type of objects it should instantiate
+ should delegate responsibility to one (or more) helper subclasses, localizing the knowledge of which help class is the delegate.

###### Structure

Generally, Factory Method applications create objects via the use of factory methods in interfaces or base-class derived child classes. A alternative, yet popular implementation of the Factory Method pattern is the use of a static method within a class that returns an object of that class' type.

###### Example
In the example below, Tailor factories of different types are used generically (via the use of a common interface) to produce instances of differing concrete classes.

<p align="center">
	<img style="border: 1px solid grey;" src="https://raw.githubusercontent.com/CaptainHillman/Liopleurodon/develop/design_patterns/diagram_factory_method.jpg"/>
</p>