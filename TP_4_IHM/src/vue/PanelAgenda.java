package vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;
import Modele.*;
public class PanelAgenda extends JPanel{
	public PanelAgenda() throws ExceptDate {
		Agenda agenda1 =new Agenda(5);
		Evenement evt1 = new Evenement(new Date(21,1,1997), "TP1","IUT");
		Evenement evt2 = new Evenement(new Date(21,1,1997), "TP2","IUT");
		Evenement evt3 = new Evenement(new Date(21,1,1997), "TP3","IUT");
		agenda1.ajout(evt1);
		agenda1.ajout(evt2);
		agenda1.ajout(evt3);
		
		
		
		PanelFormulaire form =new PanelFormulaire(agenda1);
		form.setBackground(new Color(200,200,150));
		form.setPreferredSize(new Dimension(390,460));
		
		add(form);
		
	}

}
