package com.zaksid.dev.android.googletutor.firstapplication;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class IntroFragmentActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_fragment);

        if (findViewById(R.id.intro_container) != null) {

            if (savedInstanceState != null) {
                return;
            }

            IntroFirstFragment intro1 = new IntroFirstFragment();
            intro1.setArguments(getIntent().getExtras());
            getFragmentManager().beginTransaction()
                    .add(R.id.intro_container, intro1)
                    .commit();
        }
    }
}
