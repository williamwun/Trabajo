package upc.com.pe.trabajo;

import android.app.ActionBar;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class Computers extends ListActivity {

    //TextView computerNameTextView;
    //Computer computers[];
    Laboratory laboratory;
    int computersQuantity;
    String nComputers[];
    ListView computersListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        laboratory = getIntent().getParcelableExtra("laboratoryObject");
        computersQuantity = laboratory.getComputersQuantity();

        nComputers = new String[computersQuantity];
        String nLab = laboratory.getLaboratoryName().substring(laboratory.getLaboratoryName().length()-1);
        for(int i=0; i<computersQuantity; i++) {
            if (i < 10){
                nComputers[i] = "L" + nLab + "0" + i;
            }else{
                nComputers[i] = "L" + nLab + i;
            }
        }

        computersListView = (ListView)findViewById(R.id.componentsListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,nComputers);
        setListAdapter(adapter);
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
        Intent detailsIntent = new Intent(this,Details.class);
        detailsIntent.putExtra("computerObject",laboratory.getComputerInPosition(position));
        startActivity(detailsIntent);
    }
}
