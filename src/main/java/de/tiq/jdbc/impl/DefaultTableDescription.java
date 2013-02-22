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

public class DefaultTableDescription implements TableDescription {

	private String name;
	private String tableType;
	private String remarks;

	public DefaultTableDescription(String name, String tableType, String remarks) {
		this.name = name;
		this.tableType = tableType;
		this.remarks = remarks;
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
		return name;
	}
	
	@Override
	public String getTableType() {
		return tableType;
	}

	@Override
	public String getRemarks() {
		return remarks;
	}

	@Override
	public String getTypeCatalog() {
		return null;
	}

	@Override
	public String getTypeSchema() {
		return null;
	}

	@Override
	public String getTypeName() {
		return null;
	}

	@Override
	public String getSelfReferencing() {
		return null;
	}

	@Override
	public String getRefGeneration() {
		return null;
	}
}