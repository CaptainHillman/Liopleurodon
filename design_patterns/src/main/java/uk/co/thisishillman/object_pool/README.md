Object Pool Design Pattern
===

###### Purpose

The Object Pool pattern is a creational design pattern used to keep a store of initialised objects ready for use at any time (i.e. pooled objects), rather than initialising & destroying objects on demand. This pattern is often used to increase performance by avoiding numerous object initialisations.

###### When to use

Use the Object Pool design pattern when...

+ the cost of initialising (or destroying) an object is high and the system should have a low overhead.

###### Structure

Typically, an pool or collection object is created to handling storing a set of pre-initialised objects along with associated functions to remove objects from/add objects back into the pool. A client module then requests objects from the pool, performs operations on it, then returns it to the pool instead of destroying it. These object pools can complicate object validity though, as objects obtained from/returned to the pool are not actually created or destroyed at this time, and can easily be rendered into an invalid state by a client module.

###### Example

The example set out below demonstrates a very simple implementation of an object pool through the use of consumable potion objects. Note that this example doesn't implement any multi-threading support, a commonly necessary consideration for object pool instances.

<p align="center">
	<img style="border: 1px solid grey;" src="https://raw.githubusercontent.com/CaptainHillman/Liopleurodon/develop/design_patterns/diagram_object_pool.jpg"/>
</p>