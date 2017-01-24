package kkmp.sharktank;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by kchugh on 1/22/2017 at 11:18 PM
 */

public class R_Dashboard extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.r_dashboard);
    }

    public void clickedButton_makeRequest(View view) {
        final Intent intent = new Intent(this, R_Make_Request.class);
        startActivity(intent);
    }

    public void clickedButton_browseListings(View view) {
        final Intent intent = new Intent(this, R_Browse_Listings.class);
        startActivity(intent);
    }

}
