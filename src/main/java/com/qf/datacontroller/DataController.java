package com.qf.datacontroller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DataController {
    @GetMapping("/mdhello")
    public List<String> genString(){
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
              list.add("第" + i + "名");
        }
        //打印
        System.out.println(list);

        return list;
    }
}
