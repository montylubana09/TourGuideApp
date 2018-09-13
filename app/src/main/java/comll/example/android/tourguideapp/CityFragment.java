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
public class CityFragment extends Fragment {


    public CityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_city, container, false);

        TextView text = (TextView) rootView.findViewById(R.id.attraction_text_view);

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAttraction(view);
            }
        });

        TextView text1 = (TextView) rootView.findViewById(R.id.temple1_text_view);

        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTemple(view);
            }
        });
        TextView text2 = (TextView) rootView.findViewById(R.id.rest_text_view);

        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRest(view);
            }
        });
        TextView text3 = (TextView) rootView.findViewById(R.id.historical1_text_view);

        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHist(view);
            }
        });

        return rootView;
    }
    public void openAttraction(View v){
        Intent j= new Intent(getActivity(), Attraction.class);
        startActivity(j);
    }

    public void openTemple(View v){
        Intent i= new Intent(getActivity(), Temple.class);
        startActivity(i);
    }
    public void openRest(View v){
        Intent i= new Intent(getActivity(), Restaurant.class);
        startActivity(i);
    }
    public void openHist(View v){
        Intent i= new Intent(getActivity(), Historical.class);
        startActivity(i);
    }
}
