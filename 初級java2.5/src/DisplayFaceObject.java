
public class DisplayFaceObject extends MyFrame{
	public void run() {
		Face facel=new Face();
		facel.x=50;
		facel.y=50;
		facel.draw(this);
		
		Face face2=new Face();
		face2.x=200;
		face2.y=150;
		face2.draw(this);
	}

}
