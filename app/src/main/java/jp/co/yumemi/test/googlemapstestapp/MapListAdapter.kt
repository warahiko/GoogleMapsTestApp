package jp.co.yumemi.test.googlemapstestapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import jp.co.yumemi.test.googlemapstestapp.databinding.MapListItemBinding

class MapListAdapter(
    private val data: List<String>,
) : RecyclerView.Adapter<MapListAdapter.ViewHolder>() {

    class ViewHolder(val binding: MapListItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = MapListItemBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.header.text = data[position]
        holder.binding.mapView.onCreate(null)
        holder.binding.mapView.getMapAsync {
        }
    }

    override fun getItemCount(): Int = data.size
}
