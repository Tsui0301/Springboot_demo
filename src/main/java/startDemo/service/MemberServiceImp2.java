package startDemo.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import startDemo.mapper.MemberMapper;
import startDemo.pojo.Member;


@Service
public class MemberServiceImp2 extends ServiceImpl<MemberMapper,Member> implements MemberService2{


}
