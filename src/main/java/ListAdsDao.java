import java.util.ArrayList;
import java.util.List;

public class ListAdsDao implements Ads {
    private List<Ad> ads;

    public List<Ad> all() {
        if (ads == null) {
            ads = generateAds();
        }
        return ads;
    }

    public Long insert(Ad ad) {
        if (ads == null) {
            ads = generateAds();
        }

        ad.setId((long) ads.size());
        ads.add(ad);
        return ad.getId();
    }

    private List<Ad> generateAds() {
        List<Ad> ads = new ArrayList<>();
        ads.add(new Ad(
                1,
                1,
                "sofa",
                "Barely used sectional that is left facing"
        ));
        ads.add(new Ad(
                2,
                1,
                "2007 Toyota Prius",
                "155k miles - 2 owner vehicle with all maintenance records to date"
        ));
        ads.add(new Ad(
                3,
                3,
                "Drumset",
                "Tama 7 piece drumset with dw3000 pedals and 6 cymbals"
        ));
        return ads;
    }
}

//
//    CREATE TABLE users (
//    id int NOT NULL AUTO_INCREMENT,
//    username VARCHAR(40) NOT NULL,
//    email VARCHAR(40) NOT NULL,
//    password VARCHAR(40) NOT NULL,
//    PRIMARY KEY (id)
//        );
//
//        CREATE TABLE ads (
//        id int NOT NULL AUTO_INCREMENT,
//        title VARCHAR(40) NOT NULL,
//        description VARCHAR(150) NOT NULL,
//        userid int,
//        PRIMARY KEY (id),
//        FOREIGN KEY (userid) REFERENCES users(id)
//        );