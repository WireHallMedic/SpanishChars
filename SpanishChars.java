package SpanishChars;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.datatransfer.*;

public class SpanishChars extends JPanel implements ActionListener, KeyListener
{
   private JButton[] button;
   public static final char A_LOWER = (char)225;
   public static final char E_LOWER = (char)233;
   public static final char I_LOWER = (char)237;
   public static final char O_LOWER = (char)243;
   public static final char U_LOWER = (char)250;
   public static final char N_LOWER = (char)241;
   public static final char A_UPPER = (char)193;
   public static final char E_UPPER = (char)201;
   public static final char I_UPPER = (char)205;
   public static final char O_UPPER = (char)211;
   public static final char U_UPPER = (char)218;
   public static final char N_UPPER = (char)209;
   public static final char EXCLAMATION = (char)161;
   public static final char QUESTION = (char)191;
   public static final char[] charArr = {A_UPPER, E_UPPER, I_UPPER, O_UPPER, U_UPPER, N_UPPER, EXCLAMATION,
                                         A_LOWER, E_LOWER, I_LOWER, O_LOWER, U_LOWER, N_LOWER, QUESTION};
   
   public SpanishChars()
   {
      super();
      setLayout(new GridLayout(4, 1));
      setVisible(true);
      add(new JLabel("Click a button to copy that character to the clipboard", SwingConstants.CENTER));
      JPanel subpanel1 = new JPanel();
      JPanel subpanel2 = new JPanel();
      subpanel1.setLayout(new GridLayout(1, 7));
      subpanel2.setLayout(new GridLayout(1, 7));
      button = new JButton[14];
      for(int i = 0; i < 7; i++)
      {
         button[i] = new JButton("" + charArr[i]);
         button[i].addActionListener(this);
         button[i].setFont(new Font(button[i].getFont().getName(), Font.PLAIN, 18));
         subpanel1.add(button[i]);
      }
      for(int i = 7; i < 14; i++)
      {
         button[i] = new JButton("" + charArr[i]);
         button[i].addActionListener(this);
         button[i].setFont(new Font(button[i].getFont().getName(), Font.PLAIN, 18));
         subpanel2.add(button[i]);
      }
      add(subpanel1);
      add(subpanel2);
      add(new JLabel("Michael Widler, 2021  ", SwingConstants.RIGHT));
      
      for(int i = 0; i < button.length; i++)
         button[i].setFocusable(false);
      addKeyListener(this);
      this.grabFocus();
   }
   
   private void copyToClipboard(char c)
   {
      StringSelection ss = new StringSelection("" + c);
	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
   }
   
   public void actionPerformed(ActionEvent ae)
   {
      String outStr = "";      for(int i = 0; i < button.length; i++)
      {
         if(ae.getSource() == button[i])
         {
      		copyToClipboard(charArr[i]);
         }
      }
   }
   
   public void keyPressed(KeyEvent ke){}
   public void keyReleased(KeyEvent ke){}
   public void keyTyped(KeyEvent ke)
   {
      switch(ke.getKeyChar())
      {
         case 'a' : ; copyToClipboard(A_LOWER); break;
         case 'e' : ; copyToClipboard(E_LOWER); break;
         case 'i' : ; copyToClipboard(I_LOWER); break;
         case 'o' : ; copyToClipboard(O_LOWER); break;
         case 'u' : ; copyToClipboard(U_LOWER); break;
         case 'n' : ; copyToClipboard(N_LOWER); break;
         case 'A' : ; copyToClipboard(A_UPPER); break;
         case 'E' : ; copyToClipboard(E_UPPER); break;
         case 'I' : ; copyToClipboard(I_UPPER); break;
         case 'O' : ; copyToClipboard(O_UPPER); break;
         case 'U' : ; copyToClipboard(U_UPPER); break;
         case 'N' : ; copyToClipboard(N_UPPER); break;
         case '!' : ; copyToClipboard(EXCLAMATION); break;
         case '?' : ; copyToClipboard(QUESTION); break;
      }
   }
   
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      SpanishChars panel = new SpanishChars();
      frame.setTitle("SpanishChars");
      frame.setSize(400, 300);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(panel);
      frame.setVisible(true);
      frame.addKeyListener(panel);
   }
}