package com.zaksid.dev.android.googletutor.firstapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class IntroFirstFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.intro_1, container, false);

        Button next = (Button) view.findViewById(R.id.button);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IntroSecondFragment intro2 = new IntroSecondFragment();

                android.app.FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.intro_container, intro2);
                transaction.addToBackStack(null);

                transaction.commit();
            }
        });

        return view;
    }
}
