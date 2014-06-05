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

public class Questao17 extends Activity {
	
	private CheckBox checkbox_questao17A;
    private CheckBox checkbox_questao17B;
    private CheckBox checkbox_questao17C;
    private CheckBox checkbox_questao17D;
    private CheckBox checkbox_questao17E;
    private CheckBox checkbox_questao17F;
    private TextView RespostaQuestao17;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao17);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao17A = (CheckBox) findViewById(R.id.checkbox_questao17A);
		checkbox_questao17B = (CheckBox) findViewById(R.id.checkbox_questao17B);
		checkbox_questao17C = (CheckBox) findViewById(R.id.checkbox_questao17C);
		checkbox_questao17D = (CheckBox) findViewById(R.id.checkbox_questao17D);
		checkbox_questao17E = (CheckBox) findViewById(R.id.checkbox_questao17E);
		checkbox_questao17F = (CheckBox) findViewById(R.id.checkbox_questao17F);
		RespostaQuestao17 =(TextView)findViewById(R.id.RespostaQuestao17);
		
		if (checkbox_questao17D.isChecked() && checkbox_questao17E.isChecked() && checkbox_questao17A.isChecked()==false
				&& checkbox_questao17B.isChecked()==false && checkbox_questao17C.isChecked()==false && checkbox_questao17F.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao17.setVisibility(View.VISIBLE);
		
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
