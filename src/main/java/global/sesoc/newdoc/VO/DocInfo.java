package global.sesoc.newdoc.VO;

public class DocInfo {
	public String doc_uid;
	public String regdate;
	public String user_uid;
	public String doc_password;
	public String doc_title;
	public String doc_deleted;

	public DocInfo(String doc_uid, String regdate, String user_uid, String doc_password, String doc_title,
			String doc_deleted) {
		super();
		this.doc_uid = doc_uid;
		this.regdate = regdate;
		this.user_uid = user_uid;
		this.doc_password = doc_password;
		this.doc_title = doc_title;
		this.doc_deleted = doc_deleted;
	}

	public DocInfo() {
		super();
	}

	public String getDoc_uid() {
		return doc_uid;
	}

	public void setDoc_uid(String doc_uid) {
		this.doc_uid = doc_uid;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getUser_uid() {
		return user_uid;
	}

	public void setUser_uid(String user_uid) {
		this.user_uid = user_uid;
	}

	public String getDoc_password() {
		return doc_password;
	}

	public void setDoc_password(String doc_password) {
		this.doc_password = doc_password;
	}

	public String getDoc_title() {
		return doc_title;
	}

	public void setDoc_title(String doc_title) {
		this.doc_title = doc_title;
	}

	public String getDoc_deleted() {
		return doc_deleted;
	}

	public void setDoc_deleted(String doc_deleted) {
		this.doc_deleted = doc_deleted;
	}

	@Override
	public String toString() {
		return "DOC_INFO [doc_uid=" + doc_uid + ", regdate=" + regdate + ", user_uid=" + user_uid + ", doc_password="
				+ doc_password + ", doc_title=" + doc_title + ", doc_deleted=" + doc_deleted + "]";
	}

}
