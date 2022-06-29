package com.ispan.group3.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ispan.group3.repository.Comment;
import com.ispan.group3.repository.CommentRepository;

//@Transactional
@Service
public class CommentService {
	
	private final CommentRepository cRepository;
	
	@Autowired
	public CommentService(CommentRepository cRepository) {
		this.cRepository = cRepository;
	}

	public List<Comment> getComments() {

		return cRepository.findAll();
	}
	
	public Optional<Comment> getComment(Integer id) {
		return cRepository.findById(id);
	}

	
//	public void saveComent(Comment comment) {
//		
//	}

	public void deleteComment(Integer id) {
		boolean exists = cRepository.existsById(id);
		if (!exists) {
			throw new IllegalStateException("Comment with id " + id + " does not exist");
		}
		cRepository.deleteById(id);
	}

	public void updateComment(Integer id, Integer rating, String content) {
		Comment comment = (Comment)cRepository.findById(id)
				.orElseThrow(() -> new IllegalStateException("Comment with id " + id + " does not exist"));
		if (rating != null && !Objects.equals(comment.getRating(), rating)) {
			comment.setRating(rating);
		}
		
		if (content != null && !Objects.equals(comment.getContent(), content)) {
			comment.setContent(content);
		}
	}
	
	
	
}
