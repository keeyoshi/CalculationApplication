package com.keeyoshi.calculationapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.keeyoshi.calculationapplication.Fragments.Automorphic;
import com.keeyoshi.calculationapplication.Fragments.CalculatedFragment;
import com.keeyoshi.calculationapplication.Fragments.RadiusFragment;
import com.keeyoshi.calculationapplication.Fragments.SwapNumberFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    private Button btnfirstfragments;
    private Boolean status=true;
    private Button btnSwaofragment;
    private Button btnAreaOfCircle;
    private Button AutoMorphic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnfirstfragments=findViewById(R.id.btnfirstfragments);
        btnSwaofragment=findViewById(R.id.btnSwapfragments);
        btnAreaOfCircle=findViewById(R.id.btnAreaCirclefragments);
        AutoMorphic=findViewById(R.id.btnAutoMorphic);
        AutoMorphic.setOnClickListener(this);




        btnfirstfragments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

                if(status){
                    CalculatedFragment calculatedFragment=new CalculatedFragment();
                    fragmentTransaction.replace(R.id.fragmentContainner,calculatedFragment);
                    fragmentTransaction.commit();
                    fragmentTransaction.addToBackStack(null);
                    btnfirstfragments.setText("Load Radius Fragments");
                    status=false;
                }else{

                    RadiusFragment radiusFragment=new RadiusFragment();
                    fragmentTransaction.replace(R.id.fragmentContainner,radiusFragment);
                    fragmentTransaction.commit();
                    fragmentTransaction.addToBackStack(null);
                    btnfirstfragments.setText("Load Calculation Fragments");
                    status=true;
                }
            }
        });
        btnSwaofragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                SwapNumberFragment tf=new SwapNumberFragment();
                fragmentTransaction.replace((R.id.fragmentContainner) ,tf);
                fragmentTransaction.commit();

            }
        });

        btnAreaOfCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                RadiusFragment second_fragments=new RadiusFragment();
                fragmentTransaction.replace((R.id.fragmentContainner),second_fragments);
                fragmentTransaction.commit();

            }
        });
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        Automorphic autoMorphic=new Automorphic();
        fragmentTransaction.replace(R.id.fragmentContainner,autoMorphic);
        fragmentTransaction.commit();
    }
}




