package cat.udl.eps.fragments.ejbase;

import androidx.annotation.NonNull;
import androidx.fragment.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListFrag extends ListFragment{
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public void onViewCreated(@NonNull View v, Bundle savedInstanceState) {
		super.onViewCreated(v, savedInstanceState);
		String[] values = new String[] { "Enterprise", "Star Trek", "Next Generation", "Deep Space 9", "Voyager"};
		ArrayAdapter<String> adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, values);
		setListAdapter(adapter);
	}

	@Override
	public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
		String item = (String) getListAdapter().getItem(position);
		DetailFrag frag = (DetailFrag) getActivity().getSupportFragmentManager().findFragmentById(R.id.frag_capt);
		if (frag != null) { //&& frag.isInLayout()
			frag.showText(getCapt(item));
		}
	}
	
	private String getCapt(String ship) {
		if (ship.toLowerCase().contains("enterprise")) {
			return "Johnathan Archer";
		}
		if (ship.toLowerCase().contains("star trek")) {
			return "James T. Kirk";
		}
		if (ship.toLowerCase().contains("next generation")) {
			return "Jean-Luc Picard";
		}
		if (ship.toLowerCase().contains("deep space 9")) {
			return "Benjamin Sisko";
		}
		if (ship.toLowerCase().contains("voyager")) {
			return "Kathryn Janeway";
		}
		return "???";
	}
}
