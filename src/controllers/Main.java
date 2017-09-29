package controllers;

import java.util.ArrayList;
import java.util.List;

import models.user;

public class Main
{
  public static void main(String[] args)
  {
    List<user> users = new ArrayList<user>();
    users.add(new user("Bart", "Simpson", "bart@simpson.com", "secret"));
    users.add(new user("Homer", "Simpson", "bart@simpson.com", "secret"));
    users.add(new user("Lisa", "Simpson", "bart@simpson.com", "secret"));
    System.out.println(users);
  }
}