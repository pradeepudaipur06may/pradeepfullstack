package com.example.springboot.response;

public class SpeakingClockResponse {
	private String code;
	
	private String message;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public SpeakingClockResponse(String code, String message) {
		this.code = code;
		this.message = message;
	}
	
	
}
