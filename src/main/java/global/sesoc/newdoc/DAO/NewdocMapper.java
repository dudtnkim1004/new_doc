package global.sesoc.newdoc.DAO;

import global.sesoc.newdoc.VO.DocInfo;

public interface NewdocMapper {

	public int createnewdoc(DocInfo docinfo); //난수가 된 uid를 db에 저장
	public DocInfo selectuid(String password); //저장한 uid를 찾아서 객체 불러오기

}
