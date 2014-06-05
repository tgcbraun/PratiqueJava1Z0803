package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao38 extends Activity {
	
	private CheckBox checkbox_questao38A;
    private CheckBox checkbox_questao38B;
    private CheckBox checkbox_questao38C;
    private CheckBox checkbox_questao38D;
    private CheckBox checkbox_questao38E;
    private CheckBox checkbox_questao38F;
    private CheckBox checkbox_questao38G;
    private TextView RespostaQuestao38;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao38);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao38A = (CheckBox) findViewById(R.id.checkbox_questao38A);
		checkbox_questao38B = (CheckBox) findViewById(R.id.checkbox_questao38B);
		checkbox_questao38C = (CheckBox) findViewById(R.id.checkbox_questao38C);
		checkbox_questao38D = (CheckBox) findViewById(R.id.checkbox_questao38D);
		checkbox_questao38E = (CheckBox) findViewById(R.id.checkbox_questao38E);
		checkbox_questao38F = (CheckBox) findViewById(R.id.checkbox_questao38F);
		checkbox_questao38G = (CheckBox) findViewById(R.id.checkbox_questao38G);
		RespostaQuestao38 =(TextView)findViewById(R.id.RespostaQuestao38);
		
		if (checkbox_questao38C.isChecked() && checkbox_questao38A.isChecked()==false && checkbox_questao38B.isChecked()==false
				&& checkbox_questao38D.isChecked()==false && checkbox_questao38E.isChecked()==false
				&& checkbox_questao38F.isChecked()==false && checkbox_questao38G.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao38.setVisibility(View.VISIBLE);
		
	}



	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
