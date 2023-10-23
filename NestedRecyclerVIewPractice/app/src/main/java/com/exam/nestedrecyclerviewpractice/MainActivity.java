package com.exam.nestedrecyclerviewpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.exam.nestedrecyclerviewpractice.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ArrayList<Parent_ModelClass> parentModelClassArrayList = new ArrayList<>();
    ArrayList<Child_ModelClass> Recomaded = new ArrayList<>();
    ArrayList<Child_ModelClass> Popular = new ArrayList<>();
    ArrayList<Child_ModelClass> ActionMovie = new ArrayList<>();
    ArrayList<Child_ModelClass> SuperHit = new ArrayList<>();
    ArrayList<Child_ModelClass> Netflix = new ArrayList<>();
    ArrayList<Child_ModelClass> SantaliHit = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        Recomaded.add(new Child_ModelClass(R.drawable.one));
        Recomaded.add(new Child_ModelClass(R.drawable.twelve));
        Recomaded.add(new Child_ModelClass(R.drawable.two));
        Recomaded.add(new Child_ModelClass(R.drawable.thirteen));
        Recomaded.add(new Child_ModelClass(R.drawable.fifteen));
        Recomaded.add(new Child_ModelClass(R.drawable.eight));
        Recomaded.add(new Child_ModelClass(R.drawable.seven));
        Recomaded.add(new Child_ModelClass(R.drawable.three));
        Recomaded.add(new Child_ModelClass(R.drawable.two));

        parentModelClassArrayList.add(new Parent_ModelClass("Recomanded Movie",Recomaded));

        Popular.add(new Child_ModelClass(R.drawable.eight));
        Popular.add(new Child_ModelClass(R.drawable.nine));
        Popular.add(new Child_ModelClass(R.drawable.ten));
        Popular.add(new Child_ModelClass(R.drawable.eight));
        Popular.add(new Child_ModelClass(R.drawable.twelve));
        Popular.add(new Child_ModelClass(R.drawable.thirteen));
        Popular.add(new Child_ModelClass(R.drawable.fifteen));
        Popular.add(new Child_ModelClass(R.drawable.sisteen));
        Popular.add(new Child_ModelClass(R.drawable.seventeen));

        parentModelClassArrayList.add(new Parent_ModelClass("Popular Movies",Popular));

        ActionMovie.add(new Child_ModelClass(R.drawable.eighteen));
        ActionMovie.add(new Child_ModelClass(R.drawable.nineteen));
        ActionMovie.add(new Child_ModelClass(R.drawable.twelve));
        ActionMovie.add(new Child_ModelClass(R.drawable.twenty));
        ActionMovie.add(new Child_ModelClass(R.drawable.one));
        ActionMovie.add(new Child_ModelClass(R.drawable.three));
        ActionMovie.add(new Child_ModelClass(R.drawable.fifteen));
        ActionMovie.add(new Child_ModelClass(R.drawable.five));
        ActionMovie.add(new Child_ModelClass(R.drawable.seven));
        ActionMovie.add(new Child_ModelClass(R.drawable.thirteen));

        parentModelClassArrayList.add(new Parent_ModelClass("Action Movies",ActionMovie));

        SuperHit.add(new Child_ModelClass(R.drawable.one));
        SuperHit.add(new Child_ModelClass(R.drawable.twelve));
        SuperHit.add(new Child_ModelClass(R.drawable.two));
        SuperHit.add(new Child_ModelClass(R.drawable.thirteen));
        SuperHit.add(new Child_ModelClass(R.drawable.fifteen));
        SuperHit.add(new Child_ModelClass(R.drawable.eight));
        SuperHit.add(new Child_ModelClass(R.drawable.seven));
        SuperHit.add(new Child_ModelClass(R.drawable.three));
        SuperHit.add(new Child_ModelClass(R.drawable.two));

        parentModelClassArrayList.add(new Parent_ModelClass("Super Hit Movie",SuperHit));


        Netflix.add(new Child_ModelClass(R.drawable.eight));
        Netflix.add(new Child_ModelClass(R.drawable.nine));
        Netflix.add(new Child_ModelClass(R.drawable.ten));
        Netflix.add(new Child_ModelClass(R.drawable.eight));
        Netflix.add(new Child_ModelClass(R.drawable.twelve));
        Netflix.add(new Child_ModelClass(R.drawable.thirteen));
        Netflix.add(new Child_ModelClass(R.drawable.fifteen));
        Netflix.add(new Child_ModelClass(R.drawable.sisteen));
        Netflix.add(new Child_ModelClass(R.drawable.seventeen));

        parentModelClassArrayList.add(new Parent_ModelClass("Netfilx Movies",Netflix));


        SantaliHit.add(new Child_ModelClass(R.drawable.eighteen));
        SantaliHit.add(new Child_ModelClass(R.drawable.nineteen));
        SantaliHit.add(new Child_ModelClass(R.drawable.twelve));
        SantaliHit.add(new Child_ModelClass(R.drawable.twenty));
        SantaliHit.add(new Child_ModelClass(R.drawable.one));
        SantaliHit.add(new Child_ModelClass(R.drawable.three));
        SantaliHit.add(new Child_ModelClass(R.drawable.fifteen));
        SantaliHit.add(new Child_ModelClass(R.drawable.five));
        SantaliHit.add(new Child_ModelClass(R.drawable.seven));
        SantaliHit.add(new Child_ModelClass(R.drawable.thirteen));

        parentModelClassArrayList.add(new Parent_ModelClass("Santali Hit Movies",SantaliHit));


        Parent_Adapter parentAdapter = new Parent_Adapter(parentModelClassArrayList,MainActivity.this);
        binding.ParentRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.ParentRecyclerView.setAdapter(parentAdapter);
        parentAdapter.notifyDataSetChanged();

    }
}