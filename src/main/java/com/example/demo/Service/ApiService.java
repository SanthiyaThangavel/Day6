package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


import com.example.demo.Models.Child;
import com.example.demo.Repository.ChildRepo;

@Service
public class ApiService {

	@Autowired
	ChildRepo repository;

	
	
	public List<Child> getchild(String field){
		return repository.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	

	public List<Child> setPages(@PathVariable int offset,@PathVariable int pageSize){
		Page<Child> page=repository.findAll(PageRequest.of(offset, pageSize));
		return page.getContent();
	}

	public List<Child> getSort(String field){
		return repository.findAll(Sort.by(Sort.Direction.DESC,field));

}
	public Page<Child> pageFields(int offset,int pagesize,String field){
		Pageable page1=PageRequest.of(offset,pagesize,Sort.by(Direction.ASC,field));
		return repository.findAll(page1);
	}
}