package com.example.demorestservice;

public class Model {

  private final long id;
  private final double input;
  private final double score;

  public Model(long id, double input) {
    this.id = id;
    this.input = input;
    this.score = this.input * this.input;
  }

  public long getId() {
    return id;
  }

  public double getInput() {
    return input;
  }

  public double getScore() {
    return score;
  }
}
