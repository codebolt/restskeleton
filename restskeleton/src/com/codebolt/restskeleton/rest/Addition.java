package com.codebolt.restskeleton.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Addition {
	final private long num1 ;

	final private long num2 ;

	public Addition(long num1, long num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	@JsonProperty
	public Long getNum1() {
		return num1;
	}

	@JsonProperty
	public Long getNum2() {
		return num2;
	}

	@JsonProperty
	public Long getResult() {
		return num1 + num2;
	}
}
