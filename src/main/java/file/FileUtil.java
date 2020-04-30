package file;


import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileUtil {
    public String readFile(String filePath) {
        Path path = Paths.get(filePath);
        try {
            AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(path, StandardOpenOption.READ);
            long totalSize = fileChannel.size();
            for (long pos = 0; pos < totalSize; pos = pos + 128) {
                readBlock(fileChannel, pos);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return path.toString();
    }

    private void readBlock(AsynchronousFileChannel fileChannel, long position) {
        System.out.println("Called with position: " + position);
        ByteBuffer buffer = ByteBuffer.allocate(128);
        fileChannel.read(buffer, position, buffer, new CompletionHandler<Integer, ByteBuffer>() {
            @Override
            public void completed(Integer result, ByteBuffer attachment) {
                int readLength = attachment.limit();
                if (readLength > 0) {
                    attachment.flip();
                    byte[] data = new byte[attachment.limit()];
                    attachment.get(data);
                    System.out.println(new String(data));
                    attachment.clear();
                }
            }

            @Override
            public void failed(Throwable exc, ByteBuffer attachment) {

            }
        });
    }
}

