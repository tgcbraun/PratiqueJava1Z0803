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

public class Questao10 extends Activity {
	
	private CheckBox checkbox_questao10A;
    private CheckBox checkbox_questao10B;
    private CheckBox checkbox_questao10C;
    private CheckBox checkbox_questao10D;
    private CheckBox checkbox_questao10E;
    private CheckBox checkbox_questao10F;
    private CheckBox checkbox_questao10G;
    private TextView RespostaQuestao10;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao10);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao10A = (CheckBox) findViewById(R.id.checkbox_questao10A);
		checkbox_questao10B = (CheckBox) findViewById(R.id.checkbox_questao10B);
		checkbox_questao10C = (CheckBox) findViewById(R.id.checkbox_questao10C);
		checkbox_questao10D = (CheckBox) findViewById(R.id.checkbox_questao10D);
		checkbox_questao10E = (CheckBox) findViewById(R.id.checkbox_questao10E);
		checkbox_questao10F = (CheckBox) findViewById(R.id.checkbox_questao10F);
		checkbox_questao10G = (CheckBox) findViewById(R.id.checkbox_questao10G);
		RespostaQuestao10 =(TextView)findViewById(R.id.RespostaQuestao10);
		
		if (checkbox_questao10C.isChecked() && checkbox_questao10G.isChecked() && checkbox_questao10A.isChecked()==false
				&& checkbox_questao10B.isChecked()==false && checkbox_questao10D.isChecked()==false && checkbox_questao10E.isChecked()==false
				&& checkbox_questao10F.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao10.setVisibility(View.VISIBLE);
		
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
