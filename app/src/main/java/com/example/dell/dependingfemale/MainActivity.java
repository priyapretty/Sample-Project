package com.example.dell.dependingfemale;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity implements TextView.OnEditorActionListener, View.OnClickListener {
    EditText etheight, etshoulder, etchest, etwaist, ethips, etinseam;
    Button btnlogin;
    int height,shoulder, chest,waist, hips,inseam;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    private void initialize() {
        etheight = (EditText) findViewById(R.id.etheight);
        etshoulder = (EditText) findViewById(R.id.etshoulder);
        etchest = (EditText) findViewById(R.id.etchest);
        etwaist = (EditText) findViewById(R.id.etwaist);
        ethips = (EditText) findViewById(R.id.ethips);
        etinseam = (EditText) findViewById(R.id.etinseam);
        btnlogin = (Button) findViewById(R.id.btnlogin);
        Event();

    }

    private void Event() {
        btnlogin.setOnClickListener(this);

//        etheight.setOnEditorActionListener(this);
//        etshoulder.setOnEditorActionListener(this);
//        etchest.setOnEditorActionListener(this);
//        etwaist.setOnEditorActionListener(this);
//        ethips.setOnEditorActionListener(this);
//        etinseam.setOnEditorActionListener(this);

    }

    @Override
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == EditorInfo.IME_ACTION_NEXT) {
            Validation();
        }
        return false;
    }

    private void Validation() {
        int i1 = Integer.parseInt(etheight.getText().toString());
//        int i2 = Integer.parseInt(etshoulder.getText().toString());
//        int i3 = Integer.parseInt(etchest.getText().toString());
//        int i4 = Integer.parseInt(etwaist.getText().toString());
//        int i5 = Integer.parseInt(ethips.getText().toString());
//        int i6 = Integer.parseInt(etinseam.getText().toString());


    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.btnlogin:
                sizeCheck();
                break;
        }
    }

    private void sizeCheck() {

        if (etheight.getText().toString().isEmpty()) {
            etheight.setError(getString(R.string.EMPTY));
        } else if (etshoulder.getText().toString().isEmpty()) {
            etshoulder.setError(getString(R.string.EMPTY));
        } else if (etchest.getText().toString().isEmpty()) {
            etchest.setError(getString(R.string.EMPTY));
        } else if (etwaist.getText().toString().isEmpty()) {
            etwaist.setError(getString(R.string.EMPTY));
        } else if (ethips.getText().toString().isEmpty()) {
            ethips.setError(getString(R.string.EMPTY));
        } else if (etinseam.getText().toString().isEmpty()) {
            etinseam.setError(getString(R.string.EMPTY));
        } else {
            height=Integer.parseInt(etheight.getText().toString());
            shoulder = Integer.parseInt(etshoulder.getText().toString());
            chest=Integer.parseInt(etchest.getText().toString());
            waist = Integer.parseInt(etwaist.getText().toString());
            hips = Integer.parseInt(ethips.getText().toString());
            inseam=Integer.parseInt(etinseam.getText().toString());
            size();
            sizes();
        }
    }


    private void size() {
        if ((height>121)&&(height<182)) {
//            Toast.makeText(MainActivity.this,""+height, Toast.LENGTH_SHORT).show();
        } else {
            etheight.setError(getString(R.string.ENTER_CORRECT_SIZE));
        }
        if ((shoulder > 29) && (shoulder < 53)) {
//            Toast.makeText(MainActivity.this, shoulder, Toast.LENGTH_SHORT).show();
        } else {
            etshoulder.setError(getString(R.string.ENTER_CORRECT_SIZE));

        }
        if((chest>25)&&(chest<47)){
//            Toast.makeText(MainActivity.this,chest,Toast.LENGTH_SHORT).show();
        } else {
            etchest.setError(getString(R.string.ENTER_CORRECT_SIZE));
        }
        if ((waist > 23) && (waist < 44)) {
//            Toast.makeText(MainActivity.this, waist, Toast.LENGTH_SHORT).show();

        } else {
            etwaist.setError(getString(R.string.ENTER_CORRECT_SIZE));

        }
        if ((hips > 29) && (hips < 58)) {
//            Toast.makeText(MainActivity.this, hips, Toast.LENGTH_SHORT).show();

        } else {
            ethips.setError(getString(R.string.ENTER_CORRECT_SIZE));

        }
        if((inseam>29)&&(inseam)<58){
//            Toast.makeText(MainActivity.this,inseam,Toast.LENGTH_SHORT).show();
        } else {
            etinseam.setError(getString(R.string.ENTER_CORRECT_SIZE));
        }

    }

    private void sizes() {
        if ((shoulder > 29 && shoulder < 35) && (waist > 23 && waist < 28) && (hips > 29 && hips < 34)) {
            Toast.makeText(getBaseContext(), "size is XS", Toast.LENGTH_SHORT).show();
        } else if ((shoulder > 33 && shoulder < 38) && (waist > 26 && waist < 30) && (hips > 32 && hips < 38)) {
            Toast.makeText(getBaseContext(), "size is S", Toast.LENGTH_SHORT).show();
        } else if ((shoulder > 36 && shoulder < 41) && (waist > 28 && waist < 33) && (hips > 36 && hips < 42)) {
            Toast.makeText(getBaseContext(), "size is M", Toast.LENGTH_SHORT).show();
        } else if ((shoulder > 39 && shoulder < 44) && (waist > 31 && waist < 36) && (hips > 40 && hips < 46)) {
            Toast.makeText(getBaseContext(), "size is L", Toast.LENGTH_SHORT).show();
        } else if ((shoulder > 42 && shoulder < 47) && (waist > 34 && waist < 39) && (hips > 44 && hips < 50)) {
            Toast.makeText(getBaseContext(), "size is XL", Toast.LENGTH_SHORT).show();
        } else if ((shoulder > 45 && shoulder < 50) && (waist > 37 && waist < 42) && (hips > 48 && hips < 54)) {
            Toast.makeText(getBaseContext(), "size is 2XL", Toast.LENGTH_SHORT).show();
        } else if ((shoulder > 48 && shoulder < 53) && (waist > 40 && waist < 44) && (hips > 52 && hips < 58)) {
            Toast.makeText(getBaseContext(), "size is 3XL", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getBaseContext(), "INVALID ", Toast.LENGTH_SHORT).show();
        }
    }

}
