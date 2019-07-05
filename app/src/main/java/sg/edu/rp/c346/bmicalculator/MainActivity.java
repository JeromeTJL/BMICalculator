package sg.edu.rp.c346.bmicalculator;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    EditText etHeight, etWeight;
    Button btnCalc, btnReset;
    TextView tvLastCalc, tvLastCalcBMI;
    TextView tvBMI, tvDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etHeight = findViewById(R.id.editTextHeight);
        etWeight = findViewById(R.id.editTextWeight);
        btnCalc = findViewById(R.id.buttonCalculate);
        btnReset = findViewById(R.id.buttonReset);
        tvLastCalc = findViewById(R.id.textViewLastCalculated);
        tvLastCalcBMI = findViewById(R.id.textViewLastCalBMI);
        tvBMI = findViewById(R.id.textViewBMI);
        tvDate = findViewById(R.id.textViewDate);

    }

    @Override
    protected void onPause() {
        super.onPause();

        Integer height = etHeight.getHeight();

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);

        SharedPreferences.Editor prefEdit= prefs.edit();

        prefEdit.putFloat("Height", height);

        prefEdit.commit();
    }


}
