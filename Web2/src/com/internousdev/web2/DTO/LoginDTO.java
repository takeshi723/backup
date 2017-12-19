package com.internousdev.web2.DTO;

public class LoginDTO {
	public String username;
	public String nickname;
	public String password;

	public String getUsername(){
		return username;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getNickname(){
		return nickname;
	}

	public void setNickname(String nickname){
		this.nickname = nickname;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password = password;
	}



}
