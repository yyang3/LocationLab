package yyang3.tacoma.uw.edu.locationlab;


import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyLocationActivityFragment extends Fragment {


    private TextView mLocationTextView;

    public MyLocationActivityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_my_location_activity, container, false);
        mLocationTextView = (TextView) v.findViewById(R.id.location_text);
        Location location = ((MyLocationsActivity) getActivity()).getCurrentLocation();
        updateView(location);
        return v;
    }

    public void updateView(Location location) {
        if (location != null)
        mLocationTextView.setText(location.toString());
    }

}
