package models;

public class user 
{
  public String firstName;
  public String lastName;
  public String email;
  public String password;

  public user()
  {
  }

  public user(String firstName, String lastName, String email, String password)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.password = password;
  }
}
