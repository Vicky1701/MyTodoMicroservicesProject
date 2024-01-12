package com.learnspring.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> tods = new ArrayList<>();
    static {
        tods.add(new Todo(1,"Vikas","Learn AWS", LocalDate.now().plusYears(1),false));
        tods.add(new Todo(2,"Vikas2","Learn Deveops", LocalDate.now().plusYears(2),false));
        tods.add(new Todo(3,"Vikas3","Learn DSA", LocalDate.now().plusYears(3),false));
        tods.add(new Todo(4,"Vikas4","Learn J2EE", LocalDate.now().plusYears(4),false));
    }

    public List<Todo> findByUsername(String username){
        return tods;
    }
}
