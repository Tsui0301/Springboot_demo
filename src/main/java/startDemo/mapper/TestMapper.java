package startDemo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import startDemo.pojo.User;

import java.util.List;

@Mapper
public interface TestMapper {


    @Select("select * from user")
    public List<User> selectAll();

}
