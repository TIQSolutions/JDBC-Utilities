# JDBC Utils

Library to provide default classes for building a jdbc driver. Used at runtime.
 
## Getting started

### Prerequisites

#### Build the project
This project can be built with maven. You should install maven on your operating system to be able to build the project. 
Use 'mvn -install' in the root directory of the project (the project's POM file is located there). 
This will install a jar of this project in your local maven repository, which you can use to refer to this library as a dependency in an other maven project, shown in the usage paragraph below. 
After a successful building process maven will generate a jar file in the "target" folder, containing the compiled classes.

### Usage
      
To use this library in your projects, add the created jar file to the classpath of the consuming project. 
If you are using maven, you can include this library in the dependency section of your POM:

		<dependency>
			<groupId>de.tiq</groupId>
			<artifactId>JdbcUtils</artifactId>
			<version>0.0.1-SNAPSHOT</version>
		</dependency>	

## Developer info

This project contains classes used in the JDBC Annotations project. Ignore them, if you do not use their functionality.  

There are: 

ConnectionHandler          - abstract proxy class for handling connection

QueryExecutor		   - abstract proxy class, which executes sql queries

ConnectionMetaDataProvider - interface, built to handle "connection meta data" of a connection  
 
 
For detailed informations, checkout the JDBC Annotations project on Github.

## Colophon		

### Company

This project is developed by TIQ Solutions GmbH, a german enterprise for data quality management.
You can contact us: info@tiq-solutions.de 

### License 

The project is licensed under terms of a dual treatment. For non-commercial projects, the source code is provided under terms of the GPL (http://www.gnu.org/licenses/gpl-2.0.html).
If you wish to include this project in a proprietary context, you must be granted a special vendor license.   

