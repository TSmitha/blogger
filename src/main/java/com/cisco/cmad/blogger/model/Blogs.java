package com.cisco.cmad.blogger.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.ws.rs.Path;
import javax.xml.bind.annotation.XmlRootElement;

// @XmlRootElement
@Entity (name="BLOG_DETAILS")
public class Blogs {

	
	@Id
	@Column(name="BLOG_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int blogId;
	
	@Column(name="BLOG_NAME")
	private String blogName;
	
	@Column(name="AUTHOR")
	private String author;
	
	@Column(name="CREATION_DATE")
	private Date creationDate;


	public Blogs() {
	}

	public Blogs(String blogName, String author) {
		this.blogName = blogName;
		this.author = author;
		this.creationDate = new Date();
	}
	
	public int getBlogId() {
		return blogId;
	}

	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}

	public String getBlogName() {
		return blogName;
	}

	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate() {
		this.creationDate = new Date();
	}
	
}
