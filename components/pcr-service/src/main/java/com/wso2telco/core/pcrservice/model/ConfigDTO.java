/*******************************************************************************
 * Copyright  (c) 2015-2016, WSO2.Telco Inc. (http://www.wso2telco.com) All Rights Reserved.
 * 
 * WSO2.Telco Inc. licences this file to you under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.wso2telco.core.pcrservice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;

// TODO: Auto-generated Javadoc
/**
 * The Class ConfigDTO.
 */
public class ConfigDTO extends Configuration implements Serializable{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -8356032431902326005L;
	

	/** The database. */
	@JsonProperty
	private DataSourceFactory database = new DataSourceFactory();
	
	/** The server. */
	@JsonProperty
	private Object server;
	
	/** The logging. */
	@JsonProperty
	private Object logging;
	
	/**
	 * Gets the data source factory.
	 *
	 * @return the data source factory
	 */
	public DataSourceFactory getDataSourceFactory() {
		return database;
	}

}
