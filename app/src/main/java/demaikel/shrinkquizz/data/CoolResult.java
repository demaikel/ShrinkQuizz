package demaikel.shrinkquizz.data;

/**
 * Created by Michael on 19-10-2016.
 */

public class CoolResult extends coolAnswer {

    public CoolResult(String user, boolean party, int drinks) {
        super(user, party, drinks);
    }


    //Encapsulamiento
    public String result (){
        return getUser() + " " + party() + " " + drinks();
    }

    private String party(){
        if (isParty()) {
            return "Eres un salvaje";
        }else{
            return "Vaya empollon!";
        }
    }

    private String drinks(){
        if (getDrinks() <=4) {
            return "Bebes con moderación";
        }else if (getDrinks() >=5 && getDrinks() <=8) {
            return "Eres brutal bebiendo";
        }else{
            return "Bebes como orilla de playa";
        }
    }

    }
