package global.sesoc.newdoc.DAO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.newdoc.VO.Newdoc;

@Repository
public class NewdocDAO {

	@Autowired
	SqlSession session;
	
	public int createnewdoc(Newdoc newdoc) {
		System.out.println("dao1 :" + newdoc);

		int doc = 0;
		NewdocMapper mapper = session.getMapper(NewdocMapper.class);
		try {
			doc = mapper.createnewdoc(newdoc);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return doc;
	}

	public int test(String uid) {
		System.out.println("dao2 :" + uid);

		int doc = 0;
		NewdocMapper mapper = session.getMapper(NewdocMapper.class);
		try {
			doc = mapper.test(uid);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return doc;
	}

	/*
	 * public int getpassword (String userpw) {
	 * 
	 * NewdocMapper mapper = session.getMapper(NewdocMapper.class);
	 * 
	 * int password = mapper.getpassword(userpw);
	 * 
	 * return password; }
	 */

}
