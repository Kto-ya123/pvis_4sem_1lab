import org.eclipse.swt.*;
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


public class Main {

    public static void main(String[] args) {
        Display display = new Display();
        Shell shell = new Shell(display);
        shell.setText("Лабораторная работа 1");
        shell.setSize(450, 600);

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

        Composite compositeFourthTask = new Composite(shell, SWT.NULL);
        compositeFourthTask.setLayout(rowLayoutCompositeThirdTask);

        Composite compositeButtonTextFourth = new Composite(compositeFourthTask, SWT.NULL);
        compositeButtonTextFourth.setLayout(new RowLayout(SWT.VERTICAL));

        Composite compositeCheckBox = new Composite(compositeFourthTask, SWT.NULL);
        compositeCheckBox.setLayout(new RowLayout(SWT.VERTICAL));

        Text textChooseCheckBox = new Text(compositeButtonTextFourth, SWT.BORDER);
        RowData layoutDataTextChooseCheckBox = new RowData();
        layoutDataTextChooseCheckBox.width = 150;
        textChooseCheckBox.setLayoutData(layoutDataTextChooseCheckBox);

        Button buttonChooseCheckBox = new Button(compositeButtonTextFourth, SWT.PUSH);
        buttonChooseCheckBox.setText("Выбрать");
        RowData layoutDataButtonChooseCheckBox = new RowData();
        layoutDataButtonChooseCheckBox.height = 40;
        layoutDataButtonChooseCheckBox.width = 100;
        buttonChooseCheckBox.setLayoutData(layoutDataButtonChooseCheckBox);

        Button checkBoxFirst = new Button(compositeCheckBox, SWT.CHECK);
        checkBoxFirst.setText("first");

        Button checkBoxSecond = new Button(compositeCheckBox, SWT.CHECK);
        checkBoxSecond.setText("second");

        Button checkBoxThird = new Button(compositeCheckBox, SWT.CHECK);
        checkBoxThird.setText("third");

        Composite compositeFifthTask = new Composite(shell, SWT.NULL);
        RowLayout rowLayoutCompositeFifthTask = new RowLayout();
        rowLayoutCompositeFifthTask.spacing = 30;
        compositeFifthTask.setLayout(rowLayoutCompositeFifthTask);

        Composite compositeAllButtonText = new Composite(compositeFifthTask, SWT.NULL);
        compositeAllButtonText.setLayout(new RowLayout(SWT.VERTICAL));

        Text textToTable = new Text(compositeAllButtonText, SWT.BORDER);
        RowData rowLayoutTextToTable = new RowData();
        rowLayoutTextToTable.width = 150;
        textToTable.setLayoutData(rowLayoutTextToTable);

        Button buttonTextToTable = new Button(compositeAllButtonText, SWT.PUSH);
        buttonTextToTable.setText("В таблицу");
        RowData layoutForButtonFifthTask = new RowData();
        layoutForButtonFifthTask.width = 160;
        layoutForButtonFifthTask.height = 30;
        buttonTextToTable.setLayoutData(layoutForButtonFifthTask);

        Button buttonFromFirstToSecond = new Button(compositeAllButtonText, SWT.PUSH);
        buttonFromFirstToSecond.setText("Из первого во второй");
        buttonFromFirstToSecond.setLayoutData(layoutForButtonFifthTask);

        Button buttonFromSecondToFirst = new Button(compositeAllButtonText, SWT.PUSH);
        buttonFromSecondToFirst.setText("Из второго в первый");
        buttonFromSecondToFirst.setLayoutData(layoutForButtonFifthTask);

        Table tableFifthTask = new Table(compositeFifthTask,SWT.MULTI
                                        | SWT.BORDER | SWT.NO_SCROLL | SWT.FULL_SELECTION);
        tableFifthTask.setLinesVisible(true);
        RowData rowDataTableFifthTask = new RowData();
        rowDataTableFifthTask.width = 200;
        tableFifthTask.setLayoutData(rowDataTableFifthTask);

        for(int i = 0; i < 2; i++){
            TableColumn column = new TableColumn(tableFifthTask, SWT.NONE);
            column.setText("                      ");


        }
        TableColumn [] tableColumns = tableFifthTask.getColumns();
        for(int i = 0; i < 5; i++){
            TableItem item = new TableItem(tableFifthTask, SWT.NONE);
        }
        for(int i = 0; i < 2; i++){
            tableColumns[i].pack();
        }

        buttonTextToTable.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                String stringInput = textToTable.getText();
                for(int i = tableFifthTask.getItemCount() - 1; i > 0; i--){
                    TableItem item = tableFifthTask.getItem(i);
                    TableItem prevItem = tableFifthTask.getItem(i - 1);
                    item.setText(0, prevItem.getText(0));
                    item.setText(1, prevItem.getText(1));
                }
                tableFifthTask.getItem(0).setText(stringInput);
            }
        });

        buttonFromFirstToSecond.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                int index = tableFifthTask.getSelectionIndex();
                TableItem item = tableFifthTask.getItem(index);
                item.setText(1 , item.getText(0));
                item.setText(0, "");
            }
        });

        buttonFromSecondToFirst.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                int index = tableFifthTask.getSelectionIndex();
                TableItem item = tableFifthTask.getItem(index);
                item.setText(0 , item.getText(1));
                item.setText(1, "");
            }
        });

        buttonChooseCheckBox.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent arg0) {
                String stringInput = textChooseCheckBox.getText();

                if (stringInput.equals(checkBoxFirst.getText())) {

                    if (checkBoxFirst.getSelection()) {
                        checkBoxFirst.setSelection(false);
                    } else {
                        checkBoxFirst.setSelection(true);
                    }
                    return;
                }

                if (stringInput.equals(checkBoxSecond.getText())) {

                    if (checkBoxSecond.getSelection()) {
                        checkBoxSecond.setSelection(false);
                    } else {
                        checkBoxSecond.setSelection(true);
                    }
                    return;
                }

                if (stringInput.equals(checkBoxThird.getText())) {

                    if (checkBoxThird.getSelection()) {
                        checkBoxThird.setSelection(false);
                    } else {
                        checkBoxThird.setSelection(true);
                    }
                    return;
                }
                MessageBox messageBoxError = new MessageBox(shell, SWT.OK);
                messageBoxError.setText("Ошибка");
                messageBoxError.setMessage("Кнопки с таким названием не найдено");
                messageBoxError.open();
            }
        });

        buttonChoose.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent arg0) {
                // TODO Auto-generated method stub
                String chooseString = textChoose.getText();

                if (chooseString.equals(firstRadio.getText())) {
                    firstRadio.setSelection(true);
                    secondRadio.setSelection(false);
                    thirdRadio.setSelection(false);
                    return;
                }

                if (chooseString.equals(secondRadio.getText())) {
                    firstRadio.setSelection(false);
                    secondRadio.setSelection(true);
                    thirdRadio.setSelection(false);
                    return;
                }

                if (chooseString.equals(thirdRadio.getText())) {
                    firstRadio.setSelection(false);
                    secondRadio.setSelection(false);
                    thirdRadio.setSelection(true);
                    return;
                }

                MessageBox messageNotFound = new MessageBox(shell, SWT.OK);
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

                if (stringInput.equals(stringOutput)) {
                    MessageBox messageEqualString = new MessageBox(shell, SWT.OK);
                    messageEqualString.setText("Ошибка");
                    messageEqualString.setMessage("Такая строка уже есть");
                    messageEqualString.open();
                } else {
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

        while (!shell.isDisposed()) {
            if (display.readAndDispatch()) {
                display.sleep();
            }
        }

    }
}
