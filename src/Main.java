import com.sun.tools.javadoc.Start;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	    Smartphone iPhone = new Smartphone(1234);
	    Smartphone galaxyS8 = new Smartphone(2345);

	    iPhone.playSong();
	    iPhone.takePicture();
	    galaxyS8.playSong();
	    galaxyS8.shareSong();

        ArrayList<Smartphone> list = new ArrayList<Smartphone>();

        list.add(iPhone);
        list.add(galaxyS8);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }



}
