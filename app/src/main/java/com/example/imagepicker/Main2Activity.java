package com.example.imagepicker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Main2Activity extends AppCompatActivity {


    private Button save, cancel;
    private EditText name, desc, location;
    private DatabaseReference dbref;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        dbref = FirebaseDatabase.getInstance().getReference("Attractions");
        Intent i = getIntent();
        final String donwloadURL = i.getStringExtra("url");

        save = findViewById(R.id.id_save);
        cancel = findViewById(R.id.id_cancel);

        name = findViewById(R.id.et_name);
        desc = findViewById(R.id.et_desc);
        location = findViewById(R.id.et_location);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Attractions attr = new Attractions(name.getText().toString(), desc.getText().toString(), location.getText().toString(), donwloadURL, "", false);
                dbref.child(attr.getName()).setValue(attr);
            }
        });

    }
}
