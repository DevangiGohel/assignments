package SpringCurd.SpringCurd.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.aimdek.model.EmplModel;
import com.aimdek.persistent.EmpDAO;

@Controller
public class HomeController {
	
	@Autowired
	private EmpDAO empDAO;

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("insert","emplModel",new EmplModel());
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveEmplModel(@ModelAttribute EmplModel emplmodel) {
		System.out.println("insert...");
	    empDAO.insert(emplmodel);
	    return new ModelAndView("redirect:/");
	}
	
	
	@RequestMapping(value="/view")
	public ModelAndView listEmployee(ModelAndView model) throws IOException{
	    List<EmplModel> listEmployee = empDAO.list();
	    model.addObject("listEmployee", listEmployee);
	    model.setViewName("home");
	    return model;
	} 
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView delete(ModelAndView model, HttpServletRequest request) {
		System.out.println("/delete....");
	    int id = Integer.parseInt(request.getParameter("id"));
	    empDAO.delete(id);
	    return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView edit(HttpServletRequest request) {
	    int id = Integer.parseInt(request.getParameter("id"));
	    EmplModel empmodel = empDAO.get(id);
	    ModelAndView model = new ModelAndView("insert");
	    model.addObject("emplModel", empmodel);
	 
	    return model;
	}
	
}