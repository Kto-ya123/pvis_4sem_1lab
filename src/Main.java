import org.eclipse.swt.*;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import java.awt.*;


public class Main {

    public static void main(String[] args) {
        Display display = new Display();
        Shell shell = new Shell(display);
        shell.setText("Center");
        shell.setSize(450,600);

        RowLayout rowLayout = new RowLayout(SWT.VERTICAL);
        rowLayout.marginLeft = 10;
        rowLayout.marginTop = 10;
        rowLayout.spacing = 40;
        shell.setLayout(rowLayout);

        Composite compositeFirstTask = new Composite(shell, SWT.NULL);
        RowLayout rowLayoutFirstTaskComposite = new RowLayout(SWT.HORIZONTAL);
        rowLayoutFirstTaskComposite.spacing = 10;
        compositeFirstTask.setLayout(rowLayoutFirstTaskComposite);

        Text textInput = new Text(compositeFirstTask, SWT.BORDER);
        RowData layoutDataTextInput = new RowData();
        layoutDataTextInput.width = 150;
        textInput.setLayoutData(layoutDataTextInput);

        Button buttonInput = new Button(compositeFirstTask, SWT.PUSH);
        RowData layoutDataButtonInput = new RowData();
        layoutDataButtonInput.width = 80;
        layoutDataButtonInput.height = 30;
        buttonInput.setLayoutData(layoutDataButtonInput);
        buttonInput.setText("add text");

        Text textOutput = new Text(compositeFirstTask, SWT.MULTI
                                    | SWT.READ_ONLY | SWT.BORDER);
        RowData layoutDataTextOutput = new RowData();
        layoutDataTextOutput.width = 100;
        textOutput.setLayoutData(layoutDataTextOutput);
        textOutput.setText("Text");

        Composite compositeSecondTask = new Composite(shell, SWT.NULL);
        RowLayout rowLayoutSecondTaskComposite = new RowLayout(SWT.VERTICAL);
        rowLayoutSecondTaskComposite.spacing = 10;
        compositeSecondTask.setLayout(rowLayoutFirstTaskComposite);

        Text textForButton = new Text(compositeSecondTask, SWT.BORDER);
        RowData layoutDataTextForButton = new RowData();
        layoutDataTextForButton.width = 150;
        textForButton.setLayoutData(layoutDataTextForButton);

        Button buttonTextToButton = new Button(compositeSecondTask, SWT.PUSH);
        RowData layoutDataButtonTextToButton = new RowData();
        layoutDataButtonTextToButton.width = 100;
        layoutDataButtonTextToButton.height = 40;
        buttonTextToButton.setLayoutData(layoutDataButtonTextToButton);

        Button buttonTextChange = new Button(compositeSecondTask, SWT.PUSH);
        buttonTextChange.setLayoutData(layoutDataButtonTextToButton);

        Composite compositeThirdTask = new Composite(shell, SWT.NULL);
        RowLayout rowLayoutCompositeThirdTask = new RowLayout(SWT.HORIZONTAL);
        rowLayoutCompositeThirdTask.spacing = 80;
        compositeThirdTask.setLayout(rowLayoutCompositeThirdTask);

        Composite compositeButtonText = new Composite(compositeThirdTask, SWT.NULL);
        compositeButtonText.setLayout(new RowLayout(SWT.VERTICAL));

        Composite compositeRadioButton = new Composite(compositeThirdTask, SWT.NULL);
        compositeRadioButton.setLayout(new RowLayout(SWT.VERTICAL));

        Text textChoose = new Text(compositeButtonText, SWT.BORDER);
        RowData layoutDataTextChoose = new RowData();
        layoutDataTextChoose.width = 150;
        textChoose.setLayoutData(layoutDataTextChoose);

        Button buttonChoose = new Button(compositeButtonText, SWT.PUSH);
        buttonChoose.setText("Выбрать");
        buttonChoose.setLayoutData(layoutDataButtonTextToButton);

        Button firstRadio = new Button(compositeRadioButton, SWT.RADIO);
        firstRadio.setText("firstRadio");

        Button secondRadio = new Button(compositeRadioButton, SWT.RADIO);
        secondRadio.setText("secondRadio");

        Button thirdRadio = new Button(compositeRadioButton, SWT.RADIO);
        thirdRadio.setText("thirdRadio");

        //Button

        buttonChoose.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent arg0) {
                // TODO Auto-generated method stub
                String chooseString = textChoose.getText();

                if(chooseString.equals(firstRadio.getText())) {
                    firstRadio.setSelection(true);
                    secondRadio.setSelection(false);
                    thirdRadio.setSelection(false);
                    return;
                }
                if(chooseString.equals(secondRadio.getText())) {
                    firstRadio.setSelection(false);
                    secondRadio.setSelection(true);
                    thirdRadio.setSelection(false);
                    return;
                }
                if(chooseString.equals(thirdRadio.getText())) {
                    firstRadio.setSelection(false);
                    secondRadio.setSelection(false);
                    thirdRadio.setSelection(true);
                    return;
                }
                MessageBox messageNotFound = new MessageBox(shell);
                messageNotFound.setMessage("Кнопка с таким названием не найдена");
                messageNotFound.setText("Ошибка");
                messageNotFound.open();
            }
        });

        buttonInput.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent arg0) {
                // TODO Auto-generated method stub
                String stringInput = textInput.getText();
                String stringOutput = textOutput.getText();

                if(stringInput.equals(stringOutput)){
                    MessageBox messageEqualString = new MessageBox(shell, SWT.OK);
                    messageEqualString.setText("Ошибка");
                    messageEqualString.setMessage("Такая строка уже есть");
                    messageEqualString.open();
                }else {
                    textOutput.setText(stringInput);
                }


            }
        });

        buttonTextToButton.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent arg0) {
                // TODO Auto-generated method stub
                String stringOutput = textForButton.getText();
                buttonTextChange.setText(stringOutput);
            }
        });

        buttonTextChange.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent arg0) {
                // TODO Auto-generated method stub
                String m = buttonTextToButton.getText();
                String n = buttonTextChange.getText();
                buttonTextToButton.setText(n);
                buttonTextChange.setText(m);
            }
        });

        shell.open();


        while(!shell.isDisposed()){
            if(display.readAndDispatch()) {
                display.sleep();
            }
        }

    }
}
