package startDemo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import startDemo.mapper.MemberMapper;
import startDemo.pojo.Member;

import java.util.List;

@Service
public class MemberServiceImp implements MemberService{

    @Autowired
    MemberMapper memberMapper;

    @Override
    public IPage<Member> findMember(Page<?> page, Integer state) {
        return memberMapper.findMember(page,state);
    }
}
