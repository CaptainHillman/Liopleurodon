Bridge Design Pattern
===

The Bridge design pattern is meant to de-couple an abstraction from its implementation so that the two can change dependently. This pattern can be very useful when both a class, and it's functionality, vary often. 

Standard usage of this pattern (which often incorporates use of the Class Adapter Pattern), involves separating a component's interface and implementation into an orthogonal class hierarchy. The interface then contains a reference to an abstract implementation class; this abstract reference is usually initialised with an instance of a concrete implementation class (but all further communication from the interface to it's internal reference is limited to the implementation's abstraction). The client then interacts with the interface which delegates requests to its implementation, effectively allowing users to maintain the same interface with exchangeable implementations. 

###### When to use

Use the Bridge pattern when...

+ you wish to avoid a permanent binding between an abstraction and its implementation.
+ both abstractions and implementations should be independently extensible via inheritance.
+ implementations could be shared between different (or multiple) objects, behind the scenes without the client's knowledge.
+ there is a proliferation of classes resulting from a coupled interface with multiple implementations.

###### Example

The diagram below shows a simple example of the Bridge pattern that allows a single Symbol interface to draw differing types of concrete Runes via use of a de-coupled Illustrator abstraction. In this case, additional concrete rune classes or new interfaces (like the Illustrator) could be added simply without affecting existing functionality.

<p align="center">
	<img style="border: 1px solid grey;" src="https://raw.githubusercontent.com/CaptainHillman/Liopleurodon/develop/design_patterns/diagram_bridge.jpg"/>
</p>