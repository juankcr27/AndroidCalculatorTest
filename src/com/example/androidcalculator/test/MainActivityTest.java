package com.example.androidcalculator.test;

import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;
import android.widget.TextView;

import com.example.androidcalculator.MainActivity;
import com.example.androidcalculator.R;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
	
	private MainActivity mMainActivity;
	private TextView result;
	private Button sumBt, restBt, multiBt, diviBt;
	
	//operators 
	private static final String NUMBER_12 = "1 2 TAB ";
	private static final String NUMBER_86 = "8 6 TAB ";
	private static final String NUMBER_6_DOT_5 = "6 PERIOD 5 TAB ";
	private static final String NUMBER_NEG_27 = "MINUS 2 7 TAB ";
	private static final String NUMBER_ZERO = "0 TAB ";
	private static final String NOT_NUMBER = "N U M B E R TAB ";
	
	//results
	private static final String ADD_RESULT = "98.0";
	private static final String ADD_DECIMAL_RESULT = "18.5";
	private static final String ADD_NEGATIVE_RESULT = "59.0";
	
	private static final String REST_RESULT = "74.0";
	private static final String REST_DECIMAL_RESULT = "5.5";
	private static final String REST_NEGATIVE_RESULT = "-113.0";
	
	private static final String MULTI_RESULT = "1032.0";
	private static final String MULTI_DECIMAL_RESULT = "78.0";
	private static final String MULTI_NEGATIVE_RESULT = "-324.0";
	
	private static final String DIVI_RESULT = "7.166666666666667";
	private static final String DIVI_DECIMAL_RESULT = "1.8461538461538463";
	private static final String DIVI_NEGATIVE_RESULT = "-4.153846153846154";
	
	private static final String INFINITI_RESULT = "Infinite";
	private static final String NOT_NUMBER_RESULT = "Math Error";
	
	
	public MainActivityTest() {
		super(MainActivity.class);
	}
	
	@Override
    protected void setUp() throws Exception {
        super.setUp();
        mMainActivity = getActivity();
        result = (TextView) mMainActivity.findViewById(R.id.result);
        sumBt = (Button) mMainActivity.findViewById(R.id.sumar);
        restBt = (Button) mMainActivity.findViewById(R.id.restar);
        multiBt = (Button) mMainActivity.findViewById(R.id.multiplicar);
        diviBt = (Button) mMainActivity.findViewById(R.id.dividir);        
    }
	
	////// Sum Test //////
	public void testAddValues() {       
        sendKeys(NUMBER_12);        
        sendKeys(NUMBER_86);
        TouchUtils.clickView(this, sumBt);       

        // get result
        String mathResult = result.getText().toString();
        assertTrue("Add result should be " + ADD_RESULT + " but was " + mathResult, mathResult.equals(ADD_RESULT));
    }
	
	public void testAddDecimalValues() {       
        sendKeys(NUMBER_12);        
        sendKeys(NUMBER_6_DOT_5);
        TouchUtils.clickView(this, sumBt);       

        // get result
        String mathResult = result.getText().toString();
        assertTrue("Add result should be " + ADD_DECIMAL_RESULT + " but was " + mathResult, mathResult.equals(ADD_DECIMAL_RESULT));
    }
	
	public void testAddNegativeValues() {       
        sendKeys(NUMBER_NEG_27);        
        sendKeys(NUMBER_86);
        TouchUtils.clickView(this, sumBt);       

        // get result
        String mathResult = result.getText().toString();
        assertTrue("Add result should be " + ADD_NEGATIVE_RESULT + " but was " + mathResult, mathResult.equals(ADD_NEGATIVE_RESULT));
    }
	
	public void testAddInvalidValues() {      
        sendKeys(NUMBER_12);        
        sendKeys(NOT_NUMBER);
        TouchUtils.clickView(this, sumBt);       

        // get result
        String mathResult = result.getText().toString();
        assertTrue("Add result should be " + NOT_NUMBER_RESULT + " but was " + mathResult, mathResult.equals(NOT_NUMBER_RESULT));
    }
		
	public void testAddFailedResult(){
		sendKeys(NUMBER_6_DOT_5);        
        sendKeys(NUMBER_12);
        TouchUtils.clickView(this, sumBt);       

        // get result
        String mathResult = result.getText().toString();
        assertTrue("Add result should be " + ADD_RESULT + " but was " + mathResult, mathResult.equals(ADD_RESULT));
	}
	/////////////////////
	
	////// Rest Test //////    
	public void testRestValues() {       
		sendKeys(NUMBER_86);
		sendKeys(NUMBER_12); 
        TouchUtils.clickView(this, restBt);       

        // get result
        String mathResult = result.getText().toString();
        assertTrue("Rest result should be " + REST_RESULT + " but was " + mathResult, mathResult.equals(REST_RESULT));
    }
	
	public void testRestDecimalValues() {       
		sendKeys(NUMBER_12); 
		sendKeys(NUMBER_6_DOT_5);
        TouchUtils.clickView(this, restBt);       

        // get result
        String mathResult = result.getText().toString();
        assertTrue("Rest result should be " + REST_DECIMAL_RESULT + " but was " + mathResult, mathResult.equals(REST_DECIMAL_RESULT));
    }
	
	public void testRestNegativeValues() {       
		sendKeys(NUMBER_NEG_27); 
		sendKeys(NUMBER_86);
        TouchUtils.clickView(this, restBt);       

        // get result
        String mathResult = result.getText().toString();
        assertTrue("Rest result should be " + REST_NEGATIVE_RESULT + " but was " + mathResult, mathResult.equals(REST_NEGATIVE_RESULT));
    }
	
	public void testRestInvalidValues() {      
        sendKeys(NOT_NUMBER);
        sendKeys(NUMBER_6_DOT_5);
        TouchUtils.clickView(this, restBt);       

        // get result
        String mathResult = result.getText().toString();
        assertTrue("Rest result should be " + NOT_NUMBER_RESULT + " but was " + mathResult, mathResult.equals(NOT_NUMBER_RESULT));
    }
	
	public void testRestFailedResult() {       
		sendKeys(NUMBER_NEG_27); 
		sendKeys(NUMBER_12);
        TouchUtils.clickView(this, restBt);       

        // get result
        String mathResult = result.getText().toString();
        assertTrue("Rest result should be " + REST_RESULT + " but was " + mathResult, mathResult.equals(REST_RESULT));
    }
	///////////////////////
	
	////// Multiplication Test //////
	public void testMultiplicationValues() {       
		sendKeys(NUMBER_86);
		sendKeys(NUMBER_12); 
        TouchUtils.clickView(this, multiBt);       

        // get result
        String mathResult = result.getText().toString();
        assertTrue("Multiplication result should be " + MULTI_RESULT + " but was " + mathResult, mathResult.equals(MULTI_RESULT));
    }
	
	public void testMultiplicationDecimalValues() {       
		sendKeys(NUMBER_6_DOT_5);
		sendKeys(NUMBER_12); 
        TouchUtils.clickView(this, multiBt);       

        // get result
        String mathResult = result.getText().toString();
        assertTrue("Multiplication result should be " + MULTI_DECIMAL_RESULT + " but was " + mathResult, mathResult.equals(MULTI_DECIMAL_RESULT));
    }
	
	public void testMultiplicationNegativeValues() {       
		sendKeys(NUMBER_NEG_27);
		sendKeys(NUMBER_12); 
        TouchUtils.clickView(this, multiBt);       

        // get result
        String mathResult = result.getText().toString();
        assertTrue("Multiplication result should be " + MULTI_NEGATIVE_RESULT + " but was " + mathResult, mathResult.equals(MULTI_NEGATIVE_RESULT));
    }
	
	public void testMultiplicationInvalidValues() {       
		sendKeys(NUMBER_NEG_27);
		sendKeys(NOT_NUMBER); 
        TouchUtils.clickView(this, multiBt);       

        // get result
        String mathResult = result.getText().toString();
        assertTrue("Multiplication result should be " + NOT_NUMBER_RESULT + " but was " + mathResult, mathResult.equals(NOT_NUMBER_RESULT));
    }
	
	public void testMultiplicationFailedResult() {       
		sendKeys(NUMBER_NEG_27);
		sendKeys(NUMBER_86); 
        TouchUtils.clickView(this, multiBt);       

        // get result
        String mathResult = result.getText().toString();
        assertTrue("Multiplication result should be " + MULTI_RESULT + " but was " + mathResult, mathResult.equals(MULTI_RESULT));
    }
	////////////////////////////////
	
	////// Division Test //////
	public void testDivisionValues() {       
		sendKeys(NUMBER_86);
		sendKeys(NUMBER_12); 
        TouchUtils.clickView(this, diviBt);       

        // get result
        String mathResult = result.getText().toString();
        assertTrue("Division result should be " + DIVI_RESULT + " but was " + mathResult, mathResult.equals(DIVI_RESULT));
    }
	
	public void testDivisionDecimalValues() {  
		sendKeys(NUMBER_12); 
		sendKeys(NUMBER_6_DOT_5);
        TouchUtils.clickView(this, diviBt);       

        // get result
        String mathResult = result.getText().toString();
        assertTrue("Division result should be " + DIVI_DECIMAL_RESULT + " but was " + mathResult, mathResult.equals(DIVI_DECIMAL_RESULT));
    }
	
	public void testDivisionNegativeValues() {
		sendKeys(NUMBER_NEG_27);
		sendKeys(NUMBER_6_DOT_5);
        TouchUtils.clickView(this, diviBt);       

        // get result
        String mathResult = result.getText().toString();
        assertTrue("Division result should be " + DIVI_NEGATIVE_RESULT + " but was " + mathResult, mathResult.equals(DIVI_NEGATIVE_RESULT));
    }
	
	public void testDivisionInvalidValues() {
		sendKeys(NOT_NUMBER);
		sendKeys(NUMBER_12);
        TouchUtils.clickView(this, diviBt);       

        // get result
        String mathResult = result.getText().toString();
        assertTrue("Division result should be " + NOT_NUMBER_RESULT + " but was " + mathResult, mathResult.equals(NOT_NUMBER_RESULT));
    }
	
	public void testDivisionZeroValues() {
		sendKeys(NUMBER_86);
		sendKeys(NUMBER_ZERO);
        TouchUtils.clickView(this, diviBt);       

        // get result
        String mathResult = result.getText().toString();
        assertTrue("Division result should be " + INFINITI_RESULT + " but was " + mathResult, mathResult.equals(INFINITI_RESULT));
    }
	
	public void testDivisionFailedResult() {
		sendKeys(NUMBER_86);
		sendKeys(NUMBER_6_DOT_5);
        TouchUtils.clickView(this, diviBt);       

        // get result
        String mathResult = result.getText().toString();
        assertTrue("Division result should be " + DIVI_RESULT + " but was " + mathResult, mathResult.equals(DIVI_RESULT));
    }
	
	///////////////////////////
	
}
