package com.eazybytes.EazySchoolApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/home") // sa here qe useri kerkon /home , web i e drejton ne kte faqen e home controller
    public String displayHomePage(){
        return "home.html";// do ktheje faqen e html ,
    }

}
