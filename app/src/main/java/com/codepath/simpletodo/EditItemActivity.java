package com.codepath.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    private final int REQUEST_CODE = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        editText = (EditText)findViewById(R.id.editText);
        String textToEdit = getIntent().getStringExtra("data");
        editText.setText(textToEdit);
        editText.requestFocus();
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
                                      @Override
                                      public void onClick(View view) {
                                          Intent i = new Intent();
                                          i.putExtra("newItem", editText.getText().toString());
                                          setResult(RESULT_OK, i);
                                          finish();
                                      }
                                  });
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }




}