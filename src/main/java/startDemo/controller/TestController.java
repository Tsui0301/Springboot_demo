package startDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @ResponseBody
    @RequestMapping("hello")
    public String hello(){
        System.out.println("asdasdasdi奥斯代价是带键盘");
        return "hello haaha";
    }
}
