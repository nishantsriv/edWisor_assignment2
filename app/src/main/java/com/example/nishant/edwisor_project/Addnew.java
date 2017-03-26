package com.example.nishant.edwisor_project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class Addnew extends AppCompatActivity {
    ImageView imageView;
    EditText editText;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addnew);
        imageView = (ImageView) findViewById(R.id.imageshow);
        editText = (EditText) findViewById(R.id.titleadd);
        preferences = getSharedPreferences("pref", MODE_PRIVATE);

    }

    public void addimage(View view) {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("image/*");
        startActivityForResult(intent, 10);
    }

    public void add(View view) {
        SharedPreferences.Editor editor = preferences.edit();
        if (!(editText.getText().toString().equals(""))) {
            editor.putString("title", editText.getText().toString());
            Toast.makeText(this, "Title Saved", Toast.LENGTH_SHORT).show();
        } else if (editText.getText().toString().equals("")) {
            editor.putString("title", "null");

            Toast.makeText(this, "Empty Title ,Not saved", Toast.LENGTH_SHORT).show();
        }
        editor.apply();
        finish();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK && requestCode == 10) {
            Uri imageuri = data.getData();
            InputStream inputStream;
            try {
                inputStream = getContentResolver().openInputStream(imageuri);
                Bitmap image = BitmapFactory.decodeStream(inputStream);
                imageView.setImageBitmap(image);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }
    }
}
