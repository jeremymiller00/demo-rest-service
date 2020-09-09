package com.example.demorestservice;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.*;

@RestController
public class ModelController {

//  private final AtomicLong counter = new AtomicLong();

  @PostMapping("/model")
  public ModelResponse postController(@RequestBody ModelRequest request) {
    return new ModelResponse(request.getRequestID(), request.getInputA(), request.getInputB(), request.getInputC());
  }
}
