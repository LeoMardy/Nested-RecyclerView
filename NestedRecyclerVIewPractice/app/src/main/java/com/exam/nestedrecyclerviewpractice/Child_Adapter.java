package com.exam.nestedrecyclerviewpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.exam.nestedrecyclerviewpractice.databinding.ChildLayoutBinding;

import java.util.ArrayList;

public class Child_Adapter extends RecyclerView.Adapter<Child_Adapter.Child_ViewHolder> {
    public class Child_ViewHolder extends RecyclerView.ViewHolder{

        ChildLayoutBinding binding;
        public Child_ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ChildLayoutBinding.bind(itemView);
        }
    }
    ArrayList<Child_ModelClass> childModelClassArrayList;
    Context context;

    public Child_Adapter(ArrayList<Child_ModelClass>childModelClassArrayList,Context context){
        this.childModelClassArrayList = childModelClassArrayList;
        this.context = context;
    }
    @NonNull
    @Override
    public Child_ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.child_layout,parent,false);

        return new Child_ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Child_ViewHolder holder, int position) {

        Child_ModelClass temp = childModelClassArrayList.get(position);
        holder.binding.childItem.setImageResource(temp.getImage());
    }

    @Override
    public int getItemCount() {
        return childModelClassArrayList.size();
    }
}
