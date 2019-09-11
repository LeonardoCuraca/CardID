package com.lcuraca.tecsup.cardid;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

import com.google.zxing.BarcodeFormat;
import com.journeyapps.barcodescanner.BarcodeEncoder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            String dni = "98465115";
            BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
            Bitmap bitmap = barcodeEncoder.encodeBitmap(dni, BarcodeFormat.CODE_128, 400, 160);
            ImageView imageViewQrCode = (ImageView) findViewById(R.id.barcode);
            imageViewQrCode.setImageBitmap(bitmap);
        } catch(Exception e) {

        }

    }
}
