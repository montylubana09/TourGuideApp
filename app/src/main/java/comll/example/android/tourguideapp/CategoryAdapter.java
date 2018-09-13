package comll.example.android.tourguideapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;


    public CategoryAdapter(Context context,FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0)
        {return new CityFragment();}
       if(position==1)
        { return new HillFragment();}
        if(position==2)
        {return new DdirectionFragment();
        }
        else
        {
            return new MallFragment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.city);
        } if(position==1)  {
            return mContext.getString(R.string.hill);
        }
        if(position==2){
            return mContext.getString(R.string.directions);
        }
        else
        {
            return mContext.getString(R.string.mall);
        }
    }
}
