package controllers;

import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import utils.FileLogger;
import models.user;

public class Main
{
	 public static void main(String[] args) throws IOException
	  {
	    FileLogger logger = FileLogger.getLogger();
	    logger.log("Creating user list");

	    List<user> users = new ArrayList<user>();
	    users.add(new user("Bart", "Simpson", "bart@simpson.com", "secret"));
	    users.add(new user("Homer", "Simpson", "bart@simpson.com", "secret"));
	    users.add(new user("Lisa", "Simpson", "bart@simpson.com", "secret"));
	    System.out.println(users);

	    logger.log("Serializing contacts to XML");
	    XStream xstream = new XStream(new DomDriver());
	    ObjectOutputStream out = xstream.createObjectOutputStream(new FileWriter("users.xml"));
	    out.writeObject(users);
	    out.close();    

	    logger.log("Finished - shutting down");
	  }
}