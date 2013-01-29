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

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Abstract class to define mandatory methods, handling the jdbc connection. </br>
 * Your subclass should be annotated with @Connection
 *
 * @author D. Häberlein
 * @see de.tiq.jdbc.annotations.Connection
 */
public abstract class ConnectionHandler {
	protected Connection con;
	protected ConnectionHandler(Connection con){
		this.con = con;	
	}
	public abstract void connect() throws SQLException;
	public abstract void close() throws SQLException;
}
