package com.springboot.todolist.web.dto.user;

import com.springboot.todolist.domain.user.User;

import lombok.Data;

@Data
public class CreateUserReqDto {
	private String username;
	private String password;
	private String name;
	
	public User toEntity() {
		return User.builder()
				.username(username)
				.password(password)
				.name(name)
				.build();
	}
}
