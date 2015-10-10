package scarmy.za.ac.cput.ScArmyBuilder;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    private CheckBox checkBox;
    private EditText pass;
    private Button btnReg;
    private Button btnLog;
    private String loginCheck;
    private EditText login;

    private Global global;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        global = (Global) getApplicationContext();

        checkBox = (CheckBox)findViewById(R.id.checkBox);

        pass = (EditText) findViewById(R.id.txtPasswordLogin);
        login = (EditText)findViewById(R.id.txtUsername);

        btnReg = (Button)findViewById(R.id.btnRegLogin);
        btnLog = (Button)findViewById(R.id.btnLogin);



        btnLog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(login.getText().toString().trim().length() == 0) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(Login.this);
                    adb.setTitle("No Email/Username");
                    adb.setMessage("Please enter an email/username.");
                    adb.setPositiveButton("OK", null);
                    adb.show();
                }
                else
                {
                    global.setLoggedInEmail(login.getText().toString());
                    startActivity(new Intent(Login.this, MenuSc2.class));
                }
              /*  Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        UserService service = new UserServiceImpl();
                        
                        String email =login.getText().toString();
                        String pw=pass.getText().toString();
                        
                        User user = new User();
                        user.setEmail(email);
                        user.setUserpassword(pw);
                                
                      loginCheck = service.check(user);

                    }
                });
                thread.start();

                try {

                    thread.join();
                }
                catch (Exception e) {

                    e.printStackTrace();
                }

                if(loginCheck.equals("true"))
                {
                    global.setLoggedInEmail(login.getText().toString());
                    startActivity(new Intent(Login.this,MenuSc2.class));
                }
                else
                {

                }*/
            }
        });

        btnReg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login.this,Register.class));
            }
        });

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!isChecked) {
                    pass.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    pass.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
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
