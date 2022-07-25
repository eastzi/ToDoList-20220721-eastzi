package com.springboot.todolist.domain.content;

import java.time.LocalDateTime;

import com.springboot.todolist.web.dto.content.CreateContentRespDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Content {
	private int contentcode;
	private String content;
	private int usercode;
	private LocalDateTime createdate;
	private LocalDateTime updatedate;
	
	public CreateContentRespDto toCreateContentDto(boolean insertStatus) {
		return CreateContentRespDto.builder()
				.contentcode(contentcode)
				.content(content)
				.usercode(usercode)
				.insertStatus(insertStatus)
				.build();
	}
	
}
