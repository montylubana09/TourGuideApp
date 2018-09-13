package comll.example.android.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mall);

        ImageView image = (ImageView) findViewById(R.id.lulu);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLulu(view);
            }
        });
        ImageView image1 = (ImageView) findViewById(R.id.select);

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSelect(view);
            }
        });
        ImageView image2 = (ImageView) findViewById(R.id.phoenix);

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPhoenix(view);
            }
        });
        ImageView image3 = (ImageView) findViewById(R.id.elante);

        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openElante(view);
            }
        });
    }
    public void openLulu(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.hellotravel.com/stories/10-largest-shopping-malls-in-india"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }
    public void openSelect(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.hellotravel.com/stories/10-largest-shopping-malls-in-india"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }
    public void openPhoenix(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.hellotravel.com/stories/10-largest-shopping-malls-in-india"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }
    public void openElante(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.hellotravel.com/stories/10-largest-shopping-malls-in-india"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }
}
