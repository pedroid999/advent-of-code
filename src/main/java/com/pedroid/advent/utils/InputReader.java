package com.pedroid.advent.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class InputReader {
	public static char[][] readInputToCharMatrix(String path) {
		try {
			List<String> lines = Files.readAllLines(Paths.get(path));
			char[][] matrix = new char[lines.size()][lines.get(0).length()];
			for (int i = 0; i < lines.size(); i++) {
				matrix[i] = lines.get(i).toCharArray();
			}
			return matrix;
		} catch (IOException e) {
			throw new RuntimeException("Error al leer el archivo: " + path, e);
		}
	}
}
