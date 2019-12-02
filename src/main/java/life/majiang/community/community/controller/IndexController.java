package life.majiang.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created ny wenyong on 2019/12/1
 */
@Controller  //它回自动识别扫描controller类，并把它当成bean去管理，controller类：允许这个类去接受前端的请求
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
