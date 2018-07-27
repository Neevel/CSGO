import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class ImageLoader {

	static BufferedImage i;

	public ImageLoader() {

		try {
			i = ImageIO.read(new File("src/crosshairImage/Enemy.png"));
		} catch (Exception e) {
			System.out.println("nicht gefunden ");
		}

	}

}
