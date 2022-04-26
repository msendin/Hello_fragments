package cat.udl.eps.fragments.ejbase;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class DetailFrag extends Fragment{
	TextView view;

	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
							 @Nullable Bundle savedInstanceState) {
		super.onCreateView(inflater, container, savedInstanceState);
		return inflater.inflate(R.layout.detail_fragment, container, false);
	}

	@Override
	public void onViewCreated(@NonNull View v, Bundle savedInstanceState) {
		super.onViewCreated(v, savedInstanceState);
		view = requireView().findViewById(R.id.captain);
	}

	public void showText(String item) {
		view.setText(item);
	}
}
