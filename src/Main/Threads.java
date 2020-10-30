package Main;

import java.io.IOException;
import java.net.URL;

public class Threads implements Runnable {
    private Thread thread;
    private String filename;
    private URL url;

    public Threads(String filename, URL url) {
        this.filename = filename;
        this.url = url;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        System.out.println("downloading: " + filename);
        // Output directory
        String output = String.format("D:\\%s", filename);

        try {
            download.downloadFile(url, output);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Downloading failed: " + filename + " " + e);
            return;
        }
        System.out.println("Done: " + filename);
        long endTime = System.currentTimeMillis();
        System.out.println("Time " + (endTime - startTime) / 1000 + " seconds");

    }

    public void start() {
        System.out.println("Starting download :" + filename);
        if (thread == null) {
            thread = new Thread(this, filename);
            thread.start();
        }
    }
}
