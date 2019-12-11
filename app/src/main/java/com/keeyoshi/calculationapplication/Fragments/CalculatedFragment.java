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


public class CalculatedFragment extends Fragment implements View.OnClickListener {
    private Button btnCalcualte;
    private EditText txtFirst,txtSecond;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    } public View onCreateView(LayoutInflater inflater, ViewGroup container,
                               Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_calculated,container,false);

        txtFirst=view.findViewById(R.id.etfirst);
        txtSecond=view.findViewById(R.id.etsecond);
        btnCalcualte=view.findViewById(R.id.btnCslculatetwono);

        btnCalcualte.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        int first=Integer.parseInt(txtFirst.getText().toString());
        int second=Integer.parseInt(txtSecond.getText().toString());
        int results=first+second;

        Toast.makeText(getActivity(), "Sum is"+results, Toast.LENGTH_SHORT).show();

    }
}


