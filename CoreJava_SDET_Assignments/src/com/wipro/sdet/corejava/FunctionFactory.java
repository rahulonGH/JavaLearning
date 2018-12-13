package com.wipro.sdet.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Rahul
 * EMPID 847781
 */
public class FunctionFactory {
	public String[] getQueryChunks(String queryString) {
		return queryString.trim().split("[,\\s]");
	}
	public String[] getFileOrTableName(String queryString,int startIndex,int lastindex) {
		return queryString.substring(startIndex, lastindex).trim().split("[,\\s]");
	}
	
	public String getQueryBeforeWhereClause(String queryString,int startIndex,int lastindex) {
		return queryString.substring(startIndex, lastindex).trim();
	}
	public String getQueryAfterWhereClause(String queryString,int startIndex,int lastindex) {
		return queryString.substring(startIndex, lastindex).trim();
	}
	public String[] getAllFilterConditions(String queryString) {
		String[] returnVal=queryString.trim().split(" and ");;
		returnVal = Arrays.toString(returnVal).trim().split(" or ");
		returnVal = Arrays.toString(returnVal).trim().split(" not ");
		returnVal = Arrays.toString(returnVal).trim().split(",");
		returnVal = Arrays.toString(returnVal).trim().split("[,\\[\\]]");
		return returnVal;
	}
	public List<String> getAllLogicalOperators(String queryString) {
		List<String> returnVal=new ArrayList<String>();
		if(queryString.contains(" and "))
			returnVal.add("and");
		if(queryString.contains(" or "))
			returnVal.add("or");
		if(queryString.contains(" not "))
			returnVal.add("not");
		return returnVal;
	}
	public String[] getAllSelectFileds(String queryString,int startIndex,int lastindex) {
		return getQueryChunks(queryString.substring(startIndex, lastindex));
	}
	public String[] getOrderByFields(String queryString,int startIndex,int lastindex) {
		return getQueryChunks(queryString.substring(startIndex, lastindex));
	}
	public String[] getGroupByFields(String queryString,int startIndex,int lastindex) {
		return getQueryChunks(queryString.substring(startIndex, lastindex));
	}
	public String[] getAggregateFunctions(String[] queryString) {
		return null;
	}
}
