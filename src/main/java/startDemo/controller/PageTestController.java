package startDemo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import startDemo.pojo.Member;
import startDemo.service.MemberService;
import startDemo.utils.Result;

import java.util.List;

//分页测试
@RestController
public class PageTestController {


    @Autowired
    MemberService memberService;


    //分页查询 官方文档Mybatis-plus
    @RequestMapping("/findMember")
    public Result<?> findMember(@RequestParam(defaultValue = "1") Integer pageNum,
                                @RequestParam(defaultValue = "10") Integer pageSize){

        IPage<Member> ipage= memberService.findMember
                        (new Page<Member>(pageNum,pageSize), null);
        return Result.success(ipage);
    }




}
