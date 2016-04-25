package com.cisco.cmad.blogger.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cisco.cmad.blogger.model.Blogs;
import com.cisco.cmad.blogger.dao.BlogDao;
import com.cisco.cmad.blogger.model.BlogPost;


public class BlogService {

	BlogDao blogDao = new BlogDao();
	
	public BlogService(){
		
	}	
	
	public Blogs createBlog(Blogs blog){
		Blogs newBlog = new Blogs(blog.getBlogName(),blog.getAuthor());
		blogDao.createBlog(newBlog);
		return newBlog;
	}
	
	
	public List<Blogs> getAllBlogs(){
		return blogDao.getAllBlogs();
	}


	
		
	//public List<Blogs> getAllBlogs(String Author){
//	public List<Blogs> getAllBlogs(){
//		Blogs blog1 = new Blogs(1, "Hello World", "Smitha");
//		Blogs blog2 = new Blogs(2, "Hello World again", "Samitha");
//		
//		List<Blogs> blogList = new ArrayList<>();
//		blogList.add(blog1);
//		blogList.add(blog2);
//		return blogList;
//	}
	
	
//	public Blogs getBlog(int blogId){
//		Blogs blog1 = new Blogs(1, "Hello World", "Smitha");
//		Blogs blog2 = new Blogs(2, "Hello World again", "Samitha");
//		List<Blogs> blogList = new ArrayList<>();
//		blogList.add(blog1);
//		blogList.add(blog2);
//		return blogList.get(blogId);
//		
//	}
	

//
//	public Blogs addBlog(Blogs blog) {
//		return blog;
//	}
//	
//	public Blogs updateBlog(int blogId, Blogs blog){
//		return blog;
//	}
//	
//	public void deleteBlog(int blogId){
//		
//	}
////	
//////	public List<BlogPost> getAllPosts(int blogId){
//	public List<BlogPost> getAllPosts(){
//		Blogs blog = new Blogs(1,"Hello World", "Smitha");
//		
//		BlogPost post1 = new BlogPost(1, "Hello World post1", "This is Hello world blogs 1st post");
//		BlogPost post2 = new BlogPost(2, "Hello World post2", "This is Hello world blogs 2nd post");
//		
//		List<BlogPost> blogPostList = new ArrayList<BlogPost>();
//		blogPostList.add(post1);
//		blogPostList.add(post2);
//		return blogPostList;
//	}
//	
//	
//	public BlogPost getPost(int postId){
//		BlogPost post1 = new BlogPost(1, "Hello World post1", "This is Hello world blogs 1st post");
//		BlogPost post2 = new BlogPost(2, "Hello World post2", "This is Hello world blogs 2nd post");
//		
//		List<BlogPost> blogPostList = new ArrayList<BlogPost>();
//		blogPostList.add(post1);
//		blogPostList.add(post2);
//		
//		return blogPostList.get(postId);
//	}
//
//	
//	
//	public BlogPost addPost(BlogPost blogPost, int blogId){
//		return blogPost;
//	}
//	
//	
//	
//	
//	public void updatePost(BlogPost blogPost){
//		
//	}
//
//	public BlogPost updateBlogPost(int blogId, int postId, BlogPost blogPost) {
//		return blogPost;
//	}
//
//	public List<Blogs> getAllBlogsForYear(int year) {
//		List<Blogs> BlogsForYear = new ArrayList<Blogs>();
//		return BlogsForYear;
//	}
//
//	
//	public List<BlogPost> getAllPostsForYear(int year) {
//		List<BlogPost> BlogPostsForYear = new ArrayList<BlogPost>();
//		return BlogPostsForYear;
//	}
//


}

