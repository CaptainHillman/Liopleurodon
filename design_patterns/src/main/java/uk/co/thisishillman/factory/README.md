Factory Design Pattern
===

###### Purpose

In essence a simplified version of the Factory Method pattern, the Factory pattern creates objects without exposing the initialisation logic to the user & refers to the new objects via a common interface. Factory objects are usually fixed with any sub-classing (as oppose to the generic processing used in Factory Method implementations).

###### When to use

Use the Factory design pattern when a class...

+ should delegate instantiation responsibility to one (or more) common classes, localising the logic used to create new objects.

###### Structure

Generally, Factory applications create objects via the use of static methods in commonly accessible factory classes. Factory methods generally return newly created instances through a common interface.

###### Example
The example below shows a very simple implementation using a Factory class (representing a metal forgery) to instantiate two types of Gold without the client having any knowledge of the instantiation logic or the concrete class created.

<p align="center">
	<img style="border: 1px solid grey;" src="https://raw.githubusercontent.com/CaptainHillman/Liopleurodon/develop/design_patterns/diagram_factory.jpg"/>
</p>