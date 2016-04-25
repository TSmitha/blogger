package com.cisco.cmad.blogger.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.xml.bind.annotation.XmlRootElement;

// @XmlRootElement
@Entity (name="BLOG_POST_DETAILS")
public class BlogPost {

	@Id
	@GeneratedValue
	private int postId;
	
	@Column(name="CREATION_DATE")
	private Date creationDate;
	
	@Column(name="BLOG_POST_TITLE")
	private String blogPostTitle;
	
	@Column(name="BLOG_POST_BODY")
	@Lob
	private String blogPostBody;
	
	public BlogPost() {
	}

	public BlogPost(int postId, String blogPostTitle, String blogPostBody) {
		this.postId = postId;
		this.creationDate = new Date();
		this.blogPostTitle = blogPostTitle;
		this.blogPostBody = blogPostBody;
	}
	
//	@ManyToOne
//	private BlogDetails user;
//		
//	public BlogDetails getUser() {
//		return user;
//	}
//	public void setUser(BlogDetails user) {
//		this.user = user;
//	}
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate() {
		this.creationDate = new Date();
	}
	public String getBlogPostTitle() {
		return blogPostTitle;
	}
	public void setBlogPostTitle(String blogPostTitle) {
		this.blogPostTitle = blogPostTitle;
	}
	public String getBlogPostBody() {
		return blogPostBody;
	}
	public void setBlogPostBody(String blogPostBody) {
		this.blogPostBody = blogPostBody;
	}
	
	
}


	
	

