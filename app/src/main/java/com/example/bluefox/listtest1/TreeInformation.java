package com.example.bluefox.listtest1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TreeInformation extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_tree_information, null, false);
        mDrawerLayout.addView(contentView, 0);


        Intent launchedMe = getIntent();
        String itemValue = launchedMe.getStringExtra("trees");
        TextView topic_name = (TextView)findViewById(R.id.topic_id);
        topic_name.setText(itemValue);
        setInformation(itemValue);
    }

    private void setInformation(final String itemValue) {
        TextView description = (TextView) findViewById(R.id.description);
        List<String> favorites = new ArrayList<String>();
        switch(itemValue) {
            case ("Deodar Cedar"):
                description.setText("Stevens Way is lined by dozens of these graceful evergreens, which excel in Seattle's soil and climate, so far from their Himalayan homeland. Unlike our native cedar these bear sharp 1- to 2-inch (3- to 5-centimeter) needles ranging in color from bright green to powdery blue-green in dense clusters of 20-30 needles per shoot. The erect, fist-sized cones (produced only by female and bisexual trees) shatter to pieces while still on the tree in spring when the seeds ripen. In the spring the male cones release clouds of yellow pollen into the wind.\n" +
                        "\n" +
                        "\n" +
                        "Deodar Cedars unite the relaxed, drooping posture of hemlocks and the massive horizontal sturdiness of certain pines, whether yielding valuable wood in Indian forests or graciously decorating our landscapes. Among Hindus, Deodar Cedars are regarded as divine trees. The name Deodar derives from the Sanskrit term devadāru, meaning “wood of the gods”. The wood is highly prized as building material because of its fine, close grain and rot-resistant properties. If the lower branches are pruned, Deodar Cedars are used as street trees in urban areas because they can tolerate compacted, poor soils.  Compare Deodar with its congeners: Atlas cedar and cedar of Lebanon.");
                break;
            case ("Monterey Pine"):
                description.setText("Monterey Pine Monterey Pine Monterey Pine");
                break;
            case ("European Larch"):
                description.setText("European Larch European Larch European Larch");
                break;
            default:
                description.setText("default");
                break;
        }
    }
}