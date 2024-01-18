import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class BufferTask {
    public static void refactorFile() {
        try (var inputChannel = new FileInputStream("File.txt").getChannel();
             var outputChannel = new FileOutputStream("newFile.txt").getChannel()) {

            var buffer = ByteBuffer.allocate(1024);
            var sb = new StringBuilder();

            while (inputChannel.read(buffer) > 0) {
                buffer.flip();
                var bytes = new byte[buffer.remaining()];
                buffer.get(bytes);
                var data = new String(bytes, StandardCharsets.UTF_8);
                sb.append(data.replaceAll("[^a-zA-Z ]", ""));
                buffer.clear();
            }

            var outputData = sb.toString().getBytes(StandardCharsets.UTF_8);
            buffer = ByteBuffer.wrap(outputData);
            outputChannel.write(buffer);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}