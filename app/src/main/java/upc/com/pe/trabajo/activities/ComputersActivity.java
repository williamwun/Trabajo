package upc.com.pe.trabajo.activities;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import upc.com.pe.trabajo.R;
import upc.com.pe.trabajo.models.Laboratory;


public class ComputersActivity extends ListActivity {

    //TextView computerNameTextView;
    //Computer computers[];
    Laboratory laboratory;
    int computersQuantity;
    String nComputers[];
    ListView computersListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onListItemClick(ListView list, View view, int position, long id){
        goToDetails(view, position);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_computers, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void goToDetails(View view, int position){
        Intent detailsIntent = new Intent(this,DetailsActivity.class);
        startActivity(detailsIntent);
    }
}
