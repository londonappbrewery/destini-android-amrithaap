package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView Text;
    private Button topButton;
    private Button downButton;
    private int storyIndex=1;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        Text=(TextView)findViewById(R.id.storyTextView);
        topButton=(Button)findViewById (R.id.buttonTop);
        downButton=(Button)findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(storyIndex==1){
                    Text.setText(R.string.T3_Story);
                    topButton.setText(R.string.T3_Ans1);
                    downButton.setText(R.string.T3_Ans2);
                    storyIndex=3;

                }
                else if(storyIndex==2){
                    Text.setText(R.string.T3_Story);
                    topButton.setText(R.string.T3_Ans1);
                    downButton.setText(R.string.T3_Ans2);
                    storyIndex=3;
                }
                else if(storyIndex==3){
                    Text.setText(R.string.T6_End);
                    topButton.setVisibility(View.GONE);
                    downButton.setVisibility(View.GONE);
                }

            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:



        downButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(storyIndex==1){

                    Text.setText(R.string.T2_Story);
                    topButton.setText(R.string.T2_Ans1);
                    downButton.setText(R.string.T2_Ans2);
                    storyIndex=2;
                }
                else if(storyIndex==2){
                    Text.setText(R.string.T4_End);
                    topButton.setVisibility(View.GONE);
                    downButton.setVisibility(View.GONE);

                }
                else if(storyIndex==3){
                    Text.setText(R.string.T5_End);
                    topButton.setVisibility(View.GONE);
                    downButton.setVisibility(View.GONE);

                }


            }
        });
    }
}
