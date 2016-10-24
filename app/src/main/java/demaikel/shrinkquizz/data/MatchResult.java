package demaikel.shrinkquizz.data;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import demaikel.shrinkquizz.R;

import static android.support.v7.widget.AppCompatDrawableManager.get;

/**
 * Created by Michael on 24-10-2016.
 */

public class MatchResult extends MatchAnswer {

    public MatchResult(String name, String loverName, String quarter, Context context) {
        super(name, loverName, quarter, context);
    }

    public String result (){
        return nameComparate()+ " " + quarterComparartor();
    }

    private String nameComparate () {
        int uName = getName().length();
        int lName = getLoverName().length();
        int dif = uName - lName;

        if (dif >=5) {
            return "Son compatibles!";
            }else{
            return "No son compatibles :(";
        }
            }
    private String quarterComparartor() {
        List<String> quarters = new ArrayList<>();
        quarters.add(getContext().getString(R.string.first_quarter));
        quarters.add(getContext().getString(R.string.second_quarter));
        quarters.add(getContext().getString(R.string.third_quarter));
        quarters.add(getContext().getString(R.string.fourth_quarter));

        int matcher = 0;
        for (int i = 0; i < quarters.size(); i++) {
            String quarter = quarters.get(i);
            if (getQuarter().equals(quarter)) {
                matcher = i;
            }
        }

        if (matcher%2 ==0) {
            return "Son la pareja perfecta";
        }else{
            return "Necesitan terapia de parekita";
        }
    }

}

