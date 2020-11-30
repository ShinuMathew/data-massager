package com.dataengine.variable;

import java.util.ArrayList;
import java.util.List;

public class CommonVariables {

	public static String TCName;
	
	//DB connection
	public static String url;
	public static String user;
	public static String password;
	
	//Browser
	public static String insightuiBrowser;
	public static String driverPath;
	
	public static List<String> TestSteps = new ArrayList<>();
	public static List<String> Keywords = new ArrayList<>();
	public static List<String> LocatorType = new ArrayList<>();
	public static List<String> Target = new ArrayList<>();
	public static List<String> Value = new ArrayList<>();
}
