/**
 * 
 */
package com.vincentricciuti.umlGenerator;

import java.util.ArrayList;
import java.util.List;

/**
 * ExampleClass
 * 
 * @author Vincent
 *
 */
public class ExampleClass extends SuperClass implements ExampleInterface, ExampleInterface2 {

    private String stringField = "Here is a string.";
    public static int intField = 80;
    protected List<Integer> intList = new ArrayList<>();

    public void noParamMethod() {

    }

    public int singleParamMethod(int input) {
	return input * 5;
    }

    public Long doubleParamMethod(int input1, long input2) {
	return input1 * input2;
    }

    static protected String referenceTypeParamMethod(String str) {
	return "Another string.";
    }

    private double[] arrayTypeParamMethod(double[] arr) {
	return arr;
    }

    public List<String> genericMethod(List<String> list, List<Integer> abc, List<List<Character>> chars) {
	return list;
    }

    @Override
    public void interfaceMethod1() {
	// TODO Auto-generated method stub

    }

    @Override
    public int interfaceMethod2(int a) {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public String interfaceMethod3(List<String> list) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Character interfaceMethod4(List<List<String>> nestedList) {
	// TODO Auto-generated method stub
	return null;
    }

}
