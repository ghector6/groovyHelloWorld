package com.example.groovyHelloWorld

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class GroovyController  {
    @GetMapping("/emp/{name}")
    static Employee getEmployee(@PathVariable String name){
        new Employee(name, name.size() * 6    )
    }

}
