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

public class Questao56 extends Activity {
	
	private CheckBox checkbox_questao56A;
    private CheckBox checkbox_questao56B;
    private CheckBox checkbox_questao56C;
    private CheckBox checkbox_questao56D;
    private CheckBox checkbox_questao56E;
    private CheckBox checkbox_questao56F;
    private CheckBox checkbox_questao56G;
    private TextView RespostaQuestao56;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao56);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao56A = (CheckBox) findViewById(R.id.checkbox_questao56A);
		checkbox_questao56B = (CheckBox) findViewById(R.id.checkbox_questao56B);
		checkbox_questao56C = (CheckBox) findViewById(R.id.checkbox_questao56C);
		checkbox_questao56D = (CheckBox) findViewById(R.id.checkbox_questao56D);
		checkbox_questao56E = (CheckBox) findViewById(R.id.checkbox_questao56E);
		checkbox_questao56F = (CheckBox) findViewById(R.id.checkbox_questao56F);
		checkbox_questao56G = (CheckBox) findViewById(R.id.checkbox_questao56G);
		RespostaQuestao56 =(TextView)findViewById(R.id.RespostaQuestao56);
		
		if (checkbox_questao56C.isChecked() && checkbox_questao56F.isChecked() && checkbox_questao56A.isChecked()==false
				&& checkbox_questao56B.isChecked()==false && checkbox_questao56D.isChecked()==false 
				&& checkbox_questao56E.isChecked()==false && checkbox_questao56G.isChecked()==false 
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao56.setVisibility(View.VISIBLE);
		
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
