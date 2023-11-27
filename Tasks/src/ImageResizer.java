/*
import org.imgscalr.Scalr;
import javax.imageio.ImageIO;
import java.io.File;

public class ImageResizer {

    public static void resize(String path, int width) {
        var folder = new File(path);

        if (!folder.exists() || !folder.isDirectory()) {
            throw new IllegalArgumentException("Неверный путь: " + path);
        }

        var files = folder.listFiles();

        if (files == null || files.length == 0) {
            throw new IllegalArgumentException();
        }

        for (var file : files) {
            try {
                var image = ImageIO.read(file);

                var originalWidth = image.getWidth();
                var originalHeight = image.getHeight();

                var newHeight = (int) ((double) originalHeight / originalWidth * width);

                var resizedImage = Scalr.resize(image, width, newHeight);

                ImageIO.write(resizedImage, "jpg", file);
            } catch (Exception e) {
                throw new IllegalArgumentException();
            }
        }
    }
}

 */