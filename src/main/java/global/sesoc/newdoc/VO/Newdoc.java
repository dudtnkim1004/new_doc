package global.sesoc.newdoc.VO;

public class Newdoc {

	private String usernum;
	private String userid;
	private String notestyle;
	private String notefont;

	public Newdoc(String usernum, String userid, String notestyle, String notefont) {
		super();
		this.usernum = usernum;
		this.userid = userid;
		this.notestyle = notestyle;
		this.notefont = notefont;
	}

	public Newdoc() {
		super();
	}

	public String getUsernum() {
		return usernum;
	}

	public void setUsernum(String usernum) {
		this.usernum = usernum;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getNotestyle() {
		return notestyle;
	}

	public void setNotestyle(String notestyle) {
		this.notestyle = notestyle;
	}

	public String getNotefont() {
		return notefont;
	}

	public void setNotefont(String notefont) {
		this.notefont = notefont;
	}

	@Override
	public String toString() {
		return "Newdoc [usernum=" + usernum + ", userid=" + userid + ", notestyle=" + notestyle + ", notefont="
				+ notefont + "]";
	}

}