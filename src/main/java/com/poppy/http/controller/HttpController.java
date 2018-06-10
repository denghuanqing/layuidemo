package com.poppy.http.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author poppy
 * @date 2018/6/10 9:59
 * http携带的参数与spring接受参数
 */
@RequestMapping("http")
@Controller
public class HttpController {
    Logger logger = LoggerFactory.getLogger(HttpController.class);

    @RequestMapping("/")
    public String index() {
        return "http.html";
    }

    @RequestMapping("demo1")
    public void demo1(@RequestParam(required = false) String param0,@RequestParam(required = false) String param1) {
        logger.info("+++++++++++++++++++ request  begin +++++++++++++++++++++");
        logger.info(param1);
        logger.info("------------------- request  begin ---------------------");
    }
}
