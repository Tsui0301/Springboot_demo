package startDemo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import startDemo.pojo.Member;
import startDemo.service.MemberService;
import startDemo.service.MemberService2;
import startDemo.utils.Result;

import java.sql.Wrapper;
import java.util.List;

//分页测试
@RestController
public class PageTestController {


    @Autowired
    MemberService memberService;

    @Autowired
    MemberService2 memberService2;

    //分页查询 官方文档Mybatis-plus
    @RequestMapping("/findMember")
    public Result<?> findMember(@RequestParam(defaultValue = "1") Integer pageNum,
                                @RequestParam(defaultValue = "10") Integer pageSize){

        IPage<Member> ipage= memberService.findMember
                        (new Page<Member>(pageNum,pageSize), null);
        return Result.success(ipage);
    }

    //分页查询,带搜索参数search和 模糊查询,
    @RequestMapping("/findMember2")
    public Result<?> findMember2(@RequestParam(defaultValue = "1") Integer pageNum,
                                @RequestParam(defaultValue = "10") Integer pageSize,
                                 @RequestParam(defaultValue = "") String search
                                 ){

            IPage<Member> ipage= memberService2.page   //已经封装好的page对象
                    (new Page<Member>(pageNum,pageSize),
                            Wrappers.<Member>lambdaQuery().
                                    like(Member::getName,search));
            return Result.success(ipage);
    }

    //分页查询,带搜索参数search和 模糊查询,
    @RequestMapping("/findMember22")
    public Result<?> findMember22(@RequestParam(defaultValue = "1") Integer pageNum,
                                 @RequestParam(defaultValue = "10") Integer pageSize,
                                 @RequestParam(defaultValue = "") String search
    ){

        //条件构造器，用于添加条件
        QueryWrapper<Member> queryWrapper = new QueryWrapper<Member>();
        queryWrapper.like("name",search);

        IPage<Member> ipage= memberService2.page   //已经封装好的page对象
                (new Page<Member>(pageNum,pageSize),
                        queryWrapper);
        return Result.success(ipage);
    }




}
