package com.example.shihab.menuu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_home:
                Toast.makeText(this,"Home",Toast.LENGTH_SHORT).show();
            break;

            case R.id.menu_update:
                Toast.makeText(this,"Update",Toast.LENGTH_SHORT).show();
            break;

            case R.id.menu_delete:
                Toast.makeText(this,"Delete",Toast.LENGTH_SHORT).show();
            break;

            case R.id.menu_theme:
                Toast.makeText(this,"Theme",Toast.LENGTH_SHORT).show();
            break;

            case R.id.menu_settings:
                Toast.makeText(this,"Setting",Toast.LENGTH_SHORT).show();
            break;
        }

       return super.onOptionsItemSelected(item);
    }
}
