package com.smithsonianchannel.issue;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/hi")
  public Map<String, Object> hi () {
    return Collections.singletonMap("message", "hello world");
  }
  
}
