package com.springboot.todolist.service.content;

import org.springframework.stereotype.Service;

import com.springboot.todolist.domain.content.Content;
import com.springboot.todolist.domain.content.ContentRepository;
import com.springboot.todolist.web.dto.content.CreateContentReqDto;
import com.springboot.todolist.web.dto.content.CreateContentRespDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ContentServiceImpl implements ContentService {
	
	private final ContentRepository contentRepository;

	@Override
	public CreateContentRespDto createContent(CreateContentReqDto createContentReqDto) throws Exception {
		Content contentEntity = createContentReqDto.toEntity();
		boolean insertStatus = contentRepository.save(contentEntity) > 0;
		return contentEntity.toCreateContentDto(insertStatus);
	}

	@Override
	public boolean updateContent(CreateContentReqDto createContentReqDto) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteContent(CreateContentReqDto createContentReqDto) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
