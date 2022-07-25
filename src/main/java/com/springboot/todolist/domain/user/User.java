package com.springboot.todolist.domain.user;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	private int usercode;
	private String username;
	private String password;
	private String name;
	private String email;
	private LocalDateTime createdate;
	private LocalDateTime updatedate;
	
}
