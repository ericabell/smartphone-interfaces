import com.sun.tools.javadoc.Start;

public class Main {

    public static void main(String[] args) {
	    Smartphone iPhone = new Smartphone(1234);
	    Smartphone galaxyS8 = new Smartphone(2345);

	    iPhone.playSong();
	    iPhone.takePicture();
	    galaxyS8.playSong();
	    galaxyS8.shareSong();
    }
}
