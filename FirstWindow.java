import javax.swing.JFrame ;
import javax.swing.JButton ;

public class FirstWindow extends JFrame {
  public static final int WIDTH = 300 ;
  public static final int HEIGHT = 200 ; 

  public FirstWindow() {
    super();
    setSize(WIDTH,HEIGHT);

    setTitle("first window clss ");

    setDefaultCloseOperation( JFrame.DO_NOTHING_ON_CLOSE);

    JButton endButton = new JButton("Click to end program");
    endButton.addActionListener( new EndingListener());
    add(endButton);


  } // 



}