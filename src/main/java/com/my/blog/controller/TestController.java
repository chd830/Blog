package com.my.blog.controller;

import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequestMapping("/test/api")
public class TestController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    // logger 레벨 설정 부분에서 debug와 trace는 출력되지 않음
    @GetMapping("/log")
    public void log() throws Exception {
       log.fatal("FATAL");
       log.error("ERROR");
       log.warn("WARN");
       log.info("INFO");
       log.debug("DEBUG");
       log.trace("TRACE");
    }

    @GetMapping(value = "/hello")
    @ApiOperation(value = "hello, world api", notes = "hellow world swagger check")
    public String hellowWorld(){
        return "hello, world";
    }

}
