package com.snake;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Gameplay extends JPanel implements KeyListener, ActionListener{
	
	private int[] snakexlength = new int[750];
	private int[] snakeylength = new int[750];
	
	private boolean left = false;
	private boolean right = false;
	private boolean up = false;
	private boolean down = false;
	
	private ImageIcon rightmouth;
	private ImageIcon upmouth;
	private ImageIcon downmouth;
	private ImageIcon leftmouth;
	
	private int lengthofsanke = 3;
	
	private Timer timer;
	private int delay = 100;
	private ImageIcon snakeimage;
	
	private int moves = 0; 
	
	private ImageIcon titleImage;
		
	public Gameplay(){
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		timer = new Timer(delay, this);
		timer.start();
	}
		
	public void paint(Graphics g){
		if(moves == 0){
			snakexlength[2] = 50;
			snakexlength[1] = 75;
			snakexlength[0] = 100;
			
			snakeylength[2] = 100;
			snakeylength[1] = 100;
			snakeylength[0] = 100;
			
			//31 minutes
		}
		
		//Draw title image border
		g.setColor(Color.white);
		g.drawRect(24, 10, 851, 55);
		
		//Draw the title image
		titleImage = new ImageIcon("res/snaketitle.jpg");
		titleImage.paintIcon(this, g, 25, 11);
		
		//Draw border for gameplay
		g.setColor(Color.white);
		g.drawRect(24, 74, 851, 577);
		
		//Draw background for the gameplay
		g.setColor(Color.black);
		g.fillRect(25, 75, 850, 575);
		
		rightmouth = new ImageIcon("res/rightmouth.png");
		rightmouth.paintIcon(this, g, snakexlength[0], snakeylength[0]);
		
		for(int a = 0; a < lengthofsanke; a++){
			if(a==0 && right){
				rightmouth = new ImageIcon("res/rightmouth.png");
				rightmouth.paintIcon(this, g, snakexlength[a], snakeylength[a]);
			}
			
			if(a==0 && left){
				leftmouth = new ImageIcon("res/leftmouth.png");
				leftmouth.paintIcon(this, g, snakexlength[a], snakeylength[a]);
			}
			
			if(a==0 && down){
				downmouth = new ImageIcon("res/downmouth.png");
				downmouth.paintIcon(this, g, snakexlength[a], snakeylength[a]);
			}
			
			if(a==0 && up){
				upmouth = new ImageIcon("res/upmouth.png");
				upmouth.paintIcon(this, g, snakexlength[a], snakeylength[a]);
			}
			
			if(a!=0){
				snakeimage = new ImageIcon("res/snakeimage.png");
				snakeimage.paintIcon(this, g, snakexlength[a], snakeylength[a]);
			}
		}
		
		g.dispose();
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
	
	@Override
	public void keyTyped(KeyEvent arg0) {
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		
	}
}
