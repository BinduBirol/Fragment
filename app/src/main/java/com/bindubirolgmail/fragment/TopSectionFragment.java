package com.bindubirolgmail.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class TopSectionFragment extends Fragment{
    private static EditText toptextinput;
    private static EditText bottomtextinput;
    private Button button;

    TopsectionListener activityCommander;

    public interface TopsectionListener{
        public void createMeme(String top, String Bottom);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            activityCommander= (TopsectionListener) activity;
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_section_fragment, container, false);

        toptextinput= (EditText) view.findViewById(R.id.toptext);
        bottomtextinput= (EditText) view.findViewById(R.id.bottomtext);
        button= (Button) view.findViewById(R.id.button);

        button.setOnClickListener(
               new View.OnClickListener(){
                   public void onClick(View v){
                       buttonClicked(v);
                   }
               }
        );
        return view;
    }

    public void buttonClicked(View v){
        activityCommander.createMeme(toptextinput.getText().toString(),bottomtextinput.getText().toString());
    }
}
