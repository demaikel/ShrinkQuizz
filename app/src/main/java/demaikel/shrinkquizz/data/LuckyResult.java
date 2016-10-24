package demaikel.shrinkquizz.data;

/**
 * Created by Michael on 21-10-2016.
 */

public class LuckyResult extends LuckyAnswer {

    public LuckyResult(boolean lucky) {
        super(lucky);
    }

    public String result() {
        return lucky() + " " + day();
    }

    private String lucky() {
        if (isLucky()) {
            return "En hora buena!";
        } else {
            return "Ánimo";
        }
    }

    private String day() {
        if (isDay()) {
            return "Es tu dia de suerte";
        } else {
            return "Mañana será mejor";
        }
    }

}
