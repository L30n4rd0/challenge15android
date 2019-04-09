package com.leosouzatech.challenge15android;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Chronometer chronometer;
    private boolean chronometerPaused;
    private ImageView imageViewStart;
    private List<ImageView> imageViewList;
    private long timeWhenStoped;
    private float xCoordinateFreeSpace;
    private float yCoordinateFreeSpace;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("onCreate", "Executed");
//        loadBanner();
        this.chronometerPaused = true;
        this.xCoordinateFreeSpace = -1.0f;
        this.yCoordinateFreeSpace = -1.0f;
        this.chronometer = findViewById(R.id.chronometer2);
        this.imageViewStart = findViewById(R.id.imageViewStart);
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

        for (ImageView view : this.imageViewList) {

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
        new Thread(new Runnable() {
            private SharedPreferences mySharedPreferences = PreferenceManager.getDefaultSharedPreferences(MainActivity.this.getApplicationContext());
            private boolean test = true;

            
            @Override
            public void run() {

                while (this.test) {

                    Log.i("Thread", "Execultando");

                    if ((imageViewList.get(0).getX()) != 0.0) {

                        imageViewList.set(imageViewList.size() - 1, null);

                        for (ImageView view : imageViewList) {
                            if (view != null) {
                                view.setX(mySharedPreferences.getFloat(view.getTag() + "x", view.getX()));
                                view.setY(mySharedPreferences.getFloat(view.getTag() + "y", view.getY()));
                            }
                        }

                        xCoordinateFreeSpace = mySharedPreferences.getFloat("xCoordinateFreeSpace", -1.0f);
                        yCoordinateFreeSpace = mySharedPreferences.getFloat("yCoordinateFreeSpace", -1.0f);
                        imageViewStart.setX(mySharedPreferences.getFloat("xImageViewStart", imageViewStart.getX()));
                        imageViewStart.setY(mySharedPreferences.getFloat("yImageViewStart", imageViewStart.getY()));
                        test = false;
                    }

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }).start();
    }




    private void createDialog() {

        View viewDialog = getLayoutInflater().inflate(R.layout.dialog_test, null);

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getLayoutInflater().getContext());

        alertDialogBuilder.setView(viewDialog);

        alertDialogBuilder.setTitle("Existe um jogo n\u00e3o finalizado, deseja continuar?");

        alertDialogBuilder.setPositiveButton(
                R.string.button_confirm,
                new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {
                        MainActivity.this.restoreImagesPositions();
                        Toast.makeText(MainActivity.this.getApplicationContext(), "Jogo restaurado!", Toast.LENGTH_LONG).show();
                    }
                }
        );

        alertDialogBuilder.setNegativeButton(
                R.string.button_cancel,
                new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        MainActivity.this.gameReset();
                        Toast.makeText(MainActivity.this.getApplicationContext(), "Novo jogo iniciado!", Toast.LENGTH_LONG).show();
                    }
                }

        );

        alertDialogBuilder.create().show();
    }




