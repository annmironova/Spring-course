package com.mironova.springcourse;


import org.springframework.stereotype.Component;

@Component
public class PopMusic implements Music{
    @Override
    public String getSong() {
        return "Gimme More Remastered";
    }
}
