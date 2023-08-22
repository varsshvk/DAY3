package com.Question.day3.pack_1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApicontrollerEx_1 {
@Value("1")
public int id;
@Value("Varssha")
public String name;
@Value("19")
public int age;
@Value("20000")
public long salary;
@RequestMapping("/day")
public String day() {
	return id+"-"+name+"-"+age+"-"+salary;
}


}
