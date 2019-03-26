import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverUnder  gui=new OverUnder();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setVisible(true);
		gui.setSize(300,150);
		gui.setTitle("Guessing higher lower Game");
		gui.setResizable(false);
		
	}

}
