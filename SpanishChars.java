package SpanishChars;

import javax.swing.*;
import java.awt.*;

public class SpanishChars extends JPanel
{

   public SpanishChars()
   {
      super();
      setLayout(new GridLayout(3, 1));
      setVisible(true);
      add(new JLabel("Click a button to copy that character to the clipboard"));
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