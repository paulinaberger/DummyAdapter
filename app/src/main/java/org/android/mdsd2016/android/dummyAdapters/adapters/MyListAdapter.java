package org.android.mdsd2016.android.dummyAdapters.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.android.mdsd2016.android.dummyadapter.R;
import org.android.mdsd2016.android.dummyadapter.item;

/**
 * Created by paulinaberger on 2017-03-13.
 */

public class MyListAdapter extends ArrayAdapter<item> {
    private Context mContext;
    String[]  mListValues = {"Android", "iPhone", "WindowsMobile",
            "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
            "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux",
            "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2",
            "Android", "iPhone", "WindowsMobile"};

    public MyListAdapter(Context context, int resource, item[] objects) {

        super(context, resource, objects);
        this.mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) this.mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView =  inflater.inflate(R.layout.row_layout, null);

        TextView textView = (TextView) rowView.findViewById(R.id.tv_body_row_layout);
        textView.setText("Body text of the element in position" + position);

        TextView titleTextView = (TextView) rowView.findViewById(R.id.tv_title_row_layout);
        titleTextView.setText(this.mListValues[position]);
        return rowView;

     }
}
