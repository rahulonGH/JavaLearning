package com.wipro.sdet.corejava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * @author Rahul
 * EMPID 847781
 */
public class Assignment1 {
	static int selectIndex;
	static int fromIndex;
	static int whereIndex;
	static int orderbyIndex;
	static int groupbyIndex;
	
	public static void main(String[] args) {
		String qryStringOriginal = PropertyReader.prop.getProperty("query2");
		String qryStringLowerCase = qryStringOriginal.toLowerCase();
			selectIndex = qryStringLowerCase.indexOf("select");
			fromIndex = qryStringLowerCase.indexOf("from");
			whereIndex = qryStringLowerCase.indexOf("where");
			orderbyIndex = qryStringLowerCase.indexOf("order by");
			groupbyIndex = qryStringLowerCase.indexOf("group by");
			
		FunctionFactory fFactory = new FunctionFactory();
		String chunkArray[] = fFactory.getQueryChunks(qryStringOriginal);
		
		System.out.println("########## Below is the Chunks of Query #########");
		for(String chunk :chunkArray){
				System.out.println(chunk);
	        }
		System.out.println("#################################################");
		
		System.out.println("========= Below is the File/Table Names =========");
		String[] tabFileNames={};
		if(qryStringLowerCase.contains(" where "))
			tabFileNames = fFactory.getFileOrTableName(qryStringLowerCase,(fromIndex+ "from".length()),Math.min(qryStringOriginal.length(), whereIndex));
		if(qryStringLowerCase.contains(" group by "))
			tabFileNames = fFactory.getFileOrTableName(qryStringLowerCase,(fromIndex+ "from".length()),Math.min(qryStringOriginal.length(), groupbyIndex));	
		if(qryStringLowerCase.contains(" order by "))
			tabFileNames = fFactory.getFileOrTableName(qryStringLowerCase,(fromIndex+ "from".length()),Math.min(qryStringOriginal.length(), orderbyIndex));		
		for(String chunk : tabFileNames){
				System.out.println(chunk);
	        }
		System.out.println("=================================================");
		
		System.out.println("###### Part of query (before where clause) ######");
		if(qryStringLowerCase.contains(" where ")){
		String queryBeforeWhereClause = fFactory.getQueryBeforeWhereClause(qryStringLowerCase,0,whereIndex);
		System.out.println(queryBeforeWhereClause);}
		else
			{System.out.println("where claue absent in query");}
		System.out.println("#################################################");
		
		System.out.println("###### Part of query (after where clause) ######");
		String queryAfterWhereClause="";
		if(qryStringLowerCase.contains(" where ")){
		queryAfterWhereClause = fFactory.getQueryAfterWhereClause(qryStringLowerCase,whereIndex+ "where".length(),qryStringLowerCase.length());
		System.out.println(queryAfterWhereClause);}
		else{
			System.out.println("where claue absent in query");
		}
		System.out.println("#################################################");
		
		System.out.println("========= Below is/are the filter conditions =========");
		if(qryStringLowerCase.contains(" where ")){
		String[] tmp = fFactory.getAllFilterConditions(queryAfterWhereClause);
		if(tmp != null){
		List<String> filterConditionsList = new ArrayList<String>();
		for(String chunk : tmp){
			if(chunk.length() != 0)
				filterConditionsList.add(chunk.trim());
        }
		Iterator<String> itr = filterConditionsList.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}}
		}else{System.out.println("nothing to filter");}
		System.out.println("=================================================");
		
		System.out.println("###### All Logical Operators in sequence ######");
		List<String> logicalOperatorsList = fFactory.getAllLogicalOperators(qryStringLowerCase);
		if(logicalOperatorsList !=null){
		Iterator<String> it = logicalOperatorsList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}}
		System.out.println("#################################################");
		
		System.out.println("========= Below is select fields =========");
		String[] allSelectFileds = fFactory.getAllSelectFileds(qryStringLowerCase,selectIndex+ "select".length(),fromIndex);
		for(String chunk : allSelectFileds){
				System.out.println(chunk);
	        }
		System.out.println("=================================================");
		
		System.out.println("############### get order by field ##############");
		if(qryStringLowerCase.contains("order by")){
		String[] orderByFields = fFactory.getOrderByFields(qryStringLowerCase,orderbyIndex+ "order by".length(),qryStringLowerCase.length());
		for(String chunk : orderByFields){
			System.out.println(chunk);
        }
		}else{System.out.println("no order by found");}
		System.out.println("#################################################");
		
		System.out.println("############## get group by field ###############");
		if(qryStringLowerCase.contains("group by")){
		String[] groupByFields = fFactory.getGroupByFields(qryStringLowerCase,groupbyIndex+ "group by".length(),qryStringLowerCase.length());
		for(String chunk : groupByFields){
			System.out.println(chunk);
        }
		}else{System.out.println("no group by found");}
		System.out.println("#################################################");
		
		System.out.println("========= Below is Aggregate Functions =========");
		if(qryStringLowerCase.regionMatches(0, "avg(", qryStringLowerCase.length(), 10)){
			System.out.println("**************");
		String[] allAggregateFunctions = fFactory.getAggregateFunctions(allSelectFileds);
		for(String chunk : allAggregateFunctions){
				System.out.println(chunk);
	        }
		}
		System.out.println("=================================================");
	}
}
