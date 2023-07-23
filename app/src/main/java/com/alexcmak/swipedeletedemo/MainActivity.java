package com.alexcmak.swipedeletedemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import androidx.annotation.NonNull;
/*
  the RecyclerView replaces ListActivity which was deprecated with Android 11 (Level 30)

  this is the simplest possible program that shows how swipe to the right can be used to remove a row.
  How this app can help you migrate your older apps that used ListActivity.

  Alex Mak
  7/23/2023
*/

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ItemDataAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        setupRecyclerView();
    }

    List<Item> Items;
    private void initData()
    {
        Items = new ArrayList<>();

        Items.add(new Item("Alligator"));
        Items.add(new Item("Bear"));
        Items.add(new Item("Cat"));
        Items.add(new Item("Dog"));
        Items.add(new Item("Elephant"));
        Items.add(new Item("Flamingo"));
        Items.add(new Item("Giraffe"));
        Items.add(new Item("Horse"));
        Items.add(new Item("Iguana"));
        Items.add(new Item("Jellyfish"));
        Items.add(new Item("Kangaroo"));
        Items.add(new Item("Lion"));
        Items.add(new Item("Monkey"));
        Items.add(new Item("Narwhal"));
        Items.add(new Item("Owl"));
        Items.add(new Item("Panda"));
        Items.add(new Item("Quail"));
        Items.add(new Item("Racoon"));
        Items.add(new Item("Squirrel"));
        Items.add(new Item("Tiger"));
        Items.add(new Item("Unicorn"));
        Items.add(new Item("Vulture"));
        Items.add(new Item("Worm"));
        Items.add(new Item("Xenarthra"));
        Items.add(new Item("Yak"));
        Items.add(new Item("Zebra"));

        mAdapter = new ItemDataAdapter(Items);
    }

    private void setupRecyclerView() {
        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(mAdapter);

        new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.RIGHT) {
            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
                // this method is called when we swipe item to right
                int position = viewHolder.getAdapterPosition();

                Items.remove(position);
                mAdapter.notifyItemRemoved(position);
            }
        }).attachToRecyclerView(recyclerView);

    }

}