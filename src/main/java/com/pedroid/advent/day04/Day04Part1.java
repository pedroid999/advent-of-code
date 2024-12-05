package com.pedroid.advent.day04;

import com.pedroid.advent.utils.InputReader;

public class Day04Part1 {

	public static final char[] XMAS = new char[] { 'X', 'M', 'A', 'S' };

	char[][] input = InputReader.readInputToCharMatrix("src/main/resources/inputs/day04.txt");

	public static int[][] OFFSETS = new int[][] { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 1 }, { 1, -1 },
			{ 1, 0 }, { 1, 1 } };

	public static void main(String[] args) {
		Day04Part1 day04Part1 = new Day04Part1();
		System.out.println(day04Part1.solveInput());
	}

	private int solveInput() {
		int xmasCount = 0;
		for (int i = 0; i < this.input.length; i++) {
			for (int j = 0; j < this.input[i].length; j++) {
				xmasCount += this.starCmp(i, j);
			}
		}
		return xmasCount;
	}

	private int starCmp(int posF, int posC) {
		int starCount = 0;

		for (int[] offsef : OFFSETS) {
			if (this.starRayCmp(posF, posC, offsef[0], offsef[1], 0)) {
				starCount += 1;
			}
		}

		return starCount;
	}

	private boolean starRayCmp(int posF, int posC, int offsetF, int offsetC, int xmasPos) {
		if (posF < 0 || posC < 0 || posF >= this.input.length || posC >= this.input[0].length) {
			return false;
		}

		if (this.input[posF][posC] != XMAS[xmasPos]) {
			return false;
		} else {
			return xmasPos == XMAS.length - 1
					|| this.starRayCmp(posF + offsetF, posC + offsetC, offsetF, offsetC, xmasPos + 1);
		}
	}
}
