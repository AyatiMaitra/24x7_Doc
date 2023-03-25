package com.example.introduction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class selfcare extends AppCompatActivity {
    TextView HyperLink;
    Spanned Text;

    TextView HyperLink1;
    Spanned Text1;

    TextView HyperLink2;
    Spanned Text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selfcare);
        HyperLink = (TextView)findViewById(R.id.textView2);

        Text = Html.fromHtml("<br>● For skincare advice from experts:<br>" +
                "<a href='https://www.skincare.com/'>Skincare.com</a>");

        HyperLink.setMovementMethod(LinkMovementMethod.getInstance());
        HyperLink.setText(Text);

        HyperLink1 = (TextView)findViewById(R.id.textView3);

        Text1 = Html.fromHtml("<br>● For healthCare advice from NIH:<br> " +
                "<a href='http://www.nih.gov/'>HealthCare.com</a>");

        HyperLink1.setMovementMethod(LinkMovementMethod.getInstance());
        HyperLink1.setText(Text1);

        HyperLink2 = (TextView)findViewById(R.id.textView4);

        Text2 = Html.fromHtml("<br>● For Covid 19 precautions given by WHO:<br> " +
                "<a href='https://www.who.int/southeastasia/outbreaks-and-emergencies/novel-coronavirus-2019/protective-measures'>covid19.com</a>");

        HyperLink2.setMovementMethod(LinkMovementMethod.getInstance());
        HyperLink2.setText(Text2);

    }
}
