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

public class ProtossUnits extends AppCompatActivity {

    private Button archon;
    private Button zealot;
    private Button voidray;
    private Button stalker;
    private Button sentry;
    private Button pheonix;
    private Button immortal;
    private Button ht;
    private Button dt;
    private Button carrier;
    private Button colossus;
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
        setContentView(R.layout.activity_protoss_units);

        help = (Button)findViewById(R.id.btnHelpP);
        zealot = (Button) findViewById(R.id.btnZealot);
        voidray = (Button) findViewById(R.id.btnVoidray);
        stalker = (Button) findViewById(R.id.btnStalker);
        sentry = (Button) findViewById(R.id.btnSentry);
        pheonix = (Button) findViewById(R.id.btnPheonix);
        immortal = (Button) findViewById(R.id.btnImmortal);
        ht = (Button) findViewById(R.id.btnHT);
        dt = (Button) findViewById(R.id.btnDT);
        carrier = (Button) findViewById(R.id.btnCarrier);
        colossus = (Button) findViewById(R.id.btnColossus);
        archon = (Button) findViewById(R.id.btnArchon);

        pop = (TextView) findViewById(R.id.txtpopP);
        name=(TextView)findViewById(R.id.txtArmyNameP);
        cancel = (Button) findViewById(R.id.btnCancelP);
        create = (Button) findViewById(R.id.btnCreateP);

        global = (Global) getApplicationContext();

        archon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int popCap = Integer.parseInt(pop.getText().toString());
                popCap = popCap + 4;
                if(popCap > 200) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(ProtossUnits.this);
                    adb.setTitle("Can't Add!");
                    adb.setMessage("Not enough population capacity left!");
                    adb.setPositiveButton("OK", null);
                    adb.show();
                }
                else {
                    army.add("Archon");
                    pop.setText(popCap + "");
                }
            }
        });
        zealot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int popCap = Integer.parseInt(pop.getText().toString());
                popCap = popCap + 2;
                if(popCap > 200) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(ProtossUnits.this);
                    adb.setTitle("Can't Add!");
                    adb.setMessage("Not enough population capacity left!");
                    adb.setPositiveButton("OK", null);
                    adb.show();
                }
                else {
                    army.add("Zealot");
                    pop.setText(popCap + "");
                }
            }
        });
        voidray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int popCap = Integer.parseInt(pop.getText().toString());
                popCap = popCap + 3;
                if(popCap > 200) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(ProtossUnits.this);
                    adb.setTitle("Can't Add!");
                    adb.setMessage("Not enough population capacity left!");
                    adb.setPositiveButton("OK", null);
                    adb.show();
                }
                else {
                    army.add("Void Ray");
                    pop.setText(popCap + "");
                }
            }
        });
        stalker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int popCap = Integer.parseInt(pop.getText().toString());
                popCap = popCap + 2;
                if(popCap > 200) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(ProtossUnits.this);
                    adb.setTitle("Can't Add!");
                    adb.setMessage("Not enough population capacity left!");
                    adb.setPositiveButton("OK", null);
                    adb.show();
                }
                else {
                    army.add("Stalker");
                    pop.setText(popCap + "");
                }
            }
        });
        sentry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int popCap = Integer.parseInt(pop.getText().toString());
                popCap = popCap + 2;
                if(popCap > 200) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(ProtossUnits.this);
                    adb.setTitle("Can't Add!");
                    adb.setMessage("Not enough population capacity left!");
                    adb.setPositiveButton("OK", null);
                    adb.show();
                }
                else {
                    army.add("Sentry");
                    pop.setText(popCap + "");
                }
            }
        });
        pheonix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int popCap = Integer.parseInt(pop.getText().toString());
                popCap = popCap + 2;
                if(popCap > 200) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(ProtossUnits.this);
                    adb.setTitle("Can't Add!");
                    adb.setMessage("Not enough population capacity left!");
                    adb.setPositiveButton("OK", null);
                    adb.show();
                }
                else {
                    army.add("Pheonix");
                    pop.setText(popCap + "");
                }
            }
        });
        immortal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int popCap = Integer.parseInt(pop.getText().toString());
                popCap = popCap + 4;
                if(popCap > 200) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(ProtossUnits.this);
                    adb.setTitle("Can't Add!");
                    adb.setMessage("Not enough population capacity left!");
                    adb.setPositiveButton("OK", null);
                    adb.show();
                }
                else {
                    army.add("Immortal");
                    pop.setText(popCap + "");
                }
            }
        });
        ht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int popCap = Integer.parseInt(pop.getText().toString());
                popCap = popCap + 2;
                if(popCap > 200) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(ProtossUnits.this);
                    adb.setTitle("Can't Add!");
                    adb.setMessage("Not enough population capacity left!");
                    adb.setPositiveButton("OK", null);
                    adb.show();
                }
                else {
                    army.add("High Templar");
                    pop.setText(popCap + "");
                }
            }
        });
        dt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int popCap = Integer.parseInt(pop.getText().toString());
                popCap = popCap + 2;
                if(popCap > 200) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(ProtossUnits.this);
                    adb.setTitle("Can't Add!");
                    adb.setMessage("Not enough population capacity left!");
                    adb.setPositiveButton("OK", null);
                    adb.show();
                }
                else {
                    army.add("Dark Templar");
                    pop.setText(popCap + "");
                }
            }
        });
        carrier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int popCap = Integer.parseInt(pop.getText().toString());
                popCap = popCap + 6;
                if(popCap > 200) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(ProtossUnits.this);
                    adb.setTitle("Can't Add!");
                    adb.setMessage("Not enough population capacity left!");
                    adb.setPositiveButton("OK", null);
                    adb.show();
                }
                else {
                    army.add("Carrier");
                    pop.setText(popCap + "");
                }
            }
        });
        colossus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int popCap = Integer.parseInt(pop.getText().toString());
                popCap = popCap + 6;
                if(popCap > 200) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(ProtossUnits.this);
                    adb.setTitle("Can't Add!");
                    adb.setMessage("Not enough population capacity left!");
                    adb.setPositiveButton("OK", null);
                    adb.show();
                }
                else {
                    army.add("Colossus");
                    pop.setText(popCap + "");
                }
            }
        });

        help.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                AlertDialog.Builder adb = new AlertDialog.Builder(ProtossUnits.this);
                adb.setTitle("Info");
                adb.setMessage("Click on the Unit Names to add them to your army and see your Population counter grow! Remember 200 is your maximum population! Click Create to save it!.");
                adb.setPositiveButton("OK", null);
                adb.show();
            }
        });

        cancel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProtossUnits.this, RaceSelector.class));
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

                        armyS.setRace("Protoss");
                        armyS.setPop(pop.getText().toString());
                        service.createP(armyS);
                    }
                });

                thread.start();

                try {

                    thread.join();
                }
                catch (Exception e) {

                    e.printStackTrace();
                }

                startActivity(new Intent(ProtossUnits.this,MenuSc2.class));
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_protoss_units, menu);
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
