/*
 * Copyright (c) 2012, 2013 All Rights Reserved, www.tiq-solutions.com
 * 
 * THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY KIND,
 * EITHER EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED 
 * WARRANTIES OF MERCHANTABILITY AND/OR FITNESS FOR A PARTICULAR PURPOSE.
 * 
 * This code is product of:
 * 
 * TIQ Solutions GmbH 
 * Weißenfelser Str. 84
 * 04229 Leipzig, Germany
 * 
 * info@tiq-solutions.com
 * 
 */
package de.tiq.jdbc;

 import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Abstract class to define mandatory methods, processing the sql.</br> 
 * Your subclass should be annotated with @JdbcDriver
 *
 * @author D. Häberlein
 * @see de.tiq.jdbc.annotations.JdbcDriver
 */
public abstract class QueryExecutor<T extends ConnectionHandler> {

	protected int resultSetType;
	protected int resultSetConcurrency;
	protected int resultSetHoldability;

	protected T conHandler;
	
	protected QueryExecutor(T conHandler){
		this.conHandler = conHandler;	
	}

	public T getConnectionHandler(){
		return conHandler;
	}
	
	public void setResultSetType(int resultSetType){
		this.resultSetType = resultSetType;
	}
	
	public void setResultSetConcurrency(int resultSetConcurrency){
		this.resultSetConcurrency = resultSetConcurrency;
	}
	
	public void setResultSetHoldability(int resultSetHoldability){
		this.resultSetHoldability = resultSetHoldability;
	}
	
	public abstract boolean execute(String sql) throws SQLException;
	public abstract ResultSet getResultSet() throws SQLException;
	
	public abstract ResultSet executeQuery(String sql) throws SQLException;
	public abstract int executeUpdate(String sql) throws SQLException;
	
}
