//uainf the proxyimage to get the realimage object

public class main {

    public static void main(String[] args) {
        Image image = new ProxyImage("IPPLab.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
}