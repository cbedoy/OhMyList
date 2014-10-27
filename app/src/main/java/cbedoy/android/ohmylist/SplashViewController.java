package cbedoy.android.ohmylist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by Carlos on 26/10/2014.
 */
public class SplashViewController extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashViewController.this, MasterViewController.class);
                startActivity(intent);
            }
        }, 3000);
    }
}
