package com.dataengine.executionengine;

import com.dataengine.testcasereader.TestCaseReader;
import com.dataengine.variable.CommonVariables;

public class ExecutionEngine {

	public static void main(String[] args) {

		System.out.println("Initializing Dataprocessor...");
		CommonVariables.TCName = System.getProperty("testCase");
		TestCaseReader.readCSV();
	}
}
