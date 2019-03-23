package global.sesoc.newdoc.DAO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.newdoc.VO.DocInfo;

@Repository
public class NewdocDAO {

	@Autowired
	SqlSession session;
	
	 public int createnewdoc(DocInfo docinfo) {

		int doc = 0;
		
		NewdocMapper mapper = session.getMapper(NewdocMapper.class);
		try {
			doc = mapper.createnewdoc(docinfo);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return doc;
		
	 }
	
	 public DocInfo selectuid(String password) {
	 
		 DocInfo docinfo = null;
			
		 NewdocMapper mapper = session.getMapper(NewdocMapper.class);
		 try {
			
			 docinfo = mapper.selectuid(password);
			
		 } catch (Exception e) {
			e.printStackTrace();
		 }
		
		 return docinfo;
	 
	 }
	 

}
