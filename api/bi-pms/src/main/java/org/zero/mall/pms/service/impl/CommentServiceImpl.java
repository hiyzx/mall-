package org.zero.mall.pms.service.impl;

import org.zero.mall.pms.entity.Comment;
import org.zero.mall.pms.mapper.CommentMapper;
import org.zero.mall.pms.service.ICommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品评价表 服务实现类
 * </p>
 *
 * @author hiyzx
 * @since 2019-12-04
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
