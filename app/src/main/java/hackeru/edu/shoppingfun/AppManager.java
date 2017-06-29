package hackeru.edu.shoppingfun;

import android.app.Application;
import android.util.Log;

import com.google.firebase.auth.FirebaseUser;

/**
 * Global Variables Known everywhere.
 * T
 */

public class AppManager extends Application {

    FirebaseUser user;
    int x = 10;

    @Override
    public void onCreate() {
        super.onCreate();
        //the on create of the application
        Log.d("Tomer", "OnCreate of the app");
    }
}
