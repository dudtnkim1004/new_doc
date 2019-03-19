package global.sesoc.newdoc.VO;

public class Newdocinform {

	private String userid;
	private String userpw;

	public Newdocinform(String userid, String userpw) {
		super();
		this.userid = userid;
		this.userpw = userpw;
	}

	public Newdocinform() {
		super();
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpw() {
		return userpw;
	}

	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}

	@Override
	public String toString() {
		return "Newdocinform [userid=" + userid + ", userpw=" + userpw + "]";
	}

}
