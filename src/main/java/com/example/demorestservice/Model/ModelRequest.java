package com.example.demorestservice.Model;

import java.util.Map;

public class ModelRequest {

  private String requestID;
  private Map<String, Double> features;

  public void setRequestID(String requestID) {
    this.requestID = requestID;
  }

  public String getRequestID() {
    return requestID;
  }

  public void setFeatures(Map<String, Double> features) {
    this.features = features;
  }

  public Map<String, Double> getFeatures() {
    return features;
  }

}
