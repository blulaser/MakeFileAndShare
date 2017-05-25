package com.example.administrator.myapplication;


import android.content.Intent;
import android.net.Uri;



public class ShareActivity {
    Intent share()
    {

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);

        intent.setType("application/octet-stream");
        intent.putExtra(Intent.EXTRA_STREAM, Uri.parse("file:///storage/emulated/0/temp/1.ics"));

        
        Intent chooser = Intent.createChooser(intent, "공유");

        return chooser;

    }

}
