package scarmy.za.ac.cput.ScArmyBuilder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class RaceSelector extends AppCompatActivity {

    private LinearLayout terran;
    private LinearLayout protoss;
    private LinearLayout zerg;
    private Button back;
    private Global global;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_race_selector);

        global = (Global) getApplicationContext();

        terran = (LinearLayout)findViewById(R.id.raceTerran);
        protoss = (LinearLayout)findViewById(R.id.raceProtoss);
        zerg = (LinearLayout)findViewById(R.id.raceZerg);

        back = (Button)findViewById(R.id.btnRaceBack);

        terran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                global.setRace("Terran");
                startActivity(new Intent(RaceSelector.this, TerranUnits.class));
            }
        });

        protoss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                global.setRace("Protoss");
                startActivity(new Intent(RaceSelector.this,ProtossUnits.class));
            }
        });

        zerg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                global.setRace("Zerg");
                startActivity(new Intent(RaceSelector.this,ZergUnits.class));
            }
        });

        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RaceSelector.this,MenuSc2.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_race_selector, menu);
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
