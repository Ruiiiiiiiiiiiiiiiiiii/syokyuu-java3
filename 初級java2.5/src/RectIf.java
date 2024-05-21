
public class RectIf extends MyFrame {
	public void run() {
		int x=30;
		int y=30;
		setColor(0,128,0);
		int i;
		for (i=0 ; i<9 ; i++) {
			if(i==0) {
				fillRect(x,y,10,100);
			}else {
				fillRect(x,y,10,100);
			}
			x+=20;
			y+=20;
		}
	}

}
