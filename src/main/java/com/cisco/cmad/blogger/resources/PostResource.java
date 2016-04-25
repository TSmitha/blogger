//package com.cisco.cmad.blogger.resources;
//
//import java.util.List;
//
//import javax.ws.rs.Consumes;
//import javax.ws.rs.GET;
//import javax.ws.rs.POST;
//import javax.ws.rs.PUT;
//import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;
//
//import com.cisco.cmad.blogger.model.BlogPost;
//import com.cisco.cmad.blogger.model.Blogs;
//import com.cisco.cmad.blogger.services.BlogService;
//
//@Path("/")
//public class PostResource {
//
//	
//	BlogService blogService = new BlogService();
//
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<BlogPost> getPosts(){
//		return blogService.getAllPosts();
//	}
//	
//	
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	@Path("/{postId}")
//	public BlogPost getPost(@PathParam("postId") int postId){
//		System.out.println("BlogResource.getPost() for postid ="+postId);
//		return blogService.getPost(postId);
//	}
//	
//	@POST
//	@Produces(MediaType.APPLICATION_JSON)
//	@Consumes(MediaType.APPLICATION_JSON)
//	public BlogPost addPost(BlogPost blogpost, int blogId){
//		return blogService.addPost(blogpost, blogId);
//	}
//	
//	@PUT
//	@Path("/{blogId}"+"/{postId}")
//	@Produces(MediaType.APPLICATION_JSON)
//	@Consumes(MediaType.APPLICATION_JSON)
//	public BlogPost updatePost(@PathParam("blogId") int blogId, @PathParam("postId") int postId, BlogPost blogPost){
//		blogPost.setPostId(postId);
//		return blogService.updateBlogPost(blogId, postId, blogPost);
//		
//	}
//	
//	@GET
//	public String test(){
//		return "new sub resource";
//	}
//	
//	
//}
