public class Mount {
	private int size;

	public void setSize(int size) {
		this.size = size;
	}
	
	public int getSize() {
		return this.size;
	}

	public void printShape() {
		
		for (int i = 1; i <= getSize(); i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}