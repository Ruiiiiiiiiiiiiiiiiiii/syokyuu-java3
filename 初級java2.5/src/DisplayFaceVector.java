import java.util.Vector;
public class DisplayFaceVector extends MyFrame {
	public void run() {
		Vector<Face> faces=new Vector<Face>();
		
		faces.add(new Face(30,50,10,5));
		faces.add(new Face(30,100,11,10));
		faces.add(new Face(30,150,12,15));
		faces.add(new Face(30,200,13,20));
		faces.add(new Face(30,250,14,25));
		
		for(int i=0; i<=30; i++) {
			
			clear();
			
			for(int j=0; j<faces.size();j++) {
				faces.get(j).draw(this);		
				faces.get(j).move();
			}
			
			sleep(0.1);
			
		}
	}

}
