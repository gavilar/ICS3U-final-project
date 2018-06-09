/*
 * Sheet Music Books Catalogue (SMBC)
 * by Gavin Yeomans
 * final project for ICS3U
 * for Mr Theodoropoulos, SCSS
 * June, 2018
 */

import java.util.*; //for arrays

public class SMBC extends javax.swing.JFrame {

    ArrayList<String> composerCatalogue = new ArrayList();
    ArrayList<String> titleCatalogue = new ArrayList();

    public void errorMessage() {
        outputArea.setText("Sorry, there was an error. Please try again"); //tells the user of an error
    }

    int exitCount = 0; //used to close program
    int deleteCount = 0;

    public SMBC() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputArea = new javax.swing.JTextArea();
        titleInputLabel = new javax.swing.JLabel();
        titleInput = new javax.swing.JTextField();
        composerInputLabel = new javax.swing.JLabel();
        composerInput = new javax.swing.JTextField();
        otherInfoLabel = new javax.swing.JLabel();
        otherInfoInput = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        displayButton = new javax.swing.JButton();
        sortComboBox = new javax.swing.JComboBox<>();
        searchLabel = new javax.swing.JLabel();
        searchInput = new javax.swing.JTextField();
        searchTitleLabel = new javax.swing.JLabel();
        searchTitleLabel1 = new javax.swing.JLabel();
        searchComboBox = new javax.swing.JComboBox<>();
        searchButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(152, 251, 152));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titleLabel.setText("Sheet Music Books Catalogue");

        outputArea.setEditable(false);
        outputArea.setColumns(20);
        outputArea.setLineWrap(true);
        outputArea.setRows(5);
        outputArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(outputArea);

        titleInputLabel.setText("Title of Composition (ex. Toccatas BWV 910-916) ");

        composerInputLabel.setText("Composer or Publisher (ex. Bach, J. S., Henle-Verlag) ");

        otherInfoLabel.setText("Year of Composition, length, difficulty, comments, etc. ");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        displayButton.setText("Display catalogue");
        displayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayButtonActionPerformed(evt);
            }
        });

        sortComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sort by Title", "Sort by Composer" }));

        searchLabel.setText("Please enter the title or composer you are looking for:");

        searchTitleLabel.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        searchTitleLabel.setText("Search for or remove a publication from the catalogue ");

        searchTitleLabel1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        searchTitleLabel1.setText("Add a publication to the catalogue ");

        searchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search by Title", "Search by Composer" }));

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete from catalogue");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save my catalogue");
        saveButton.setToolTipText("This feature hasn't been added yet");
        saveButton.setEnabled(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addComponent(titleLabel))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(titleInputLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(titleInput)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(composerInputLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(composerInput, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(otherInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(addButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sortComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(127, 127, 127))
                                .addComponent(otherInfoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(searchTitleLabel1)
                            .addComponent(displayButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(searchLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(searchTitleLabel)
                            .addComponent(deleteButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchButton)))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addComponent(exitButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exitButton)
                            .addComponent(saveButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleLabel)
                        .addGap(13, 13, 13)
                        .addComponent(searchTitleLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(titleInputLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titleInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(composerInputLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(composerInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(otherInfoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(otherInfoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton)
                            .addComponent(sortComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displayButton)
                        .addGap(37, 37, 37)
                        .addComponent(searchTitleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String request = "Please include a title and composer or publisher for your entry.";

        if (titleInput.getText().isEmpty() || composerInput.getText().isEmpty()) //checks that a composer and title have been included
        {
            outputArea.setText(request);
        } else //when data in entered in the title and composer box
        {
            if (outputArea.getText().equals(request)) {
                outputArea.setText("");
            }
            String composerFirst = composerInput.getText() + "; " + titleInput.getText()
                    + ". " + otherInfoInput.getText();
            composerCatalogue.add(composerFirst); //adds data to primary array 

            String titleFirst = titleInput.getText() + " by " + composerInput.getText()
                    + ". " + otherInfoInput.getText();
            titleCatalogue.add(titleFirst); //adds data to secondary array in a different order

            outputArea.append(titleFirst + "\n"); //add data to output

            composerInput.setText("");
            titleInput.setText("");
            otherInfoInput.setText(""); //wipe inputs
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void displayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayButtonActionPerformed
        outputArea.setText(""); //wipe box

        if (composerCatalogue.isEmpty()) {
            outputArea.setText("Please add some data to your catalogue first."); //can't sort nothing
        } else {
            switch ((String) sortComboBox.getSelectedItem()) {
                case "Sort by Composer":
                    Collections.sort(composerCatalogue);
                    for (int i = 0; i < composerCatalogue.size(); i++) {
                        outputArea.append(composerCatalogue.get(i) + "\n"); //lists all of the entries in the array in a certain order
                    }
                    break;
                case "Sort by Title":
                    Collections.sort(titleCatalogue);
                    for (int i = 0; i < titleCatalogue.size(); i++) {
                        outputArea.append(titleCatalogue.get(i) + "\n"); //lists array contents
                    }
                    break;
                default:
                    errorMessage();
                    break;
            }
        }
    }//GEN-LAST:event_displayButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        outputArea.setText(""); //wipe box

        String apology = "Sorry, no results matching your query were found. "
                + "Please check that all words were spelled correctly or try "
                + "changing capitalizations (Search is case-sensitive)."; //if nothing is found, this is written

        switch ((String) searchComboBox.getSelectedItem()) {
            case "Search by Composer":
                Collections.sort(composerCatalogue);
                for (int i = 0; i < composerCatalogue.size(); i++) {
                    if (composerCatalogue.get(i).contains(searchInput.getText())) { //check each entry of the catalogue for the query
                        outputArea.append(composerCatalogue.get(i) + "\n"); //output matching entries
                    }

                }
                if (outputArea.getText().equals("")) { //if no entries were outputted
                    outputArea.setText(apology);
                }
                break;
            case "Search by Title":
                Collections.sort(titleCatalogue);
                for (int i = 0; i < titleCatalogue.size(); i++) {
                    if (titleCatalogue.get(i).contains(searchInput.getText())) { //same as above
                        outputArea.append(titleCatalogue.get(i) + "\n");
                    }

                }
                if (outputArea.getText().equals("")) { //if no results
                    outputArea.setText(apology);
                }
                break;
            default:
                errorMessage();
                break;
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        outputArea.setText("");

        String tryAgain = "Your search query was not found in the catalogue. Please" //if nothing is found, this is written
                + " check that the correct \"Search by\" option is selected and"
                + " that your spelling is EXACTLY the same as the entry"
                + " in the catalogue that you seek.";

        String input = searchInput.getText(); //create a string to search for

        System.out.println(input);

        if (input.equals("")) {
            outputArea.setText("Please type the entry you intend to delete in the search box");
        } else { //if a query is provided by the user
            try {
                String fragment1 = input.substring(0, 4); //creates a string with first 4 letters of input
                String fragment2 = input.substring(input.length()-4, (input.length())); //last 4 letters too
                System.out.println(fragment1);
                System.out.println(fragment2); //for troubleshooting******************************************************************************
                
                switch ((String) searchComboBox.getSelectedItem()) {
                    case "Search by Composer":
                        int index1 = Collections.binarySearch(composerCatalogue, input); //searches composer array for the inputted data
                        if (index1 >= 0) { //this code will run if it is found

                            composerCatalogue.remove(input); //removes title from composer list

                            outputArea.setText("The following title was removed from your catalogue: " + input); //communicate with user
                            searchInput.setText(""); //wipes input

                        } else { //informs user that the data was not found
                            outputArea.setText(tryAgain);
                        }
                        break;
                    case "Search by Title":
                        int index2 = Collections.binarySearch(titleCatalogue, input); //searches title array for the inputted data
                        if (index2 >= 0) { //this code will run if it is found

                            titleCatalogue.remove(input); //removes title from title list

                            for (int i = 0; i < titleCatalogue.size(); i++) //cycle through other catalogue
                            {
                                String entry = titleCatalogue.get(i);
                                System.out.println(entry); //for troubleshooting******************************************************************************
                                if (entry.contains(fragment1) && entry.contains(fragment2)) //if entry matches both fragments, 
                                {                                                           //it's probably the one we're looking for
                                    titleCatalogue.remove(entry); //delete it
                                }
                            }

                            outputArea.setText("The following title was removed from your catalogue: " + input);

                            searchInput.setText(""); //wipes input

                        } else { //informs user that the data was not found
                            outputArea.setText(tryAgain);
                        }
                        break;
                    default:
                        errorMessage();
                }
            } catch (Exception e) {
                errorMessage();
            }

        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        String exitMessage = "All unsaved changes to your catalogue will be lost. Are you sure you want to exit?";

        if (!outputArea.getText().equals(exitMessage)) { //sets exitCount to 0 when it's pressed 
            exitCount = 0;                               //for the first time in a sequence
        }

        exitCount++;

        switch (exitCount % 2) {
            case 1: //if it's odd
                outputArea.setText(exitMessage); //write the exit message
                break;
            case 0: //if it's even (requires the button to be pressed twice in succession)
                System.exit(0); //closes the window
            default:
                //do nothing
                break;
        }
    }//GEN-LAST:event_exitButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // coming in a future update
    }//GEN-LAST:event_saveButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SMBC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SMBC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SMBC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SMBC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SMBC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField composerInput;
    private javax.swing.JLabel composerInputLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton displayButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField otherInfoInput;
    private javax.swing.JLabel otherInfoLabel;
    private javax.swing.JTextArea outputArea;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> searchComboBox;
    private javax.swing.JTextField searchInput;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JLabel searchTitleLabel;
    private javax.swing.JLabel searchTitleLabel1;
    private javax.swing.JComboBox<String> sortComboBox;
    private javax.swing.JTextField titleInput;
    private javax.swing.JLabel titleInputLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
