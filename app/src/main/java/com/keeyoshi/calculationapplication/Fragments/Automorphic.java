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

public class Automorphic extends Fragment implements View.OnClickListener {

    EditText txtMorphicnumber;
    Button btnAutoMorphic;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onClick(View v) {
        int square, num, result = 0;
        num = Integer.parseInt(txtMorphicnumber.getText().toString());
        square = num * num;
        result = square % 10;
        if (result == num) {
            Toast.makeText(getActivity(), "This is auto morphic number", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getActivity(), "This is not auto morphic number", Toast.LENGTH_SHORT).show();

        }

    }
}


