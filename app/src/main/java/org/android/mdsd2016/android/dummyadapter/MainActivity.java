package org.android.mdsd2016.android.dummyadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
 import android.widget.ListView;
import android.widget.Toast;

import org.android.mdsd2016.android.dummyAdapters.adapters.MyListAdapter;

public class MainActivity extends AppCompatActivity  implements AdapterView.OnItemClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView mListView = (ListView)this.findViewById(R.id.list_view_main);


        // This 'String[]' data could be retrieved from a file, for instance
        // This 'String[]' data could be retrieved from a file, for instance
        String[]  ListValues = {"Android", "iPhone", "WindowsMobile",
                "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
                "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux",
                "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2",
                "Android", "iPhone", "WindowsMobile"};

        item[] listItems = new item[23];

         for(int id = 0; id <23; id ++) {
            listItems[id] = new item("", "", "");

        }

        //     mListView.setAdapter(new ArrayAdapter<>(this,
        //            android.R.layout.simple_list_item_1,
        //              ListValues));
        //     mListView.setOnItemClickListener(this);

        mListView.setAdapter(new MyListAdapter(this,0, listItems));
        mListView.setOnItemClickListener(this);
     }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "Element " + position + ", with ID = " + id, Toast.LENGTH_SHORT).show();

    }
}
