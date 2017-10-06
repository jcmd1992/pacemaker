package controllers;

import java.util.ArrayList;
import java.util.List;

import models.user;

public class PacemakerAPI
{
  private List <user> users = new ArrayList<user>();

  public List<user> getUsers ()
  {
    return users;
  }

  public  void deleteUsers() 
  {
    users.clear();
  }

  public user createUser(String firstName, String lastName, String email, String password) 
  {
    user user = new user (firstName, lastName, email, password);
    users.add(user);
    return user;
  }

  public user getUser(String email) 
  {
    for (user user : users)
    {
      if (email.equals(user.email))
        return user;
    }
    return null;
  }

  public void deleteUser(String email) 
  {
    user foundUser = null;
    for (user user : users)
    {
      if (email.equals(user.email))
        foundUser = user;
    }
    if (foundUser != null)
    {
      users.remove(foundUser);
    }
  }
}