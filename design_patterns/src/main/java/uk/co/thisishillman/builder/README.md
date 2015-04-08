Builder Design Pattern
===

###### Purpose

Unlike the Abstract Factory pattern, the intention of the Builder pattern isn't to enable polymorphism but rather to separate the construction of a complicated object from its representation so that the same construction process can create different representations (avoiding the Telescoping Constructor Anti-Pattern).

###### When to use

The Builder pattern should be used...

+ when the algorithm for creating a complicated object should be independent of the parts that make it up/how they're assembled.
+ the object construction process should allow different representations to be created.

###### Structure

The Builder Pattern separates the construction of a complicated object by use of a builder object upon which the user runs various methods to configure the then output concrete object.

###### Example
In the example below, a builder class is used to construct to create a new Wizard instance with the input attributes.

<p align="center">
	<img style="border: 1px solid grey;" src="https://raw.githubusercontent.com/CaptainHillman/Liopleurodon/develop/design_patterns/diagram_builder.jpg"/>
</p>