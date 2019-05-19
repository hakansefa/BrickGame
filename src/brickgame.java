import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;

public class brickgame extends JFrame {
int oyuncu=310;
int topitop;
int hizx=1;
int hizy=1;

int topy;
int tahtax;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					brickgame frame = new brickgame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public brickgame() {
		
		setTitle("Brick Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 700, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.YELLOW, Color.ORANGE, Color.GREEN, Color.RED));
		contentPane.setBackground(Color.BLACK);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel tahta = new JLabel();
		tahta.setBounds(oyuncu, 550, 100, 8);
		tahta.setOpaque(true);
		tahta.setBackground(Color.GREEN);
		contentPane.add(tahta);
		 Rectangle play = new Rectangle(oyuncu, 550, 100, 8);
		 Rectangle cikar = new Rectangle(900, 900, 0, 0);
		
		JLabel k5 = new JLabel();
		k5.setOpaque(true);
		k5.setBackground(Color.RED);
		k5.setBounds(537, 28, 118, 50);
		contentPane.add(k5);
		 Rectangle rect5 = new Rectangle(537, 28, 118, 50);
		
		JLabel kir1 = new JLabel();
		kir1.setOpaque(true);
		kir1.setBackground(Color.RED);
		kir1.setBounds(27, 28, 118, 50);
		contentPane.add(kir1);
		Rectangle rect1 = new Rectangle(27, 28, 118, 50);
		
		JLabel k2 = new JLabel();
		k2.setOpaque(true);
		k2.setBackground(Color.RED);
		k2.setBounds(155, 28, 118, 50);
		contentPane.add(k2);
		Rectangle rect2 = new Rectangle(155, 28, 118, 50);
		JLabel k3 = new JLabel();
		k3.setOpaque(true);
		k3.setBackground(Color.RED);
		k3.setBounds(283, 28, 118, 50);
		contentPane.add(k3);
		Rectangle kar1 = new Rectangle(27, 28, 118, 50);
		JLabel k4 = new JLabel();
		k4.setOpaque(true);
		k4.setBackground(Color.RED);
		k4.setBounds(411, 28, 118, 50);
		contentPane.add(k4);
		Rectangle rect4 = new Rectangle(411, 28, 118, 50);
		JLabel k10 = new JLabel();
		k10.setOpaque(true);
		k10.setBackground(Color.RED);
		k10.setBounds(537, 88, 118, 50);
		contentPane.add(k10);
		Rectangle rect10 = new Rectangle(537, 88, 118, 50);
		JLabel k9 = new JLabel();
		k9.setOpaque(true);
		k9.setBackground(Color.RED);
		k9.setBounds(411, 88, 118, 50);
		contentPane.add(k9);
		Rectangle rect9 = new Rectangle(411, 88, 118, 50);
		JLabel k8 = new JLabel();
		k8.setOpaque(true);
		k8.setBackground(Color.RED);
		k8.setBounds(283, 88, 118, 50);
		contentPane.add(k8);
		Rectangle rect8 = new Rectangle(283, 88, 118, 50);
		JLabel k7 = new JLabel();
		k7.setOpaque(true);
		k7.setBackground(Color.RED);
		k7.setBounds(155, 88, 118, 50);
		contentPane.add(k7);
		Rectangle rect7 = new Rectangle(155, 88, 118, 50);
		JLabel k6 = new JLabel();
		k6.setOpaque(true);
		k6.setBackground(Color.RED);
		k6.setBounds(27, 88, 118, 50);
		contentPane.add(k6);
		Rectangle rect6 = new Rectangle(27, 88, 118, 50);
		JLabel k15 = new JLabel();
		k15.setOpaque(true);
		k15.setBackground(Color.RED);
		k15.setBounds(537, 149, 118, 50);
		contentPane.add(k15);
		Rectangle rect15 = new Rectangle(537, 149, 118, 50);
		JLabel k14 = new JLabel();
		k14.setOpaque(true);
		k14.setBackground(Color.RED);
		k14.setBounds(411, 149, 118, 50);
		contentPane.add(k14);
		Rectangle rect14 = new Rectangle(411, 149, 118, 50);
		JLabel k13 = new JLabel();
		k13.setOpaque(true);
		k13.setBackground(Color.RED);
		k13.setBounds(283, 149, 118, 50);
		contentPane.add(k13);
		Rectangle rect13 = new Rectangle(283, 149, 118, 50);
		JLabel k12 = new JLabel();
		k12.setOpaque(true);
		k12.setBackground(Color.RED);
		k12.setBounds(155, 149, 118, 50);
		contentPane.add(k12);
		Rectangle rect12 = new Rectangle(155, 149, 118, 50);
		JLabel k11 = new JLabel();
		k11.setOpaque(true);
		k11.setBackground(Color.RED);
		k11.setBounds(27, 149, 118, 50);
		contentPane.add(k11);
		Rectangle rect11 = new Rectangle(27, 149, 118, 50);
		JLabel top = new JLabel();
		top.setBounds(350, 523, 27, 23);
		top.setOpaque(true);
		top.setBackground(Color.BLUE);
		contentPane.add(top);
		Rectangle topx = new Rectangle(topitop,  523, 27, 23);
		
		Timer time = new Timer();
		TimerTask timer =new TimerTask() {
			@Override
			public void run() {
				//TOP && TAHTA
				topitop=(int) top.getBounds().getX();
				topy=(int) top.getBounds().getY();
				 topitop= topitop + hizx;
				 topy= topy + hizy;
				 top.setBounds(topitop, topy, 27, 23);
				Rectangle x = new Rectangle(topitop, topy, 27, 23);
				 if(topitop>=650 || topitop<=0) hizx = hizx * -1;
				 if(topy>535 || topy<=0)  hizy = hizy * -1;
				
				 if(x.intersects(play)) 
				 {
						hizx = hizx * +1;
						 hizy = hizy * +1;  
						 
					
					 
				 }
				 //TOP && KUTULAR
				 if(rect1.intersects(x)) 
				 {
						hizx = hizx * -1;
						 hizy = hizy * -1;  
					 kir1.setBounds(cikar);
					 rect1.setBounds(cikar);
					 
				 }
				 if(x.intersects(rect2)) 
				 {
						hizx = hizx * -1;
						 hizy = hizy * -1;   
					
						 k2.setBounds(cikar);
						 rect2.setBounds(cikar);
				 }
				 if(x.intersects(kar1)) 
				 {
						hizx = hizx * -1;
						 hizy = hizy * -1;  
					 k3.setBounds(cikar);
					 kar1.setBounds(cikar);
				 }
				 if(x.intersects(rect4)) 
				 {
						hizx = hizx * -1;
						 hizy = hizy * -1;  
					 k4.setBounds(cikar);
					 rect4.setBounds(cikar);
				 }
				 if(x.intersects(rect5)) 
				 {
						hizx = hizx * -1;
						 hizy = hizy * -1;   
					 k5.setBounds(cikar);
					 rect5.setBounds(cikar);
				 }
				 if(x.intersects(rect6)) 
				 {
						hizx = hizx * -1;
						 hizy = hizy * -1;   
					 k6.setBounds(cikar);
					 rect6.setBounds(cikar);
					 
				 }
				 if(x.intersects(rect7)) 
				 {
						hizx = hizx * -1;
						 hizy = hizy * -1;    
					 k7.setBounds(cikar);
					 rect7.setBounds(cikar);
				 }
				 if(x.intersects(rect8)) 
				 {
						hizx = hizx * -1;
						 hizy = hizy * -1;  
					 k8.setBounds(cikar);
					 rect8.setBounds(cikar);
				 }
				 if(x.intersects(rect9)) 
				 {
						hizx = hizx * -1;
						 hizy = hizy * -1;   
					 k9.setBounds(cikar);
					 rect9.setBounds(cikar);
				 }
				 if(x.intersects(rect10)) 
				 {
						hizx = hizx * -1;
						 hizy = hizy * -1;  
					 k10.setBounds(cikar);
					 rect10.setBounds(cikar);
				 }
				 if(x.intersects(rect11)) 
				 {
						hizx = hizx * -1;
						 hizy = hizy * -1;   
					 k11.setBounds(cikar);
					 rect11.setBounds(cikar);
					 
				 }
				 if(x.intersects(rect12)) 
				 {
						hizx = hizx * -1;
						 hizy = hizy * -1;  
					 k12.setBounds(cikar);
					 rect12.setBounds(cikar);
				 }
				 if(x.intersects(rect13)) 
				 {
						hizx = hizx * -1;
						 hizy = hizy * -1;  
					 k13.setBounds(cikar);
					 rect13.setBounds(cikar);
				 }
				 if(rect14.intersects(x)) 
				 {
						hizx = hizx * +1;
						 hizy = hizy * +1;  
					 k14.setBounds(cikar);
					 rect14.setBounds(cikar);
				 }
				 if(rect15.intersects(x)) 
				 {
					
					hizx = hizx * -1;
					 hizy = hizy * -1;  
					 k15.setBounds(cikar);
					 rect15.setBounds(cikar);
				 }
				 
				 
				
			}
		};
		time.schedule(timer,0,3);
		addKeyListener(new KeyAdapter() {
			
				
		
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_RIGHT) 
				{
					tahtax=(int) tahta.getBounds().getX();
					if(tahtax<590) tahtax+=20;
					tahta.setBounds(tahtax, 550, 100, 8);
                  
				}
				if(e.getKeyCode() == KeyEvent.VK_LEFT) 
				{
					tahtax=(int) tahta.getBounds().getX();
					
                    if(tahtax>10) {tahtax-=20;}
                    tahta.setBounds(tahtax, 550, 100, 8);
				}
			}
		});
	    
	}

}
