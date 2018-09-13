package comll.example.android.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class wordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public wordAdapter(Activity context, ArrayList<Word> wordadapter, int colorResourceId) {
        super(context, 0, wordadapter);
        mColorResourceId=colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        final Word currentWord= getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.place_name);
        nameTextView.setText(currentWord.getPlaceName());

        ImageView image=(ImageView) listItemView.findViewById(R.id.image);
        image.setImageResource(currentWord.getImageResourceID());

        View textContainer = listItemView.findViewById(R.id.textContainer);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
