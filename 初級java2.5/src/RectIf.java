
public class RectIf extends MyFrame {
	public void run() {
		int x=20;
		int c=15;
		int i;
		setColor(0,128,0);
		for (i=0 ; i<9 ; i++) {
			fillRect(x,x,c,c);
			x+=c;
			c+=15;
		}
	}

}
