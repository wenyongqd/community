package life.majiang.community.community.controller;


import life.majiang.community.community.dto.PaginationDTO;
import life.majiang.community.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created ny wenyong on 2019/12/1
 */
@Controller  //它回自动识别扫描controller类，并把它当成bean去管理，controller类：允许这个类去接受前端的请求
public class IndexController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/")
    public String index(Model model,
                        @RequestParam(name = "page", defaultValue = "1") Integer page,
                        @RequestParam(name = "size", defaultValue = "5") Integer size
                        ){


        PaginationDTO pagination = questionService.list(page, size);

            model.addAttribute("pagination", pagination);
        return "index";
    }
}
