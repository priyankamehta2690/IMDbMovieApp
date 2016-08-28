package com.example.imdbmovieapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView movieName;
    Button searchIMDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movieName = (TextView) findViewById(R.id.tv_FindMovies);
        searchIMDb = (Button) findViewById(R.id.btn_SearchIMDb);

        setupActionBar();
        searchIMDb.setOnClickListener(sendIntent);

    }//end On Create

//==================================
private void setupActionBar(){

    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    actionBar.setDisplayShowHomeEnabled(true);
    actionBar.setIcon(R.mipmap.ic_launcher);
// actionBar.setTitle("Search Movies");
    //actionBar.setTitle();

}//End setupActionBar

//==================================
View.OnClickListener sendIntent = new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if(!movieName.getText().toString().isEmpty())
        {
            Log.d("Search Trem", "=" + movieName.getText().toString());
            Intent intent = new Intent(MainActivity.this,SearchMovieActivity.class);
            intent.putExtra("SEARCH_TERM", movieName.getText().toString());
            startActivity(intent);
            finish();
        }
        else
            Toast.makeText(getApplicationContext(),"Enter a movie name",Toast.LENGTH_LONG).show();
    }
};//end SendIntent

}//end