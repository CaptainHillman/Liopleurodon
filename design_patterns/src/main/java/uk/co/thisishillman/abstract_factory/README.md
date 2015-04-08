Abstract Factory Design Pattern
===

###### Purpose

The Abstract Factory pattern attempts to provide an interface for creating groups of related objects without specifying their concrete classes. It does this by use of a hierarchy that facilitates potential "families" (or "platforms"), and the ability for each family to construct a series of a suite of "products".

###### When to use

The Abstract Factory pattern should be used when a system should...

+ be independent of how its components are created.
+ be used with specific families of products, where a family of related products should be used together.
+ provide a class library of products, revealing their interfaces but not their implementations.

###### Structure

The Abstract Factory defines a factory method for each individual product. Each factory method encapsulates the creation of each concrete, platform-specific, product class. Each family is then modeled with a factory derived class.

###### Example
In the example below, the Abstract Factory pattern is used to generate a series of fantasy heroes. The core interface (HeroFactory.java) declares the factory methods to create each type of hero. Each platform is then represented by factory classes using that interface to produce concrete hero classes of the appropriate type. You can see this in action in the UML class diagram below or via the "abstract_factory" sample code here.

<p align="center">
	<img style="border: 1px solid grey;" src="https://raw.githubusercontent.com/CaptainHillman/Liopleurodon/develop/design_patterns/diagram_prototype.jpg"/>
</p>