package cat.udl.eps.fragments.ejbase;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailFrag extends Fragment{

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public void onViewCreated(@NonNull View v, Bundle savedInstanceState) {
		super.onViewCreated(v, savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.detail_fragment, container, false);
	}

	public void showText(String item) {
		TextView view = getView().findViewById(R.id.captain);
		view.setText(item);
	}
}
