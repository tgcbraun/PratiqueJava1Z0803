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

public class Questao20 extends Activity {
	
	private CheckBox checkbox_questao20A;
    private CheckBox checkbox_questao20B;
    private CheckBox checkbox_questao20C;
    private CheckBox checkbox_questao20D;
    private CheckBox checkbox_questao20E;
    private CheckBox checkbox_questao20F;
    private CheckBox checkbox_questao20G;
    private TextView RespostaQuestao20;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao20);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao20A = (CheckBox) findViewById(R.id.checkbox_questao20A);
		checkbox_questao20B = (CheckBox) findViewById(R.id.checkbox_questao20B);
		checkbox_questao20C = (CheckBox) findViewById(R.id.checkbox_questao20C);
		checkbox_questao20D = (CheckBox) findViewById(R.id.checkbox_questao20D);
		checkbox_questao20E = (CheckBox) findViewById(R.id.checkbox_questao20E);
		checkbox_questao20F = (CheckBox) findViewById(R.id.checkbox_questao20F);
		checkbox_questao20G = (CheckBox) findViewById(R.id.checkbox_questao20G);
		RespostaQuestao20 =(TextView)findViewById(R.id.RespostaQuestao20);
		
		if (checkbox_questao20B.isChecked() && checkbox_questao20A.isChecked()==false && checkbox_questao20C.isChecked()==false
				&& checkbox_questao20D.isChecked()==false && checkbox_questao20E.isChecked()==false && checkbox_questao20F.isChecked()==false
				&& checkbox_questao20G.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao20.setVisibility(View.VISIBLE);
		
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
