package com.example.demorestservice;

import com.example.demorestservice.utils.Constants;

public class Model {

  private final String id;
  private final double inputA;
  private final double inputB;
  private final double inputC;
  private double score;
  Constants constants = new Constants();

  public Model(String id, double inputA, double inputB, double inputC) {
    this.id = id;
    this.inputA = inputA;
    this.inputB = inputB;
    this.inputC = inputC;
  }

  /*
  Alias for "predict". Model functionality goes here.
   */
  public void setScore() {
    this.score = this.inputA * constants.coefficients.get("featureA") +
                  this.inputB * constants.coefficients.get("featureB") +
                  this.inputC * constants.coefficients.get("featureC") +
                  constants.coefficients.get("intercept");
  }

  public String getId() {
    return id;
  }

//  public double getInput() {
//    return input;
//  }

  public double getScore() {
    return score;
  }
}
