package scarmy.za.ac.cput.ScArmyBuilder;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import scarmy.za.ac.cput.ScArmyBuilder.model.ArmyObject;
import scarmy.za.ac.cput.ScArmyBuilder.services.Impl.ArmyServiceViewImpl;

public class ViewArmy extends AppCompatActivity {

    private List<ArmyObject> armyClusterT;
    private List<ArmyObject> armyClusterP;
    private List<ArmyObject> armyClusterZ;
    private List<ArmyObject> armyUser;

    private ArrayList<String> strArmyList;
    private ListView armyListView;

    private HashMap<String,ArrayList<HashMap<String,String>>> ArmyMain = new HashMap<>();
    private Global global;
    private int checkV;
    private String email;
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_army);

        checkV = 0;
        armyListView = (ListView)findViewById(R.id.listViewArmy);

        global = (Global) getApplicationContext();
        email = global.getLoggedInEmail();
        armyUser = new ArrayList<>();

        back = (Button)findViewById(R.id.btnBackView);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ViewArmy.this,MenuSc2.class));
            }
        });
        global.setCheckV(0);

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

                strArmyList = new ArrayList<>();
                if(armyUser.size()!=0) {
                    for (ArmyObject army : armyUser) {
                        strArmyList.add("User:  " + army.getUser() + "\n"
                                + "Army Name:  " + army.getArmyName() + "\n"
                                + "Army Race::  " + army.getRace() + "\n"
                                + "Army ID::  " + army.getId());
                        checkV = 1;
                    }
                    global.setCheckV(checkV);
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
        if(armyUser.size() != 0)
        {
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(ViewArmy.this, android.R.layout.simple_list_item_1, android.R.id.text1, strArmyList);
            armyListView.setAdapter(adapter);
        }
        else
        {
            AlertDialog.Builder adb = new AlertDialog.Builder(ViewArmy.this);
            adb.setTitle("No Armies!");
            adb.setMessage("No armies conntected to the current email: " + email);
            adb.setPositiveButton("OK", null);
            adb.show();
            startActivity(new Intent(ViewArmy.this, MenuSc2.class));
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_view_army, menu);
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
