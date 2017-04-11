package com.ilkaytasli.acilaramalar;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * Created by İlkay Taşlı on 11.02.2017.
 */

public class Hakkinda extends AppCompatActivity implements View.OnClickListener {
    private Typeface mTypeface = null;

    public Typeface getTypeface() {
        return mTypeface;
    }
    ConnectivityManager cm;
    NetworkInfo activeNetwork;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hakkinda);
        TextView tcontent = (TextView)findViewById(R.id.textViewalt);
        TextView turkTelekom = (TextView) findViewById(R.id.turktelekom);
        TextView turkcell = (TextView) findViewById(R.id.turkcell);
        TextView vodafone = (TextView) findViewById(R.id.vodafone);
        turkTelekom.setOnClickListener(this);
        turkcell.setOnClickListener(this);
        vodafone.setOnClickListener(this);
        cm = (ConnectivityManager) this.getSystemService(Context.CONNECTIVITY_SERVICE);
    }

    @Override
    public void onClick(View v) {
        activeNetwork = cm.getActiveNetworkInfo();
        if (activeNetwork != null) {
            if (activeNetwork.getType() == ConnectivityManager.TYPE_WIFI) {
                connect(v);
            }
            else if (activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE) {
                connect(v);
            }
        }
        else {
            Toast.makeText(this.getApplicationContext(),"İnternet bağlantınızı açmanız gerekmektedir.",Toast.LENGTH_LONG).show();
        }

    }
    public void connect(View v)
    {
        switch(v.getId())
        {
            case R.id.turktelekom:
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://kurumsal.turktelekom.com.tr/buyuk-kurumlar/hizmetler/ses-hizmetleri/cagri-karsilama-hizmetleri/3-haneli-ozel-servis-numaralari.aspx"));
                startActivity(i);
                break;
            case R.id.turkcell:
                Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.turkcell.com.tr/yardim/hattiniz/sikca-sorulan-sorular/ozel-servis-numaralari"));
                startActivity(i2);
                break;
            case R.id.vodafone:
                Intent i3 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.vodafone.com.tr/Tarifeler/kisa-numaralar.php"));
                startActivity(i3);
                break;
        }
    }
}
