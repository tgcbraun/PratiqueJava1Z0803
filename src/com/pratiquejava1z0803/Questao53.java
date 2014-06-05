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

public class Questao53 extends Activity {
	
	private CheckBox checkbox_questao53A;
    private CheckBox checkbox_questao53B;
    private CheckBox checkbox_questao53C;
    private CheckBox checkbox_questao53D;
    private CheckBox checkbox_questao53E;
    private CheckBox checkbox_questao53F;
    private CheckBox checkbox_questao53G;
    private TextView RespostaQuestao53;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao53);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao53A = (CheckBox) findViewById(R.id.checkbox_questao53A);
		checkbox_questao53B = (CheckBox) findViewById(R.id.checkbox_questao53B);
		checkbox_questao53C = (CheckBox) findViewById(R.id.checkbox_questao53C);
		checkbox_questao53D = (CheckBox) findViewById(R.id.checkbox_questao53D);
		checkbox_questao53E = (CheckBox) findViewById(R.id.checkbox_questao53E);
		checkbox_questao53F = (CheckBox) findViewById(R.id.checkbox_questao53F);
		checkbox_questao53G = (CheckBox) findViewById(R.id.checkbox_questao53G);
		RespostaQuestao53 =(TextView)findViewById(R.id.RespostaQuestao53);
		
		if (checkbox_questao53C.isChecked() && checkbox_questao53A.isChecked()==false && checkbox_questao53B.isChecked()==false
				&& checkbox_questao53D.isChecked()==false && checkbox_questao53E.isChecked()==false 
				&& checkbox_questao53F.isChecked()==false && checkbox_questao53G.isChecked()==false
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao53.setVisibility(View.VISIBLE);
		
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
