package upc.com.pe.trabajo.activities;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

//json
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONObject;

import upc.com.pe.trabajo.R;
import upc.com.pe.trabajo.models.Laboratory;


public class LaboriatoriesActivity extends ListActivity {

    int laboratoriesQuantity;
    Laboratory vLaboratories[];
    String[] nLaboratories;

    //--json
    private static final String QUERY_URL = "http://openLibrary.org/search.json?q=";
    //--

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_laboriatories);
        laboratoriesQuantity = 20;
        vLaboratories = new Laboratory[laboratoriesQuantity];
        nLaboratories = new String[laboratoriesQuantity];
        for(int i=0; i<laboratoriesQuantity; i++){
            vLaboratories[i] = new Laboratory();
            vLaboratories[i].setLaboratoryName(vLaboratories[i].getLaboratoryName().concat(" "+(i+1)));
            nLaboratories[i]=vLaboratories[i].getLaboratoryName().toString();
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nLaboratories);
        setListAdapter(adapter);
    }

    public void onListItemClick(ListView list, View view, int position, long id){

        goToComputers(view, position);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_laboriatories, menu);
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

    public void goToComputers(View view, int position){
        Intent computersIntent = new Intent(this, ComputersActivity.class);
        computersIntent.putExtra("laboratoryObject",vLaboratories[position]);
        startActivity(computersIntent);
    }

    private void gettingLaboratories(){

        String urlString ="";

        AsyncHttpClient client = new AsyncHttpClient();

        client.get(QUERY_URL + urlString, new JsonHttpResponseHandler(){//get de http

            @Override
            public void onSuccess(JSONObject jsonObject){
                Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_LONG).show();
                //Log.d("ReaderHelp", jsonObject.toString());
                //mJSONAdapter.updateData(jsonObject.optJSONArray("docs"));
            }

            @Override
            public void onFailure(int statusCode, Throwable throwable, JSONObject error){
                Toast.makeText(getApplicationContext(), "Error " + statusCode + " "+throwable.getMessage(), Toast.LENGTH_LONG).show();
                //Log.d("ReaderHelp", statusCode + " " + throwable.getMessage());

            }

        });
    }

}
