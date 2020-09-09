package com.example.demorestservice;

public class ModelResponse {

  private final String requestID;
  private final double score;

  public ModelResponse(String requestID, double inputA, double inputB, double inputC) {
    Model model = new Model(requestID, inputA, inputB, inputC);
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