//    private void setOnClickListenerToImages() {
//        Iterator it = this.imageViewList.iterator();
//        while (it.hasNext()) {
//            ImageView image = (ImageView) it.next();
//            if (image != null) {
//                image.setOnClickListener(new MyOnClickListener());
//            }
//        }
//    }




    private void setOnTouchListenerToImages() {

        for (ImageView image : this.imageViewList) {

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

        this.imageViewList = new ArrayList<>();

        this.imageViewList.add((ImageView) findViewById(R.id.imageView1));
        this.imageViewList.get(this.imageViewList.size() - 1).setTag(1);

        this.imageViewList.add((ImageView) findViewById(R.id.imageView14));
        this.imageViewList.get(this.imageViewList.size() - 1).setTag(14);

        this.imageViewList.add((ImageView) findViewById(R.id.imageView5));
        this.imageViewList.get(this.imageViewList.size() - 1).setTag(5);

        this.imageViewList.add((ImageView) findViewById(R.id.imageView7));
        this.imageViewList.get(this.imageViewList.size() - 1).setTag(7);

        this.imageViewList.add((ImageView) findViewById(R.id.imageView2));
        this.imageViewList.get(this.imageViewList.size() - 1).setTag(2);

        this.imageViewList.add((ImageView) findViewById(R.id.imageView10));
        this.imageViewList.get(this.imageViewList.size() - 1).setTag(10);

        this.imageViewList.add((ImageView) findViewById(R.id.imageView8));
        this.imageViewList.get(this.imageViewList.size() - 1).setTag(8);

        this.imageViewList.add((ImageView) findViewById(R.id.imageView6));
        this.imageViewList.get(this.imageViewList.size() - 1).setTag(6);

        this.imageViewList.add((ImageView) findViewById(R.id.imageView3));
        this.imageViewList.get(this.imageViewList.size() - 1).setTag(3);

        this.imageViewList.add((ImageView) findViewById(R.id.imageView4));
        this.imageViewList.get(this.imageViewList.size() - 1).setTag(4);

        this.imageViewList.add((ImageView) findViewById(R.id.imageView15));
        this.imageViewList.get(this.imageViewList.size() - 1).setTag(15);

        this.imageViewList.add((ImageView) findViewById(R.id.imageView11));
        this.imageViewList.get(this.imageViewList.size() - 1).setTag(11);

        this.imageViewList.add((ImageView) findViewById(R.id.imageView13));
        this.imageViewList.get(this.imageViewList.size() - 1).setTag(13);

        this.imageViewList.add((ImageView) findViewById(R.id.imageView9));
        this.imageViewList.get(this.imageViewList.size() - 1).setTag(9);

        this.imageViewList.add((ImageView) findViewById(R.id.imageView12));
        this.imageViewList.get(this.imageViewList.size() - 1).setTag(12);

        this.imageViewList.add((ImageView) findViewById(R.id.imageViewStart));
        this.imageViewList.get(this.imageViewList.size() - 1).setTag(0);

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





//    private void loadBanner() {
//        AdRequest.Builder adRequestBuilder = new AdRequest.Builder();
//        adRequestBuilder.addTestDevice(SearchAdRequest.DEVICE_ID_EMULATOR);
//        adRequestBuilder.addTestDevice("E81B2658F8501C8429615429E4180E8B");
//        ((AdView) findViewById(C0453R.id.adView)).loadAd(adRequestBuilder.build());
//    }




    private void checkMove() {

        int i = 0;

        while (this.imageViewList.get(i) != null && (int) this.imageViewList.get(i).getTag() == i + 1) {

            i++;

        }

        if (i == this.imageViewList.size() - 1) {

            Toast.makeText(getApplicationContext(), "Parab\u00e9ns vc conseguiu!", Toast.LENGTH_LONG).show();
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

        for (ImageView view : this.imageViewList) {

            if (view == null) {

                Log.i("Tag", "null");

            } else {

                Log.i("Tag", view.getTag().toString());
                Log.i("X", view.getX() + BuildConfig.FLAVOR);

            }
        }
    }





    class MyOnTouchListener implements View.OnTouchListener {
        private int action;
        private int indexOfCurrentImage;
        private int indexOfNullImage;
        private float xCoordinateTemp;
        private float yCoordinateTemp;

        private MyOnTouchListener() {
        }

        public boolean onTouch(View view, MotionEvent event) {
            
            this.action = event.getAction();
            
            switch (this.action) {

                case MotionEvent.ACTION_DOWN:

                    Log.i("DOWN", "executed");

                    if ((int) view.getTag() != 0) {

                        if (
                                (view.getX() + view.getWidth() == xCoordinateFreeSpace &&
                                 view.getY() + view.getHeight() == yCoordinateFreeSpace + view.getHeight()) ||
                                ((view.getX() - view.getWidth() == xCoordinateFreeSpace &&
                                view.getY() + view.getHeight() == yCoordinateFreeSpace + view.getHeight()) ||
                                ((view.getY() + view.getHeight() == yCoordinateFreeSpace &&
                                view.getX() + view.getWidth() == xCoordinateFreeSpace + view.getWidth()) ||
                                (view.getY() - view.getHeight() == yCoordinateFreeSpace &&
                                view.getX() + view.getWidth() == xCoordinateFreeSpace + view.getWidth())))
                        ) {
                            
//                            if (chronometerPaused) {
//                                chronometerStart();
//                            }
                            
                            this.xCoordinateTemp = view.getX();
                            this.yCoordinateTemp = view.getY();

                            view.setX(xCoordinateFreeSpace);
                            view.setY(yCoordinateFreeSpace);

                            xCoordinateFreeSpace = this.xCoordinateTemp;
                            yCoordinateFreeSpace = this.yCoordinateTemp;

                            this.indexOfCurrentImage = imageViewList.indexOf(view);
                            this.indexOfNullImage = imageViewList.indexOf(null);

                            imageViewList.set(this.indexOfNullImage, (ImageView) view);
                            imageViewList.set(this.indexOfCurrentImage, null);

                            checkMove();

                            break;
                        }

                    } else {

                        if (xCoordinateFreeSpace == -1f) {

                            xCoordinateFreeSpace = view.getX();
                            yCoordinateFreeSpace = view.getY();

                            this.indexOfCurrentImage = imageViewList.indexOf(view);

                            view.setX( view.getX() - view.getWidth() * 2 );
                            // (float) view.getHeight() / 3) -->> because of the top wall
                            view.setY( view.getY() - (view.getHeight() * 4 + (float) view.getHeight() / 3) );

                            imageViewList.set(this.indexOfCurrentImage, null);

                        }

                    }


                    if (chronometerPaused) {
                        chronometerStart();
                    }

                    break;
                    
                    
                case MotionEvent.ACTION_UP:
                    Log.i("UP", "executed");
                    break;
                    
            }
            return true;
        }
    }


}
