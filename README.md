# UML Assistant

This project generates a text output representing the **UML Class Diagram** definition of a class which is **printed to the console**. 

This is achieved through the use of **Java's Reflection API** to return the details of the provided class and format these details to the UML Class Diagram specification. Ideally, the output should be able to be copied and inserted into the user's diagramming tool of choice.

**Features to be added:**
 1. Class inheritance and associations
 2. Output to a file *or* straight the clipboard (?)
 3. Construct an image output (unlikely)
	

**Current issues:**

 1. Any text formatting for the UML Standard is not able to be
    represented via console output. 
    *Perhaps sending the output String to a file with a special format with formatting tags can fix this?*
