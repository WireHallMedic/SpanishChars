package SpanishChars;

import javax.swing.*;
import java.awt.*;

public class SpanishChars extends JPanel
{
   private JButton[] button;
   public static final char A_LOWER = (char)225;
   public static final char E_LOWER = (char)233;
   public static final char I_LOWER = (char)237;
   public static final char O_LOWER = (char)243;
   public static final char U_LOWER = (char)250;
   public static final char N_LOWER = (char)241;
   public static final char A_UPPER = (char)192;
   public static final char E_UPPER = (char)201;
   public static final char I_UPPER = (char)205;
   public static final char O_UPPER = (char)211;
   public static final char U_UPPER = (char)218;
   public static final char N_UPPER = (char)209;
   public static final char EXCLAMATION = (char)161;
   public static final char QUESTION = (char)191;
   
   public SpanishChars()
   {
      super();
      setLayout(new GridLayout(3, 1));
      setVisible(true);
      add(new JLabel("Click a button to copy that character to the clipboard"));
      JPanel subpanel1 = new JPanel();
      JPanel subpanel2 = new JPanel();
      subpanel1.setLayout(new GridLayout(1, 7));
      subpanel2.setLayout(new GridLayout(1, 7));
      char[] charArr = {A_UPPER, E_UPPER, I_UPPER, O_UPPER, U_UPPER, N_UPPER, EXCLAMATION,
                        A_LOWER, E_LOWER, I_LOWER, O_LOWER, U_LOWER, N_LOWER, QUESTION};
   }
   
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      SpanishChars panel = new SpanishChars();
      frame.setSize(400, 300);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(panel);
      frame.setVisible(true);
   }
}