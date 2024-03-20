package com.von.api;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class HomeService {
    private final HomeRepository repository;
    
    public String test(){
        return "";
    }
}
