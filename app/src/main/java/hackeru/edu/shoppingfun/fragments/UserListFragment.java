package hackeru.edu.shoppingfun.fragments;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import hackeru.edu.shoppingfun.R;
import hackeru.edu.shoppingfun.dialogs.AddListDialogFragment;
import hackeru.edu.shoppingfun.models.UserList;

/**
 * A simple {@link Fragment} subclass.
 */
public class UserListFragment extends Fragment {


    @BindView(R.id.fabAddUserList)
    FloatingActionButton fabAddUserList;
    @BindView(R.id.rvUserLists)
    RecyclerView rvUserLists;
    Unbinder unbinder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_user_list, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick(R.id.fabAddUserList)
    public void onFabAddUserClicked() {
        //1) ref the user - > userID
        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        if (currentUser == null) {
            Log.e("Tomer", "No User!");
            return; //No User-> No DB...{}
        }

        //2) listID = ref UserListTable->UID->push()

        DatabaseReference newUserListRowRef = FirebaseDatabase.getInstance().
                getReference("UserLists").
                child(currentUser.getUid()).
                push();
        //UserLists/8b6XnHvv07N5j4Gsw6AZHpgZ4kw2/-GKljfsdkljfdskljfs

        //3) create a new UserList Model
        UserList list = new UserList();
        //4) ref.setValue(userList)


        AddListDialogFragment dialog = new AddListDialogFragment();
        dialog.show(getChildFragmentManager(), "AddUserListDialog");
    }
}
