package Random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Sudoku {
	// La matriz del sudoku
	private ArrayList<ArrayList<Integer>> grid;

	// Constructor
	public Sudoku() {
		// Inicializa la matriz con todas las celdas vacías (valor 0)
		grid = new ArrayList<>();
		for (int i = 0; i < 9; i++) {
			grid.add(new ArrayList<>(Collections.nCopies(9, 0)));
		}
	}

	public ArrayList<ArrayList<Integer>> getGrid() {
		return grid;
	}

//Verifica si un número es válido en una celda determinada
	public boolean isValid(int row, int col, int num) {
// Verifica si el número ya está en la fila
		for (int i = 0; i < 9; i++) {
			if (grid.get(row).get(i) == num) {
				return false;
			}
		}

// Verifica si el número ya está en la columna
		for (int i = 0; i < 9; i++) {
			if (grid.get(i).get(col) == num) {
				return false;
			}
		}

// Verifica si el número ya está en el cuadrante 3x3
		int startRow = row - row % 3;
		int startCol = col - col % 3;
		for (int i = startRow; i < startRow + 3; i++) {
			for (int j = startCol; j < startCol + 3; j++) {
				if (grid.get(i).get(j) == num) {
					return false;
				}
			}
		}
// Si llegó hasta aquí, es porque el número es válido
		return true;
	}

//Intenta rellenar el sudoku de manera aleatoria
	public boolean fillRandom() {
		Random random = new Random();

		// Recorre cada celda del sudoku
		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {

				// Si la celda está vacía, elige un número aleatorio y verifica si es válido
				if (grid.get(row).get(col) == 0) {
					int num = random.nextInt(9) + 1; // Elige un número entre 1 y 9
					if (isValid(row, col, num)) {
						grid.get(row).set(col, num); // Utiliza set() en lugar de get() para asignar el valor
					} else {
						// Si no es válido, deja la celda vacía y vuelve a intentar
						grid.get(row).set(col, 0); // Utiliza set() en lugar de get() para asignar el valor
						col--; // Decrementa col en lugar de row para volver a intentar
					}
				}
			}
		}

		// Si llegó hasta aquí, es porque el sudoku se completó exitosamente
		return true;
	}
		
	}

