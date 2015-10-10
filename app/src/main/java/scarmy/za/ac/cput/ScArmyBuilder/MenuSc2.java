package scarmy.za.ac.cput.ScArmyBuilder;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MenuSc2 extends AppCompatActivity {

    private LinearLayout armycreate;
    private LinearLayout armyview;
    private LinearLayout armydelete;
    private Global global;
    private int check;
    private int checkV;
    private Button help;
    private Button logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        help = (Button)findViewById(R.id.btnMenuHelp);

        logout = (Button)findViewById(R.id.btnLogout);

        global = (Global)getApplicationContext();
        check = global.getCheck();
        checkV = global.getCheckV();
        armycreate = (LinearLayout)findViewById(R.id.createArmy);
        armyview = (LinearLayout)findViewById(R.id.viewArmy);
        armydelete=(LinearLayout)findViewById(R.id.deleteArmy);


        if(check == 1)
        {
            AlertDialog.Builder adb = new AlertDialog.Builder(MenuSc2.this);
            adb.setTitle("Deleted!");
            adb.setMessage("Army was deleted!.");
            adb.setPositiveButton("OK", null);
            adb.show();
        }
        if(check == 0)
        {
            AlertDialog.Builder adb = new AlertDialog.Builder(MenuSc2.this);
            adb.setTitle("Not deleted!!");
            adb.setMessage("No ID/Race combo found!!.");
            adb.setPositiveButton("OK", null);
            adb.show();
        }

        if(checkV == 0)
        {
            AlertDialog.Builder adb = new AlertDialog.Builder(MenuSc2.this);
            adb.setTitle("No Army!!");
            adb.setMessage("No armies on this username/email!!.");
            adb.setPositiveButton("OK", null);
            adb.show();
        }



        global.setCheckV(3);
        global.setCheck(3);


        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                global.setLoggedInEmail("");
                startActivity(new Intent(MenuSc2.this,Login.class));
            }
        });
        armycreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuSc2.this,RaceSelector.class));
            }
        });

        armyview.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuSc2.this,ViewArmy.class));
            }
        });

        armydelete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuSc2.this,ArmyDelete.class));
            }
        });

        help.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                AlertDialog.Builder adb = new AlertDialog.Builder(MenuSc2.this);
                adb.setTitle("Info");
                adb.setMessage("Clicking on View Army won't do anything if you don't have atleast 1 army created on the current Email/Username. Clicking View Army might be slow.");
                adb.setPositiveButton("OK", null);
                adb.show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu, menu);
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
