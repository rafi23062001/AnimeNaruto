package com.rafi.training.menuapp;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class FakeFragment extends Fragment {


    public static FakeFragment newInstance(int pos,String Text){
        FakeFragment fakeFragment = new FakeFragment();
        Bundle args = new Bundle();
        args.putInt("position", pos);
        args.putString("Text", Text);
        fakeFragment.setArguments(args);
        return fakeFragment;
    }

    public FakeFragment() {
        // Required empty public constructor
    }

    private TextView textData;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview=inflater.inflate(R.layout.fragment_fake, container, false);

        textData=rootview.findViewById(R.id.tv_rumah);
        return rootview;
    }

}
