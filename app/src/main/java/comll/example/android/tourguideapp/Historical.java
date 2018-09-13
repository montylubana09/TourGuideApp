package comll.example.android.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Historical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historical2);

        ImageView image = (ImageView) findViewById(R.id.call7);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCall(view);
            }
        });

        ImageView image1 = (ImageView) findViewById(R.id.share7);

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openShare(view);
            }
        });
        ImageView image2 = (ImageView) findViewById(R.id.google4);

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGoogle(view);
            }
        });
    }
    public void openCall(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.tripadvisor.in/AttractionProductReview-g304555-d12923585-Private_Full_Day_Tour_of_Jaipur-Jaipur_Jaipur_District_Rajasthan.html"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

    public void openShare(View v){
        String share = getResources().getString(R.string.share);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(share));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }
    public void openGoogle(View v){
        String location2 = getResources().getString(R.string.location4);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(location2));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }
}
