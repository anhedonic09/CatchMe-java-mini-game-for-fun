import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class CathMeIfYouCan 
{	JFrame jf=new JFrame("Catch Me If You Can");
	JLabel gif=new JLabel(new ImageIcon(getClass().getResource("sans-icegif-8.gif")));
	JLabel back=new JLabel(new ImageIcon(getClass().getResource("background.png")));
	Random rd=new Random();

	int c=0;
	
	public CathMeIfYouCan()
	{
		jf.setSize(1650,1080);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(3);
		jf.setResizable(false);
		jf.setLayout(null);
		back.setBounds(0,0,1300,800);
		jf.add(back);
		gif.setBounds(400,100,100,170);
		back.add(gif);
		gif.addMouseListener(new Mouse());
		jf.addKeyListener(new key());
		jf.setVisible(true);
	}
	
	
	class Mouse implements MouseListener
	{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			
			if(c==0) 
			{
			int x=rd.nextInt(1150);
			int y=rd.nextInt(500);
			gif.setLocation(x,y);
			}
			c=0;
		}

		@Override
		public void mouseExited(MouseEvent e) {
			
			
		}
		
	}
	
	class key implements KeyListener
	{

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			char ch=e.getKeyChar();	
			if(ch==' ')
				c=1;
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	public static void main(String[] args) 
	{
		new CathMeIfYouCan();
	}

}
