package com.digitalmirko.clockanimationviewlibrarydemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import jp.shts.android.library.clockanimationview.ClockAnimationView;

public class MainActivity extends AppCompatActivity {

    Button button;
    ClockAnimationView clockAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        clockAnimationView = (ClockAnimationView) findViewById(R.id.image);
        clockAnimationView.setTime(0, 0);

        button.setText("Set to 2:30");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Using switch to go through a number of time movements when the button is clicked
                switch (counter) {
                    case 0:
                        clockAnimationView.animateToTime(2, 30);
                        button.setText("Set to 4:45");
                        break;
                    case 1:
                        clockAnimationView.setTime(4, 45);
                        button.setText("Set to 7:15");
                        break;
                    case 2:
                        clockAnimationView.animateToTime(7, 15);
                        button.setText("Set to 9:50");
                        break;
                    case 3:
                        clockAnimationView.setTime(9, 50);
                        button.setText("Set to 11:30");
                        break;
                    case 4:
                        clockAnimationView.animateToTime(11, 30);
                        button.setText("Set to 12:00");
                        break;
                    case 5:
                        clockAnimationView.animateToTime(12, 0);
                        button.setText("Demo Finished");
                        button.setEnabled(false);  // greyed out button, demo over
                        break;
                    default:
                        finish();
                        break;
                }
                counter++;
            }
        });
    }
    int counter=0;
}
