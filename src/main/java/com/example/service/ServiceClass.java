
  package com.example.service;
  
  
  
  import java.util.List; 
  import org.springframework.web.bind.annotation.*;
 import com.example.model.Student;
  
  
  
  @RestController 
  public class ServiceClass  
  {
  
  @PostMapping("/hello") 
  public String display() 
  { 
	  
	  return "Hello Welcome";
  
  }
  
  @GetMapping("/hello/{name}") 
  public String displayName(@PathVariable String name) 
  {
			  
			  return "Hello Welcome   "+name;
			  
   }
  
  
  @GetMapping("/hellos") 
  public String displayNameandId(@RequestParam String name, @RequestParam int id) 
  {
			 
  return "Hello Welcome   "+name+" And Id is:-"+id;
			  
   }
  
  
  @GetMapping("/StudentMarks") 
  public String StudentMarks(@RequestParam  List<Integer> marks) {
			  
			  return "Student Marks Are "+marks;
			  
			  }
			  
			  
			  
  		@GetMapping("/StudentData") 
  		public String StudentData(@RequestParam String  name,@RequestParam(required = false,defaultValue = "NA") String address)
  		{
			  return "Hello name is   "+name+"   Address IS   "+address;
			  
		 }

  		@PostMapping("/JsonStudent") 
  		public String displayStudent(@RequestBody  Student stu) 
  		{ 
  			return "Student Details are Id:- "+stu.getSid()+" name:-"+stu.getSname();
	  
	    }
	 
  
  
  }
 