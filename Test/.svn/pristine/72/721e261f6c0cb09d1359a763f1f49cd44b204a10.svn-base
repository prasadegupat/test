package com.intellect.hrm.service.util;
import java.lang.reflect.Field;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HrmCommonFunctionUtil {
	
	private final static Logger log = LoggerFactory.getLogger(HrmCommonFunctionUtil.class);

	public static String getCurrentMethodName() {
		StringBuilder sb=new StringBuilder();
		sb.append(Thread.currentThread().getStackTrace()[2].getClassName());
		sb.append("::");
		sb.append(Thread.currentThread().getStackTrace()[2].getMethodName());
        return  sb.toString();
    }
	
	/**
	 * @author 
	 * @usage for  Date conversions to long type timestamp .
	 */
    public static Long getTimeStamp() {
		return (new Date()).getTime();
	}
    
    /**
     * Gets the time stamp.
     *
     * @return the time stamp
     * @author navyasree
     * @throws IllegalAccessException 
     * @throws IllegalArgumentException 
     */
    public static Object addTimestampDetails(Object object,Long userid) throws IllegalArgumentException, IllegalAccessException {
    	for (Field field : object.getClass().getDeclaredFields()) {
    		field.setAccessible(true);
    		if(field.getName().equalsIgnoreCase("id")) {
    		    if((Long)field.get(object) != null) {
    		    	return getUserAuditUpdate(object, userid);
    		    }
    		}
    		else {
    			
    			if(field.getName().equalsIgnoreCase("createdOn")) {
        		    	field.set(object, getTimeStamp());
        		}
        		if(field.getName().equalsIgnoreCase("createdBy")) {
        		    	field.set(object, userid);
        		}
        		
        		if(field.getName().equalsIgnoreCase("modifiedOn")) {
        		    	field.set(object, getTimeStamp());
        		}
        		if(field.getName().equalsIgnoreCase("modifiedBy")) {
        		    	field.set(object, userid);
        		}
    			
    		}
		}
		return object;
	}
    
    public static Object getUserAuditUpdate(Object object,Long userid) throws IllegalArgumentException, IllegalAccessException {
    	for (Field field : object.getClass().getDeclaredFields()) {
    		field.setAccessible(true);
    		
    		if(field.getName().equalsIgnoreCase("modifiedOn")) {
    		    	field.set(object, getTimeStamp());
    		}
    		if(field.getName().equalsIgnoreCase("modifiedBy")) {
    		    	field.set(object, userid);
    		}
    		
		}
    	
		return object;
	}

}
