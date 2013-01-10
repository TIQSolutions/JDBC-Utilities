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

import java.sql.DatabaseMetaData;
import java.sql.SQLException;

/**
 * Interface to provide the connection meta data. </br>
 * Your class that is implementing it should be annotated with @ConnectionMetaData.
 *
 * @author D. Häberlein
 * @see de.tiq.jdbc.annotations.ConnectionMetaData
 */
public interface ConnectionMetaDataProvider<T extends ConnectionHandler> {
	DatabaseMetaData getMetaData() throws SQLException;
	void init(T conHandler);
}
