Prototype Design Pattern
===

###### Purpose

The Prototype design pattern is generally used to create new objects based on prototypical instances. Often coupled with the Factory Method pattern, code using the Prototype pattern allows the creation of new objects by cloning the aforementioned prototype instances.

###### When to use

Use the Prototype design pattern when...

+ the classes to create are specified at run time (i.e. dynamically).
+ instances of a class can have only one of a few combinations of state.

###### Structure

Typical use of the Prototype pattern involves declaring an abstract base class that specifies a virtual clone function. Then, instead of creating objects using the "new" keyword, simply call the clone operation from the desired prototypical instance.

###### Example
See a Java example of the Prototype design pattern in my GitHub repository here.

<p align="center">
	<img style="border: 1px solid grey;" src="https://raw.githubusercontent.com/CaptainHillman/Liopleurodon/develop/design_patterns/diagram_prototype.jpg"/>
</p>