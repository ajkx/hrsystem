package com.victory.hr.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.victory.hr.test.Student;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ajkx
 * Date: 2017/5/4.
 * Time:17:20
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody
    Map test(Student student){
        System.out.println(student.getName());
        System.out.println(student.getAge());
        Map<String, String> map = new HashMap<String, String>();
        map.put("1","a");

        return map;
    }
}
