package upc.com.pe.trabajo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Options extends ActionBarActivity {

    Button laboratoriesButton;
    SearchView computerSearchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
        laboratoriesButton = (Button)findViewById(R.id.laboratoriesButton);
        laboratoriesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToLaboratories(v);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
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

    public void goToLaboratories(View view){
        Intent laboratoriesIntent = new Intent(this, Laboriatories.class);
        startActivity(laboratoriesIntent);
    }

}
