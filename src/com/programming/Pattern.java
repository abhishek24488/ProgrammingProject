package com.programming;

public class Pattern {

	public static void patternPyramid(int n) {
		int space = n;
		for (int i = 1; i <= n; i++) {

			for (int j = 0; j < space--; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= (2 * i - 1); j++) {

				System.out.print("*");
			}
			System.out.println("");
		}

	}

	public static void patternReversePyramid(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * n - (2 * i - 1)); j++) {

				System.out.print("*");
			}
			System.out.println("");
		}

	}

	public static void patternRightTriangleStar(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
	}

	public static void patternMirrorRightTriangleStar(int n) {
		int space = n - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = space; j >= 1; j--) {
				System.out.print(" ");
			}
			space--;
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void patternInvertedRightTriangleStar(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
	}

	public static void patternInvertedMirrorRightTriangleStar(int n) {
		int space = 0;
		for (int i = 0; i < n; i++) {
			for (int x = 0; x <= i; x++) {
				System.out.print(" ");
				space++;
			}
			for (int j = n - i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	public static void patternMirrorRhombus(int n) {

		for (int i = 0; i < n; i++) {
			for (int x = 0; x <= i; x++) {
				System.out.print(" ");
			}

			for (int j = n; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	public static void patternRhombusStar(int n) {
		int space = n - 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			space--;
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void hollowRhombusStar(int n) {
		int space = n - 1;
		int empty = n - 2;

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			space--;
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println("");
		}
	}

	public static void mirrorHollowRhombusStar(int n) {
		int space = 1;
		int empty = n - 2;

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			space++;
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println("");
		}
	}
	
	public static void halfDiamondStar(int n) {
		int column=1;
		
		for (int i = 1; i <= n*2; i++) {
			for (int j = 1; j <= column; j++) {
				System.out.print("*");
			}
			System.out.println("");
			if(i>=n)
				column--;
			else
				column++;
		}
	}
	
	public static void mirrorHalfDiamondStar(int n) {
		int column=1;
		int space=n-1;
		for (int i = 1; i <= n*2; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= column; j++) {
				System.out.print("*");
			}
			System.out.println("");
			if(i>=n) {
				column--;
				space++;
			}
			else {
				column++;
				space--;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pattern pattern = new Pattern();
		// patternRightTriangleStar(7);
		// patternPyramid(4);
		// patternReversePyramid(4);
		// patternMirrorRightTriangleStar(4);
		// patternInvertedRightTriangleStar(4);
		// patternInvertedMirrorRightTriangleStar(4);
		// patternMirrorRhombus(4);
		// patternRhombusStar(4);
		// hollowRhombusStar(4);
		//mirrorHollowRhombusStar(4);
		//halfDiamondStar(4);
		mirrorHalfDiamondStar(4);
	}

}
