package com.prueba;

import javax.annotation.PostConstruct;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;

public class PlaygroundPart {
	private Text text;

    // the WindowBuilder / SWTDesigner tooling
    // uses the @PostConstruct method to figure out
    // that the class is am Eclipse 4 part

    // one method must be annotated with @PostConstruct and
    // must receive a least a SWT Composiste


    @PostConstruct
    public void createControls(Composite parent) {
    	parent.setLayout(new GridLayout(2, false));
    	
    	Button btnNewButton = new Button(parent, SWT.NONE);
    	btnNewButton.setText("New Button");
    	new Label(parent, SWT.NONE);
    	
    	Button btnNewButton_1 = new Button(parent, SWT.NONE);
    	btnNewButton_1.setText("New Button");
    	new Label(parent, SWT.NONE);
    	
    	Label lblNewLabel = new Label(parent, SWT.NONE);
    	lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
    	lblNewLabel.setText("New Label");
    	
    	text = new Text(parent, SWT.BORDER);
    	text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        System.out.println(this.getClass().getSimpleName()
        + " @PostConstruct method called.");
    }
}
