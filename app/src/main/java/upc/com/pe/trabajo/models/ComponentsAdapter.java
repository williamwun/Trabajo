package upc.com.pe.trabajo.models;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
;
import android.widget.TextView;


import java.util.List;

import upc.com.pe.trabajo.R;

/**
 * Created by william on 10/06/15.
 */
public class ComponentsAdapter extends ArrayAdapter<Computer> {

    public ComponentsAdapter(Context context, List<Computer> objects) {

        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Obteniendo una instancia del inflater
        LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //Salvando la referencia del View de la fila
        View listItemView = convertView;

        //Comprobando si el View no existe
        if (null == convertView) {
            //Si no existe, entonces inflarlo con two_line_list_item.xml
            listItemView = inflater.inflate(R.layout.component_row_layout, parent, false);
        }

        //Obteniendo instancias de los text views
        TextView titulo = (TextView)listItemView.findViewById(R.id.componentTitleTextView);
        //TextView subtitulo = (TextView)listItemView.findViewById(R.id.text2);

        //Obteniendo instancia de la Tarea en la posición actual
        Computer item = getItem(position);

        //titulo.setText(item.getRamMemory());
        //subtitulo.setText(item.getRamMemory());

        //Devolver al ListView la fila creada
        return listItemView;
    }
}