
public class DisplayFaceObject extends MyFrame{
	public void run() {
		Face facel= new Face(50,50);
		
		Face face2=new Face(200,100);

		for (int i=0; i<30; i++) {
			clear();
			facel.draw(this);
			face2.draw(this);
			facel.x+=10;
			facel.y+=5;
			face2.x-=10;
			face2.y-=5;
			sleep(0.1);
		}
	}

}
