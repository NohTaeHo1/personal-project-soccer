package com.von.api.user;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "http://localhost:3000/")
@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserService service;
    
    @PostMapping("/login") 
    public Map<?,?> login(@RequestBody Map<?,?> paramMap){
        Map<String, String> map = new HashMap<>();
        String userName = (String)paramMap.get("userName");
        String password = (String)paramMap.get("password");
        System.out.println("로그인하는 아이디 : "+userName);
        System.out.println("로그인하는 비밀번호 : "+password);
        map.put("유저이름", userName);
        map.put("비밀번호", password);
        return map;
    }

    
    public Map<String, ?> findAll() {
        Map<String, String> map = new HashMap<>();
        return map;
    }
    
    
    public Map<String, ?> findById(Scanner scanner) {
        Map<String, String> map = new HashMap<>();
        return map;    }
    
    public Map<String, ?> updatePassword(Scanner scanner) {
        Map<String, String> map = new HashMap<>();
        return map;
    }
    
    public Map<String, ?> delete(Scanner scanner) {
        Map<String, String> map = new HashMap<>();
        return map;
    }
    
    
    public Map<String, ?> findUsersByName(Scanner scanner) {
        Map<String, String> map = new HashMap<>();
        return map;    }
    
    
    public Map<String, ?> findUsersByJob(Scanner scanner) {
        Map<String, String> map = new HashMap<>();
        return map;    }
    
    
    public Map<String, ?> count() {
        Map<String, String> map = new HashMap<>();
        return map;    }
    
    
    public Map<String, ?> findUsers() throws SQLException {
        Map<String, String> map = new HashMap<>();
        return map;    }
    
    public Map<String, ?> createUsers() throws SQLException {
        Map<String, String> map = new HashMap<>();
        return map;    }
    
    public Map<String, ?> createTable() throws SQLException {
        Map<String, String> map = new HashMap<>();
        return map;    }
    
    public Map<String, ?> deleteTable() throws SQLException {
        Map<String, String> map = new HashMap<>();
        return map;    

    // public Map<?,?> join(@RequestBody Map<?,?> paraMap){

    // }
}

}
