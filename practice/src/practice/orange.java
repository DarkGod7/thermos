package practice;

public class orange {
	int volume;
	char brand;
	char liquid;
	
	public orange(int volume,char brand,char liquid) {
		this.volume=volume;
		this.brand=brand;
		this.liquid=liquid;
		
	}
	 void add(char a) {
		 liquid=a;
	 }
 void display() {
	 System.out.println("liquid"+liquid);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
