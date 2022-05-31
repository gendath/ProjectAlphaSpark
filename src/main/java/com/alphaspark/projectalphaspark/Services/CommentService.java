package com.alphaspark.projectalphaspark.Services;

import com.alphaspark.projectalphaspark.Entities.Comment;

import java.util.List;

public interface CommentService {

    List<Comment> getAllComments();
    List<Comment> getUserComments(Long userId);
    List<Comment> getProjectComments(Long projectId);
    List<Comment> getProposalComments(Long ProposalId);
    Comment addComment(Comment comment);
    Comment updateComment(Comment comment);
    boolean deleteComment(Long commentId);
}
