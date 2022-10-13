package clase15;

import javax.swing.JOptionPane;

class Clase15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JOptionPane.showMessageDialog(null, "Aca empieza el programa");
		
		Autor cortazar = new Autor("Julio", "Cortazar", "1914", "masclino", "julitocortazar@hotmail.com" );
		JOptionPane.showMessageDialog(null, cortazar);
		
		//cortazar.setNombre("Vicky");
		
		Editorial penguin = new Editorial("Penguin", "maipu 464", "caba", "penguinlibros@hotmail.com",1582252441,28231584 );
		JOptionPane.showMessageDialog(null, penguin);
		
		Libro rayuela = new Libro("Rayuela","1963", 10, 100, penguin, cortazar);
		JOptionPane.showMessageDialog(null, rayuela);
		
	}

}
