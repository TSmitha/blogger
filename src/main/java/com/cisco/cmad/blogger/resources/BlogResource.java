package com.cisco.cmad.blogger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.cisco.cmad.blogger.model.BlogPost;
import com.cisco.cmad.blogger.model.Blogs;

import com.cisco.cmad.blogger.services.BlogService;

@Path("/blogs")
public class BlogResource {
	
	BlogService blogService = new BlogService();

//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<Blogs> getBlogs(@QueryParam(value = "year") int year){
//		if(year <= 0){
//		return blogService.getAllBlogs();
//		}else{
//			
//		}
//		return null;
//	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Blogs> getBlogs(){
		return blogService.getAllBlogs();

	}
	
	
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	@Path("/{blogId}")
//	public Blogs getBlog(@PathParam("blogId") int blogId){
//		System.out.println("BlogResource.getBlog() for blogid ="+blogId);
//		return blogService.getBlog(blogId);
//	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Blogs addBlog(Blogs blog){
		return blogService.createBlog(blog);
	}

	
//	@PUT
//	@Path("/{blogId}")
//	@Produces(MediaType.APPLICATION_JSON)
//	@Consumes(MediaType.APPLICATION_JSON)
//	public Blogs updateBlog(@PathParam("blogId") int blogId, Blogs blog){
//		blog.setBlogId(blogId);
//		return blogService.updateBlog(blogId, blog);
//		
//	}
	
//	
//	
//	@DELETE
//	@Path("/{blogId}")
//	@Produces(MediaType.APPLICATION_JSON)
//	@Consumes(MediaType.APPLICATION_JSON)
//	public void deleteBlog(@PathParam("blogId") int blogId){
//		blogService.deleteBlog(blogId);
//		
//	}
	
//	public String getBlogs(){
//		return "Hello World";
//	}
	
	
//	@Path("/blogId/posts")
//	public PostResource getPostResource(){
//		return new PostResource();
//	}

	
}
