package com.example.community_old.Dto.CommunityDto.BoardDto;

import com.example.community_old.JpaClass.CommunityTable.BoardEntity;
import com.example.community_old.JpaClass.CommunityTable.CommentEntity;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CommentDto {

    private int id;
    private String commentWriter;
    private String commentContent;
    private LocalDateTime creatTime;
    private int postId;

    public static CommentEntity TransferCommentEntity(CommentDto dto, BoardEntity entitys, String userId) {
        CommentEntity entity = new CommentEntity();
        entity.setReport(0);
        entity.setCommentContent(dto.commentContent);
        entity.setLikeCount(0);
        entity.setCommentWriter(dto.commentWriter);
        entity.setEntity(entitys);
        entity.setUserId(userId);
        return entity;
    }
}
