package com.uvce.rest.api;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonProperty;

@XmlRootElement
public class Portal {
	@JsonProperty("companyName")
	public String companyName;

	public Portal() {

	}
}
