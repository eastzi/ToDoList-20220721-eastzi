package com.springboot.todolist.web.dto.content;

import com.springboot.todolist.domain.content.Content;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateContentReqDto {
	private int contentcode;
	private String content;
	private int usercode;
	
	public Content toEntity() {
		return Content.builder()
				.contentcode(contentcode)
				.content(content)
				.usercode(usercode)
				.build();
	}
}
