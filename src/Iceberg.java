public class Iceberg {
	private int size;

	public void setSize(int size) {
		this.size = size;
	}
	
	public int getSize() {
		return this.size;
	}


	public void printShape() {

		
		for (int i = 1; i <= getSize(); i++) {
			for (int space = 0; space < i - 1; space++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= getSize() - i + 1; j++) {
				System.out.print("%");
			}
			
			System.out.println();
		}
	}
}