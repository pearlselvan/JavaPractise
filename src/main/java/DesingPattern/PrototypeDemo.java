package DesingPattern;

/**
 * Created by muthuselvan on 2/6/17.
 */

/*
What ?
------
Prototype pattern refers to creating duplicate object
while keeping performance in mind.
This pattern involves implementing a prototype interface
which tells to create a clone of the current object.
When ?
------
It would be easy to understand prototype design pattern with an example.
Suppose we have an Object that loads data from database.
Now we need to modify this data in our program multiple times,
so it’s not a good idea to create the Object using new keyword
and load all the data again from database.

The better approach would be to clone the existing object
into a new object and then do the data manipulation.
How ?
------
Prototype pattern provides a mechanism to copy the original object to a new object
and then modify it according to our needs.
Prototype design pattern uses java cloning to copy the object.

Reff ?
http://www.journaldev.com/1440/prototype-design-pattern-in-java
https://www.tutorialspoint.com/design_pattern/prototype_pattern.htm
 */


public class PrototypeDemo {
}
