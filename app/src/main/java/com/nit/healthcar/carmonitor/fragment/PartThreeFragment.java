package com.nit.healthcar.carmonitor.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.PatternMatcher;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.nit.healthcar.carmonitor.ActivityAll;
import com.nit.healthcar.carmonitor.EditAccount;
import com.nit.healthcar.carmonitor.R;

public class PartThreeFragment extends Fragment implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment3, container, false);

        LinearLayout linearLayout = view.findViewById(R.id.input_layout_version);

        linearLayout.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View view){
        switch (view.getId()){

            case R.id.input_layout_version:
                LinearLayout linearLayout = view.findViewById(R.id.input_layout_version);
                startActivity(new Intent(linearLayout.getContext(), EditAccount.class));
                break;
        }
    }

}
