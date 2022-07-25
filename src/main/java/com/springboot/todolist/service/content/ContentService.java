package com.springboot.todolist.service.content;

import com.springboot.todolist.web.dto.content.CreateContentReqDto;
import com.springboot.todolist.web.dto.content.CreateContentRespDto;

public interface ContentService {
	public CreateContentRespDto createContent(CreateContentReqDto createContentReqDto) throws Exception;
	//public boolean readContent(CreateContentReqDto createContentReqDto) throws Exception;
	public boolean updateContent(CreateContentReqDto createContentReqDto) throws Exception;
	public boolean deleteContent(CreateContentReqDto createContentReqDto) throws Exception;
}
