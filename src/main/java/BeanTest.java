import model.Album;
import java.util.Date;

public class BeanTest {
    public static void main(String[] args) {
        //instantiates few instances of album, author, and quote
        Date nevermind = new Date(1991, 9, 24);
        Album Nirvana = new Album(1, "Nirvana", "Nevermind", nevermind, 2.2, "alternative");
    }
}