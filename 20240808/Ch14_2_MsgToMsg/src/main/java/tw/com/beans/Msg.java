package tw.com.beans;

public class Msg {
	private String msg;
	private String fromUser;
	private String toUser;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getFromUser() {
		return fromUser;
	}
	public void setFromUser(String fromUser) {
		this.fromUser = fromUser;
	}
	public String getToUser() {
		return toUser;
	}
	public void setToUser(String toUser) {
		this.toUser = toUser;
	}
	@Override
	public String toString() {
		return "Msg [msg=" + msg + ", fromUser=" + fromUser + ", toUser=" + toUser + "]";
	}
	
}
