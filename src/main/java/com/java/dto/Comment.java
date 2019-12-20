package com.java.dto;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Comment {
	String commentId;
	String text;
	ArrayList<String> replies = new ArrayList<String>();
}
