package com.example.review2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.review2.Library2;
import com.example.review2.LibraryRepository;

@Service
public class LibraryService
{
     @Autowired
     LibraryRepository repo;
     
     //sorting
     public Iterable<Library2> sortLibrfun (String field)
     {
    	 return repo.findAll(Sort.by(field));
     }
     
   //paging
 	public Page<Library2> pageLibrfun(int page,int size)
 	{
 		Pageable paging=PageRequest.of(page, size);
 		return repo.findAll(paging);
 	}
 	
 	//sorting and paging
 	public Page<Library2> pagesortLibrfun(int page,int size,String field)
 	{
 		Pageable paging=PageRequest.of(page, size).withSort(Sort.by(field));
 		return repo.findAll(paging);
 	}
 	
 	
 	public void postbylp(Library2 li)
 	{
 		repo.save(li);
 		
 	}
 	

}