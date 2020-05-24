package ge.msda.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class recyclerViewAdapter(val userList: ArrayList<data>) :
    RecyclerView.Adapter<recyclerViewAdapter.ViewHolder>() {
    class ViewHolder(item: View) : RecyclerView.ViewHolder(item){
        var Text:TextView = item.findViewById(R.id.tvtext)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
                   return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

}
