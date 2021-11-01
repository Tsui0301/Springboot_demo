package startDemo.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import startDemo.mapper.MemberMapper;
import startDemo.pojo.Member;

import java.util.List;

public interface MemberService {

    IPage<Member> findMember(Page<?> page, Integer state);
}
