package com.wasatchwired.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private Button spotButton;
    private Button superduoButton;
    private Button builditbiggerButton;
    private Button xyzreaderButton;
    private Button capstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spotButton = (Button)findViewById(R.id.spotifyButton);
        superduoButton = (Button) findViewById(R.id.scoresButton);
        builditbiggerButton = (Button) findViewById(R.id.buildbiggerButton);
        xyzreaderButton = (Button)findViewById(R.id.xyzButton);
        capstoneButton = (Button)findViewById(R.id.capstoneButton);

        spotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                      HandleButtonClicks("spotButton");
            }
        });

        superduoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    HandleButtonClicks("superduoButton");
            }
        });

        builditbiggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 HandleButtonClicks("builditbiggerButton");
            }
        });

        xyzreaderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HandleButtonClicks("xyzreaderButton");
            }
        });

        capstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 HandleButtonClicks("capstoneButton");
            }
        });
    }

    public void HandleButtonClicks(String buttonName)
    {

        switch (buttonName)
        {
            case "spotButton":
                Toast.makeText(this, "This Button Will Launch My Spotify Streamer App!",
                        Toast.LENGTH_SHORT).show();
                break;
            case "superduoButton" :
                Toast.makeText(this, "This Button Will Launch My Super Duo App!",
                        Toast.LENGTH_SHORT).show();
                break;

            case "builditbiggerButton" :
                Toast.makeText(this, "This Button Will Launch My Build it Bigger App!",
                        Toast.LENGTH_SHORT).show();
                break;
            case "xyzreaderButton" :
                Toast.makeText(this, "This Button Will Launch My XYZ Readerr App!",
                        Toast.LENGTH_SHORT).show();
                break;
            case "capstoneButton" :
                Toast.makeText(this, "This Button Will Launch My Capstone App!",
                        Toast.LENGTH_SHORT).show();
                break;
        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
