package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {
     
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     
    @Column(nullable = false, unique = true, length = 45)
    private String uname;
     
    @Column(nullable = false, length = 64)
    private String uusername;
     
    @Column(nullable = false,  length = 45)
    private String upassword;
     
    @Column(nullable = false,unique=true, length = 64)
    private String uemail;
   
    @Column(nullable = false,  length = 45)
    private String uaddress;
    
    @Column(nullable = false,  length = 45)
    private String uzip;
    
   

public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUusername() {
		return uusername;
	}

	public void setUusername(String uusername) {
		this.uusername = uusername;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUaddress() {
		return uaddress;
	}

	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}

	public String getUzip() {
		return uzip;
	}

	public void setUzip(String uzip) {
		this.uzip = uzip;
	}

	
    // getters and setters are not shown   
}

