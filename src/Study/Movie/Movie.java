package Study.Movie;

public class Movie {

    private static int movie(int card, int ticket, double perc) {
        int n = 0;
        double systemB = card;

        while (ticket*n <= Math.ceil(systemB)) {
            systemB += ticket*Math.pow(perc,++n);
        }

        return n;
    }

    public static void main(String[] args) {
        System.out.println(movie(500,15,0.90));
        System.out.println(movie(100,10,0.95));
    }
}
