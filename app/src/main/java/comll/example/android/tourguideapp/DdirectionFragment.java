package comll.example.android.tourguideapp;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class DdirectionFragment extends Fragment {


    public DdirectionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_directions, container, false);
        ImageView text = (ImageView) rootView.findViewById(R.id.direction);

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDirection(view);
            }
        });
        return rootView;
    }
    public void openDirection(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.google.co.in/maps/@27.0280489,74.6551089,14z"));

            startActivity(intent);

    }
}