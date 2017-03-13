package org.android.mdsd2016.android.dummyAdapters.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.android.mdsd2016.android.dummyadapter.R;
import org.android.mdsd2016.android.dummyadapter.item;
import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by paulinaberger on 2017-03-13.
 */

public class MyListAdapter extends ArrayAdapter<item> {
    private Context mContext;

    public MyListAdapter(Context context, int resource, item[] objects) {
        super(context, resource, objects);
        this.mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) this.mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView =  inflater.inflate(R.layout.new_adapter, null);

        TextView textView = (TextView) rowView.findViewById(R.id.tv_body_row_layout);
        textView.setText("Body text of the element in position" + position);
        return rowView;

     }
}
