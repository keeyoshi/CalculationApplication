package com.keeyoshi.calculationapplication.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.keeyoshi.calculationapplication.R;


public class RadiusFragment extends Fragment implements View.OnClickListener {
    EditText etradius;
    Button btnCalRadius;
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_radius, container, false);

        etradius=  view.findViewById(R.id.etradius);
        btnCalRadius=view.findViewById(R.id.btCalRadius);

        btnCalRadius.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int radius;
        radius=Integer.parseInt(etradius.getText().toString());
        int value= ((22/7)*radius*radius);
        Toast.makeText(getActivity(), "The radius is:"+value, Toast.LENGTH_LONG).show();
    }
}
