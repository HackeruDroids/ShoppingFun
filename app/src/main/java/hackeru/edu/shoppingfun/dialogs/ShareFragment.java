package hackeru.edu.shoppingfun.dialogs;


import android.os.Bundle;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import de.hdodenhof.circleimageview.CircleImageView;
import hackeru.edu.shoppingfun.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShareFragment extends BottomSheetDialogFragment {

    //find the recycler by id
    @BindView(R.id.rvUsers)
    RecyclerView rvUsers;

    Unbinder unbinder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_share, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }


    public static class UserAdapter {
        //ViewHolder
        public static class UserViewHolder extends RecyclerView.ViewHolder {
            CircleImageView ivProfile;
            TextView tvUserName;

            public UserViewHolder(View itemView) {
                super(itemView);
                ivProfile = (CircleImageView) itemView.findViewById(R.id.ivProfile);
                tvUserName = (TextView) itemView.findViewById(R.id.tvUserName);
            }
        }
    }

}
