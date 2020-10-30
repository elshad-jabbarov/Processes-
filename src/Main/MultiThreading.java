package Main;

import java.io.IOException;
import java.net.URL;

public class MultiThreading {
    final long startTime = System.nanoTime();
    // in This mode Threads runs in parallel
    public static void main(String[] args) throws IOException {
        URL url1 = new URL("http://www.ubicomp.org/ubicomp2003/adjunct_proceedings/proceedings.pdf");
        URL url2 = new URL("https://www.hq.nasa.gov/alsj/a17/A17_FlightPlan.pdf");
        URL url3 = new URL("https://ars.els-cdn.com/content/image/1-s2.0-S0140673617321293-mmc1.pdf");
        URL url4 = new URL("http://www.visitgreece.gr/deployedFiles/StaticFiles/maps/Peloponnese_map.pdf");
        Threads threads1 = new Threads("file1.pdf", url1);
        Threads threads2 = new Threads("file2.pdf", url2);
        Threads threads3 = new Threads("file3.pdf", url3);
        Threads threads4 = new Threads("file4.pdf", url4);
        //  the number of processors available to the Java virtual machine
        int processors = Runtime.getRuntime().availableProcessors();
        //Array of Threads
        Threads[] myThreads = {threads1, threads2, threads3, threads4};
        // In this loop  splits the work off for that thread, and fires off the thread
        for (int i = 0; i < processors; i++) {
            if (i == myThreads.length) break;
            myThreads[i].start();
        }

    }


}
