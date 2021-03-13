package com.example.food;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

public class SingupTabFragment extends Fragment {

    EditText email,uearname,password,confirm;
    Button singup;
    float v = 0;
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.signup_fragment,container,false);

        uearname = root.findViewById(R.id.usermane);
        password = root.findViewById(R.id.password);
        email = root.findViewById(R.id.email);
        confirm = root.findViewById(R.id.confrim);

        email.setTranslationY(800);
        password.setTranslationY(800);
        confirm.setTranslationY(800);
        uearname.setTranslationY(800);

        email.setAlpha(v);
        password.setAlpha(v);
        confirm.setAlpha(v);
        uearname.setAlpha(v);

        email.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(300).start();
        password.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(500).start();
        confirm.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(500).start();
        uearname.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(700).start();

        return root;
    }
}
