package com.example.demorestservice.Model;

import com.example.demorestservice.ModelController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class ModelResponse {

  private final String requestID;
  private final double score;
  private static final Logger logger = LoggerFactory.getLogger(ModelResponse.class);

  public ModelResponse(String requestID, Map<String, Double> features) {
    Model model = new Model(features);
    model.setScore();
    this.requestID = requestID;
    this.score = model.getScore();
    logger.info("Request ID: {}; Features: {}; Score: {}", requestID, model.getFeatures(), score);
  }

  public String getRequestID() {
    return requestID;
  }

  public double getScore() {
    return score;
  }
}
