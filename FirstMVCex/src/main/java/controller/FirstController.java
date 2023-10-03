package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

	@Autowired
	private StudentsDao studDao;
	
	@RequestMapping(value="edit",method = RequestMethod.GET)
	@ModelAttribute
	public String test(Model model){
		String msg = "Enter student id to edit";
		model.addAttribute("msg", msg);
		return "edit";
	}
	
	@RequestMapping(value="view",method = RequestMethod.GET)
	public String viewStud(Model model){
		model.addAttribute("studList", studDao.getStudents());
		return "viewStudents";
	}
	
	@RequestMapping(value="editStud",method = RequestMethod.POST)
	public String viewId(Model model,@RequestParam String id){
		int studId = Integer.parseInt(id);
		Students student = studDao.findById(studId);
		System.out.println(student.getName());
		model.addAttribute("student", student);
		model.addAttribute("newstudent", new Students());
		return "fillDetails";
	}
	
	@RequestMapping(value="save",method = RequestMethod.POST)
	public String saveChange(@ModelAttribute("newstudent") Students newstudent,Model model){
		studDao.updateStudent(newstudent);
		model.addAttribute("msg", "Successfully changed");
		return "success";
	}
	
}
