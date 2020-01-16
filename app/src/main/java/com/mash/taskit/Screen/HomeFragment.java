package com.mash.taskit.Screen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;

import com.mash.taskit.R;

public class HomeFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        System.out.println("Test");

        return inflater.inflate(R.layout.home_layout, container, false);

    }

    public void onViewCreated(View view, Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        LinearLayout layout = view.findViewById(R.id.homeLayout);

        DatePicker datePicker = new DatePicker(view.getContext());

        layout.addView(datePicker);
    }

}
