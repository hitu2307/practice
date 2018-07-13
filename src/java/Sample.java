package com.ds.learning;

public class Sample {
	public static void main(String[] ARGV) {
		System.out.println("Hello 3DS");
		String commandSymbolicName = "command_APPRouteAddPeople on program eServiceSchemaVariableMapping.tcl to command APPRouteAddPeople";
		commandSymbolicName = commandSymbolicName.substring(0, commandSymbolicName.indexOf("on program eServiceSchemaVariableMapping")-1);
		System.out.println("commandSymbolicName : " + commandSymbolicName);
		// Sample //
	}

}
