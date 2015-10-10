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

import scarmy.za.ac.cput.ScArmyBuilder.model.User;
import scarmy.za.ac.cput.ScArmyBuilder.services.Impl.UserServiceImpl;
import scarmy.za.ac.cput.ScArmyBuilder.services.UserService;

public class Register extends AppCompatActivity {

    private Button cancel;
    private Button register;
    private EditText email;
    private EditText pw;
    private EditText fn;
    private EditText sn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        email = (EditText)findViewById(R.id.txtEmail);
        pw = (EditText)findViewById(R.id.txtPassword);
        fn = (EditText)findViewById(R.id.txtFirstname);
        sn = (EditText)findViewById(R.id.txtSurname);

        register = (Button)findViewById(R.id.btnRegister);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {

                        UserService service = new UserServiceImpl();

                        User user = new User();

                        user.setEmail(email.getText().toString());
                        user.setUserpassword(pw.getText().toString());
                        user.setFirstname(fn.getText().toString());
                        user.setLastname(sn.getText().toString());
                        service.save(user);
                    }
                });

                thread.start();

                try {

                    thread.join();
                }
                catch (Exception e) {

                    e.printStackTrace();
                }
                    startActivity(new Intent(Register.this,Login.class));

            }
        });


        cancel = (Button)findViewById(R.id.btnCancelReg);

        cancel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Register.this,Login.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_register, menu);
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
