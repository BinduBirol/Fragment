package com.bindubirolgmail.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Sherlock Holmes on 3/28/2018.
 */

public class BottomSectionFragment extends Fragment{
    private  TextView top;
    private  TextView bottom;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_section_fragment, container, false);

        top= (TextView) view.findViewById(R.id.b_top);
        bottom= (TextView) view.findViewById(R.id.b_bottom);

        return view;
    }

    public void setMemeText(String top, String bottom){
        this.top.setText(top);
        this.bottom.setText(bottom);
    }
}
