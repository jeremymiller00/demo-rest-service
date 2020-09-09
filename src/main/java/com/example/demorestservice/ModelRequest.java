package com.example.demorestservice;

public class ModelRequest {

  private double input;

  public ModelRequest(double input) {
    this.setInput(input);
  }

  public void setInput(double input) {
    this.input = input;
  }

  public double getInput() {
    return input;
  }
}
