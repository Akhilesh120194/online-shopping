package com.akhilexpress.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	//A query string is a string that is a part of url and starts after "?" where data is transferred through url in form of key value pair 
	
	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index()
	{
		
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Home Page");
		mv.addObject("userClickHome",true);
		return mv;
		
	}
	
	@RequestMapping(value={"/about"})
	public ModelAndView about()
	{
		
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","About Us");
		mv.addObject("userClickAbout",true);
		return mv;
		
	}
	
	@RequestMapping(value={"/listProducts"})
	public ModelAndView listProducts()
	{
		
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","All Products");
		mv.addObject("userClickListProducts",true);
		return mv;
		
	}
	
	@RequestMapping(value={"/contact"})
	public ModelAndView contacts()
	{
		
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Contact Us");
		mv.addObject("userClickContact",true);
		return mv;
		
	}
	
	//In order to keep url clean and make it more user friendly we need to access the value from the path 
	@RequestMapping(value="/test")
	public ModelAndView test(@RequestParam(value="greeting", required=false) String greeting1)
	{
		if(greeting1==null)
		{
			greeting1="hello There";
		}
		
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("greeting",greeting1);
		return mv;
		
	}
	
	@RequestMapping(value="/test/{greeting}")
	public ModelAndView test2(@PathVariable(value="greeting", required=false) String greeting1)
	{
		if(greeting1==null)
		{
			greeting1="hello There";
		}
		
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("greeting",greeting1);
		return mv;
		
	}
	
}
