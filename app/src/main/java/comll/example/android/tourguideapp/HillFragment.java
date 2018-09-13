package comll.example.android.tourguideapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class HillFragment extends Fragment {


    public HillFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_hill, container, false);

        TextView text = (TextView) rootView.findViewById(R.id.restaurants_text_view);

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRestaurants(view);
            }
        });

        TextView text2 = (TextView) rootView.findViewById(R.id.temple_text_view);

        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTemple(view);
            }
        });

        TextView text3 = (TextView) rootView.findViewById(R.id.local_text_view);

        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLocalShopping(view);
            }
        });

        TextView text4 = (TextView) rootView.findViewById(R.id.historical_text_view);

        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHistorical(view);
            }
        });

        return rootView;
    }
    public void openRestaurants(View v){
        Intent j= new Intent(getActivity(), RestaurantActivity.class);
        startActivity(j);
    }
    public void openTemple(View v){
        Intent j= new Intent(getActivity(), TempleActivity.class);
        startActivity(j);
    }
    public void openLocalShopping(View v){
        Intent j= new Intent(getActivity(), LocalActivity.class);
        startActivity(j);
    }
    public void openHistorical(View v){
        Intent j= new Intent(getActivity(), HistoricalActivity.class);
        startActivity(j);
    }
}


