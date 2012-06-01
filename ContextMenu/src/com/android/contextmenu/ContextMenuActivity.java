package com.android.contextmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.Button;
import android.widget.Toast;

public class ContextMenuActivity extends Activity 
{
    
	Button b1;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        b1=(Button)findViewById(R.id.button1);
        registerForContextMenu(b1);
    }
    
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,ContextMenuInfo menuInfo)
    {
    	menu.setHeaderTitle("Select an option");
    	menu.setHeaderIcon(R.drawable.icon);
    	
    	menu.add(0, v.getId(),0, "Item1");
    	menu.add(0, v.getId(),1, "Item2");
    	menu.add(0, v.getId(),2, "Item3");
    	menu.add(0, v.getId(),3, "Item4");
    	menu.add(0, v.getId(),4, "Item5");
    	super.onCreateContextMenu(menu, v, menuInfo);
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) 
    {
    	Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();

    	return super.onContextItemSelected(item);
    }
}