package com.cisco.cmad.blogger.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cisco.cmad.blogger.model.Blogs;
import com.cisco.cmad.blogger.dao.HibernateUtil;

public class BlogDao {

	
	public void createBlog(Blogs blog){
		try{
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();
		session.save(blog);
		transaction.commit();
		}finally{
			HibernateUtil.closeSession();
		}
	}
	
	
	public List<Blogs> getAllBlogs(){
		try{
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();
		Query queryResult = session.createQuery("from Blogs");
		List<Blogs> blogList = new ArrayList<>();
		blogList = queryResult.list();
		return blogList;
		}finally{
			HibernateUtil.closeSession();
		}
	}

	
	
}
