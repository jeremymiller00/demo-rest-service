package com.example.demorestservice.Model;

import java.util.Map;

public class ModelResponse {

  private final String requestID;
  private final double score;

  public ModelResponse(String requestID, Map<String, Double> features) {
    Model model = new Model(requestID, features);
    model.setScore();
    this.requestID = requestID;
    this.score = model.getScore();
  }

  public String getRequestID() {
    return requestID;
  }

  public double getScore() {
    return score;
  }
}
