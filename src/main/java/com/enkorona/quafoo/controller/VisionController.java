package com.enkorona.quafoo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author EnKorona
 * @version 1.0.0
 * @ClassName VisionController
 * @Description TODO
 * @date 2021/4/30
 */
@RestController
@RequestMapping(value = "/vision")
public class VisionController {
    @RequestMapping("/vision")
    public String index() {
        return "Hello Vision";
    }
}
