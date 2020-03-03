import java.io.*;
import java.util.ArrayList;
import java.util.logging.*;
import javax.script.*;


/**
 * Et program der gennem grafisk brugerflade tillader brugeren at slå formler op
 * og lave udregninger med dem.
 * @version 1.0 
 * @author Frederik Dam
 * @author Victor Jacobsen
 */
public final class window extends javax.swing.JFrame {

    /**
     * Creates new form window
     */
    public window() {
        initComponents();
        // Call the initial loading of varibles and dynamic content 
        load();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        scrollView = new javax.swing.JScrollPane();
        formelList = new javax.swing.JList<>();
        formelView = new javax.swing.JPanel();
        displayHeader = new javax.swing.JLabel();
        display = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        formelDisplay = new javax.swing.JEditorPane();
        calculateHeader = new javax.swing.JLabel();
        calculator = new javax.swing.JPanel();
        value1 = new javax.swing.JTextField();
        value2 = new javax.swing.JTextField();
        value3 = new javax.swing.JTextField();
        SIEnhed1 = new javax.swing.JLabel();
        SIEnhed2 = new javax.swing.JLabel();
        SIEnhed3 = new javax.swing.JLabel();
        unitLabel1 = new javax.swing.JLabel();
        unitLabel2 = new javax.swing.JLabel();
        unitLabel3 = new javax.swing.JLabel();
        unitSelect1 = new javax.swing.JComboBox<>();
        unitSelect2 = new javax.swing.JComboBox<>();
        unitSelect3 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formelsamling");
        setMaximumSize(new java.awt.Dimension(1200, 1000));
        setMinimumSize(new java.awt.Dimension(700, 490));
        setPreferredSize(new java.awt.Dimension(700, 490));
        setSize(new java.awt.Dimension(700, 490));

        background.setBackground(new java.awt.Color(110, 136, 153));

        scrollView.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollView.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        formelList.setBackground(new java.awt.Color(110, 136, 153));
        formelList.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        formelList.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        formelList.setForeground(new java.awt.Color(0, 0, 0));
        formelList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        formelList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        formelList.setAlignmentX(10.0F);
        formelList.setInheritsPopupMenu(true);
        formelList.setMaximumSize(new java.awt.Dimension(1000, 10000));
        formelList.setMinimumSize(new java.awt.Dimension(0, 0));
        formelList.setName(""); // NOI18N
        formelList.setPreferredSize(null);
        formelList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                formelListValueChanged(evt);
            }
        });
        scrollView.setViewportView(formelList);

        formelView.setBackground(null);

        displayHeader.setBackground(new java.awt.Color(187, 187, 187));
        displayHeader.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        displayHeader.setText("Formel");

        display.setBackground(new java.awt.Color(110, 136, 153));
        display.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        display.setForeground(new java.awt.Color(0, 0, 0));

        formelDisplay.setBackground(new java.awt.Color(110, 136, 153));
        formelDisplay.setBorder(null);
        formelDisplay.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jScrollPane2.setViewportView(formelDisplay);

        org.jdesktop.layout.GroupLayout displayLayout = new org.jdesktop.layout.GroupLayout(display);
        display.setLayout(displayLayout);
        displayLayout.setHorizontalGroup(
            displayLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(displayLayout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addContainerGap())
        );
        displayLayout.setVerticalGroup(
            displayLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(displayLayout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        calculateHeader.setBackground(new java.awt.Color(187, 187, 187));
        calculateHeader.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        calculateHeader.setText("Beregn");

        calculator.setBackground(new java.awt.Color(110, 136, 153));
        calculator.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        calculator.setForeground(new java.awt.Color(0, 0, 0));
        calculator.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        value1.setBackground(new java.awt.Color(110, 136, 153));
        value1.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        value1.setText("1000");
        value1.setBorder(null);
        value1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                value1ActionPerformed(evt);
            }
        });
        calculator.add(value1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 90, -1));

        value2.setBackground(new java.awt.Color(110, 136, 153));
        value2.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        value2.setText("1000");
        value2.setBorder(null);
        value2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                value2ActionPerformed(evt);
            }
        });
        calculator.add(value2, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 110, 90, -1));

        value3.setBackground(new java.awt.Color(110, 136, 153));
        value3.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        value3.setText("1000");
        value3.setBorder(null);
        value3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                value3ActionPerformed(evt);
            }
        });
        calculator.add(value3, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 170, 90, -1));

        SIEnhed1.setBackground(new java.awt.Color(187, 187, 187));
        SIEnhed1.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        SIEnhed1.setText("Energi [J]");
        calculator.add(SIEnhed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 52, -1, -1));

        SIEnhed2.setBackground(new java.awt.Color(187, 187, 187));
        SIEnhed2.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        SIEnhed2.setText("Masse [J]");
        calculator.add(SIEnhed2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 111, -1, -1));

        SIEnhed3.setBackground(new java.awt.Color(187, 187, 187));
        SIEnhed3.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        SIEnhed3.setText("Lysets hastighed [J]");
        calculator.add(SIEnhed3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 170, -1, -1));

        unitLabel1.setBackground(new java.awt.Color(187, 187, 187));
        unitLabel1.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        unitLabel1.setText("e =");
        calculator.add(unitLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        unitLabel2.setBackground(new java.awt.Color(187, 187, 187));
        unitLabel2.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        unitLabel2.setText("m =");
        calculator.add(unitLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        unitLabel3.setBackground(new java.awt.Color(187, 187, 187));
        unitLabel3.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        unitLabel3.setText("c =");
        calculator.add(unitLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 170, -1, -1));

        unitSelect1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        calculator.add(unitSelect1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, -1));

        unitSelect2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        calculator.add(unitSelect2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, -1));

        unitSelect3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        calculator.add(unitSelect3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, -1));

        org.jdesktop.layout.GroupLayout formelViewLayout = new org.jdesktop.layout.GroupLayout(formelView);
        formelView.setLayout(formelViewLayout);
        formelViewLayout.setHorizontalGroup(
            formelViewLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(formelViewLayout.createSequentialGroup()
                .add(0, 0, 0)
                .add(formelViewLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(calculator, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 470, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(displayHeader)
                    .add(calculateHeader)
                    .add(display, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(0, 0, 0))
        );
        formelViewLayout.setVerticalGroup(
            formelViewLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(formelViewLayout.createSequentialGroup()
                .add(0, 0, 0)
                .add(displayHeader)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(display, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(calculateHeader)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(calculator, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 223, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, 0))
        );

        org.jdesktop.layout.GroupLayout backgroundLayout = new org.jdesktop.layout.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .add(scrollView, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(formelView, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .add(backgroundLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(backgroundLayout.createSequentialGroup()
                        .add(formelView, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 1, Short.MAX_VALUE))
                    .add(scrollView))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(0, 0, 0)
                .add(background, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(0, 0, 0)
                .add(background, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void value1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_value1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_value1ActionPerformed

    private void value2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_value2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_value2ActionPerformed

    private void value3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_value3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_value3ActionPerformed

    private void formelListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_formelListValueChanged
        int selectedIndex = formelList.getSelectedIndex();
        String selected = formelList.getModel().getElementAt(selectedIndex);
        String[] infomation = formler[selectedIndex].replaceAll("\"[ \\w]+\": ?\\{(.*?)\\},?","$1").split("^\".+?\": ?");
        for(String s : infomation) {
            String[] su = s.replaceAll(" ?\"[ \\w]+\":","").split(",? (?!\")");
            for(int i = 1; i < su.length; i++) {
                String a = capitalize(getSINameFromUnit(su[i].replaceAll("\\[(-?\\d+.?\\d*), \"(.+?)\"\\]", "$2")));
                switch(i) {
                    case 1: SIEnhed1.setText(a); break;
                    case 2: SIEnhed2.setText(a); break;
                    case 3: SIEnhed3.setText(a); break;
                }
                
            }
        }
        String[] parts = formler[selectedIndex].replaceAll("\"\\w+\": \\{(.+?)\\},?", "$1").split("\\],");
        String[] tempparts = new String[parts.length];
        String temp = "";
        for(int i = 0; i < tempparts.length; i++)
            tempparts[i] = parts[i].replaceAll("\"(\\w+)\": ?\\[(.+?), ?\".+?\"\\]? ?", "$1^$2");
        for(String t : tempparts) {
            temp += t+"=";
            for(String s : tempparts)
                if(!t.equals(s))
                    temp += s;
            temp += "\n";
        }
        temp = temp.replaceAll("= ", "=");
        temp = temp.replaceAll("(.+?)\\^-1=(.+)", "$1=$2");
        temp = temp.replaceAll("(.+?)\\^1=(.+)", "$1=1/($2)");
        temp = temp.replaceAll("(\\w+)\\^1", "$1");
        temp = temp.replaceAll("(\\w+)\\^-1 (\\w+)\\^-1", "1/($1$2)");
        temp = temp.replaceAll("(\\w+)\\^-(\\d+) (\\w+)\\^-(\\d+)", "($2/$1)*($4/$3)");
        temp = temp.replaceAll("(\\w+) (\\w+)\\^-1", "($1/$2)");
        temp = temp.replaceAll("(\\w+) (\\w+)\\^-(\\d+)", "($1/$2^$3)");
        temp = temp.replaceAll("(\\w+)\\^-1 (\\w+)", "($2/$1)");
        temp = temp.replaceAll("(\\w+)\\^-(\\d+) (\\w+)", "($3/$1^$2)");
        temp = temp.replaceAll("(\\w+)\\^-1=(.+)", "$1=1/$2");
        temp = temp.replaceAll(" (.+?)=", "$1=");
        temp = temp.replaceAll("1/\\(1/(.+?)\\)", "$1");
        temp = temp.replaceAll(" ", "*");
        temp = temp.replaceAll("\\(\\((.+?)\\)\\)", "($1)");
        temp = temp.replaceAll("1/(\\w+)\\*(\\w+)", "$2/$1");
        temp = temp.replaceAll("1/\\((\\w+)/(\\w+)\\)", "$2/$1");
        temp = temp.replaceAll("=\\((\\w+/\\w+)\\)", "=$1");
        
        temp = insertGreek(temp);
        
        formelDisplay.setText(temp);
    }//GEN-LAST:event_formelListValueChanged
    
    // Array med alle formlerne holdes public til sener brug af andre
    // funktioner/classes.
    public String[] formler, enheder;
    private String[][][] si;
    
    /**
     * Load content that needs to be loaded at startup, including loading json
     * files.
     */
    private void load() {
        try {
            String formlerString = window.getFileContent(".\\src\\formler.json"),
                   enhederString = window.getFileContent(".\\src\\enheder.json");

            try {
                JSONObject o = new JSONObject(formlerString);
            } catch (ScriptException ex) {
                Logger.getLogger(window.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            formler = formlerString.replaceAll("^\\{\n|  |\\}\\n?$", "").split("\n");
            String[] navne = new String[formler.length];
            for(int i = 0; i < navne.length; i++)
                navne[i] = formler[i].replaceAll("\"(\\w+)\".+","$1").replaceAll("_"," ");
            formelList.setListData(navne);
            
            // Initilize units
            enheder = enhederString.replaceAll("^\\{|  |\\}\\n?$", "").split("\n");
            si = new String[enheder.length][10][2]; // TODO: Optimer size
            for(int i = 0; i < si.length; i++) {
                try {
                    String[] r;
                    r = (String[]) extractAllGroups(enheder[i], "\"(.+?)\": ?\\{(.+),?\\}",2);
                    si[i][0][0] = r[0];
                    String[] s = r[1].split(", ?");
                    for (int j = 0; j < s.length; j++)
                        si[i][j+1] = s[j].replaceAll("\"(.+?)\"", "$1").split(": ?");
                } catch (Throwable ex) {}
            }
            
        } catch (IOException ex) {
            Logger.getLogger(window.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * inputs symbols in the equations thus using the correct symbols for the units
     * @param s
     * @return Symbols for the equation
     */
    private String insertGreek(String s) {
        String[] greek = {
            "LAMBDA", "λ",
            "RHO", "ρ",
            "F_t", "Fₜ",
            "KONSTANT", ""
        };
        for(int i = 0; i < greek.length; i+=2)
            s=s.replaceAll(greek[i], greek[i+1]);
        return s;
    }
    
    /**
     * Get the factor no greater or less than (int)
     * @param unit Any available unit
     * @return The factor of given unit
     * @return 0 if non is available
     */
    private int getSIValue(String unit) {
        for (String[][] s : si)
            for (String[] t : s)
                if (t[0] != null && !t[0].equals(s[0][0]) && t[0].equals(unit))
                    return Integer.parseInt(t[1]);
        return 0;
    }
    
    /**
     * Will return all available prefixed units
     * @param name SI-name of unit
     * @return List of prefixed units of SI-name
     * @return null if non is available
     */
    private Object[] getSIPrefixList(String name) {
        ArrayList<String> list = new ArrayList<>();
        for (String[][] s : si)
            for (String[] t : s)
                if (t[0] != null && !t[0].equals(s[0][0]) && s[0][0].equals(name))
                    list.add(t[0]);
        return list.toArray();
    }
    
    /**
     * Will return all available the-same-unit's prefix-versions
     * @param unit any non- or prefixed unit
     * @return List of prefixed units of same unit
     * @return null if non is available
     */
    private Object[] getSIPrefixListFromUnit(String unit) {
        for (String[][] s : si)
            for (String[] t : s)
                if (t[0] != null && !t[0].equals(s[0][0]) && t[0].equals(unit))
                    return getSIPrefixList(s[0][0]);
        return null;
    }
    
    /**
     * Finds the SI-units for the selected unit if masse is input then well recieve kg
     * @param unit
     * @return SI-unit name
     */
    private String getSINameFromUnit(String unit) {
        for(String s : enheder) {
            String[] a = s.replaceAll("\"(.+?)\": ?\\{(.+?)\\},?", "$1@$2").split("@");
            if(a.length > 1)
                for (String t : a[1].split(", ?")) 
                    if(t.split(": ?")[0].replaceAll("\"","").equals(unit))
                        return a[0];
        }
        return "";
    }
    
    public String capitalize(String s) {
        if(s.length() > 0) return s.toUpperCase().charAt(0) + s.substring(1,s.length());
        else return "";
    }
    
    /**
     * Get the content of file
     * @param path Path to the file, can be relative or absolute
     * @return String of file content
     * @throws FileNotFoundException If file does not exist
     * @throws IOException
     */
    public static String getFileContent(String path) throws FileNotFoundException, IOException {
        File file = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st, cnt = "";
        while((st=br.readLine()) != null) cnt += st+"\n";
        return cnt;
    }
    
    /**
     * Matches a full-match regular expression but only returns the group(s).
     * @param s String
     * @param RegExp Regular Expression
     * @param Groups Amount of groups to include, cannot be grater than the actually amount of RegExp-groups
     * @return Array of strings for each group
     * @throws Throwable If no match was found
     */
    public Object[] extractAllGroups(String s, String RegExp, int Groups) throws Throwable {
        String replace = "";
        for(int i = 0; i < Groups; i++) replace+="$"+(i+1)+"!";
        replace = replace.substring(0, replace.length()-1);
        s = s.replaceAll(RegExp, replace);
        if (s.isEmpty()) throw new Throwable("No match");
        return s.split("!");
    }
    
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
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new window().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SIEnhed1;
    private javax.swing.JLabel SIEnhed2;
    private javax.swing.JLabel SIEnhed3;
    private javax.swing.JPanel background;
    private javax.swing.JLabel calculateHeader;
    private javax.swing.JPanel calculator;
    private javax.swing.JPanel display;
    private javax.swing.JLabel displayHeader;
    private javax.swing.JEditorPane formelDisplay;
    private javax.swing.JList<String> formelList;
    private javax.swing.JPanel formelView;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane scrollView;
    private javax.swing.JLabel unitLabel1;
    private javax.swing.JLabel unitLabel2;
    private javax.swing.JLabel unitLabel3;
    private javax.swing.JComboBox<String> unitSelect1;
    private javax.swing.JComboBox<String> unitSelect2;
    private javax.swing.JComboBox<String> unitSelect3;
    private javax.swing.JTextField value1;
    private javax.swing.JTextField value2;
    private javax.swing.JTextField value3;
    // End of variables declaration//GEN-END:variables
}
