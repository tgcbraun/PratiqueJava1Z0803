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

public class Questao9 extends Activity {
	
	private CheckBox checkbox_questao9A;
    private CheckBox checkbox_questao9B;
    private CheckBox checkbox_questao9C;
    private CheckBox checkbox_questao9D;
    private CheckBox checkbox_questao9E;
    private CheckBox checkbox_questao9F;
    private CheckBox checkbox_questao9G;
    private TextView RespostaQuestao9;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao9);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao9A = (CheckBox) findViewById(R.id.checkbox_questao9A);
		checkbox_questao9B = (CheckBox) findViewById(R.id.checkbox_questao9B);
		checkbox_questao9C = (CheckBox) findViewById(R.id.checkbox_questao9C);
		checkbox_questao9D = (CheckBox) findViewById(R.id.checkbox_questao9D);
		checkbox_questao9E = (CheckBox) findViewById(R.id.checkbox_questao9E);
		checkbox_questao9F = (CheckBox) findViewById(R.id.checkbox_questao9F);
		checkbox_questao9G = (CheckBox) findViewById(R.id.checkbox_questao9G);
		RespostaQuestao9 =(TextView)findViewById(R.id.RespostaQuestao9);
		
		if (checkbox_questao9C.isChecked() && checkbox_questao9F.isChecked() && checkbox_questao9A.isChecked()==false
				&& checkbox_questao9B.isChecked()==false && checkbox_questao9D.isChecked()==false && checkbox_questao9E.isChecked()==false
				&& checkbox_questao9G.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao9.setVisibility(View.VISIBLE);
		
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
