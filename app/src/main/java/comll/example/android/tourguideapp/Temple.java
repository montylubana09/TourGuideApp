package comll.example.android.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Temple extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temple2);

        ImageView image = (ImageView) findViewById(R.id.call_button);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCall(view);
            }
        });

        ImageView image1 = (ImageView) findViewById(R.id.share_button);

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openShare(view);
            }
        });

        ImageView image2 = (ImageView) findViewById(R.id.google_map);

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGoogle(view);
            }
        });
    }
    public void openCall(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.goibibo.com/destinations/jaipur/"));
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
        String location2 = getResources().getString(R.string.loaction2);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(location2));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }
}
