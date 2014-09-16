package gt.edu.usac.ipc1a;



import javax.swing.JFrame;

public class Tarea4 {
	
	public Tarea4(){
		
	}

	public static void main(String args[]){

		JFrame jframe=new JFrame();
		jframe.setSize(800, 600);

		Canvas can = new Canvas();
		
		jframe.add(can);
		jframe.setVisible(true);
	}
	
}