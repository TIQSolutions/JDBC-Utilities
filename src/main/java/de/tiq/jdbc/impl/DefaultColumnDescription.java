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

public class DefaultColumnDescription implements ColumnDescription {
	
	private int idx;
	private String typeName;
	private int dataType;
	private String columnName;
	private String tableName;

	public DefaultColumnDescription(int idx, String typeName, int dataType,
			String columnName, String tableName) {
		this.idx = idx;
		this.typeName = typeName;
		this.dataType = dataType;
		this.columnName = columnName;
		this.tableName = tableName;
	}

	@Override
	public String getTableCatalog() {
		return null;
	}

	@Override
	public String getTableSchema() {
		return null;
	}

	@Override
	public String getTableName() {
		return tableName;
	}

	@Override
	public String getColumnName() {
		return columnName;
	}

	@Override
	public int getDataType() {
		return dataType;
	}

	@Override
	public String getTypeName() {
		return typeName;
	}

	@Override
	public int getColumnSize() {
		return 0;
	}

	@Override
	public int getDecimalDigits() {
		return 0;
	}

	@Override
	public int getNumPreRadix() {
		return 10;
	}

	@Override
	public int getNullable() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getRemarks() {
		return null;
	}

	@Override
	public String getColumnDef() {
		return null;
	}

	@Override
	public int getCharOctetLength() {
		return 0;
	}

	@Override
	public int getOrdinalPosition() {
		return idx;
	}

	@Override
	public String isNullable() {
		return "";
	}

	@Override
	public String getScopeCatalog() {
		return null;
	}

	@Override
	public String getScopeSchema() {
		return null;
	}

	@Override
	public String getScopeTable() {
		return null;
	}

	@Override
	public short getSourceDataType() {
		return 0;
	}

	@Override
	public String isAutoincrement() {
		return "";
	}

}
