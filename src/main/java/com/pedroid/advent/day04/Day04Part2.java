package com.pedroid.advent.day04;

import com.pedroid.advent.utils.InputReader;

import java.util.Arrays;

public class Day04Part2 {

	public static final char[] XMAS = new char[] {'M', 'A', 'S' };

	public static final String X_MAS = "MMSS";
	public static final String X_MAS_ALTER = "MSMS";

	char[][] input = InputReader.readInputToCharMatrix("src/main/resources/inputs/day04.txt");

	public static int[][] OFFSETS = new int[][] { { -1, -1 }, { -1, 1 }, { 1, -1 }, { 1, 1 } };

	public static void main(String[] args) {
		Day04Part2 day04Part2 = new Day04Part2();
		System.out.println(day04Part2.solveInput());
	}

	private int solveInput() {
		int xmasCount = 0;
		for (int i = 0; i < this.input.length; i++) {
			for (int j = 0; j < this.input[i].length; j++) {
				if (this.input[i][j] == 'A') {
					xmasCount += this.xCmp(i, j) ? 1 : 0;
				}

			}
		}
		return xmasCount;
	}

	private boolean xCmp(int posF, int posC) {
		char[] xCheckArray = new char[OFFSETS.length];

		for(int i = 0; i < OFFSETS.length; i++) {
			int offsetF = posF + OFFSETS[i][0];
			int offsetC = posC + OFFSETS[i][1];
			if (offsetF < 0 || offsetC < 0 || offsetF >= this.input.length || offsetC >= this.input[0].length) {
				return false;
			}
			xCheckArray[i] = this.input[offsetF][offsetC];
		}

		char[] xMasArray = X_MAS.toCharArray();
		char[] reversedXMasArray = new StringBuilder(X_MAS).reverse().toString().toCharArray();
		char[] xMasAlterArray = X_MAS_ALTER.toCharArray();
		char[] reversedXMasAlterArray = new StringBuilder(X_MAS_ALTER).reverse().toString().toCharArray();

		return Arrays.equals(xCheckArray, xMasArray) || Arrays.equals(xCheckArray, reversedXMasArray)
				|| Arrays.equals(xCheckArray, xMasAlterArray) || Arrays.equals(xCheckArray, reversedXMasAlterArray);
	}
}
