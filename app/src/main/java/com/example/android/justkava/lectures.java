package com.example.android.justkava;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.*;
import android.util.Log;
import android.view.View;

/**
 * Created by shubhankitsingh on 06/12/19.
 *
 */

public class lectures extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.skill_cooking);
    }
  /* TextView num=(TextView)findViewById(R.id.numbers);
    TextView fam=(TextView)findViewById(R.id.family);
    TextView col=(TextView)findViewById(R.id.colors);
    TextView phr=(TextView)findViewById(R.id.phrases);*/

    public void Lectur1(View view)
    {

        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Il7qwg3vyVU&list=PLHKsrffpkToFORIQ1heaTFYMh7uWG9OmM")));
        Log.i("Video", "Video Playing....");

//        Intent ob = new Intent(this,NumbersActivity.class);
//        startActivity(ob);
    }
    public void Lecture2(View view)
    {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Il7qwg3vyVU&list=PLHKsrffpkToFORIQ1heaTFYMh7uWG9OmM")));
        Log.i("Video", "Video Playing....");

//        Intent ob = new Intent(this,FamilyMembersActivity.class);
//        startActivity(ob);
    }
    public void Lecture3(View view)
    {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Il7qwg3vyVU&list=PLHKsrffpkToFORIQ1heaTFYMh7uWG9OmM")));
        Log.i("Video", "Video Playing....");

//        Intent ob = new Intent(this,ColorsActivity.class);
//        startActivity(ob);
    }
    public void Lecture4(View view)
    {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Il7qwg3vyVU&list=PLHKsrffpkToFORIQ1heaTFYMh7uWG9OmM")));
        Log.i("Video", "Video Playing....");

//        Intent ob = new Intent(this,PhrasesActivity.class);
//        startActivity(ob);
    }
    public void Lecture5(View view)
    {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Il7qwg3vyVU&list=PLHKsrffpkToFORIQ1heaTFYMh7uWG9OmM")));
        Log.i("Video", "Video Playing....");

//        Intent ob = new Intent(this,NumbersActivity.class);
//        startActivity(ob);
    }
    public void Lecture6(View view)
    {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Il7qwg3vyVU&list=PLHKsrffpkToFORIQ1heaTFYMh7uWG9OmM")));
        Log.i("Video", "Video Playing....");

//        Intent ob = new Intent(this,FamilyMembersActivity.class);
//        startActivity(ob);
    }
    public void Resource1(View view)
    {
        startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("http://docs.whirlpool.eu/_doc/Cookbook_Mwo_only_501912000448EN.pdf")));
    }
}
