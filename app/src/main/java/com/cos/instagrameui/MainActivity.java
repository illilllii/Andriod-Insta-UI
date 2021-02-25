package com.cos.instagrameui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvUserList, rvContentList;
    private UserAdapter userAdapter;
    private ContentAdapter contentAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<User> users = new ArrayList<>();
        for (int i=1; i<10; i++) {
            users.add(new User(i, "username "+i, R.drawable.profile1));
        }

        List<Content> contents = new ArrayList<>();
        contents.add(new Content(1, "username1", R.drawable.profile1, R.drawable.content1));
        contents.add(new Content(2, "username2", R.drawable.profile2, R.drawable.content2));
        contents.add(new Content(3, "username3", R.drawable.profile3, R.drawable.content3));

        rvUserList = findViewById(R.id.rv_user_list);
        rvUserList.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        userAdapter = new UserAdapter(users);
        rvUserList.setAdapter(userAdapter);

        rvContentList = findViewById(R.id.rv_content_list);
        rvContentList.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        contentAdapter = new ContentAdapter(contents);
        rvContentList.setAdapter(contentAdapter);
    }
}