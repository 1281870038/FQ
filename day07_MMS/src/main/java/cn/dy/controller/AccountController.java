package cn.dy.controller;

import cn.dy.pojo.Account;
import cn.dy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/acc")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/FindAll")
    public String findAll(Model model){
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "show";
    }

}
