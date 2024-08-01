package tw.com.beans;

public class Mask {
	private String id;
	private String name;
	private String maskAdult;
	private String maskChild;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMaskAdult() {
		return maskAdult;
	}
	public void setMaskAdult(String maskAdult) {
		this.maskAdult = maskAdult;
	}
	public String getMaskChild() {
		return maskChild;
	}
	public void setMaskChild(String maskChild) {
		this.maskChild = maskChild;
	}
	@Override
	public String toString() {
		return "Mask [id=" + id + ", name=" + name + ", maskAdult=" + maskAdult + ", maskChild=" + maskChild + "]";
	}
	
}
