package jp.co.yumemi.test.googlemapstestapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import jp.co.yumemi.test.googlemapstestapp.databinding.FragmentMapListBinding

class MapListFragment : Fragment(R.layout.fragment_map_list), OnMapReadyCallback {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = FragmentMapListBinding.bind(view)
        binding.mapView.onCreate(null)
        binding.mapView.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
    }
}
