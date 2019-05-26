package com.lqw.supermarketGuideSystem.comment.web;

import com.lqw.supermarketGuideSystem.comment.domain.Comment;
import com.lqw.supermarketGuideSystem.comment.dto.CommentGetDTO;
import com.lqw.supermarketGuideSystem.comment.service.impl.CommentServiceImpl;
import com.lqw.supermarketGuideSystem.common.dto.ResultDTO;
import com.lqw.supermarketGuideSystem.user.domain.Customer;
import com.lqw.supermarketGuideSystem.user.repository.UserRepository;
import com.lqw.supermarketGuideSystem.user.service.impl.CustomerServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/4/11
 * @TIME: 22:00
 */


@RestController
@RequestMapping(value = "/api/comment/")
public class CommentController {
    @Autowired
    CommentServiceImpl service;
    @Autowired
    CustomerServiceImpl customerService;

    @RequestMapping(value = "",method = RequestMethod.POST)
    public ResultDTO postComment(@RequestBody Comment comment) {
        if(service.saveComment(comment)){
            return ResultDTO.builder().statusCode(2000L).message("success").build();
        }else {
            return ResultDTO.builder().statusCode(4000L).message("false").build();
        }
    }

    @RequestMapping(value = "{merchantId}",method = RequestMethod.GET)
    public ResultDTO getComment( @PathVariable("merchantId") int merchantId) {
        List<Comment> result1 = service.findCommentByMerchantId(merchantId);
        List result = new ArrayList();
        for (int i = 0; i < result1.size(); i++) {
            Comment comment = result1.get(i);
            CommentGetDTO commentGetDTO = new CommentGetDTO();
            BeanUtils.copyProperties(comment,commentGetDTO);
            List<Customer> result2 = customerService.findCustomerById(comment.getUserId());
            BeanUtils.copyProperties(result2.get(0),commentGetDTO);
            result.add(commentGetDTO);
        }
        if(result.size()>0){
            return ResultDTO.builder().statusCode(2000L).message("success").data(result).build();
        }else {
            return ResultDTO.builder().statusCode(4000L).message("false").build();
        }
    }
}
