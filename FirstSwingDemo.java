import javax.swing.JFrame;
import javax.swing.JButton ;

public class FirstSwingDemo {
  public static final int WIDTH = 300 ;
  public static final int HEIGHT = 300 ;

  public static void main( String[] args) {
    JFrame firstWindow = new JFrame();
    firstWindow.setSize(WIDTH, HEIGHT);
    firstWindow.setDefaultCloseOperation( JFrame.DO_NOTHING_ON_CLOSE);

    JButton endButton = new JButton("end");
    EndingListener buttonEar = new EndingListener();
    endButton.addActionListener(buttonEar);
    firstWindow.add(endButton);

    firstWindow.setVisible(true);

  } // 





}//