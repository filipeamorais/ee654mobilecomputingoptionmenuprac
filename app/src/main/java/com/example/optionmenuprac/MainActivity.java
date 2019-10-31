package com.example.optionmenuprac;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.option1:
                Toast.makeText(getApplicationContext(),
                        "Option A", Toast.LENGTH_LONG).show();
                return true;
            case R.id.option2:
                Toast.makeText(getApplicationContext(), "Option B", 2);
                return true;
            case R.id.option3:
                Toast.makeText(getApplicationContext(), "Option C", 2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }





}
