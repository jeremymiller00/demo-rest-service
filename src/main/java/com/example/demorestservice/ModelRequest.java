package com.example.demorestservice;

public class ModelRequest {

  private String requestID;
  private double inputA;
  private double inputB;
  private double inputC;

  public void setRequestID(String requestID) {
    this.requestID = requestID;
  }

  public String getRequestID() {
    return requestID;
  }

  public void setInputA(double input) {
    this.inputA = input;
  }
  public double getInputA() {
    return inputA;
  }
  public void setInputB(double input) {
    this.inputB = input;
  }
  public double getInputB() {
    return inputB;
  }
  public void setInputC(double input) {
    this.inputC = input;
  }
  public double getInputC() {
    return inputC;
  }
}
