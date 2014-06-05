package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao68 extends Activity {
	
	private CheckBox checkbox_questao68A;
    private CheckBox checkbox_questao68B;
    private CheckBox checkbox_questao68C;
    private CheckBox checkbox_questao68D;
    private CheckBox checkbox_questao68E;
    private CheckBox checkbox_questao68F;
    private CheckBox checkbox_questao68G;
    private CheckBox checkbox_questao68H;
    private TextView RespostaQuestao68;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao68);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao68A = (CheckBox) findViewById(R.id.checkbox_questao68A);
		checkbox_questao68B = (CheckBox) findViewById(R.id.checkbox_questao68B);
		checkbox_questao68C = (CheckBox) findViewById(R.id.checkbox_questao68C);
		checkbox_questao68D = (CheckBox) findViewById(R.id.checkbox_questao68D);
		checkbox_questao68E = (CheckBox) findViewById(R.id.checkbox_questao68E);
		checkbox_questao68F = (CheckBox) findViewById(R.id.checkbox_questao68F);
		checkbox_questao68G = (CheckBox) findViewById(R.id.checkbox_questao68G);
		checkbox_questao68H = (CheckBox) findViewById(R.id.checkbox_questao68H);
		RespostaQuestao68 =(TextView)findViewById(R.id.RespostaQuestao68);
		
		if (checkbox_questao68H.isChecked() && checkbox_questao68A.isChecked()==false && checkbox_questao68B.isChecked()==false
				&& checkbox_questao68C.isChecked()==false && checkbox_questao68D.isChecked()==false 
				&& checkbox_questao68E.isChecked()==false && checkbox_questao68F.isChecked()==false
				&& checkbox_questao68G.isChecked()==false
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao68.setVisibility(View.VISIBLE);
		
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
