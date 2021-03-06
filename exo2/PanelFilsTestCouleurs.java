import javax.swing.* ;

import java.awt.*;


public class PanelFilsTestCouleurs  extends JPanel  {
	public  PanelFilsTestCouleurs  () {
		setLayout (new BorderLayout (5,5)) ;
		Color test = new Color(0,0,0);
		JLabel labelSud = new JLabel(test.toString()) ;
		JLabel labelCentre = new JLabel ("Zone Centre",JLabel.CENTER) ;
		PanelSaisieCouleur labelNord = new PanelSaisieCouleur(labelCentre,labelSud) ;
		
		labelCentre.setOpaque (true);
		labelNord.setOpaque (true);
		labelSud.setOpaque (true);
		labelCentre.setFont (new Font ("Verdana",Font.ITALIC,24));
		
		// sud
		JPanel panelSud = new JPanel();
		panelSud.add(labelSud);
		add (labelCentre, BorderLayout.CENTER);
		add (labelNord, BorderLayout.NORTH);
		add (labelSud, BorderLayout.SOUTH);
		setBackground (new Color (100,67,98));
		
	
	
	}
}
