package com.huangxunyi;

import java.io.*;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.UUID;

public class FileUtil {

    static File getRandomFile() {
        String fileName = UUID.randomUUID().toString();

        final File file = new File(fileName);
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                file.delete();
            }
        }));
        return file;
    }

    static FileChannel getFileChannel() throws FileNotFoundException {
        File file = FileUtil.getRandomFile();
        FileChannel fc = new RandomAccessFile(file, "rw").getChannel();
        return fc;
    }

    static MappedByteBuffer getMappedByteBuffer() throws IOException {
        File file = FileUtil.getRandomFile();
        MappedByteBuffer mb = new RandomAccessFile(file, "rw").getChannel().
                map(FileChannel.MapMode.READ_WRITE, 0, 1024 * 1024 * 1024);
        return mb;
    }

}