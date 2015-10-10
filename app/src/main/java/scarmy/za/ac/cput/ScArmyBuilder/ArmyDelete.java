package scarmy.za.ac.cput.ScArmyBuilder;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

import scarmy.za.ac.cput.ScArmyBuilder.model.ArmyObject;
import scarmy.za.ac.cput.ScArmyBuilder.services.Impl.ArmyServiceDeleteImpl;
import scarmy.za.ac.cput.ScArmyBuilder.services.Impl.ArmyServiceViewImpl;

public class ArmyDelete extends AppCompatActivity {

    private EditText id;
    private EditText race;
    private Button delete;
    private List<ArmyObject> armyClusterT;
    private List<ArmyObject> armyClusterP;
    private List<ArmyObject> armyClusterZ;
    private List<ArmyObject> armyUser;
    private int check;
    private Global global;
    private String email;
    private Button deleteHelp;
    private Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_army_delete);

        deleteHelp = (Button)findViewById(R.id.btnHelpDelete);
        global = (Global) getApplicationContext();
        email = global.getLoggedInEmail();
        armyUser = new ArrayList<>();
        global.setCheck(0);
        id = (EditText)findViewById(R.id.txtDeleteID);
        race = (EditText)findViewById(R.id.txtDeleteRace);

        delete = (Button)findViewById(R.id.btnDelete);
        back = (Button)findViewById(R.id.btnBackDelete);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ArmyDelete.this,MenuSc2.class));
            }
        });


        deleteHelp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                AlertDialog.Builder adb = new AlertDialog.Builder(ArmyDelete.this);
                adb.setTitle("Info");
                adb.setMessage("If you don't know the ID and Race of the army you want to delete go find it in View Army first.");
                adb.setPositiveButton("OK", null);
                adb.show();
            }
        });


        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        ArmyServiceViewImpl service = new ArmyServiceViewImpl();

                        armyClusterT = service.viewT();
                        armyClusterP = service.viewP();
                        armyClusterZ = service.viewZ();

                        int sizeT = armyClusterT.size();
                        int sizeP = armyClusterP.size();
                        int sizeZ = armyClusterZ.size();

                        if(sizeT != 0)
                        {
                            for(int i = 0;i<sizeT;i++)
                            {
                                if(armyClusterT.get(i).getUser().equals(email))
                                {
                                    armyClusterT.get(i).setRace("Terran");
                                    armyUser.add(armyClusterT.get(i));
                                }
                            }
                        }

                        if(sizeP != 0)
                        {
                            for(int i = 0;i<sizeP;i++)
                            {
                                if(armyClusterP.get(i).getUser().equals(email))
                                {
                                    armyClusterP.get(i).setRace("Protoss");
                                    armyUser.add(armyClusterP.get(i));
                                }
                            }
                        }

                        if(sizeZ != 0)
                        {
                            for(int i = 0;i<sizeZ;i++)
                            {
                                if(armyClusterZ.get(i).getUser().equals(email))
                                {
                                    armyClusterZ.get(i).setRace("Zerg");
                                    armyUser.add(armyClusterZ.get(i));
                                }
                            }
                        }

                    }
                });

                thread.start();

                try {

                    thread.join();
                }
                catch (Exception ex){

                    ex.printStackTrace();
                }

                Thread thread1 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for(int i = 0;i<armyUser.size();i++)
                        {
                            if(id.getText().toString().equals(armyUser.get(i).getId().toString()))
                            {
                                if(race.getText().toString().equals(armyUser.get(i).getRace()))
                                {
                                    ArmyServiceDeleteImpl serviceDelete = new ArmyServiceDeleteImpl();
                                    if(race.getText().toString().equals("Terran"))
                                    {
                                        serviceDelete.deleteT(armyUser.get(i));
                                        global.setCheck(1);
                                    }
                                    if(race.getText().toString().equals("Protoss"))
                                    {
                                        serviceDelete.deleteP(armyUser.get(i));
                                        global.setCheck(1);
                                    }
                                    if(race.getText().toString().equals("Zerg"))
                                    {
                                        serviceDelete.deleteZ(armyUser.get(i));
                                        global.setCheck(1);
                                    }
                                }
                            }
                        }
                    }
                });
                thread1.start();

                try {

                    thread1.join();
                }
                catch (Exception ex){

                    ex.printStackTrace();
                }


                startActivity(new Intent(ArmyDelete.this,MenuSc2.class));

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_army_delete, menu);
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
