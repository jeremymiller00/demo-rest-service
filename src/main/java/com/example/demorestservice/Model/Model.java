package com.example.demorestservice.Model;

import com.example.demorestservice.utils.Constants;
import java.util.Map;

public class Model {

  private Map<String, Double> features;
  private double score;
  Constants constants = new Constants();

  public Model(Map<String, Double> features) {
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

  public Map<String, Double> getFeatures() {
    return features;
  }

  public double getScore() {
    return score;
  }
}
