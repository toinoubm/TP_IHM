import javax.swing.* ;

import java.awt.*;


public class PanelFilsTreizeLabels  extends JPanel  {
	public  PanelFilsTreizeLabels  () {
		setLayout (new BorderLayout (10,10)) ;
		JLabel labelCentre = new JLabel ("Zone Centre",JLabel.CENTER) ;
		JLabel labelNord = new JLabel ("Zone Nord",JLabel.CENTER) ;
		PanelFilsCinqLabels labelEst = new PanelFilsCinqLabels () ;
		JLabel labelSud = new JLabel ("Zone Sud",JLabel.CENTER) ;
		PanelFilsCinqLabels labelOuest = new PanelFilsCinqLabels () ;
		labelCentre.setOpaque (true);
		labelNord.setOpaque (true);
		labelEst.setOpaque (true);
		labelSud.setOpaque (true);
		labelOuest.setOpaque (true);
		labelCentre.setFont (new Font ("Verdana",Font.ITALIC,24));
		labelNord.setFont (new Font ("Arial",Font.BOLD,20));
		//labelEst.setFont (new Font ("Verdana",Font.ITALIC,16));
		labelSud.setFont (new Font ("Proxima nova",Font.PLAIN,22));
		//labelOuest.setFont (new Font ("Times",Font.ITALIC,18));
		add (labelCentre, BorderLayout.CENTER);
		add (labelNord, BorderLayout.NORTH);
		add (labelEst, BorderLayout.EAST);
		add (labelSud, BorderLayout.SOUTH);
		add (labelOuest , BorderLayout.WEST);
		setBackground (new Color (100,67,98));
	}  // constructeur
}  // classe
