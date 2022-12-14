package com.example.arapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class FolderActivity extends AppCompatActivity {


    ImageView imgmonuments,imgactivity,imghistory,imgpdf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_folder);
        imgmonuments = findViewById(R.id.imgmonuments);
        imghistory = findViewById(R.id.imghistory);
        imgactivity = findViewById(R.id.imgactivity);
        imgpdf = findViewById(R.id.imgpdf);
        imgmonuments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FolderActivity.this,AfterLauncherActivity.class);
                startActivity(intent);
            }
        });
        imghistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FolderActivity.this, AfterLauncherActivity2.class);
                startActivity(intent);
            }
        });
        imgactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FolderActivity.this,Activity2Activity.class);
                startActivity(intent);
            }
        });
        imgpdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
<<<<<<< HEAD
////                Toast.makeText(FolderActivity.this,"Coming Soon!!!",Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(Intent.ACTION_VIEW);
////                startActivity(intent);
//                intent.setData(Uri.parse("https://drive.google.com/file/d/1K8C3aPr6FjUsPZP2_8ImEa7_dIKLq4yd/view?usp=sharing"));
//                startActivity(intent);
//                Intent intent = new Intent();
//                intent.setAction(Intent.ACTION_VIEW);
//                intent.addCategory(Intent.CATEGORY_BROWSABLE);
//                intent.setData(Uri.parse("https://drive.google.com/file/d/1K8C3aPr6FjUsPZP2_8ImEa7_dIKLq4yd/view?usp=sharing"));
//                startActivity(intent);
=======
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1K8C3aPr6FjUsPZP2_8ImEa7_dIKLq4yd/view?usp=sharing"));
                startActivity(intent);
>>>>>>> fa881f17b690e0e71e8715a9ea11f7c9d6afb65d
            }
        });
    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(FolderActivity.this);
        builder.setMessage("Do you want to close the app");
        builder.setTitle("Alert!");
        builder.setCancelable(false);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
                dialog.dismiss();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder.show();
    }
}