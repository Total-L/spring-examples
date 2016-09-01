package com.javachen.example.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({ "prod" })
public class GenericService implements MessageService {

  @Value("${hello:Hello}")
  private String hello;

  @Value("${name:World}")
  private String name;

  @Override
  public String getMessage() {
    return this.hello + " from prod " + this.name;
  }

}