package com.example.basicsex3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.basicsex3.databinding.ItemListBinding

class PersonAdapter(val personList: List<Person>): RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {

    class PersonViewHolder(val binding: ItemListBinding): ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        return PersonViewHolder(ItemListBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return personList.size
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val model = personList[position]
        holder.binding.imageView.setImageResource(model.image)
        holder.binding.userName.text = model.name
    }


}