package tw.com.beans;

public class MyApple {
		private String name;
		private int price;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "MyApple [name=" + name + ", price=" + price + "]";
		}
		
}
