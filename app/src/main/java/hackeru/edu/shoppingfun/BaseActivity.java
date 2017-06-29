package hackeru.edu.shoppingfun;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/**
 * Created by hackeru on 29/06/2017.
 */

public class BaseActivity extends AppCompatActivity {

    protected AlertDialog dialog;

    protected AlertDialog showProgress(boolean show){
        if (dialog == null){
            dialog = new AlertDialog.Builder(this).setTitle("").setMessage("").create();
        }

        if (show){
            dialog.show();
        }else {
            dialog.dismiss();
        }
        return dialog;
    }

    protected FirebaseUser getUser(){
        return FirebaseAuth.getInstance().getCurrentUser();
    }
}
