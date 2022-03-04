package com.zbh.Dao;

import com.zbh.Entity.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: ONESTAR
 * @QQ群: 530311074
 * @URL: https://onestar.newstar.net.cn/
 */
public interface CommentRepository extends JpaRepository<Comment,Long>{


    List<Comment> findByBlogIdAndParentCommentNull(Long blogId, Sort sort);

}
