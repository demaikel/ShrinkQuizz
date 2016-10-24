package demaikel.shrinkquizz.adapters;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import demaikel.shrinkquizz.views.CoolFragment;
import demaikel.shrinkquizz.views.LuckyFragment;
import demaikel.shrinkquizz.views.MatchFragment;
import demaikel.shrinkquizz.R;

/**
 * Created by Michael on 19-10-2016.
 */

public class PagerAdapter extends FragmentPagerAdapter {

    private Context context;

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public PagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        switch (position){
            case 0:
                return CoolFragment.newInstance();
            case 1:
                return LuckyFragment.newInstance();
            case 2:
                return MatchFragment.newInstance();
            default:
                return CoolFragment.newInstance();
        }
    }


    @Override
    public int getCount() {return 3;}

        @Override
        public CharSequence getPageTitle(int position) {
            switch(position){
                case 0:
                    return context.getString(R.string.cool_title);
                case 1:
                    return context.getString(R.string.lucky_title);
                case 2:
                    return context.getString(R.string.match_title);
                default:
                    return context.getString(R.string.cool_title);
            }

        }



}
