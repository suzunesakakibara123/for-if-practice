import java.util.Scanner;

public class Size {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			int number;

			/* 1〜3が入力されるまで繰り返す*/
			while (true) {
				System.out.println("【課題①-③】：形を選択してください。");
				System.out.println("1: 山型");
				System.out.println("2: 氷山型");
				System.out.println("3: 反射型");
				System.out.print("入力欄: ");

				if (!sc.hasNextInt()) {
					System.out.println("無効な入力です。整数を入力してください。");
					sc.next(); /* 間違った入力を捨てる*/
					continue;
				}

				number = sc.nextInt();

				if (number >= 1 && number <= 3) {
					break;
				}

				System.out.println("無効な数字です。もう一度、1〜3の中から数字を入力してください。");
			}

			/* サイズ入力*/
			int size;

			while (true) {
				System.out.println("サイズを入力してください。:");

				if (!sc.hasNextInt()) {
					System.out.println("無効な入力です。整数を入力してください。");
					sc.next(); /* 間違った入力を捨てる*/
					continue;
				}

				size = sc.nextInt();

				if (size > 0) {
					break;
				}

				System.out.println("無効な数字です。正の整数を入力してください。");
			}

			if (number == 1) {
				System.out.println("山型が選択されました。");

				Mount mount = new Mount();
				mount.setSize(size);
				mount.printShape();

			} else if (number == 2) {
				System.out.println("氷山型が選択されました。");

				Iceberg iceberg = new Iceberg();
				iceberg.setSize(size);
				iceberg.printShape();

			} else if (number == 3) {
				System.out.println("反射型が選択されました。");

				Reflected reflected = new Reflected();
				reflected.setSize(size);
				reflected.printShape();
			}

			/* 課題④*/
			int count;

			while (true) {
				System.out.println("【課題④】：生成する数列の数を入力してください。 (1-30):");

				if (!sc.hasNextInt()) {
					System.out.println("無効な入力です。整数を入力してください。");
					sc.next(); /* 間違った入力を捨てる*/
					continue;
				}

				count = sc.nextInt();

				if (count >= 1 && count <= 30) {
					break;
				}

				System.out.println("無効な数字です。1から30の数字を入れてください。");
			}

			RandomNumber randomNumber = new RandomNumber(count);
			randomNumber.printNumber();
			randomNumber.orderDescending();

		} finally {
			sc.close();
		}
	}
}
