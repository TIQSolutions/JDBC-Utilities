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
package de.tiq.jdbc.impl;

public interface TableDescription {
	String getTableCatalog();
	String getTableSchema();
	String getTableName();
	String getTableType();
	String getRemarks();
	String getTypeCatalog();
	String getTypeSchema();
	String getTypeName();
	String getSelfReferencing();
	String getRefGeneration();
}