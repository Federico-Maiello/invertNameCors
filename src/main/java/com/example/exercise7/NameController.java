package com.example.exercise7;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/api")
public class NameController {
    @GetMapping("/name")
    public String getName(@RequestParam String name){
        return name;
    }
    @PostMapping("/invertName")
    public String invertName(@RequestParam String name){
        StringBuilder invertName = new StringBuilder();
        for(int i = name.length() - 1; i>0; i--){
            invertName.append(name.charAt(i));
        }
        return invertName.toString();
    }
}
