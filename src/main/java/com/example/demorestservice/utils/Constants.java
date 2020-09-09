package com.example.demorestservice.utils;

import java.util.HashMap;
import java.util.Map;

public class Constants {

  public Map<String, Double> coefficients;

  public Constants() {
    Map<String, Double> coefficients = new HashMap<>();
    coefficients.put("intercept", -0.5);
    coefficients.put("featureA", 1.1);
    coefficients.put("featureB", 2.2);
    coefficients.put("featureC", 3.3);
    this.coefficients = coefficients;
  }

  public Map<String, Double> getCoefficients() {
    return this.coefficients;
  }
}
