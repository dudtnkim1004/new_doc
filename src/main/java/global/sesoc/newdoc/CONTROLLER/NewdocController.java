package global.sesoc.newdoc.CONTROLLER;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import global.sesoc.newdoc.DAO.NewdocDAO;
import global.sesoc.newdoc.VO.DocInfo;

@Controller
public class NewdocController {

	@Autowired
	NewdocDAO dao;

	@RequestMapping(value = "/creatnewdoc", method = RequestMethod.POST)
	@ResponseBody //발생한 난수를 DB단에 저장 
	public String createnewdoc(HttpSession session, String uid, HttpServletRequest request) {

		DocInfo docinfo = new DocInfo();
	
		docinfo.setDoc_uid(uid);
		
		int result = dao.createnewdoc(docinfo);
		
		if (result != 0) {
		
			session.setAttribute("docInfo", docinfo.getDoc_uid());
			
			return "new_doc";
		} else {
		
			return "home";
		}
	}
	
	@RequestMapping(value = "/new_doc", method = RequestMethod.GET)
	public String newdoc(String randomValue) {
		//randomValue 를 찾아서 고유한 정보를 검색 후 화면으로 이동
	return "new_doc";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		
		session.invalidate();
	
	return "redirect:/new_doc";
	}
	
	@RequestMapping(value = "/selectuid", method = RequestMethod.POST)
	@ResponseBody
	public String selectuid(String password , HttpSession session) {
		
		DocInfo docinfo = new DocInfo();

		docinfo = dao.selectuid(password);
		
		String getpassword = (String) session.getAttribute(docinfo.getDoc_uid());
		
		System.out.println(session.getAttribute(getpassword));
		
		return "confirm";
		
	}
}
