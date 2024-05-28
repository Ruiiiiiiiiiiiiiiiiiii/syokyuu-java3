
public class DisplayFaceAndTree extends MyFrame {
	public void run() {
		Face facel= new Face(50,50,10,5);
		
		Tree treel=new Tree(200,100,-10,-5);

		for (int i=0; i<30; i++) {
			clear();
			facel.draw(this);
			treel.draw(this);
			facel.move();
			treel.move();
			sleep(0.1);
		}
	}

}
