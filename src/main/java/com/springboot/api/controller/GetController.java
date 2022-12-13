package com.springboot.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.springboot.api.dto.MemberDto;

@Controller
@RequestMapping("/api/v1/get-api")
public class GetController {

    // http://localhost:8080/api/v1/get-api/name
    @GetMapping("/name")
    public String MyName() {
        return "Boseok Son";
    }

    // http://localhost:8080/api/v1/get-api/get-name/{ name }
    @GetMapping("/get-name/{name}")
    public String getName(@PathVariable String name) {
        return "Typed My Name : " + name;
    }

    // http://localhost:8080/api/v1/get-api/get-name2/{ name2 }
    @GetMapping("/get-name2/{name2}")
    public String getName2(@PathVariable("name2") String var) {
        return "Typed My Name : " + var;
    }

    // http://localhost:8080/api/v1/get-api/req?name={ name }&age={ age }
    @GetMapping("/req")
    public String getRequestParam( @RequestParam String name, @RequestParam String age, Model model ) {

        model.addAttribute("name", name);
        model.addAttribute("age", age);

        return "get-req";
    }

    // http://localhost:8080/api/v1/get-api/dto?name={ name }&age={ age }&gender={ gender }
    @GetMapping("/dto")
    public String getDtoRequestParam(MemberDto memberDto, Model model) {

        model.addAttribute("name", memberDto.getName());
        model.addAttribute("age", memberDto.getAge());
        model.addAttribute("gender", memberDto.getGender());
        model.addAttribute("variable", memberDto.toString());

        return "get-dto-req";
    }

}
