package scarmy.za.ac.cput.ScArmyBuilder;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import scarmy.za.ac.cput.ScArmyBuilder.model.ArmyService;
import scarmy.za.ac.cput.ScArmyBuilder.services.ArmyUnitsService;
import scarmy.za.ac.cput.ScArmyBuilder.services.Impl.ArmyServiceImpl;

public class ZergUnits extends AppCompatActivity {

    private Button baneling;
    private Button broodlord;
    private Button corruptor;
    private Button hydralisk;
    private Button infestor;
    private Button mutalisk;
    private Button queen;
    private Button roach;
    private Button ultralisk;
    private Button zergling;
    private TextView pop;
    private TextView name;
    private List<String> army =new ArrayList<>();
    private Button cancel;
    private Button create;
    private Global global;
    private Button help;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zerg_units);

        help = (Button)findViewById(R.id.btnHelpZ);
        baneling = (Button) findViewById(R.id.btnBaneling);
        broodlord = (Button) findViewById(R.id.btnBroodlord);
        corruptor = (Button) findViewById(R.id.btnCorruptor);
        hydralisk = (Button) findViewById(R.id.btnHydralisk);
        infestor = (Button) findViewById(R.id.btnInfestor);
        mutalisk = (Button) findViewById(R.id.btnMutalisk);
        queen = (Button) findViewById(R.id.btnQueen);
        roach = (Button) findViewById(R.id.btnRoach);
        ultralisk = (Button) findViewById(R.id.btnUltralisk);
        zergling = (Button) findViewById(R.id.btnZergling);

        pop = (TextView) findViewById(R.id.txtpopZ);
        name=(TextView)findViewById(R.id.txtArmyNameZ);
        cancel = (Button) findViewById(R.id.btnCancelZ);
        create = (Button) findViewById(R.id.btnCreateZ);

        global = (Global) getApplicationContext();

        baneling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int popCap = Integer.parseInt(pop.getText().toString());
                popCap = popCap + 1;
                if(popCap > 200) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(ZergUnits.this);
                    adb.setTitle("Can't Add!");
                    adb.setMessage("Not enough population capacity left!");
                    adb.setPositiveButton("OK", null);
                    adb.show();
                }
                else {
                    army.add("Baneling");
                    pop.setText(popCap + "");
                }
            }
        });
        broodlord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int popCap = Integer.parseInt(pop.getText().toString());
                popCap = popCap + 4;
                if(popCap > 200) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(ZergUnits.this);
                    adb.setTitle("Can't Add!");
                    adb.setMessage("Not enough population capacity left!");
                    adb.setPositiveButton("OK", null);
                    adb.show();
                }
                else {
                    army.add("Broodlord");
                    pop.setText(popCap + "");
                }
            }
        });
        corruptor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int popCap = Integer.parseInt(pop.getText().toString());
                popCap = popCap + 2;
                if(popCap > 200) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(ZergUnits.this);
                    adb.setTitle("Can't Add!");
                    adb.setMessage("Not enough population capacity left!");
                    adb.setPositiveButton("OK", null);
                    adb.show();
                }
                else {
                    army.add("Corruptor");
                    pop.setText(popCap + "");
                }
            }
        });
        hydralisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int popCap = Integer.parseInt(pop.getText().toString());
                popCap = popCap + 2;
                if(popCap > 200) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(ZergUnits.this);
                    adb.setTitle("Can't Add!");
                    adb.setMessage("Not enough population capacity left!");
                    adb.setPositiveButton("OK", null);
                    adb.show();
                }
                else {
                    army.add("Hydralisk");
                    pop.setText(popCap + "");
                }
            }
        });
        infestor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int popCap = Integer.parseInt(pop.getText().toString());
                popCap = popCap + 2;
                if(popCap > 200) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(ZergUnits.this);
                    adb.setTitle("Can't Add!");
                    adb.setMessage("Not enough population capacity left!");
                    adb.setPositiveButton("OK", null);
                    adb.show();
                }
                else {
                    army.add("Infestor");
                    pop.setText(popCap + "");
                }
            }
        });
        mutalisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int popCap = Integer.parseInt(pop.getText().toString());
                popCap = popCap + 2;
                if(popCap > 200) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(ZergUnits.this);
                    adb.setTitle("Can't Add!");
                    adb.setMessage("Not enough population capacity left!");
                    adb.setPositiveButton("OK", null);
                    adb.show();
                }
                else {
                    army.add("Mutalisk");
                    pop.setText(popCap + "");
                }
            }
        });
        queen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int popCap = Integer.parseInt(pop.getText().toString());
                popCap = popCap + 2;
                if(popCap > 200) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(ZergUnits.this);
                    adb.setTitle("Can't Add!");
                    adb.setMessage("Not enough population capacity left!");
                    adb.setPositiveButton("OK", null);
                    adb.show();
                }
                else {
                    army.add("Queen");
                    pop.setText(popCap + "");
                }
            }
        });
        roach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int popCap = Integer.parseInt(pop.getText().toString());
                popCap = popCap + 2;
                if(popCap > 200) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(ZergUnits.this);
                    adb.setTitle("Can't Add!");
                    adb.setMessage("Not enough population capacity left!");
                    adb.setPositiveButton("OK", null);
                    adb.show();
                }
                else {
                    army.add("Roach");
                    pop.setText(popCap + "");
                }
            }
        });
        ultralisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int popCap = Integer.parseInt(pop.getText().toString());
                popCap = popCap + 6;
                if(popCap > 200) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(ZergUnits.this);
                    adb.setTitle("Can't Add!");
                    adb.setMessage("Not enough population capacity left!");
                    adb.setPositiveButton("OK", null);
                    adb.show();
                }
                else {
                    army.add("Ultralisk");
                    pop.setText(popCap + "");
                }
            }
        });
        zergling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int popCap = Integer.parseInt(pop.getText().toString());
                popCap = popCap + 1;
                if(popCap > 200) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(ZergUnits.this);
                    adb.setTitle("Can't Add!");
                    adb.setMessage("Not enough population capacity left!");
                    adb.setPositiveButton("OK", null);
                    adb.show();
                }
                else {
                    army.add("Zergling");
                    pop.setText(popCap + "");
                }
            }
        });

        help.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                AlertDialog.Builder adb = new AlertDialog.Builder(ZergUnits.this);
                adb.setTitle("Info");
                adb.setMessage("Click on the Unit Names to add them to your army and see your Population counter grow! Remember 200 is your maximum population! Click Create to save it!.");
                adb.setPositiveButton("OK", null);
                adb.show();
            }
        });

        cancel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ZergUnits.this, RaceSelector.class));
            }
        });
        create.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {

                        ArmyUnitsService service = new ArmyServiceImpl();

                        ArmyService armyS = new ArmyService();
                        armyS.setArmy(army);
                        armyS.setEmail(global.getLoggedInEmail());

                        if(name.getText().toString().trim().length() == 0) {
                            armyS.setArmyname("Unknown Army");
                        }
                        else
                        {
                            armyS.setArmyname(name.getText().toString());
                        }
                        armyS.setRace("Zerg");
                        armyS.setPop(pop.getText().toString());
                        service.createZ(armyS);
                    }
                });

                thread.start();

                try {

                    thread.join();
                }
                catch (Exception e) {

                    e.printStackTrace();
                }

                startActivity(new Intent(ZergUnits.this,MenuSc2.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_zerg_units, menu);
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
