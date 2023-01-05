package com.example.minip;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class NewClass extends AppCompatActivity {

    DBDataBase dbnader;
    Button up6ate, de1ete, c1ear, v1ew, a66;
    EditText n1me, c0de, pr1ce, da8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_class);
        //hide the action bar
        getSupportActionBar().hide();

        dbnader = new DBDataBase(this);

        n1me = (EditText) findViewById(R.id.ET1temName);
        c0de = (EditText)findViewById(R.id.ET1temC0de);
        pr1ce = (EditText) findViewById(R.id.ETPr1ce);
        da8 = (EditText) findViewById(R.id.ETexp1reD8te);

        up6ate = (Button) findViewById(R.id.bt6Upd8te);
        de1ete = (Button) findViewById(R.id.bt6De1ete);
        c1ear = (Button) findViewById(R.id.bt6C1ear);
        v1ew = (Button) findViewById(R.id.bt6V1ew);
        a66 = (Button) findViewById(R.id.bt6A8d);
//define user defined methods
        updateItem();
        deleteItem();
        clearItem();
        ViewItem();
        adddItem();
    }

    //update button
    public void updateItem() {
        up6ate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean
                        upd8=dbnader.updateItem(c0de.getText().toString(), n1me.getText().toString(), pr1ce.getText().toString(), da8.getText().toString());
                if (upd8==true)
                    Toast.makeText(NewClass.this, "Update Done", Toast.LENGTH_LONG).show();
                else Toast.makeText(NewClass.this, "Update Failed", Toast.LENGTH_LONG).show();
            }
        });
    }
    //delete date button
    public void deleteItem() {
        de1ete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer de1 =dbnader.deleteItem(c0de.getText().toString());
                if (de1>0) Toast.makeText(NewClass.this, "Delete Done", Toast.LENGTH_LONG).show();
                else Toast.makeText(NewClass.this, "Delete Failed", Toast.LENGTH_LONG).show();
            }
        });
    }
    //clear the screen button
    public void clearItem() {
        c1ear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1me.setText("");
                c0de.setText("");
                pr1ce.setText("");
                da8.setText("");
            }
        });
    }

    //view data button
    public void ViewItem() {
        v1ew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor ur=dbnader.getAllItemz();
                if (ur.getCount()==0)
                {
                    showMessage("ERR0R","Nothing Found");
                    return;
                }
                StringBuffer bfr =new StringBuffer();
                while(ur.moveToNext())
                {
                    bfr.append("Item_Code:"+ur.getString(0)+"\n");
                    bfr.append("Item_Name:"+ur.getString(1)+"\n");
                    bfr.append("Price:"+ur.getString(2)+"\n");
                    bfr.append("Expire_Date:"+ur.getString(3)+"\n");
                }
                showMessage("Item Details", bfr.toString());
            }
        });
    }

    //add data button
    public void adddItem() {
        a66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 boolean adadddd = dbnader.adddItem(n1me.getText().toString(), pr1ce.getText().toString(), da8.getText().toString());
                 if (adadddd==true)
                     Toast.makeText(NewClass.this, "Add Done", Toast.LENGTH_LONG).show();
                 else Toast.makeText(NewClass.this, "Add Failed", Toast.LENGTH_LONG).show();
            }
        });
    }


    //status bar
    public void showMessage(String title, String io) {
        AlertDialog.Builder xs=new AlertDialog.Builder(this);
        xs.setTitle(title);
        xs.setCancelable(true);
        xs.setMessage(io);
        xs.show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.style, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem NaderMenuItem) {
        int i619d = NaderMenuItem.getItemId();
        if (i619d == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(NaderMenuItem);
    }
}