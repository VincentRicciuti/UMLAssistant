/**
 * 
 */
package com.vincentricciuti.umlGenerator.Converter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.vincentricciuti.umlGenerator.ExampleClass;

/**
 * ConverterTests
 * 
 * @author Vincent
 *
 */
@ExtendWith(MockitoExtension.class)
public class ConverterTests {

    private UMLGenConverter converter;
    
    @Mock
    private ExampleClass testClass;
    
    @BeforeEach
    public void init() {
	converter = new UMLGenConverter();
    }

    @Test
    public void test_that_convertFieldModifersToUMLSymbols_returns_hyphen_when_passed_Field_with_private_modifier() {
    }
}
