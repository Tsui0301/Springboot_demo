package startDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import startDemo.mapper.TestMapper;
import startDemo.pojo.User;

import java.util.List;

@Service
public class TestServiceImp implements TestService {

    @Autowired
    TestMapper testMapper;

    @Override
    public List<User> selectAll() {
        return testMapper.selectAll();
    }
}
