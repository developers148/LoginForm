package com.toumal.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
ImageButton imagebutton;
RelativeLayout mylayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagebutton = findViewById(R.id.imagebutton);
        mylayout = findViewById(R.id.mylayout);


        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopup(view);
            }
        });
        mylayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopup(view);
            }
        });

    }


    private void showPopup(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        // Inflate the menu from xml
        popup.getMenuInflater().inflate(R.menu.popup, popup.getMenu());
        // Setup menu item selection
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menuitem1:
                        Toast.makeText(MainActivity.this, "troy", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.menuitem2:
                        Toast.makeText(MainActivity.this, "300 Rise of Empire", Toast.LENGTH_SHORT).show();
                        return true;
                    default:
                        return false;
                }
            }
        });
        // Handle dismissal with: popup.setOnDismissListener(...);
        // Show the menu
        popup.show();
    }


}
