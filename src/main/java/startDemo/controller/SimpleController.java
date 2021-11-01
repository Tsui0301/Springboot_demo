package startDemo.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import startDemo.pojo.User;
import startDemo.service.TestService;
import java.util.List;

@Controller
@ResponseBody
public class SimpleController {

    @Autowired
    TestService testService;


    @RequestMapping("hello")
    public String hello(){
        System.out.println("这是简单的字符串传输测试！");
        return "hello haaha";
    }


//    查询数据库用户信息
    @RequestMapping("selectAll")
    public JSONObject selectAll(){
        JSONObject js = new JSONObject();
        try {
           List<User> list =  testService.selectAll();
           js.put("msg",list);
           js.put("code","1");
           return js;

        }catch (Exception e){
            e.printStackTrace();
            js.put("msg","系统错误");
            js.put("code","0");
            return js;

        }


    }

}
