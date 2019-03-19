package global.sesoc.newdoc.CONTROLLER;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import global.sesoc.newdoc.DAO.NewdocDAO;
import global.sesoc.newdoc.VO.Newdoc;

@Controller
public class NewdocController {

	@Autowired
	NewdocDAO dao;

	@RequestMapping(value = "/creatnewdoc", method = RequestMethod.POST)
	@ResponseBody
	public String createnewdoc(HttpSession session, String uid, HttpServletRequest request) {

		Newdoc newdoc = new Newdoc();
		System.out.println("controller uid :" + uid);
		newdoc.setUsernum(uid);
		System.out.println("controller :" + newdoc);

		int result = dao.createnewdoc(newdoc);
		if (result != 0) {
			session.setAttribute("uid", uid);
			return "new_doc";
		} else {
			return "home";
		}
	}

	/*
	 * @RequestMapping(value = "/getpassword", method = RequestMethod.POST) public
	 * String getpassword(HttpSession session , @RequestParam String userpw ,
	 * HttpServletRequest request) {
	 * 
	 * int result = 0;
	 * 
	 * String password = request.getParameter(userpw);
	 * 
	 * result = dao.getpassword(userpw);
	 * 
	 * if (result == 1) {
	 * 
	 * session.setAttribute("password", password);
	 * 
	 * return "new_doc";
	 * 
	 * } else {
	 * 
	 * return "home";
	 * 
	 * } }
	 */
}
