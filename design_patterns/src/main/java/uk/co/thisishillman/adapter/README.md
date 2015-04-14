Adapter Design Pattern
===

The Adapter design pattern is a structural pattern that allows the code to convert the interface of an existing class into to another interface for the use of the client object. This conversion process lets classes that would normally be incompatible work together.

Unlike other patterns, there are two popular methodologies used to implement the Adapter pattern:

+ Object Adapter pattern: In this method, the adapter contains an instance of the adaptee class that it re-directs method calls to whilst sub-classing from the class type expected from the client (this can be seen in the example below).
+ Class Adapter pattern: This method uses polymorphism to setup that the adapter so that it sub-classes both the client-required class and the incompatible adaptee class, essentially ensuring the adapter is both, making it applicable to all code modules. However, this can easily lead to overly bloated & complicated adapter classes, potentially with conflicting behavior

###### When to use

Use the Adapter pattern when...

+ you want to use a pre-existing class but its interface does not match the one needed.
+ you need to create a re-usable class that potentially co-operates with unrelated classes that may not have compatible interfaces.
+ you need to use multiple existing & incompatible classes. Creating an adapter for each class would be troublesome, but if all the classes share a common parent, an adapter can be created that inherit from that common class.

###### Example

In the example below, a Scribe instance (the client class) expects to receive an instance of a Scroll, the main code base however has been update to only contain the newer Tome class (the adaptee). To facilitate this, an Adapter class is created that inherits from the Scroll class, but contains a Tome instance that the core logic is actually operated upon. This allows the Scribe to seemingly use the adapter as a Scroll, whilst the actual operations are carried out on the Tome instance.

<p align="center">
	<img style="border: 1px solid grey;" src="https://raw.githubusercontent.com/CaptainHillman/Liopleurodon/develop/design_patterns/diagram_adapter.jpg"/>
</p>