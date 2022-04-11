package startDemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import startDemo.pojo.Member;

import java.util.List;

@Mapper
public interface MemberMapper extends BaseMapper<Member> {
    @Select("select * from member")
    IPage<Member> findMember(Page<?> page, Integer state);




}
