package startDemo.service;

import org.springframework.stereotype.Service;
import startDemo.pojo.User;

import java.util.List;


public interface TestService {

    public List<User> selectAll();
}
