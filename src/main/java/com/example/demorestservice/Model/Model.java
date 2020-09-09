package com.example.demorestservice.Model;

import com.example.demorestservice.utils.Constants;

import java.util.Map;

public class Model {

  private final String id;
  private Map<String, Double> features;
  private double score;
  Constants constants = new Constants();

  public Model(String id, Map<String, Double> features) {
    this.id = id;
    this.features = features;
  }

  /*
  Alias for "predict". Model functionality goes here.
   */
  public void setScore() {
    this.score = this.features.get("featureA") * constants.coefficients.get("featureA") +
                  this.features.get("featureB") * constants.coefficients.get("featureB") +
                  this.features.get("featureC") * constants.coefficients.get("featureC") +
                  constants.coefficients.get("intercept");
  }

  public String getId() {
    return id;
  }

  public Map<String, Double> getFeatures() {
    return features;
  }

  public double getScore() {
    return score;
  }
}
