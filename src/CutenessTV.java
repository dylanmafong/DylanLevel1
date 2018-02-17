import java.net.URI;
import javax.swing.JFrame;
public class CutenessTV {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		CutenessTV TV = new CutenessTV();
		TV.showDucks();
		TV.showFrog();
		TV.showFluffyUnicorns();
	}
	void showDucks() {
		playVideo("Drirjl5K9Yk");
	}
	void showFrog() {
		playVideo("aSjCb-FfxhI");
	}
	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}
	void playVideo(String videoID) {
		try {
			URI uri = new URI("https://youtu.be/" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
