package src;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/** 
 * Class IhmClass 
 */
public class IhmClass extends JFrame implements ActionListener {

	/** 
	 *  Main method of the class
	 */
	public static void main(String[] args) {
		buildContentPane();
	}

	/** 
	 *  Build IHM template
	 */
	private static void buildContentPane() {
		JFrame cadre = new JFrame();
		cadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cadre.setSize(500, 400);

		JPanel contenuFenetre = (JPanel) cadre.getContentPane();
		contenuFenetre.setLayout(null);

		JLabel nombreA = new JLabel("Nombre A :");
		contenuFenetre.add(nombreA);
		Dimension sizeLabelA = nombreA.getPreferredSize();
		nombreA.setBounds(10, 10, sizeLabelA.width, sizeLabelA.height);

		JTextField entree1 = new JTextField(10);
		contenuFenetre.add(entree1);
		Dimension sizeInput1 = entree1.getPreferredSize();
		entree1.setBounds(90, 10, sizeInput1.width, sizeInput1.height);

		JLabel nombreB = new JLabel("Nombre B :");
		contenuFenetre.add(nombreB);
		Dimension sizeLabelB = nombreB.getPreferredSize();
		nombreB.setBounds(250, 10, sizeLabelB.width, sizeLabelB.height);

		JTextField entree2 = new JTextField(10);
		contenuFenetre.add(entree2);
		Dimension sizeInput2 = entree2.getPreferredSize();
		entree2.setBounds(340, 10, sizeInput2.width, sizeInput2.height);

		JLabel resultat = new JLabel("Resultat :");
		contenuFenetre.add(resultat);
		Dimension sizeLabelResult = resultat.getPreferredSize();
		resultat.setBounds(10, 110, sizeLabelResult.width, sizeLabelResult.height);
		
		JTextArea data = new JTextArea("");
		contenuFenetre.add(data);
		Dimension sizeLabelData = resultat.getPreferredSize();
		data.setBounds(10, 150, 460, 200);

		JButton calculez = new JButton("Calculez ");
		contenuFenetre.add(calculez);
		Dimension sizeLabelButton = calculez.getPreferredSize();
		calculez.setBounds(10, 60, 460, 30);
		calculez.addActionListener(new java.awt.event.ActionListener() {
			/** 
			 *  Method when we click on the button
			 */
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					ArrayList<Float> arrayList = NumberClass.ListOfSquareRoot(entree1.getText(), entree2.getText());
					String transformString = TransformArrayListToString(arrayList);
					data.setText(transformString);
				} catch (Exception e) {
					data.setText(e.getMessage());
				}
			}
		});
		
		cadre.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

	/** 
	 *  Transform the ArrayList<Float> in String
	 */
	private static String TransformArrayListToString(ArrayList<Float> list) {
		String listToString = "";

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) != list.get(0))
				listToString += " | ";
			
			if(i % 6 == 0)
				listToString += "\n";
				
			listToString += list.get(i).toString();
		}
		return listToString;
	}
}