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


public abstract class AbstractColumnsResultSet extends AbstractReadonlyResultSet {
	
	private final List<ColumnDescription> tables = new ArrayList<ColumnDescription>();
	private int tablesIdx = -1;

	@Override
	public boolean next() throws SQLException {
		if (tablesIdx == -1) {
			tables.addAll(initialize());
		}
		return ++tablesIdx < tables.size();
	}

	protected abstract List<ColumnDescription> initialize() throws SQLException;

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
		if ("COLUMN_NAME".equals(column)) {
			retValue = 4;
		} else
		if ("DATA_TYPE".equals(column)) {
			retValue = 5;
		} else
		if ("TYPE_NAME".equals(column)) {
			retValue = 6;
		} else
		if ("COLUMN_SIZE".equals(column)) {
			retValue = 7;
		} else
		if ("DECIMAL_DIGITS".equals(column)) {
			retValue = 9;
		} else
		if ("NUM_PREC_RADIX".equals(column)) {
			retValue = 10;
		} else
		if ("NULLABLE".equals(column)) {
			retValue = 11;
		} else
		if ("REMARKS".equals(column)) {
			retValue = 12;
		} else
		if ("COLUMN_DEF".equals(column)) {
			retValue = 13;
		} else
		if ("CHAR_OCTET_LENGTH".equals(column)) {
			retValue = 16;
		} else
		if ("ORDINAL_POSITION".equals(column)) {
			retValue = 17;
		} else
		if ("IS_NULLABLE".equals(column)) {
			retValue = 18;
		} else
		if ("SCOPE_CATLOG".equals(column)) {
			retValue = 19;
		} else
		if ("SCOPE_SCHEMA".equals(column)) {
			retValue = 20;
		} else
		if ("SCOPE_TABLE".equals(column)) {
			retValue = 21;
		} else
		if ("SOURCE_DATA_TYPE".equals(column)) {
			retValue = 22;
		} else
		if ("IS_AUTOINCREMENT".equals(column)) {
			retValue = 23;
		}
		
		return retValue;
	}
	
	@Override
	public String getString(int columnIdx) throws SQLException {
		String retValue;
				
		ColumnDescription columnDescription = tables.get(tablesIdx);
		switch (columnIdx) {
		case 1:
			retValue = columnDescription.getTableCatalog();
			break;
		case 2:
			retValue = columnDescription.getTableSchema();
			break;
		case 3:
			retValue = columnDescription.getTableName();
			break;
		case 4:
			retValue = columnDescription.getColumnName();
			break;
		case 5:
			retValue = Integer.toString(columnDescription.getDataType());
			break;
		case 6:
			retValue = columnDescription.getTypeName();
			break;
		case 7:
			retValue = Integer.toString(columnDescription.getColumnSize());
			break;
		case 9:
			retValue = Integer.toString(columnDescription.getDecimalDigits());
			break;
		case 10:
			retValue = Integer.toString(columnDescription.getNumPreRadix());
			break;
		case 11:
			retValue = Integer.toString(columnDescription.getNullable());
			break;
		case 12:
			retValue = columnDescription.getRemarks();
			break;
		case 13:
			retValue = columnDescription.getColumnDef();
			break;
		case 16:
			retValue = Integer.toString(columnDescription.getCharOctetLength());
			break;
		case 17:
			retValue = Integer.toString(columnDescription.getOrdinalPosition());
			break;
		case 18:
			retValue = columnDescription.isNullable();
			break;
		case 19:
			retValue = columnDescription.getScopeCatalog();
			break;
		case 20:
			retValue = columnDescription.getScopeSchema();
			break;
		case 21:
			retValue = columnDescription.getScopeTable();
			break;
		case 22:
			retValue = Short.toString(columnDescription.getSourceDataType());
			break;
		case 23:
			retValue = columnDescription.isAutoincrement();
			break;
			
		default:
			throw new SQLException(new ArrayIndexOutOfBoundsException());
		}

		return retValue;
	}
}