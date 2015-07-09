package upc.com.pe.trabajo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
//import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import upc.com.pe.trabajo.models.ComponentsAdapter;
import upc.com.pe.trabajo.models.Computer;


public class DetailsActivity extends Activity{// implements AdapterView.OnItemClickListener{

    Computer computerReceived;
    //TextView computerTextView;
    ListView componentListView;//----N----
    ArrayAdapter myAdapter;//----N----
    List<String> pruebas = new ArrayList<String>();//----N----
    List<Computer> computerArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        computerReceived = getIntent().getParcelableExtra("computerObject");
        for (int i = 1; i < 6; i++) {//----N----
            pruebas.add("prueba numero " + i);
        }

        ArrayList computerArrayList = getListData(computerReceived);
        componentListView = (ListView)findViewById(R.id.componentListView);//----N----
        myAdapter = new ComponentsAdapter(this,computerArrayList);//----N----
        componentListView.setAdapter(myAdapter);//----N----

    }

    private ArrayList getListData(Computer computer) {
        ArrayList<Computer> components = new ArrayList<Computer>();
        components.add(computer);
        return components;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_details, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
