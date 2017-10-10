package controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.user;

public class PacemakerAPI
{
	 private Map<String, user> users = new HashMap<>();

	  public Collection<user> getusers ()
	  {
	    return users.values();
	  }
	  
  public  void deleteusers() 
  {
    users.clear();
  }

  public user createuser(String firstName, String lastName, String email, String password) 
  {
    user user = new user (firstName, lastName, email, password);
    users.put(email, user);
    return user;
  }

  public user getuser(String email) 
  {
    return users.get(email);
  }

  public void deleteuser(String email) 
  {
    users.remove(email);
  }
}