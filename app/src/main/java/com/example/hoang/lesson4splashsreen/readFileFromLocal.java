package com.example.hoang.lesson4splashsreen;

import android.os.AsyncTask;
import android.os.Environment;
import android.util.Log;

import java.io.File;
import java.io.FileFilter;
import java.util.Collections;
import java.util.List;

public class readFileFromLocal extends AsyncTask<String, Integer, File[]> {

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected File[] doInBackground(String... strings) {
        File file = new File(strings[0]);
        File[] listImage = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.getAbsolutePath().endsWith(".png")
                        || file.getAbsolutePath().endsWith(".jpg")
                        || file.getAbsolutePath().endsWith("jpeg");
            }
        });
        return listImage;
    }

    @Override
    protected void onPostExecute(File[] files) {
        super.onPostExecute(files);

    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
    }
}


