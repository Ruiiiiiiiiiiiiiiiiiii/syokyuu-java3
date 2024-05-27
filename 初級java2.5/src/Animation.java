
public class Animation extends MyFrame {
	public void run() {
		int y = 300;
		int x = 30;
		while (true) {
			while (y >= 90) {
				clear();

				setColor(0, 128, 0);
				fillRect(x, y, 10, 100);
				y-= 5;

				sleep(0.1);
			}
			while (x <= 250) {
				clear();

				setColor(0, 128, 0);
				fillRect(x, y, 10, 100);

				x += 5;

				sleep(0.1);
			}
		}
	}

}
