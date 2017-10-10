package controllers;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import models.user;

public class Main
{
  public static void main(String[] args) throws IOException
  {    
    PacemakerAPI pacemakerAPI = new PacemakerAPI();

    pacemakerAPI.createuser("Bart",  "Simpson", "bart@simpson.com",  "secret");
    pacemakerAPI.createuser("Homer", "Simpson", "homer@simpson.com", "secret");
    pacemakerAPI.createuser("Lisa",  "Simpson", "lisa@simpson.com",  "secret");

    Collection<user> users = pacemakerAPI.getusers();
    System.out.println(users);
  }
}