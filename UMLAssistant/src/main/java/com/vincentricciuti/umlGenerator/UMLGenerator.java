/**
 * 
 */
package com.vincentricciuti.umlGenerator;

import com.vincentricciuti.umlGenerator.Cleaner.UMLGenCleaner;
import com.vincentricciuti.umlGenerator.Extractor.UMLGenExtractor;

/**
 * UMLGenerator
 * 
 * @author Vincent
 *
 */
public class UMLGenerator {
    private static UMLGenExtractor uMLGenExtractor;
    private static UMLGenCleaner uMLGenCleaner;

    public <T> void classToClassDiagramSystemOut(Class<T> inputClass) {
	uMLGenExtractor = new UMLGenExtractor();
	StringBuilder stringBuilder = new StringBuilder();

	// Line breaks for readability
	uMLGenExtractor.extractClassName(inputClass, stringBuilder);
	stringBuilder.append("extends: ");
	uMLGenExtractor.extractSuperClass(inputClass, stringBuilder);
	stringBuilder.append("implements: ");
	uMLGenExtractor.extractInterfaces(inputClass, stringBuilder);
	stringBuilder.append('\n');
	uMLGenExtractor.extractFields(inputClass, stringBuilder);
	stringBuilder.append('\n');
	uMLGenExtractor.extractMethods(inputClass, stringBuilder);

	// Methods which are extracted by reflection have square brackets for parameters
	char[] charArr = new char[stringBuilder.length()];
	stringBuilder.getChars(0, stringBuilder.length(), charArr, 0);
	uMLGenCleaner = new UMLGenCleaner();
	uMLGenCleaner.replaceSquareBracketsWithParentheses(charArr);

	String finalOutput = new String(charArr).replace(" (", "(");
	System.out.println("=== GENERATED TEXT CLASS DIAGRAM === " + '\n' + '\n' + finalOutput + '\n' + "=== END ===");
    }
}
