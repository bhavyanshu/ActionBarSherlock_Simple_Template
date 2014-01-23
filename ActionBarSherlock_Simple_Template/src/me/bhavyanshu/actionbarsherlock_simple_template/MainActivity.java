package me.bhavyanshu.actionbarsherlock_simple_template;

import android.os.Bundle;
import android.widget.Toast;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;

public class MainActivity extends SherlockActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 if (savedInstanceState != null) {
	            int index = savedInstanceState.getInt("selected_tab_index", 0);
	            getSupportActionBar().setSelectedNavigationItem(index);
	        }
	}
	
	@Override 
	protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        int index = getSupportActionBar().getSelectedNavigationIndex();
        outState.putInt("selected_tab_index", index); 
    }
	
	/**
	 * Responding to menu items
	 */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		 MenuInflater inflater = getSupportMenuInflater();
		    inflater.inflate(R.menu.mainmenu, menu);
		    return true;
	}

	/**
	 * When an item from a menu is selected
	 */
	@Override
	  public boolean onOptionsItemSelected(MenuItem item) {
		ActionBar menubar = getSupportActionBar();
		switch (item.getItemId()) {
	    case R.id.action_settings:
	      Toast.makeText(this, "Settings", Toast.LENGTH_SHORT)
	          .show();
	      break;
	    case R.id.action_switch_theme:
	      Toast.makeText(this, "Switch Theme", Toast.LENGTH_SHORT).show();
	      /*Intent intent = new Intent(this, TabSwipeTestActivity.class);
	      this.startActivity(intent);*/
	      break;

	    default:
	      break;
	    }

	    return true;
	  } 
	
}