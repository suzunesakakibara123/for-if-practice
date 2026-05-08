public class Reflected {
	private int size;

	public void setSize(int size) {
		this.size = size;
	}
	
	public int getSize() {
		return this.size;
	}

	public void printShape() {
		
		for (int i = 0; i < getSize(); i++) {
			for (int space = 0; space < i; space++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (getSize() - i)* 2  - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	
	}
}