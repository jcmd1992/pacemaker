package controllers;

import java.util.ArrayList;
import java.util.List;

import utils.FileLogger;
import models.user;

public class Main
{
	public static void main(String[] args)
	  {
	    FileLogger logger = FileLogger.getLogger();
	    logger.log("Creating user list");

	    List<user> users = new ArrayList<user>();
	    users.add(new user("Bart", "Simpson", "bart@simpson.com", "secret"));
	    users.add(new user("Homer", "Simpson", "bart@simpson.com", "secret"));
	    users.add(new user("Lisa", "Simpson", "bart@simpson.com", "secret"));
	    System.out.println(users);

	    logger.log("Finished - shutting down");
	  }
}