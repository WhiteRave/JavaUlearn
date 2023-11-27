import java.io.File;

public class FileUtils {
    public static long calculateFolderSize(String path){
        var folder = new File(path);
        if (!folder.exists() || !folder.isDirectory()) {
            throw new IllegalArgumentException("Неверный путь");
        }
        return getFolderSize(folder);
    }

    private static long getFolderSize(File folder) {
        long size = 0;
        var files = folder.listFiles();

        for (var file : files) {
            if (file.isFile()) {
                size += file.length();
            } else if (file.isDirectory()) {
                size += getFolderSize(file);
            }
        }
        return size;
    }
}