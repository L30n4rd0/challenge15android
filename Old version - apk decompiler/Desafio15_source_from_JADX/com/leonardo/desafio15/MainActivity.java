package com.leonardo.desafio15;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnDragListener;
import android.view.View.OnTouchListener;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {
    private Chronometer chronometer;
    private boolean chronometerPaused;
    private ImageView imageViewStart;
    private ArrayList<ImageView> images;
    private long timeWhenStoped;
    private float xCoordinateFreeSpace;
    private float yCoordinateFreeSpace;

    /* renamed from: com.leonardo.desafio15.MainActivity.1 */
    class C04501 implements Runnable {
        private SharedPreferences mySharedPreferences;
        private boolean test;

        C04501() {
            this.test = true;
            this.mySharedPreferences = PreferenceManager.getDefaultSharedPreferences(MainActivity.this.getApplicationContext());
        }

        public void run() {
            while (this.test) {
                Log.i("Thread", "Execultando");
                if (((double) ((ImageView) MainActivity.this.images.get(0)).getX()) != 0.0d) {
                    MainActivity.this.images.set(MainActivity.this.images.size() - 1, null);
                    Iterator it = MainActivity.this.images.iterator();
                    while (it.hasNext()) {
                        ImageView view = (ImageView) it.next();
                        if (view != null) {
                            view.setX(this.mySharedPreferences.getFloat(view.getTag() + "x", view.getX()));
                            view.setY(this.mySharedPreferences.getFloat(view.getTag() + "y", view.getY()));
                        }
                    }
                    MainActivity.this.xCoordinateFreeSpace = this.mySharedPreferences.getFloat("xCoordinateFreeSpace", -1.0f);
                    MainActivity.this.yCoordinateFreeSpace = this.mySharedPreferences.getFloat("yCoordinateFreeSpace", -1.0f);
                    MainActivity.this.imageViewStart.setX(this.mySharedPreferences.getFloat("xImageViewStart", MainActivity.this.imageViewStart.getX()));
                    MainActivity.this.imageViewStart.setY(this.mySharedPreferences.getFloat("yImageViewStart", MainActivity.this.imageViewStart.getY()));
                    this.test = false;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.leonardo.desafio15.MainActivity.2 */
    class C04512 implements OnClickListener {
        C04512() {
        }

        public void onClick(DialogInterface arg0, int arg1) {
            MainActivity.this.restoreImagesPositions();
            Toast.makeText(MainActivity.this.getApplicationContext(), "Jogo restaurado!", 1).show();
        }
    }

    /* renamed from: com.leonardo.desafio15.MainActivity.3 */
    class C04523 implements OnClickListener {
        C04523() {
        }

        public void onClick(DialogInterface dialog, int which) {
            MainActivity.this.gameReset();
            Toast.makeText(MainActivity.this.getApplicationContext(), "Novo jogo iniciado!", 1).show();
        }
    }

    class MyOnClickListener implements View.OnClickListener {
        private int indexOfCurrentImage;
        private int indexOfNullImage;
        private float xCoordinateTemp;
        private float yCoordinateTemp;

        private MyOnClickListener() {
        }

        public void onClick(View v) {
            if (((Integer) v.getTag()).intValue() == 0) {
                MainActivity.this.xCoordinateFreeSpace = v.getX();
                MainActivity.this.yCoordinateFreeSpace = v.getY();
                this.indexOfCurrentImage = MainActivity.this.images.indexOf(v);
                v.setVisibility(4);
                MainActivity.this.images.set(this.indexOfCurrentImage, null);
                if (MainActivity.this.chronometerPaused) {
                    MainActivity.this.chronometerStart();
                }
            } else if ((v.getX() + ((float) v.getWidth()) == MainActivity.this.xCoordinateFreeSpace && v.getY() + ((float) v.getHeight()) == MainActivity.this.yCoordinateFreeSpace + ((float) v.getHeight())) || ((v.getX() - ((float) v.getWidth()) == MainActivity.this.xCoordinateFreeSpace && v.getY() + ((float) v.getHeight()) == MainActivity.this.yCoordinateFreeSpace + ((float) v.getHeight())) || ((v.getY() + ((float) v.getHeight()) == MainActivity.this.yCoordinateFreeSpace && v.getX() + ((float) v.getWidth()) == MainActivity.this.xCoordinateFreeSpace + ((float) v.getWidth())) || (v.getY() - ((float) v.getHeight()) == MainActivity.this.yCoordinateFreeSpace && v.getX() + ((float) v.getWidth()) == MainActivity.this.xCoordinateFreeSpace + ((float) v.getWidth()))))) {
                Log.i("w", v.getWidth() + BuildConfig.FLAVOR);
                Log.i("wl", v.getLayoutParams().width + BuildConfig.FLAVOR);
                if (MainActivity.this.chronometerPaused) {
                    MainActivity.this.chronometerStart();
                }
                this.xCoordinateTemp = v.getX();
                this.yCoordinateTemp = v.getY();
                v.setX(MainActivity.this.xCoordinateFreeSpace);
                v.setY(MainActivity.this.yCoordinateFreeSpace);
                MainActivity.this.xCoordinateFreeSpace = this.xCoordinateTemp;
                MainActivity.this.yCoordinateFreeSpace = this.yCoordinateTemp;
                this.indexOfCurrentImage = MainActivity.this.images.indexOf(v);
                this.indexOfNullImage = MainActivity.this.images.indexOf(null);
                MainActivity.this.images.set(this.indexOfNullImage, (ImageView) v);
                MainActivity.this.images.set(this.indexOfCurrentImage, null);
                MainActivity.this.checkMove();
            }
        }
    }

    class MyOnDragListener implements OnDragListener {
        private int action;
        private float oldX_eventOnDraging;
        private float oldX_viewOnDraging;
        private float oldY_eventOnDraging;
        private float oldY_viewOnDraging;
        private View viewOnDragging;

        private MyOnDragListener() {
        }

        public boolean onDrag(View v, DragEvent event) {
            this.action = event.getAction();
            this.viewOnDragging = (View) event.getLocalState();
            switch (this.action) {
                case ConnectionResult.SERVICE_MISSING /*1*/:
                    Log.i("STARTED", "executed");
                    this.oldX_eventOnDraging = event.getX();
                    this.oldY_eventOnDraging = event.getY();
                    this.oldX_viewOnDraging = this.viewOnDragging.getX();
                    this.oldY_viewOnDraging = this.viewOnDragging.getY();
                    break;
                case ConnectionResult.SERVICE_VERSION_UPDATE_REQUIRED /*2*/:
                    Log.i("viewOnDragging.getWidth", this.viewOnDragging.getWidth() + BuildConfig.FLAVOR);
                    Log.i("viewOnDragging.getHeigh", this.viewOnDragging.getHeight() + BuildConfig.FLAVOR);
                    if (Math.abs(this.oldX_eventOnDraging - event.getX()) < ((float) this.viewOnDragging.getWidth()) || Math.abs(this.oldY_eventOnDraging - event.getY()) < ((float) this.viewOnDragging.getHeight())) {
                        Log.i("LOCATION", "executed  " + Math.abs(this.oldX_eventOnDraging - event.getX()));
                        this.viewOnDragging.setY(event.getY() - ((float) (this.viewOnDragging.getHeight() / 2)));
                        this.viewOnDragging.setX(event.getX() - ((float) (this.viewOnDragging.getWidth() / 2)));
                        break;
                    }
                case ConnectionResult.SERVICE_DISABLED /*3*/:
                    Log.i("DROP", "executed");
                    Log.i("ClipData", event.getClipData().getItemAt(0).getText() + BuildConfig.FLAVOR);
                    Log.i("getY", this.viewOnDragging.getY() + BuildConfig.FLAVOR);
                    this.viewOnDragging.setX(this.oldX_viewOnDraging + ((float) this.viewOnDragging.getWidth()));
                    break;
                case ConnectionResult.SIGN_IN_REQUIRED /*4*/:
                    Log.i("ENDED", "executed");
                    break;
                case ConnectionResult.INVALID_ACCOUNT /*5*/:
                    Log.i("ENTERED", "executed");
                    break;
                case ConnectionResult.RESOLUTION_REQUIRED /*6*/:
                    Log.i("EXITED", "executed");
                    break;
            }
            return true;
        }
    }

    class MyOnTouchListener implements OnTouchListener {
        private int action;
        private int indexOfCurrentImage;
        private int indexOfNullImage;
        private float xCoordinateTemp;
        private float yCoordinateTemp;

        private MyOnTouchListener() {
        }

        public boolean onTouch(View v, MotionEvent event) {
            this.action = event.getAction();
            switch (this.action) {
                case ConnectionResult.SUCCESS /*0*/:
                    Log.i("DOWN", "executed");
                    if (((Integer) v.getTag()).intValue() != 0) {
                        if ((v.getX() + ((float) v.getWidth()) == MainActivity.this.xCoordinateFreeSpace && v.getY() + ((float) v.getHeight()) == MainActivity.this.yCoordinateFreeSpace + ((float) v.getHeight())) || ((v.getX() - ((float) v.getWidth()) == MainActivity.this.xCoordinateFreeSpace && v.getY() + ((float) v.getHeight()) == MainActivity.this.yCoordinateFreeSpace + ((float) v.getHeight())) || ((v.getY() + ((float) v.getHeight()) == MainActivity.this.yCoordinateFreeSpace && v.getX() + ((float) v.getWidth()) == MainActivity.this.xCoordinateFreeSpace + ((float) v.getWidth())) || (v.getY() - ((float) v.getHeight()) == MainActivity.this.yCoordinateFreeSpace && v.getX() + ((float) v.getWidth()) == MainActivity.this.xCoordinateFreeSpace + ((float) v.getWidth()))))) {
                            if (MainActivity.this.chronometerPaused) {
                                MainActivity.this.chronometerStart();
                            }
                            this.xCoordinateTemp = v.getX();
                            this.yCoordinateTemp = v.getY();
                            v.setX(MainActivity.this.xCoordinateFreeSpace);
                            v.setY(MainActivity.this.yCoordinateFreeSpace);
                            MainActivity.this.xCoordinateFreeSpace = this.xCoordinateTemp;
                            MainActivity.this.yCoordinateFreeSpace = this.yCoordinateTemp;
                            this.indexOfCurrentImage = MainActivity.this.images.indexOf(v);
                            this.indexOfNullImage = MainActivity.this.images.indexOf(null);
                            MainActivity.this.images.set(this.indexOfNullImage, (ImageView) v);
                            MainActivity.this.images.set(this.indexOfCurrentImage, null);
                            MainActivity.this.checkMove();
                            break;
                        }
                    }
                    MainActivity.this.xCoordinateFreeSpace = v.getX();
                    MainActivity.this.yCoordinateFreeSpace = v.getY();
                    this.indexOfCurrentImage = MainActivity.this.images.indexOf(v);
                    v.setX(v.getX() - ((float) (v.getWidth() * 2)));
                    v.setY(v.getY() - ((float) ((v.getHeight() * 4) + (v.getHeight() / 3))));
                    MainActivity.this.images.set(this.indexOfCurrentImage, null);
                    if (MainActivity.this.chronometerPaused) {
                        MainActivity.this.chronometerStart();
                        break;
                    }
                    break;
                case ConnectionResult.SERVICE_MISSING /*1*/:
                    Log.i("UP", "executed");
                    break;
            }
            return true;
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0453R.layout.activity_main);
        Log.i("onCreate", "Executed");
        loadBanner();
        this.chronometerPaused = true;
        this.xCoordinateFreeSpace = -1.0f;
        this.xCoordinateFreeSpace = -1.0f;
        this.chronometer = (Chronometer) findViewById(C0453R.id.chronometer2);
        this.imageViewStart = (ImageView) findViewById(C0453R.id.imageViewStart);
        loadArrayListImages();
        setOnTouchListenerToImages();
    }

    protected void onStart() {
        super.onStart();
        Log.i("onStart", "Executed");
    }

    protected void onStop() {
        super.onStop();
        Log.i("onStop", "Executed");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i("onDestroy", "Executed");
    }

    protected void onPause() {
        super.onPause();
        Log.i("onPause", "Executed");
        if (!this.chronometerPaused && this.xCoordinateFreeSpace != -1.0f) {
            chronometerPause();
            storeImagesPositions();
        }
    }

    protected void onResume() {
        super.onResume();
        Log.i("onResume", "Executed");
        SharedPreferences mySharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        this.timeWhenStoped = mySharedPreferences.getLong("timeWhenStoped", 0);
        this.chronometer.setText(mySharedPreferences.getString("chronometerText", "00:00"));
        if (!this.chronometer.getText().toString().equals("00:00")) {
            createDialog();
        }
    }

    private void storeImagesPositions() {
        SharedPreferences mySharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        Iterator it = this.images.iterator();
        while (it.hasNext()) {
            ImageView view = (ImageView) it.next();
            if (view != null) {
                mySharedPreferences.edit().putFloat(view.getTag() + "x", view.getX()).apply();
                mySharedPreferences.edit().putFloat(view.getTag() + "y", view.getY()).apply();
            }
        }
        mySharedPreferences.edit().putFloat("xImageViewStart", this.imageViewStart.getX()).apply();
        mySharedPreferences.edit().putFloat("yImageViewStart", this.imageViewStart.getY()).apply();
        mySharedPreferences.edit().putFloat("xCoordinateFreeSpace", this.xCoordinateFreeSpace).apply();
        mySharedPreferences.edit().putFloat("yCoordinateFreeSpace", this.yCoordinateFreeSpace).apply();
    }

    private void restoreImagesPositions() {
        new Thread(new C04501()).start();
    }

    private void createDialog() {
        View viewDialog = getLayoutInflater().inflate(C0453R.layout.dialog_test, null);
        Builder alertDialogBuilder = new Builder(getLayoutInflater().getContext());
        alertDialogBuilder.setView(viewDialog);
        alertDialogBuilder.setTitle((CharSequence) "Existe um jogo n\u00e3o finalizado, deseja continuar?");
        alertDialogBuilder.setPositiveButton((int) C0453R.string.button_confirm, new C04512());
        alertDialogBuilder.setNegativeButton((int) C0453R.string.button_cancel, new C04523());
        alertDialogBuilder.create().show();
    }

    private void setOnClickListenerToImages() {
        Iterator it = this.images.iterator();
        while (it.hasNext()) {
            ImageView image = (ImageView) it.next();
            if (image != null) {
                image.setOnClickListener(new MyOnClickListener());
            }
        }
    }

    private void setOnTouchListenerToImages() {
        Iterator it = this.images.iterator();
        while (it.hasNext()) {
            ImageView image = (ImageView) it.next();
            if (image != null) {
                image.setOnTouchListener(new MyOnTouchListener());
            }
        }
    }

    private void initCoordinatesFreeSpace() {
        this.xCoordinateFreeSpace = 458.0f;
        this.yCoordinateFreeSpace = 348.0f;
    }

    private void loadArrayListImages() {
        this.images = new ArrayList();
        this.images.add((ImageView) findViewById(C0453R.id.imageView1));
        ((ImageView) this.images.get(this.images.size() - 1)).setTag(Integer.valueOf(1));
        this.images.add((ImageView) findViewById(C0453R.id.imageView14));
        ((ImageView) this.images.get(this.images.size() - 1)).setTag(Integer.valueOf(14));
        this.images.add((ImageView) findViewById(C0453R.id.imageView5));
        ((ImageView) this.images.get(this.images.size() - 1)).setTag(Integer.valueOf(5));
        this.images.add((ImageView) findViewById(C0453R.id.imageView7));
        ((ImageView) this.images.get(this.images.size() - 1)).setTag(Integer.valueOf(7));
        this.images.add((ImageView) findViewById(C0453R.id.imageView2));
        ((ImageView) this.images.get(this.images.size() - 1)).setTag(Integer.valueOf(2));
        this.images.add((ImageView) findViewById(C0453R.id.imageView10));
        ((ImageView) this.images.get(this.images.size() - 1)).setTag(Integer.valueOf(10));
        this.images.add((ImageView) findViewById(C0453R.id.imageView8));
        ((ImageView) this.images.get(this.images.size() - 1)).setTag(Integer.valueOf(8));
        this.images.add((ImageView) findViewById(C0453R.id.imageView6));
        ((ImageView) this.images.get(this.images.size() - 1)).setTag(Integer.valueOf(6));
        this.images.add((ImageView) findViewById(C0453R.id.imageView3));
        ((ImageView) this.images.get(this.images.size() - 1)).setTag(Integer.valueOf(3));
        this.images.add((ImageView) findViewById(C0453R.id.imageView4));
        ((ImageView) this.images.get(this.images.size() - 1)).setTag(Integer.valueOf(4));
        this.images.add((ImageView) findViewById(C0453R.id.imageView15));
        ((ImageView) this.images.get(this.images.size() - 1)).setTag(Integer.valueOf(15));
        this.images.add((ImageView) findViewById(C0453R.id.imageView11));
        ((ImageView) this.images.get(this.images.size() - 1)).setTag(Integer.valueOf(11));
        this.images.add((ImageView) findViewById(C0453R.id.imageView13));
        ((ImageView) this.images.get(this.images.size() - 1)).setTag(Integer.valueOf(13));
        this.images.add((ImageView) findViewById(C0453R.id.imageView9));
        ((ImageView) this.images.get(this.images.size() - 1)).setTag(Integer.valueOf(9));
        this.images.add((ImageView) findViewById(C0453R.id.imageView12));
        ((ImageView) this.images.get(this.images.size() - 1)).setTag(Integer.valueOf(12));
        this.images.add((ImageView) findViewById(C0453R.id.imageViewStart));
        ((ImageView) this.images.get(this.images.size() - 1)).setTag(Integer.valueOf(0));
    }

    private void chronometerPause() {
        SharedPreferences mySharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        this.chronometer.stop();
        this.timeWhenStoped = this.chronometer.getBase() - SystemClock.elapsedRealtime();
        this.chronometerPaused = true;
        mySharedPreferences.edit().putLong("timeWhenStoped", this.timeWhenStoped).apply();
        mySharedPreferences.edit().putString("chronometerText", this.chronometer.getText().toString()).apply();
    }

    private void chronometerStart() {
        this.chronometer.setBase(SystemClock.elapsedRealtime() + this.timeWhenStoped);
        this.chronometer.start();
        this.chronometerPaused = false;
    }

    private void loadBanner() {
        AdRequest.Builder adRequestBuilder = new AdRequest.Builder();
        adRequestBuilder.addTestDevice(SearchAdRequest.DEVICE_ID_EMULATOR);
        adRequestBuilder.addTestDevice("E81B2658F8501C8429615429E4180E8B");
        ((AdView) findViewById(C0453R.id.adView)).loadAd(adRequestBuilder.build());
    }

    private void checkMove() {
        int i = 0;
        while (this.images.get(i) != null && ((Integer) ((ImageView) this.images.get(i)).getTag()).intValue() == i + 1) {
            i++;
        }
        if (i == this.images.size() - 1) {
            Toast.makeText(getApplicationContext(), "Parab\u00e9ns vc conseguiu!", 1).show();
            gameReset();
        }
    }

    private void gameReset() {
        chronometerPause();
        PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit().clear().apply();
        this.chronometer.setText("00:00");
        this.timeWhenStoped = 0;
    }

    private void showArray() {
        Iterator it = this.images.iterator();
        while (it.hasNext()) {
            ImageView view = (ImageView) it.next();
            if (view == null) {
                Log.i("Tag", "null");
            } else {
                Log.i("Tag", view.getTag().toString());
                Log.i("X", view.getX() + BuildConfig.FLAVOR);
            }
        }
    }
}
