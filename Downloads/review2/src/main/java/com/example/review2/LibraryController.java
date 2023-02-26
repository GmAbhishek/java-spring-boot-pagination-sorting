package com.example.review2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController 
{
    @Autowired
    LibraryService ser;
   
    @Autowired
    LibraryRepository repo;
   
     //sorting
     @GetMapping("/getlib/{field}")
     public Iterable<Library2> sortfun(@PathVariable String field)
     {
	    return ser.sortLibrfun(field);
     }
     
     @GetMapping("/get")
     public List<Library2> getDetails()
     {
    	 System.out.println("Retrived all the data");
    	 return repo.findAll();
     }
     
     @PostMapping("/post")
 	public String postDetails(@RequestBody Library2 lib)
 	{
 		repo.save(lib);
 		return "Book Details Successfully Saved In The DataBase";
 	}
   
     @PostMapping("/postl")
	 public String postfun(@RequestBody Library2 ob )
	 {
		 repo.save(ob);
		 return " Details Saved successfully!";
	 }
	 @PutMapping(value="/putlib/{id}")
	 public Library2 putfun(@RequestBody Library2 ob)
	 {
		 return repo.save(ob);
	 }
	 @DeleteMapping(value="/delib/{id}")
	 public String delfun(@PathVariable int id)
	 {
		 repo.deleteById(id);
		 return "The given Id is Deleted";
	 } 
	
	 //paging
	 @GetMapping("/getlib/{pageNo}/{pageSize}")
	 public Page<Library2> pagefun(@PathVariable int pageNo,@PathVariable int pageSize)
	 {
		 return ser.pageLibrfun(pageNo,pageSize);
	 }
		
	//paging & sorting
	@GetMapping(value="/getlib/{pageNo}/{pageSize}/{field}")
	public Page<Library2> pagesortfun(@PathVariable int pageNo,@PathVariable int pageSize,@PathVariable String field)
	{
		return ser.pagesortLibrfun(pageNo,pageSize,field);
	}
	
	@PostMapping("/postlib")
	public String postbylp(@RequestBody Library2 library)
	{
		ser.postbylp(library);
		return "Your data is saved..";
	}
	
}