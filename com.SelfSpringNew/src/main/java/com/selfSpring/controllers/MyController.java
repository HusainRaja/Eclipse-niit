package com.selfSpring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.http.converter.json.JsonbHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.selfSpring.models.Student;
import com.selfSpring.services.StudentService;

@Controller
public class MyController {
	@Autowired
	StudentService service;
	
	@RequestMapping("Registration.fog")
	public ModelAndView showRegistration() {
		return new ModelAndView("Registration");
	}
	@RequestMapping("/")
	public ModelAndView showHome() {
		return new ModelAndView("index");
	}
	@RequestMapping("Login")
	public ModelAndView showLogin() {
		return new ModelAndView("Login");
	}
	@RequestMapping("addStudent")
	public ModelAndView NewStudent(){
		return new ModelAndView("Registration");
	}
	@RequestMapping("saveStudent")
	public String saveStudent(@RequestParam int id,@RequestParam String name,@RequestParam String mail,@RequestParam String add,@RequestParam String pwd) {
		Student st=new Student();
		st.setSid(id);
		st.setSname(name);
		st.setMailId(mail);
		st.setPwd(pwd);
		st.setAddress(add);
		service.registerStudent(st);
		return "redirect:addStudent";
	}
	@RequestMapping("addStudent2")
	public ModelAndView NewStudent1(Model model){
		model.addAttribute("st",new Student());
		return new ModelAndView("Registration1");
	}
	@RequestMapping(value="saveStudent2",method=RequestMethod.POST)
	public String saveStudent1(@ModelAttribute Student st) {
		service.registerStudent(st);
		return "redirect:addStudent2";
	}
	@RequestMapping(value="studentList")
	public @ResponseBody String showAll() {
		List<Student> lst=service.showAllStudents();
	    Gson gson=new Gson();
		return gson.toJson(lst);
	}
	@RequestMapping(value="ShowAll")
	public String showAllStudents() {
		return "ShowAllStudents";
	}
}
