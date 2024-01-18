import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Utils {
    public static void copyFolder(String sourceDirectory, String destinationDirectory) {
        var source = new File(sourceDirectory);

        checkFileExistence(source);

        var sourcePath = Paths.get(sourceDirectory);
        var destinationPath = Paths.get(destinationDirectory);

        try {
            var fileVisitor = new MyFileVisitor(sourcePath, destinationPath);
            Files.walkFileTree(sourcePath, fileVisitor);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static long calculateFolderSize(String path){
        var folder = new File(path);
        checkFileExistence(folder);
        return getFolderSize(folder);
    }

    private static long getFolderSize(File folder) {
        var size = 0;
        var files = folder.listFiles();

        for (var file: files) {
            if (file.isFile()) {
                size += file.length();
            } else if (file.isDirectory()) {
                size += getFolderSize(file);
            }
        }
        return size;
    }

    public static void checkFileExistence(File file) {
        if (!file.exists() || !file.isDirectory()) {
            throw new IllegalArgumentException("Неверный путь");
        }
    }
}

class MyFileVisitor extends SimpleFileVisitor<Path> {
    private final Path sourcePath;
    private final Path destinationPath;

    public MyFileVisitor(Path sourcePath, Path destinationPath) {
        this.sourcePath = sourcePath;
        this.destinationPath = destinationPath;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        var relativePath = sourcePath.relativize(dir);
        var destination = destinationPath.resolve(relativePath);

        Files.createDirectories(destination);

        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attr) throws IOException {
        var relativePath = sourcePath.relativize(file);
        var destination = destinationPath.resolve(relativePath);

        Files.copy(file, destination);

        return FileVisitResult.CONTINUE;
    }
}
