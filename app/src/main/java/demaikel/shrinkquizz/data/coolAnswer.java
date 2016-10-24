package demaikel.shrinkquizz.data;

/**
 * Created by Michael on 19-10-2016.
 */

public class coolAnswer {

    private String user;
    private boolean party;
    private int drinks;

    public coolAnswer(String user, boolean party, int drinks) {
        this.user = user;
        this.party = party;
        this.drinks = drinks;
    }

    public String getUser() {
        return user;
    }

    public boolean isParty() {
        return party;
    }

    public int getDrinks() {
        return drinks;
    }
}
