package comll.example.android.tourguideapp;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MallFragment extends Fragment {


    public MallFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        /** TODO: Insert all the code from the NumberActivity’s onCreate() method after the setContentView method call */

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.mall4, R.drawable.mall2));
        words.add(new Word(R.string.mall8, R.drawable.mall4));

        wordAdapter adapters = new wordAdapter(getActivity(), words, R.color.artist);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapters);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word obj=words.get(position);
                switch(words.indexOf(obj))
                {
                    case 0:Intent aksharDhamIntent = new Intent(getActivity(),MallActivity.class);
                        startActivity(aksharDhamIntent);break;
                    case 1:Intent chandraMahalIntent = new Intent(getActivity(),MallActivity.class);
                        startActivity(chandraMahalIntent);break;
                }


            }
        });


        return rootView;
    }

}
