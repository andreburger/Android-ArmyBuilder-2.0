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

public class TerranUnits extends AppCompatActivity {

    private Button marine;
    private Button marauder;
    private Button ghost;
    private Button banshee;
    private Button battlecruiser;
    private Button viking;
    private Button hellion;
    private Button siegetank;
    private Button reaper;
    private Button thor;
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
        setContentView(R.layout.activity_terran_units);

        help = (Button)findViewById(R.id.btnHelpT);
        global = (Global) getApplicationContext();
        pop = (TextView)findViewById(R.id.txtpopT);
        name=(TextView)findViewById(R.id.txtArmyNameT);
        marine = (Button)findViewById(R.id.btnMarine);
        marauder = (Button)findViewById(R.id.btnMarauder);
        ghost = (Button)findViewById(R.id.btnGhost);
        banshee = (Button)findViewById(R.id.btnBanshee);
        battlecruiser = (Button)findViewById(R.id.btnCruiser);
        viking = (Button)findViewById(R.id.btnViking);
        hellion = (Button)findViewById(R.id.btnHellion);
        siegetank = (Button)findViewById(R.id.btnSiegetank);
        reaper = (Button)findViewById(R.id.btnReaper);
        thor = (Button)findViewById(R.id.btnThor);

        cancel = (Button)findViewById(R.id.btnCancelT);
        create = (Button)findViewById(R.id.btnCreateT);

        marine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int popCap = Integer.parseInt(pop.getText().toString());
                popCap = popCap + 1;
                if(popCap > 200) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(TerranUnits.this);
                    adb.setTitle("Can't Add!");
                    adb.setMessage("Not enough population capacity left!");
                    adb.setPositiveButton("OK", null);
                    adb.show();
                }
                else {
                    army.add("Marine");
                    pop.setText(popCap + "");
                }
            }
        });
        marauder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int popCap = Integer.parseInt(pop.getText().toString());
                popCap = popCap + 2;
                if(popCap > 200) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(TerranUnits.this);
                    adb.setTitle("Can't Add!");
                    adb.setMessage("Not enough population capacity left!");
                    adb.setPositiveButton("OK", null);
                    adb.show();
                }
                else {
                    army.add("Marauder");
                    pop.setText(popCap + "");
                }
            }
        });
        ghost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int popCap = Integer.parseInt(pop.getText().toString());
                popCap = popCap + 2;
                if(popCap > 200) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(TerranUnits.this);
                    adb.setTitle("Can't Add!");
                    adb.setMessage("Not enough population capacity left!");
                    adb.setPositiveButton("OK", null);
                    adb.show();
                }
                else {
                    army.add("Ghost");
                    pop.setText(popCap + "");
                }
            }
        });
        banshee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int popCap = Integer.parseInt(pop.getText().toString());
                popCap = popCap + 3;
                if(popCap > 200) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(TerranUnits.this);
                    adb.setTitle("Can't Add!");
                    adb.setMessage("Not enough population capacity left!");
                    adb.setPositiveButton("OK", null);
                    adb.show();
                }
                else {
                    army.add("Banshee");
                    pop.setText(popCap + "");
                }
            }
        });
        battlecruiser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int popCap = Integer.parseInt(pop.getText().toString());
                popCap = popCap + 6;
                if(popCap > 200) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(TerranUnits.this);
                    adb.setTitle("Can't Add!");
                    adb.setMessage("Not enough population capacity left!");
                    adb.setPositiveButton("OK", null);
                    adb.show();
                }
                else {
                    army.add("Battlecruiser");
                    pop.setText(popCap + "");
                }
            }
        });
        viking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int popCap = Integer.parseInt(pop.getText().toString());
                popCap = popCap + 2;
                if(popCap > 200) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(TerranUnits.this);
                    adb.setTitle("Can't Add!");
                    adb.setMessage("Not enough population capacity left!");
                    adb.setPositiveButton("OK", null);
                    adb.show();
                }
                else {
                    army.add("Viking");
                    pop.setText(popCap + "");
                }
            }
        });
        hellion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int popCap = Integer.parseInt(pop.getText().toString());
                popCap = popCap + 2;
                if(popCap > 200) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(TerranUnits.this);
                    adb.setTitle("Can't Add!");
                    adb.setMessage("Not enough population capacity left!");
                    adb.setPositiveButton("OK", null);
                    adb.show();
                }
                else {
                    army.add("Hellion");
                    pop.setText(popCap + "");
                }
            }
        });
        siegetank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int popCap = Integer.parseInt(pop.getText().toString());
                popCap = popCap + 3;
                if(popCap > 200) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(TerranUnits.this);
                    adb.setTitle("Can't Add!");
                    adb.setMessage("Not enough population capacity left!");
                    adb.setPositiveButton("OK", null);
                    adb.show();
                }
                else {
                    army.add("Siege Tank");
                    pop.setText(popCap + "");
                }
            }
        });
        reaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int popCap = Integer.parseInt(pop.getText().toString());
                popCap = popCap + 1;
                if(popCap > 200) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(TerranUnits.this);
                    adb.setTitle("Can't Add!");
                    adb.setMessage("Not enough population capacity left!");
                    adb.setPositiveButton("OK", null);
                    adb.show();
                }
                else {
                    army.add("Reaper");
                    pop.setText(popCap + "");
                }
            }
        });
        thor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int popCap = Integer.parseInt(pop.getText().toString());
                popCap = popCap + 5;
                if(popCap > 200) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(TerranUnits.this);
                    adb.setTitle("Can't Add!");
                    adb.setMessage("Not enough population capacity left!");
                    adb.setPositiveButton("OK", null);
                    adb.show();
                }
                else {
                    army.add("Thor");
                    pop.setText(popCap + "");
                }
            }
        });

        help.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                AlertDialog.Builder adb = new AlertDialog.Builder(TerranUnits.this);
                adb.setTitle("Info");
                adb.setMessage("Click on the Unit Names to add them to your army and see your Population counter grow! Remember 200 is your maximum population! Click Create to save it!.");
                adb.setPositiveButton("OK", null);
                adb.show();
            }
        });

        cancel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TerranUnits.this, RaceSelector.class));
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

                        armyS.setRace("Terran");
                        armyS.setPop(pop.getText().toString());
                        service.createT(armyS);
                    }
                });

                thread.start();

                try {

                    thread.join();
                }
                catch (Exception e) {

                    e.printStackTrace();
                }

                startActivity(new Intent(TerranUnits.this,MenuSc2.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_terran_units, menu);
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
