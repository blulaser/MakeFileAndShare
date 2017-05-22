package com.example.administrator.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;

import java.io.File;

/**
 * Created by Administrator on 2017-05-22.
 */

public class ShareActivity {
    Intent share()
    {
        File fileRoute = null;
        fileRoute = Environment.getExternalStorageDirectory();

        Intent intent = new Intent();

        intent.setAction(Intent.ACTION_SEND);



        intent.putExtra(Intent.EXTRA_STREAM, Uri.parse(fileRoute+"/temp/"+"1.jpg"));
        intent.setType("image/*");


        Intent chooser = Intent.createChooser(intent, "공유");

        return chooser;

    }

}
