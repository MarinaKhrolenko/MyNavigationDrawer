package com.marinakhrolenko.mynavigationdrawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Администратор on 11.02.2015.
 */
public class TextFragment2 extends Fragment{

    private String mItem;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args = getArguments();
        if (args != null) {
            mItem = args.getString("item");
        }
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.frag2,container,false);

        TextView tvF1=(TextView) v.findViewById(R.id.tvF2);

        if (!TextUtils.isEmpty(mItem)) {
            tvF1.setText(mItem);
        }
        return v;
    }

    public static TextFragment2 newInstance(String someStr) {

        TextFragment2 frag = new TextFragment2();
        Bundle args = new Bundle();
        args.putString("item", someStr);
        frag.setArguments(args);

        return frag;
    }
}
