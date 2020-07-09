package com.multiThreading.edu;

import java.awt.*;


public class Banner extends Frame implements Runnable{

	String str="Core java Online";
	
	 Banner() {
		
		 setLayout(null);// dont set layout
		 setBackground(Color.cyan);
		 setForeground(Color.RED);
	}
	 public void paint(Graphics g)
	 {
		 String name;
		Font font = new Font("Courier", Font.BOLD, 40);
		g.setFont(font);
		g.drawString(str, 10, 100);
	 }
	public void run()
	{
		for(;;){// move banner contiously
			repaint();// refresh the frame contents
			try{
				Thread.sleep(400);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			char ch=str.charAt(0);
			str=str.substring(1, str.length());
			str=str+ch;
					
					
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banner banner = new Banner();
		banner.setSize(400, 400);
		banner.setTitle("My Banner");
		banner.setVisible(true);
		// create a thread and run it.
		Thread thread = new Thread(banner);
		thread.start();

	}

}
