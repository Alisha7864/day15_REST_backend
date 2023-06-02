package com.app.sec;

//import com.app.dto.UserDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthenticationResponse {
	
	private final String token;
	private com.app.sec.User user;
	private boolean success;
	
	public AuthenticationResponse(String jwt) {
		this.token = jwt;
	}

	public AuthenticationResponse(String token, com.app.sec.User user, boolean success) {
		super();
		this.token = token;
		this.user = user;
		this.success = success;
	}

	public String getToken() {
		return token;
	}

	public com.app.sec.User getUser() {
		return user;
	}

	public void setUser(com.app.sec.User user) {
		this.user = user;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	@Override
	public String toString() {
		return "AuthenticationResponse [token=" + token + ", user=" + user + ", success=" + success + "]";
	}

	
	
}
