package com.weifajue.schoolLife;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.*;
import android.util.Log;

/******SchoolLifeӦ��������
 * �ṹ������3��ҳ��:personalPage,sharingPage,managementPage
 * ��Ӧ����������personalPage(),sharingPage(),managementPage()
 * ����onCreat()��ֱ����ת��������personalPage()
 * ÿ���������Ӧһ��layout���ֱ�Ϊmain.xml,menu2.xml,menu3.xml
 * ÿ�����涼����"����","����������������������ť��������ת��������ҳ�� 
 */

public class SchoolLifeActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.e("DebugLog","run in main");
        personalPage();
    }
    
/* *****************************************����ҳ�洦������*********************************************/
/*
*  ע�⣺setContentView(R.layout.main)�����������ǰ
*/
    public void personalPage()
    {
    	
        setContentView(R.layout.main);
        
    	Button buttonPersonal1 =(Button)findViewById(R.id.buttonPersonal1);
        Button buttonSharing1 =(Button)findViewById(R.id.buttonSharing1);
        Button buttonManagement1 =(Button)findViewById(R.id.buttonManagement1);
   

        Log.e("DebugLog","show personalPage View");
        
        //�ڸ���ҳ���У�ȥʹ�ܸ��˰�ť
        buttonPersonal1.setEnabled(false);
        
        //��ת������ҳ��
        buttonSharing1.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Log.e("DebugLog","on click buttonSharing1");
            	sharingPage();
            }
        });
        
      //��ת������ҳ��
        buttonManagement1.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Log.e("DebugLog","on click buttonManagement1");
            	managementPage();
            }
        });

    }
/*****************************************����ҳ�洦������ end********************************************/
    
/* ****************************************����ҳ�洦������*********************************************/
    public void sharingPage()
    {
        setContentView(R.layout.menu2); 
    	final Button buttonPersonal2=(Button)findViewById(R.id.buttonPersonal2);
        final Button buttonSharing2=(Button)findViewById(R.id.buttonSharing2);
        final Button buttonManagement2=(Button)findViewById(R.id.buttonManagement2);

        Log.e("DebugLog","show sharingPage View");
        
        buttonPersonal2.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Log.e("DebugLog","on click OnClickListener");
            	personalPage();
            }
        });
        
        buttonSharing2.setEnabled(false);
        
        buttonManagement2.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Log.e("DebugLog","on click buttonManagement2");
            	managementPage();
            }
        });
    }
/*****************************************����ҳ�洦������end *********************************************/    

/*****************************************����ҳ�洦������***********************************************/    
    public void managementPage()
    {
        setContentView(R.layout.menu3); 
        
    	final Button buttonPersonal3=(Button)findViewById(R.id.buttonPersonal3);
        final Button buttonSharing3=(Button)findViewById(R.id.buttonSharing3);
        final Button buttonManagement3=(Button)findViewById(R.id.buttonManagement3);

        Log.e("DebugLog","show managementPage View");
                
        buttonPersonal3.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Log.e("DebugLog","on click buttonPersonal3");
            	personalPage();
            }
        });
        
        buttonSharing3.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Log.e("DebugLog","on click buttonSharing3");
            	sharingPage();
            }
        });
        
        buttonManagement3.setEnabled(false);
    }
/*****************************************����ҳ�洦������ end ***********************************************/    
}