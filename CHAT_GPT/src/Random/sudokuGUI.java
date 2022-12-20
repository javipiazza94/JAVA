package Random;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class sudokuGUI extends JFrame {
  
 private static final long serialVersionUID = 1L;
	
//La matriz del sudoku
	private ArrayList<ArrayList<Integer>> grid; //ARRAYLIST BIDIMENSIONAL

	// Constructor
	public sudokuGUI(ArrayList<ArrayList<Integer>> grid) {
		this.grid = grid;

    // Crea la ventana
    setTitle("Sudoku");
    setSize(400, 400);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    // Crea el panel principal y le agrega un layout GridLayout
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(9, 9));

    // Crea cada uno de los 81 botones y los agrega al panel principal
    for (int row = 0; row < 9; row++) {
      for (int col = 0; col < 9; col++) {
        JButton button = new JButton();
        // Si la celda del sudoku no está vacía, establece el valor en el botón
        if (grid.get(row).get(col) != 0) {
			button.setText(String.valueOf(grid.get(row).get(col)));
		}
        panel.add(button);
      }
    }

    // Agrega el panel principal a la ventana y la hace visible
    add(panel);
    setVisible(true);
  }

  public static void main(String[] args) {
    // Crea un sudoku aleatorio
    Sudoku sudoku = new Sudoku();
    sudoku.fillRandom();
    ArrayList<ArrayList<Integer>> grid = sudoku.getGrid();

	// Muestra el sudoku en pantalla
	new sudokuGUI(grid);
}
  
}

