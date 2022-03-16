package jp.co.yumemi.test.googlemapstestapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import jp.co.yumemi.test.googlemapstestapp.databinding.FragmentMapListBinding

class MapListFragment : Fragment(R.layout.fragment_map_list) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = FragmentMapListBinding.bind(view)
        binding.recyclerView.also {
            it.layoutManager = LinearLayoutManager(requireContext())
            it.adapter = MapListAdapter(List(100) { num -> "map: $num" })
        }
    }
}
