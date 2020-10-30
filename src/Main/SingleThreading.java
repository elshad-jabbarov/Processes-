package Main;

import java.net.MalformedURLException;
import java.net.URL;

public class SingleThreading {
    // in This mode threads runs sequentially
    public static void main(String[] args) throws MalformedURLException {
        URL url1 = new URL("http://www.ubicomp.org/ubicomp2003/adjunct_proceedings/proceedings.pdf");
        URL url2 = new URL("https://www.hq.nasa.gov/alsj/a17/A17_FlightPlan.pdf");
        URL url3 = new URL("https://ars.els-cdn.com/content/image/1-s2.0-S0140673617321293-mmc1.pdf");
        URL url4 = new URL("http://www.visitgreece.gr/deployedFiles/StaticFiles/maps/Peloponnese_map.pdf");
        Threads threads1 = new Threads("file1.pdf", url1);
        Threads threads2 = new Threads("file2.pdf", url2);
        Threads threads3 = new Threads("file3.pdf", url3);
        Threads threads4 = new Threads("file4.pdf", url4);
        threads1.run();
        threads2.run();
        threads3.run();
        threads4.run();
    }
}
