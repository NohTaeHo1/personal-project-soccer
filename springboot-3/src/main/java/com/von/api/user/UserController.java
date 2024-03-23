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

import com.von.api.enums.Messenger;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "http://localhost:3000")
@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserRepository repo;

    @PostMapping("/api/login") 
    public Map<?,?> login(@RequestBody Map<String,?> paramMap){
        Map<String, String> map = new HashMap<>();
        String userName = (String)paramMap.get("userName");
        String password = (String)paramMap.get("password");
        System.out.println("로그인하는 아이디 : "+userName);
        System.out.println("로그인하는 비밀번호 : "+password);
        map.put("유저이름", userName);
        map.put("비밀번호", password);
        return map;
    }

    @PostMapping(path = "/api/users")
    public Map<?,?> join(@RequestBody Map<String,?> paramMap){

        User newUser = repo.save(User.builder()
        .username((String) paramMap.get("userName"))
        .password((String) paramMap.get("password"))
        .name((String) paramMap.get("name"))
        .phone((String) paramMap.get("phone"))
        .job((String) paramMap.get("job"))
        .height(Double.parseDouble((String) paramMap.get("height")))
        .weight(Double.parseDouble((String) paramMap.get("weight")))
        .build()   
        );
        System.out.println("DB에 저장된 User 정보: "+newUser);
        Map<String, Messenger> map = new HashMap<>(); 
        map.put("messege", Messenger.SUCCESS);
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


}

}
