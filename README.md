This project generates a text output representing the UML Class Diagram definition of a class which is printed to the console. 
This is achieved through the use of Java's reflection API to return the details of the provided class and format these details to the UML Class Diagram specification. Ideally, the output should be able to be copied and inserted into the user's diagramming tool of choice.

Features to be added: 
	Class inheritance and associations
	Output to a file or straight to the clipboard(?)
	Image output (very unlikely)
	
Current issues: 
	Any text formatting for the UML Standard e.g. static fields being represented with underlined text, abstract classes being represented with italics, is not able to be represented via console output. Perhaps outputting the output String to a specific file format with formatting tags can fix this?
