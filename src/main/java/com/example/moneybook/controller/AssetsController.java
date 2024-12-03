package com.example.moneybook.controller;

import com.example.moneybook.dto.AssetsDTO1;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Log4j2

public class AssetsController {


    @GetMapping("/zz/zz")
    public String inputDate(){



        return "aa";
    }
    @PostMapping("/zz/zz")
    public String inputDatePost(AssetsDTO1 assetsDTO1){


        log.info("들어온 값" +  assetsDTO1);
        log.info("들어온 값" +  assetsDTO1);
        log.info("들어온 값" +  assetsDTO1);
        log.info("들어온 값" +  assetsDTO1);
        log.info("들어온 값" +  assetsDTO1);



        return "aa";
    }



}
