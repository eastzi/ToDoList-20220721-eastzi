package com.springboot.todolist.service.user;

import com.springboot.todolist.web.dto.user.CreateUserReqDto;

public interface UserService { 
	public boolean createUser(CreateUserReqDto createUserReqDto) throws Exception;
	public  boolean readUser(CreateUserReqDto createUserReqDto) throws Exception;
	public  boolean updateUser(CreateUserReqDto createUserReqDto) throws Exception;
	public  boolean deleteUser(CreateUserReqDto createUserReqDto) throws Exception; 
}
