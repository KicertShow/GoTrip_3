package com.ispan.group3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ispan.group3.repository.Comment;
import com.ispan.group3.service.CommentService;

@RestController
@RequestMapping(path = "api/comments")
public class CommentController {

	private final CommentService cService;
	
	@Autowired
	public CommentController(CommentService cService) {
		this.cService = cService;
	}

	@GetMapping
	public List<Comment> getComments() {
		return cService.getComments();
	}
	
//	@PostMapping
//	public void saveComment(@RequestBody Comment comment) {
//		cService.saveComent(comment);
//	}
	
	@PutMapping(path = "{id}")
	public void updateComment(@PathVariable Integer id,
							  @RequestParam(required = false) Integer rating,
							  @RequestParam(required = false) String content) {
		cService.updateComment(id, rating, content);
	}
	
	@DeleteMapping(path = "{id}")
	public void deleteComment(@PathVariable Integer id) {
		cService.deleteComment(id);
	}


}
