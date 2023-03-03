package com.example.demo.Controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Child;
import com.example.demo.Repository.ChildRepo;
import com.example.demo.Service.ApiService;


@RestController
public class ApiController {
	 @Autowired
	  ChildRepo serviceRepository;
	@Autowired
	   ApiService service;
	 
	 @GetMapping("/getvalues")
	   List<Child> getList(){
		 return serviceRepository.findAll();
	 }
	 @PostMapping("/post")
	  public Child create(@RequestBody Child ch) {
		 return serviceRepository.save(ch);
	 }
	 
	 @GetMapping("/{field}")
	 public List<Child> getbyid(@PathVariable String field){
		
		return service.getchild(field);
	 }
	  @GetMapping("/child/{offset}/{PageSize}")
	 public List<Child> studentWithPagination(@PathVariable int offset,@PathVariable int PageSize){
		return service.setPages(offset, PageSize); 
	 }
	 
	 @GetMapping("/child/{field}")
	 public List<Child> childSortList(@PathVariable String field){
		 return service.getSort(field);
	 }
	 @GetMapping("/{offset}/{pagesize}/{field}")
     public Page<Child> pageField(@PathVariable int offset, @PathVariable int pagesize, @PathVariable String field){
         return service.pageFields(offset,pagesize,field);
     }

	   
}