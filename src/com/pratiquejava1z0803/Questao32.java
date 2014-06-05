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

public class Questao32 extends Activity {
	
	private CheckBox checkbox_questao32A;
    private CheckBox checkbox_questao32B;
    private CheckBox checkbox_questao32C;
    private CheckBox checkbox_questao32D;
    private CheckBox checkbox_questao32E;
    private CheckBox checkbox_questao32F;
    private CheckBox checkbox_questao32G;
    private CheckBox checkbox_questao32H;
    private TextView RespostaQuestao32;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao32);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao32A = (CheckBox) findViewById(R.id.checkbox_questao32A);
		checkbox_questao32B = (CheckBox) findViewById(R.id.checkbox_questao32B);
		checkbox_questao32C = (CheckBox) findViewById(R.id.checkbox_questao32C);
		checkbox_questao32D = (CheckBox) findViewById(R.id.checkbox_questao32D);
		checkbox_questao32E = (CheckBox) findViewById(R.id.checkbox_questao32E);
		checkbox_questao32F = (CheckBox) findViewById(R.id.checkbox_questao32F);
		checkbox_questao32G = (CheckBox) findViewById(R.id.checkbox_questao32G);
		checkbox_questao32H = (CheckBox) findViewById(R.id.checkbox_questao32H);
		RespostaQuestao32 =(TextView)findViewById(R.id.RespostaQuestao32);
		
		if (checkbox_questao32C.isChecked() && checkbox_questao32A.isChecked()==false && checkbox_questao32B.isChecked()==false
				&& checkbox_questao32D.isChecked()==false && checkbox_questao32E.isChecked()==false && checkbox_questao32F.isChecked()==false
				&& checkbox_questao32G.isChecked()==false && checkbox_questao32H.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao32.setVisibility(View.VISIBLE);
		
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
