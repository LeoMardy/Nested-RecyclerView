package com.exam.nestedrecyclerviewpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.exam.nestedrecyclerviewpractice.databinding.ParentLayoutBinding;

import java.util.ArrayList;

public class Parent_Adapter extends RecyclerView.Adapter<Parent_Adapter.Parent_ViewHolder> {
    public class Parent_ViewHolder extends RecyclerView.ViewHolder{

        ParentLayoutBinding binding;
        public Parent_ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ParentLayoutBinding.bind(itemView);
        }
    }
    ArrayList<Parent_ModelClass> parentModelClassArrayList;
    Context context;
    public Parent_Adapter(ArrayList<Parent_ModelClass>parentModelClassArrayList,Context context){
        this.context = context;
        this.parentModelClassArrayList = parentModelClassArrayList;
    }
    @NonNull
    @Override
    public Parent_ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.parent_layout,parent,false);

        return new Parent_ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Parent_ViewHolder holder, int position) {

        Parent_ModelClass temp = parentModelClassArrayList.get(position);

        holder.binding.parentTextView.setText(temp.getTitle());
        Child_Adapter childAdapter = new Child_Adapter(temp.getChildModelClass(),context);
        holder.binding.childRecyclerVIew.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
        holder.binding.childRecyclerVIew.setAdapter(childAdapter);
        childAdapter.notifyDataSetChanged();



    }

    @Override
    public int getItemCount() {
        return parentModelClassArrayList.size();
    }
}
