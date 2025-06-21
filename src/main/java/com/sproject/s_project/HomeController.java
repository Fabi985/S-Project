package com.sproject.s_project;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.ui.Model;

import com.sproject.s_project.Entity.TestTable;
import com.sproject.s_project.Repository.TestTableRepo;

@Controller
public class HomeController {

    @Autowired
    private TestTableRepo repository;

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/test")
    public String test(Model model)
    {
        List<TestTable> data = repository.findAll();
        model.addAttribute("testData", data);
        return "test";
    }
}
