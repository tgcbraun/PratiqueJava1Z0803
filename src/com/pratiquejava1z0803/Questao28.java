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

public class Questao28 extends Activity {
	
	private CheckBox checkbox_questao28A;
    private CheckBox checkbox_questao28B;
    private CheckBox checkbox_questao28C;
    private CheckBox checkbox_questao28D;
    private CheckBox checkbox_questao28E;
    private CheckBox checkbox_questao28F;
    private TextView RespostaQuestao28;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao28);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao28A = (CheckBox) findViewById(R.id.checkbox_questao28A);
		checkbox_questao28B = (CheckBox) findViewById(R.id.checkbox_questao28B);
		checkbox_questao28C = (CheckBox) findViewById(R.id.checkbox_questao28C);
		checkbox_questao28D = (CheckBox) findViewById(R.id.checkbox_questao28D);
		checkbox_questao28E = (CheckBox) findViewById(R.id.checkbox_questao28E);
		checkbox_questao28F = (CheckBox) findViewById(R.id.checkbox_questao28F);
		RespostaQuestao28 =(TextView)findViewById(R.id.RespostaQuestao28);
		
		if (checkbox_questao28F.isChecked() && checkbox_questao28A.isChecked()==false && checkbox_questao28B.isChecked()==false
				&& checkbox_questao28C.isChecked()==false && checkbox_questao28D.isChecked()==false && checkbox_questao28E.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao28.setVisibility(View.VISIBLE);
		
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
