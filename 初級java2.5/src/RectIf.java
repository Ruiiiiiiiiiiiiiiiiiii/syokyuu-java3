
public class RectIf extends MyFrame {
	public void run() {
		int x=30;
		int c=0;
		int i;
		for (i=0 ; i<9 ; i++) {
			setColor(c,c,c);
			if(i==0) {
				fillRect(x,80,10,100);
			}else {
				fillRect(x,80,10,100);
			}
			x+=20;
			c+=20;
		}
	}

}
