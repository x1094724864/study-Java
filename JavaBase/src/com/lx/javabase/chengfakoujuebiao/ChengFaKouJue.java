
package com.lx.javabase.chengfakoujuebiao;

public class ChengFaKouJue {

	private void math() {

		for (int i = 1; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				if (j <= i) {
					System.out.print(j + "*" + i + "=" + (j * i) + " \t");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}

	}

}
