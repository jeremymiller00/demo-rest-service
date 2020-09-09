package com.example.demorestservice;

public class ModelResponse {

  private final long id;
  private final double score;

  public ModelResponse(long id, double input) {
    Model model = new Model(id, input);
    this.id = id;
    this.score = model.getScore();
  }

  public long getId() {
    return id;
  }

  public double getScore() {
    return score;
  }
}
