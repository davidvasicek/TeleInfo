package com.example.teleinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.teleinfo.rozvrh.ObjectDates;

import java.util.ArrayList;
import java.util.List;

public class testRecyclerViewHorizontal extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<ObjectDates> source;
    RecyclerView.LayoutManager RecyclerViewLayoutManager;
    Adapter adapter;
    LinearLayoutManager HorizontalLayout;

    View ChildView;
    int RecyclerViewItemPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity_test_recycler_view_horizontal);
        // initialisation with id's
        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        RecyclerViewLayoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(RecyclerViewLayoutManager);
        AddItemsToRecyclerViewArrayList();

        adapter = new Adapter(source);

        HorizontalLayout = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(HorizontalLayout);

        recyclerView.setAdapter(adapter);
    }

    public void AddItemsToRecyclerViewArrayList()
    {
        source = new ArrayList<>();

        ObjectDates objectDates = new ObjectDates(); objectDates.day = 1; objectDates.month = 9; objectDates.year = 2022; objectDates.dayOfTheWeek = 4; objectDates.theNameOfTheDayOfTheWeek = "Čtvrtek"; objectDates.shortTheNameOfTheDayOfTheWeek = "Čt"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 2; objectDates.month = 9; objectDates.year = 2022; objectDates.dayOfTheWeek = 5; objectDates.theNameOfTheDayOfTheWeek = "Pátek"; objectDates.shortTheNameOfTheDayOfTheWeek = "Pá"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 3; objectDates.month = 9; objectDates.year = 2022; objectDates.dayOfTheWeek = 6; objectDates.theNameOfTheDayOfTheWeek = "Sobota"; objectDates.shortTheNameOfTheDayOfTheWeek = "So"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 4; objectDates.month = 9; objectDates.year = 2022; objectDates.dayOfTheWeek = 7; objectDates.theNameOfTheDayOfTheWeek = "Neděle"; objectDates.shortTheNameOfTheDayOfTheWeek = "Ne"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 5; objectDates.month = 9; objectDates.year = 2022; objectDates.dayOfTheWeek = 1; objectDates.theNameOfTheDayOfTheWeek = "Pondělí"; objectDates.shortTheNameOfTheDayOfTheWeek = "Po"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 6; objectDates.month = 9; objectDates.year = 2022; objectDates.dayOfTheWeek = 2; objectDates.theNameOfTheDayOfTheWeek = "Úterý"; objectDates.shortTheNameOfTheDayOfTheWeek = "Út"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 7; objectDates.month = 9; objectDates.year = 2022; objectDates.dayOfTheWeek = 3; objectDates.theNameOfTheDayOfTheWeek = "Středa"; objectDates.shortTheNameOfTheDayOfTheWeek = "St"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 8; objectDates.month = 9; objectDates.year = 2022; objectDates.dayOfTheWeek = 4; objectDates.theNameOfTheDayOfTheWeek = "Čtvrtek"; objectDates.shortTheNameOfTheDayOfTheWeek = "Čt"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 9; objectDates.month = 9; objectDates.year = 2022; objectDates.dayOfTheWeek = 5; objectDates.theNameOfTheDayOfTheWeek = "Pátek"; objectDates.shortTheNameOfTheDayOfTheWeek = "Pá"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 10; objectDates.month = 9; objectDates.year = 2022; objectDates.dayOfTheWeek = 6; objectDates.theNameOfTheDayOfTheWeek = "Sobota"; objectDates.shortTheNameOfTheDayOfTheWeek = "So"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 11; objectDates.month = 9; objectDates.year = 2022; objectDates.dayOfTheWeek = 7; objectDates.theNameOfTheDayOfTheWeek = "Neděle"; objectDates.shortTheNameOfTheDayOfTheWeek = "Ne"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 12; objectDates.month = 9; objectDates.year = 2022; objectDates.dayOfTheWeek = 1; objectDates.theNameOfTheDayOfTheWeek = "Pondělí"; objectDates.shortTheNameOfTheDayOfTheWeek = "Po"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 13; objectDates.month = 9; objectDates.year = 2022; objectDates.dayOfTheWeek = 2; objectDates.theNameOfTheDayOfTheWeek = "Úterý"; objectDates.shortTheNameOfTheDayOfTheWeek = "Út"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 14; objectDates.month = 9; objectDates.year = 2022; objectDates.dayOfTheWeek = 3; objectDates.theNameOfTheDayOfTheWeek = "Středa"; objectDates.shortTheNameOfTheDayOfTheWeek = "St"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 15; objectDates.month = 9; objectDates.year = 2022; objectDates.dayOfTheWeek = 4; objectDates.theNameOfTheDayOfTheWeek = "Čtvrtek"; objectDates.shortTheNameOfTheDayOfTheWeek = "Čt"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 16; objectDates.month = 9; objectDates.year = 2022; objectDates.dayOfTheWeek = 5; objectDates.theNameOfTheDayOfTheWeek = "Pátek"; objectDates.shortTheNameOfTheDayOfTheWeek = "Pá"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 17; objectDates.month = 9; objectDates.year = 2022; objectDates.dayOfTheWeek = 6; objectDates.theNameOfTheDayOfTheWeek = "Sobota"; objectDates.shortTheNameOfTheDayOfTheWeek = "So"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 18; objectDates.month = 9; objectDates.year = 2022; objectDates.dayOfTheWeek = 7; objectDates.theNameOfTheDayOfTheWeek = "Neděle"; objectDates.shortTheNameOfTheDayOfTheWeek = "Ne"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 19; objectDates.month = 9; objectDates.year = 2022; objectDates.dayOfTheWeek = 1; objectDates.theNameOfTheDayOfTheWeek = "Pondělí"; objectDates.shortTheNameOfTheDayOfTheWeek = "Po"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 20; objectDates.month = 9; objectDates.year = 2022; objectDates.dayOfTheWeek = 2; objectDates.theNameOfTheDayOfTheWeek = "Úterý"; objectDates.shortTheNameOfTheDayOfTheWeek = "Út"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 21; objectDates.month = 9; objectDates.year = 2022; objectDates.dayOfTheWeek = 3; objectDates.theNameOfTheDayOfTheWeek = "Středa"; objectDates.shortTheNameOfTheDayOfTheWeek = "St"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 22; objectDates.month = 9; objectDates.year = 2022; objectDates.dayOfTheWeek = 4; objectDates.theNameOfTheDayOfTheWeek = "Čtvrtek"; objectDates.shortTheNameOfTheDayOfTheWeek = "Čt"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 23; objectDates.month = 9; objectDates.year = 2022; objectDates.dayOfTheWeek = 5; objectDates.theNameOfTheDayOfTheWeek = "Pátek"; objectDates.shortTheNameOfTheDayOfTheWeek = "Pá"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 24; objectDates.month = 9; objectDates.year = 2022; objectDates.dayOfTheWeek = 6; objectDates.theNameOfTheDayOfTheWeek = "Sobota"; objectDates.shortTheNameOfTheDayOfTheWeek = "So"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 25; objectDates.month = 9; objectDates.year = 2022; objectDates.dayOfTheWeek = 7; objectDates.theNameOfTheDayOfTheWeek = "Neděle"; objectDates.shortTheNameOfTheDayOfTheWeek = "Ne"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 26; objectDates.month = 9; objectDates.year = 2022; objectDates.dayOfTheWeek = 1; objectDates.theNameOfTheDayOfTheWeek = "Pondělí"; objectDates.shortTheNameOfTheDayOfTheWeek = "Po"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 27; objectDates.month = 9; objectDates.year = 2022; objectDates.dayOfTheWeek = 2; objectDates.theNameOfTheDayOfTheWeek = "Úterý"; objectDates.shortTheNameOfTheDayOfTheWeek = "Út"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 28; objectDates.month = 9; objectDates.year = 2022; objectDates.dayOfTheWeek = 3; objectDates.theNameOfTheDayOfTheWeek = "Středa"; objectDates.shortTheNameOfTheDayOfTheWeek = "St"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 29; objectDates.month = 9; objectDates.year = 2022; objectDates.dayOfTheWeek = 4; objectDates.theNameOfTheDayOfTheWeek = "Čtvrtek"; objectDates.shortTheNameOfTheDayOfTheWeek = "Čt"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 30; objectDates.month = 9; objectDates.year = 2022; objectDates.dayOfTheWeek = 5; objectDates.theNameOfTheDayOfTheWeek = "Pátek"; objectDates.shortTheNameOfTheDayOfTheWeek = "Pá"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 1; objectDates.month = 10; objectDates.year = 2022; objectDates.dayOfTheWeek = 6; objectDates.theNameOfTheDayOfTheWeek = "Sobota"; objectDates.shortTheNameOfTheDayOfTheWeek = "So"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 2; objectDates.month = 10; objectDates.year = 2022; objectDates.dayOfTheWeek = 7; objectDates.theNameOfTheDayOfTheWeek = "Neděle"; objectDates.shortTheNameOfTheDayOfTheWeek = "Ne"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 3; objectDates.month = 10; objectDates.year = 2022; objectDates.dayOfTheWeek = 1; objectDates.theNameOfTheDayOfTheWeek = "Pondělí"; objectDates.shortTheNameOfTheDayOfTheWeek = "Po"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 4; objectDates.month = 10; objectDates.year = 2022; objectDates.dayOfTheWeek = 2; objectDates.theNameOfTheDayOfTheWeek = "Úterý"; objectDates.shortTheNameOfTheDayOfTheWeek = "Út"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 5; objectDates.month = 10; objectDates.year = 2022; objectDates.dayOfTheWeek = 3; objectDates.theNameOfTheDayOfTheWeek = "Středa"; objectDates.shortTheNameOfTheDayOfTheWeek = "St"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 6; objectDates.month = 10; objectDates.year = 2022; objectDates.dayOfTheWeek = 4; objectDates.theNameOfTheDayOfTheWeek = "Čtvrtek"; objectDates.shortTheNameOfTheDayOfTheWeek = "Čt"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 7; objectDates.month = 10; objectDates.year = 2022; objectDates.dayOfTheWeek = 5; objectDates.theNameOfTheDayOfTheWeek = "Pátek"; objectDates.shortTheNameOfTheDayOfTheWeek = "Pá"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 8; objectDates.month = 10; objectDates.year = 2022; objectDates.dayOfTheWeek = 6; objectDates.theNameOfTheDayOfTheWeek = "Sobota"; objectDates.shortTheNameOfTheDayOfTheWeek = "So"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 9; objectDates.month = 10; objectDates.year = 2022; objectDates.dayOfTheWeek = 7; objectDates.theNameOfTheDayOfTheWeek = "Neděle"; objectDates.shortTheNameOfTheDayOfTheWeek = "Ne"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 10; objectDates.month = 10; objectDates.year = 2022; objectDates.dayOfTheWeek = 1; objectDates.theNameOfTheDayOfTheWeek = "Pondělí"; objectDates.shortTheNameOfTheDayOfTheWeek = "Po"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 11; objectDates.month = 10; objectDates.year = 2022; objectDates.dayOfTheWeek = 2; objectDates.theNameOfTheDayOfTheWeek = "Úterý"; objectDates.shortTheNameOfTheDayOfTheWeek = "Út"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 12; objectDates.month = 10; objectDates.year = 2022; objectDates.dayOfTheWeek = 3; objectDates.theNameOfTheDayOfTheWeek = "Středa"; objectDates.shortTheNameOfTheDayOfTheWeek = "St"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 13; objectDates.month = 10; objectDates.year = 2022; objectDates.dayOfTheWeek = 4; objectDates.theNameOfTheDayOfTheWeek = "Čtvrtek"; objectDates.shortTheNameOfTheDayOfTheWeek = "Čt"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 14; objectDates.month = 10; objectDates.year = 2022; objectDates.dayOfTheWeek = 5; objectDates.theNameOfTheDayOfTheWeek = "Pátek"; objectDates.shortTheNameOfTheDayOfTheWeek = "Pá"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 15; objectDates.month = 10; objectDates.year = 2022; objectDates.dayOfTheWeek = 6; objectDates.theNameOfTheDayOfTheWeek = "Sobota"; objectDates.shortTheNameOfTheDayOfTheWeek = "So"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 16; objectDates.month = 10; objectDates.year = 2022; objectDates.dayOfTheWeek = 7; objectDates.theNameOfTheDayOfTheWeek = "Neděle"; objectDates.shortTheNameOfTheDayOfTheWeek = "Ne"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 17; objectDates.month = 10; objectDates.year = 2022; objectDates.dayOfTheWeek = 1; objectDates.theNameOfTheDayOfTheWeek = "Pondělí"; objectDates.shortTheNameOfTheDayOfTheWeek = "Po"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 18; objectDates.month = 10; objectDates.year = 2022; objectDates.dayOfTheWeek = 2; objectDates.theNameOfTheDayOfTheWeek = "Úterý"; objectDates.shortTheNameOfTheDayOfTheWeek = "Út"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 19; objectDates.month = 10; objectDates.year = 2022; objectDates.dayOfTheWeek = 3; objectDates.theNameOfTheDayOfTheWeek = "Středa"; objectDates.shortTheNameOfTheDayOfTheWeek = "St"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 20; objectDates.month = 10; objectDates.year = 2022; objectDates.dayOfTheWeek = 4; objectDates.theNameOfTheDayOfTheWeek = "Čtvrtek"; objectDates.shortTheNameOfTheDayOfTheWeek = "Čt"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 21; objectDates.month = 10; objectDates.year = 2022; objectDates.dayOfTheWeek = 5; objectDates.theNameOfTheDayOfTheWeek = "Pátek"; objectDates.shortTheNameOfTheDayOfTheWeek = "Pá"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 22; objectDates.month = 10; objectDates.year = 2022; objectDates.dayOfTheWeek = 6; objectDates.theNameOfTheDayOfTheWeek = "Sobota"; objectDates.shortTheNameOfTheDayOfTheWeek = "So"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 23; objectDates.month = 10; objectDates.year = 2022; objectDates.dayOfTheWeek = 7; objectDates.theNameOfTheDayOfTheWeek = "Neděle"; objectDates.shortTheNameOfTheDayOfTheWeek = "Ne"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 24; objectDates.month = 10; objectDates.year = 2022; objectDates.dayOfTheWeek = 1; objectDates.theNameOfTheDayOfTheWeek = "Pondělí"; objectDates.shortTheNameOfTheDayOfTheWeek = "Po"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 25; objectDates.month = 10; objectDates.year = 2022; objectDates.dayOfTheWeek = 2; objectDates.theNameOfTheDayOfTheWeek = "Úterý"; objectDates.shortTheNameOfTheDayOfTheWeek = "Út"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 26; objectDates.month = 10; objectDates.year = 2022; objectDates.dayOfTheWeek = 3; objectDates.theNameOfTheDayOfTheWeek = "Středa"; objectDates.shortTheNameOfTheDayOfTheWeek = "St"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 27; objectDates.month = 10; objectDates.year = 2022; objectDates.dayOfTheWeek = 4; objectDates.theNameOfTheDayOfTheWeek = "Čtvrtek"; objectDates.shortTheNameOfTheDayOfTheWeek = "Čt"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 28; objectDates.month = 10; objectDates.year = 2022; objectDates.dayOfTheWeek = 5; objectDates.theNameOfTheDayOfTheWeek = "Pátek"; objectDates.shortTheNameOfTheDayOfTheWeek = "Pá"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 29; objectDates.month = 10; objectDates.year = 2022; objectDates.dayOfTheWeek = 6; objectDates.theNameOfTheDayOfTheWeek = "Sobota"; objectDates.shortTheNameOfTheDayOfTheWeek = "So"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 30; objectDates.month = 10; objectDates.year = 2022; objectDates.dayOfTheWeek = 7; objectDates.theNameOfTheDayOfTheWeek = "Neděle"; objectDates.shortTheNameOfTheDayOfTheWeek = "Ne"; source.add(objectDates);
        objectDates = new ObjectDates(); objectDates.day = 31; objectDates.month = 10; objectDates.year = 2022; objectDates.dayOfTheWeek = 1; objectDates.theNameOfTheDayOfTheWeek = "Pondělí"; objectDates.shortTheNameOfTheDayOfTheWeek = "Po"; source.add(objectDates);

        source.add(objectDates);
    }

    public class Adapter extends RecyclerView.Adapter<Adapter.MyView> {

        private List<ObjectDates> list;

        public Adapter(List<ObjectDates> horizontalList) {

            this.list = horizontalList;
        }

        @Override
        public MyView onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.test_activity_test_recycler_view_horizontal_item, parent, false);

            return new MyView(itemView);
        }

        @Override
        public void onBindViewHolder(final MyView holder, final int position) {

            ObjectDates objectDates = list.get(position);

            // Set the text of each item of
            // Recycler view with the list items
            holder.textviewlll.setText(objectDates.theNameOfTheDayOfTheWeek);
            holder.textView.setText(objectDates.day + "");
            holder.textviewaa.setText(objectDates.month + " | " + objectDates.year);


            if(objectDates.day == 3){

                holder.weekTitle.setVisibility(View.VISIBLE);

            }else{


                holder.weekTitle.setVisibility(View.INVISIBLE);

            }

            holder.date2.setVisibility(View.GONE);
            holder.dateSeparator.setVisibility(View.GONE);
            //holder.weekTitle.setVisibility(View.GONE);


        }

        @Override
        public int getItemCount()
        {
            return list.size();
        }

        public class MyView extends RecyclerView.ViewHolder {

            // Text View
            TextView textView;
            TextView textviewlll;
            TextView textviewaa;

            LinearLayout date1;
            LinearLayout date2;
            LinearLayout dateSeparator;
            LinearLayout weekTitle;

            // parameterised constructor for View Holder class
            // which takes the view as a parameter
            public MyView(View view){
                super(view);

                // initialise TextView with id
                textView = (TextView)view.findViewById(R.id.textview);
                textviewlll = (TextView)view.findViewById(R.id.textviewlll);
                textviewaa = (TextView)view.findViewById(R.id.textviewaa);

                date1 = (LinearLayout)view.findViewById(R.id.date1);
                date2 = (LinearLayout)view.findViewById(R.id.date2);
                dateSeparator = (LinearLayout)view.findViewById(R.id.dateSeparator);
                weekTitle = (LinearLayout)view.findViewById(R.id.weekTitle);



            }
        }
    }



}