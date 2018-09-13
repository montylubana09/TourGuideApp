package comll.example.android.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Restaurant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant2);

        ImageView image = (ImageView) findViewById(R.id.call1);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCall(view);
            }
        });
        ImageView image1 = (ImageView) findViewById(R.id.share1);

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openShare(view);
            }
        });
        ImageView image2 = (ImageView) findViewById(R.id.call2);

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCall1(view);
            }
        });
        ImageView image3 = (ImageView) findViewById(R.id.share2);

        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openShare1(view);
            }
        });
        ImageView image4 = (ImageView) findViewById(R.id.call3);

        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCall2(view);
            }
        });
        ImageView image5 = (ImageView) findViewById(R.id.share3);

        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openShare2(view);
            }
        });

        ImageView image6 = (ImageView) findViewById(R.id.google1);

        image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGoogle(view);
            }
        });

        ImageView image7 = (ImageView) findViewById(R.id.google2);

        image7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGoogle(view);
            }
        });

        ImageView image8 = (ImageView) findViewById(R.id.google3);

        image8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGoogle(view);
            }
        });

    }
    public void openCall(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.tripadvisor.in/Restaurant_Review-g304555-d2177263-Reviews-Okra-Jaipur_Jaipur_District_Rajasthan.html"));
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
    public void openCall1(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.tripadvisor.in/Restaurant_Review-g304555-d3593183-Reviews-Jal_Mahal-Jaipur_Jaipur_District_Rajasthan.html"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }
    public void openShare1(View v){
        String share = getResources().getString(R.string.share);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(share));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }
    public void openCall2(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.tripadvisor.in/Restaurant_Review-g304555-d8136897-Reviews-Sheesh_Mahal_Bar-Jaipur_Jaipur_District_Rajasthan.html"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }
    public void openShare2(View v){
        String share = getResources().getString(R.string.share);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(share));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }
    public void openGoogle(View v){
        String location2 = getResources().getString(R.string.location3);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(location2));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }
}
