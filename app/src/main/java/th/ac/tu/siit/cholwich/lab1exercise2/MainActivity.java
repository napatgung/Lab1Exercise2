package th.ac.tu.siit.cholwich.lab1exercise2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void inputTemp(View v)
    {
        Double d;
        String s;
        EditText etInput = (EditText)findViewById(R.id.etInput);

        s = etInput.getText().toString();
        d = Double.parseDouble(s);

        RadioGroup rgFrom = (RadioGroup)findViewById(R.id.rgFrom);
        RadioGroup rgTo = (RadioGroup)findViewById(R.id.rgTo);
        int selForm = rgFrom.getCheckedRadioButtonId();
        int selTo = rgTo.getCheckedRadioButtonId();
        if (selForm == R.id.rbFrmC) { //The user wants to convert from Celsius.


        }
        else if (selForm == R.id.rbFrmF) { //The user wants to convert from Celsius.
            d = d-32;
            d=d*5;
            d =d/9;
        }
        else if (selForm == R.id.rbFrmK) { //The user wants to convert from Celsius.
            d = d-273;
        }




        if (selTo == R.id.rbToC) { //The user wants to convert from Celsius.


        }

        else if (selTo == R.id.rbToF) { //The user wants to convert from Celsius.
            d = ((9.0/5.0)*d)+32;
        }
        else if (selTo == R.id.rbToK) { //The user wants to convert from Celsius.
            d = d+273;
        }

        TextView m = (TextView)findViewById(R.id.tvOutput);
        String n = d.toString();
        m.setText(n);


    }
//    public void buttonClicked(View v)
//    {
//        TextView tv = (TextView)findViewById(R.id.textview);
//        Double.parseDouble(s);
//
//    }

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
}
