package com.marinakhrolenko.mynavigationdrawer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Toast;

import static android.view.View.inflate;

/**
 * Created by Администратор on 11.02.2015.
 */
public class WebFragment extends Fragment{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        super.onCreate(savedInstanceState);
    }

    WebView mWeb;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.frag3,container,false);

        mWeb=(WebView) v.findViewById(R.id.web);
        mWeb.loadUrl("https://www.google.com.ua");

        return v;



    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

        inflater.inflate(R.menu.frag1, menu);

          super.onCreateOptionsMenu(menu, inflater);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

         mWeb.reload();

        return super.onOptionsItemSelected(item);
    }
}
