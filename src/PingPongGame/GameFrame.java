package PingPongGame;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame {
	
	GamePanel panel;
	
	GameFrame(){
		panel = new GamePanel();
		this.add(panel);
		this.setTitle("PingPongGame");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
	
}
