package com.example.demorestservice;

import java.io.IOException;

import com.example.demorestservice.Model.ModelRequest;
import com.example.demorestservice.Model.ModelResponse;
import org.springframework.web.bind.annotation.*;

@RestController
public class ModelController {

  @PostMapping("/model")
  public ModelResponse postController(@RequestBody ModelRequest request) throws IOException {
    return new ModelResponse(request.getRequestID(), request.getFeatures());
  }
}
