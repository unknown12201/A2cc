package com.example.myapplication;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    Button b;


    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        b = (Button) findViewById(R.id.button);

        registerForContextMenu(b); // to register the menu to the specific button

    }


    @Override // creates the Context Menu by using the resource in menu.xml

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        super.onCreateContextMenu(menu, v, menuInfo);

//MenuInflater is required to create a menu object from the xml resource.

        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.menu, menu);  //first parameter R.menu.My_menu is the xml, second parameter menu is the pbject to create/inflate

    }


    @Override
//after creating the context menu , do specific operations on the options selected.

    public boolean onContextItemSelected(MenuItem item) {


        if (item.getItemId() == R.id.item1)

            Toast.makeText(getApplicationContext(), "YOU CLICKED ITEM1", Toast.LENGTH_SHORT).show();

        else {

            Toast.makeText(getApplicationContext(), "YOU CLKICKED OPTION 3", Toast.LENGTH_LONG).show();


        }

        return true;

    }
}