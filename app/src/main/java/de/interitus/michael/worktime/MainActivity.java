package de.interitus.michael.worktime;

import android.content.DialogInterface;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import static android.view.View.OnClickListener;


public class MainActivity extends ActionBarActivity implements OnClickListener {

    SQLiteDatabase Zeiten;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button schliessen = (Button) findViewById(R.id.button);
        schliessen.setOnClickListener(this);
        Zeiten = openOrCreateDatabase("Meine Zeiten", MODE_PRIVATE, null);
        Zeiten.execSQL("CREATE TABLE IF NOT EXISTS Text (texteingabedb VARCHAR);");

    }




    public void schliessen(){

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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


    @Override
    public void onClick(View v) {
        finish();
    }
}
