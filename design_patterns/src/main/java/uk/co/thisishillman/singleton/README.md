Singleton Design Pattern
===

###### Purpose

One of the simplest design patterns, the Singleton pattern restricts the initialization of a class type to one specific instance (which is then usually globally accessible). Factory objects are commonly implemented using the Singleton pattern.

###### When to use

Use the Singleton design pattern when…

+ only one instance of a class should exist, and it should be widely accessible.

###### Structure

Typical use of the Singleton pattern involves declaring creating a single instance of the restricted class, often this class is then used to lazy-initialise single instances commonly used throughout the program.

###### Example
In the example below a lazy-initialising simple singleton class used to get the only occurring instance of a GameWorld object.

<p align="center">
	<img style="border: 1px solid grey;" src="https://raw.githubusercontent.com/CaptainHillman/Liopleurodon/develop/design_patterns/diagram_singleton.jpg"/>
</p>