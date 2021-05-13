package cat.udl.eps.fragments.ejbase;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

public class Main extends FragmentActivity {
    
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}