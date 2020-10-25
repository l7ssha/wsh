package xyz.l7ssha.wsh.chatproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(path = "/api")
public class ApiController {
    @RequestMapping(path = {"/", ""}, method = RequestMethod.GET)
    public Map<String, Object> indexAction() {
        return Map.of("version", "v1");
    }
}
