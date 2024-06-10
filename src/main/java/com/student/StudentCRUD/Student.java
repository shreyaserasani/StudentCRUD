package com.student.StudentCRUD;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Firstname;
    private String Lastname;
    private String Email;
    private String Gender;
    private String Password;
    
    public Student()
    {
    	
    }
    
    public Student(Integer id,String fname,String lname,String email,String gender,String pass)
    {
    	this.id = id;
    	this.Firstname = fname;
    	this.Lastname = lname;
    	this.Email = email;
    	this.Gender = gender;
    	this.Password = pass;
    }
    
    public Student(String email,String pass)
    {
    	this.Email = email;
    	this.Password = pass;
    }
    
    public int getStudentid()
    {
    	return id;
    }
    public String getFirstname()
    {
    	return Firstname;
    }
    public String getLastname()
    {
    	return Lastname;
    }
    public String getEmail()
    {
    	return Email;
    }
    public String getGender()
    {
    	return Gender;
    }
    public String getPassword()
    {
    	return Password;
    }
    
    public void setStudentid(int id)
    {
    	this.id = id;
    }
    
    public void setFirstname(String Firstname)
    {
    	this.Firstname = Firstname;
    }
    
    public void setLastname(String Lastname)
    {
    	this.Lastname = Lastname;
    }
    
    public void setEmail(String Email)
    {
    	this.Email = Email;
    }
    
    public void setGender(String Gender)
    {
    	this.Gender = Gender;
    }
    
    public void setPassword(String Password)
    {
    	this.Password = Password;
    }
}