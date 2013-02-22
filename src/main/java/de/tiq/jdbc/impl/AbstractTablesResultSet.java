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

import java.sql.Ref;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLXML;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public abstract class AbstractTablesResultSet extends
		AbstractReadonlyResultSet {
	private final List<TableDescription> tables = new ArrayList<TableDescription>();
	private int tablesIdx = -1;

	@Override
	public boolean next() throws SQLException {
		if (tablesIdx == -1) {
			tables.addAll(initialize());
		}
		return ++tablesIdx < tables.size();
	}

	protected abstract List<TableDescription> initialize() throws SQLException;

	@Override
	public Statement getStatement() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SQLXML getSQLXML(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RowId getRowId(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ref getRef(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSetMetaData getMetaData() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findColumn(String column) throws SQLException {
		int retValue = 0;
		
		if ("TABLE_CAT".equals(column)) {
			retValue = 1;
		} else
		if ("TABLE_SCHEM".equals(column)) {
			retValue = 2;
		} else
		if ("TABLE_NAME".equals(column)) {
			retValue = 3;
		} else
		if ("TABLE_TYPE".equals(column)) {
			retValue = 4;
		} else
		if ("REMARKS".equals(column)) {
			retValue = 5;
		} else
		if ("TYPE_CAT".equals(column)) {
			retValue = 6;
		} else
		if ("TYPE_SCHEM".equals(column)) {
			retValue = 7;
		} else
		if ("TYPE_NAME".equals(column)) {
			retValue = 8;
		} else
		if ("SELF_REFERENCING".equals(column)) {
			retValue = 9;
		} else
		if ("REF_GENERATION".equals(column)) {
			retValue = 10;
		}
		return retValue;
	}
	
	@Override
	public String getString(int columnIdx) throws SQLException {
		String retValue;
				
		TableDescription tableDescription = tables.get(tablesIdx);
		switch (columnIdx) {
		case 1:
			retValue = tableDescription.getTableCatalog();
			break;
		case 2:
			retValue = tableDescription.getTableSchema();
			break;
		case 3:
			retValue = tableDescription.getTableName();
			break;
		case 4:
			retValue = tableDescription.getTableType();
			break;
		case 5:
			retValue = tableDescription.getRemarks();
			break;
		case 6:
			retValue = tableDescription.getTypeCatalog();
			break;
		case 7:
			retValue = tableDescription.getTypeSchema();
			break;
		case 8:
			retValue = tableDescription.getTypeName();
			break;
		case 9:
			retValue = tableDescription.getSelfReferencing();
			break;
		case 10:
			retValue = tableDescription.getRefGeneration();
			break;

		default:
			throw new SQLException(new ArrayIndexOutOfBoundsException());
		}
		
		return retValue;
	}
}