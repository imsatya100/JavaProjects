package com.springboot.model;

import java.io.File;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "user48")
public class User {
	@Id
	@Column
	@Size(min = 3, max = 50)
	private String name;
	@Column
	@NotBlank
	@Email(message = "Please enter a valid e-mail address")
	private String email;
	@Column
	@NotBlank
	private String gender;
	@Column
	@NotBlank
	@Size(min = 8, max = 15)
	private String password;
	@Column
	private String profession;
	@Column
	@Size(max = 100)
	private String note;
	@Column
	@NotBlank
	private String birthday;
	@Column
	private boolean married;
	@Column
	private String fileName;

	
	  @Column private File image;
	  
	  public File getImage() { 
		
		  return  image; 
		  
	  }
	  
	  
	  
	  public void setImage(MultipartFile image){ 
		  
		  this.image = (File) image; 
		  
	  }
	  
	 
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public boolean isMarried() {
		return married;
	}

	void setMarried(boolean married) {
		this.married = married;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", gender=" + gender + ", password=" + password
				+ ", profession=" + profession + ", note=" + note + ", birthday=" + birthday + ", married=" + married
				+ "]";
	}

}
