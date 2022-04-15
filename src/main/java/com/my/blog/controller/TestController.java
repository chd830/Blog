package com.my.blog.controller;

import com.my.blog.data.EventDoc;
import com.my.blog.service.EventService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/test/api")
public class TestController {

    @Autowired
    private EventService service;

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


    @GetMapping("/getevent")
    public void getEvent(@RequestParam String id) {
        try {
            System.out.println(service.getEvent(id));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @GetMapping("/geteventlist")
    public void getEventList(@RequestParam String title) {
        List<EventDoc> list = service.getEventList(title);
        for(EventDoc d : list)
            System.out.println(d);
    }

    @PostMapping("/insert")
    public void insertEvent(@RequestBody EventDoc doc) {
        service.insertEvent(doc);
    }
}
