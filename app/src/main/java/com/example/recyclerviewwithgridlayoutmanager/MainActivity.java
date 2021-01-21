package com.example.recyclerviewwithgridlayoutmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcvUser;
    UserAdapter mUserAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvUser = findViewById(R.id.rcv_user);
        mUserAdapter = new UserAdapter(MainActivity.this);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 4);
        rcvUser.setLayoutManager(gridLayoutManager);

        mUserAdapter.setData(getListUser());
        rcvUser.setAdapter(mUserAdapter);
    }

    private List<User> getListUser() {
        List<User> list = new ArrayList<>();
        list.add(new User(R.drawable.image, "Hai Dang"));
        list.add(new User(R.drawable.image, "Quynh Anh"));
        list.add(new User(R.drawable.kitty, "Kitty"));
        list.add(new User(R.drawable.bulldog, "BullDog"));
        return list;
    }
}