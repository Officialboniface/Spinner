package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     Spinner statespinner = findViewById(R.id.firstspinner);
        statespinner.setOnItemSelectedListener(this);

     List<String> list = new ArrayList<String>();

            list.add("Abia State");
            list.add("Adamawa State");
            list.add("Akwa Ibom State");
            list.add("Anambra State");
            list.add("Bauchi State");
            list.add("Bayelsa State");
            list.add("Benue State");
            list.add("Borno State");
            list.add("Cross River State");
            list.add("Delta State");
            list.add("Ebonyi State");
            list.add("Edo State");
            list.add("Ekiti State");
            list.add("Enugu State");
            list.add("FCT");
            list.add("Gombe State");
            list.add("Imo State");
            list.add("Jigawa State");
            list.add("Kaduna State");
            list.add("Kano State");
            list.add("Katsina State");
            list.add("Kebbi State");
            list.add("Kogi State");
            list.add("Kwara State");
            list.add("Lagos State");
            list.add("Nasarawa State");
            list.add("Niger State ");
            list.add("Ogun State");
            list.add("Oyo State");
            list.add("Plateau State");
            list.add("Rivers State");
            list.add("Sokoto State");
            list.add("Taraba State");
            list.add("Yobe State");
            list.add("Zamfara State");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String> (this, android.R.layout.simple_spinner_item,list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        statespinner.setAdapter(dataAdapter);






        Spinner lgspinner = findViewById(R.id.secondspinner);
        lgspinner.setOnItemSelectedListener(this);
        List<String> list2 = new ArrayList<String>();

        list2.add("Abak");
        list2.add("Eastern Obolo");
        list2.add("Eket");
        list2.add("Uran");
        list2.add("Ibiono Ibom");
        list2.add("Uyo");
        list2.add("Ikot Ekpene");
        list2.add("Oruk Anam");
        list2.add("Itu");
        list2.add("Obot Akara");
        list2.add("Mkpat Enin");
        list2.add("Nsit Atai");
        list2.add("Nsit Ubium");
        list2.add("Nsit Ibom");
        list2.add("Etinan");
        list2.add("Mbo");
        list2.add("Ika");
        list2.add("Ini");
        list2.add("Ikono");
        list2.add("Essien Udim");
        list2.add("Ikot Abasi");
        list2.add("Onna");
        list2.add("Ibesikpo Asutan");
        list2.add("Ibeno");
        list2.add("Okobo");
        list2.add("Ukanafun");
        list2.add("Udung Uko");
        list2.add("Urue Offong Oruko");
        list2.add("Oron");
        list2.add("Esit Eket");
        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String> (this, android.R.layout.simple_spinner_item,list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        lgspinner.setAdapter(dataAdapter1);



        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String> (this, android.R.layout.simple_spinner_item,list2);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        lgspinner.setAdapter(dataAdapter2);



    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


        String item = parent.getItemAtPosition(position).toString();

        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}


