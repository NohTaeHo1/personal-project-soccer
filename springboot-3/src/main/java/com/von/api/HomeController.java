package com.von.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "http://localhost:3000/")
@RequiredArgsConstructor
@RestController
public class HomeController {
    private final HomeService service;

    @GetMapping("/")
    public String hello(){
        String s = service.test();
        return "Welcome To Spring Boot - 9";
    }

    @PostMapping("/name") //request scope (/)가 다 가져오라는 뜻ex)/jobs :jobs에 있는거 다 가져와라
    public Map<String,?> name(@RequestBody Map<String,?> map){
        String name = (String)map.get("name");
        System.out.println("리퀘스트가 가져온 이름 : "+name);
        Map<String,String> respMap = new HashMap<>();
        respMap.put("name", "환영합니다 "+name);
        return respMap;
    }

}
