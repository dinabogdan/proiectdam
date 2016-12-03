package com.ase.dam.damtranslator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;

public class HomeActivity extends AppCompatActivity {

    private Spinner  spnFromLanguage;
    private Spinner  spnToLanguage;
    private EditText etInitialText;
    private EditText etResultText;
    private Button   btnTranslate;
    private ImageButton btnSwitchLanguages;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initComponents();
    }

    /*
     * PRIVATE HELPER METHODS
     */
    private void initComponents () {
        spnFromLanguage = (Spinner) findViewById (R.id.act_home_spn_from_lang);
        initSpinnerFromResource (spnFromLanguage, R.array.languages);
        spnToLanguage = (Spinner) findViewById (R.id.act_home_spn_to_lang);
        initSpinnerFromResource (spnToLanguage, R.array.languages);
        etInitialText = (EditText) findViewById (R.id.act_home_et_initial_text);
        etResultText  = (EditText) findViewById (R.id.act_home_et_result_text);
        btnSwitchLanguages = (ImageButton) findViewById (R.id.act_home_btn_switch_lang);
        btnTranslate = (Button) findViewById (R.id.act_home_btn_translate);
    }

    private void initSpinnerFromResource (Spinner spinner, int resourceId) {
        ArrayAdapter <CharSequence> adapter = ArrayAdapter.createFromResource (getApplicationContext(), resourceId, R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter (adapter);
    }
}
