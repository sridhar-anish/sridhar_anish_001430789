/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Car_Interface;

/**
 *
 * @author anish
 */
//import statements are placed here
import Car_Product.Car_Details;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
public class Create_JPanel extends javax.swing.JPanel {

    /**
     * Creates new form Create_JPanel
     */
    private Car_Details Car_Object;
    public Create_JPanel(Car_Details Car_Object) {
        initComponents();
        this.Car_Object=Car_Object;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Car_product_label = new javax.swing.JLabel();
        Model_Label = new javax.swing.JLabel();
        Color_Label = new javax.swing.JLabel();
        Color_Field = new javax.swing.JTextField();
        Model_Field = new javax.swing.JTextField();
        Serial_no_Label = new javax.swing.JLabel();
        Serial_no_Field = new javax.swing.JTextField();
        Dimensions_Label = new javax.swing.JLabel();
        Dimensions_Field = new javax.swing.JTextField();
        Seating_capacity_label = new javax.swing.JLabel();
        Seating_capacity_Field = new javax.swing.JTextField();
        Mileage_Label = new javax.swing.JLabel();
        Mileage_Field = new javax.swing.JTextField();
        Top_Speed_Label = new javax.swing.JLabel();
        Top_Speed_Field = new javax.swing.JTextField();
        Engine_Label = new javax.swing.JLabel();
        Engine_Field = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Weight_Label = new javax.swing.JLabel();
        Weight_Field = new javax.swing.JTextField();
        Category_Label = new javax.swing.JLabel();
        Category_Field = new javax.swing.JTextField();
        Fuel_capacity_Label = new javax.swing.JLabel();
        Fuel_Capacity_Field = new javax.swing.JTextField();
        Transmission_Label = new javax.swing.JLabel();
        Transmission_Field = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Gear_Field = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Price_Field = new javax.swing.JTextField();
        Generation_Label = new javax.swing.JLabel();
        Generation_Field = new javax.swing.JTextField();
        Year_Label = new javax.swing.JLabel();
        Year_Field = new javax.swing.JTextField();
        Image_Label = new javax.swing.JLabel();
        Browse_upload_btn = new javax.swing.JButton();
        Creat_car_btn = new javax.swing.JButton();

        Car_product_label.setFont(new java.awt.Font("Ubuntu", 1, 27)); // NOI18N
        Car_product_label.setText("Create Your Car!");

        Model_Label.setFont(new java.awt.Font("Ubuntu", 2, 19)); // NOI18N
        Model_Label.setText("Model  ---");

        Color_Label.setFont(new java.awt.Font("Ubuntu", 2, 19)); // NOI18N
        Color_Label.setText("Color  ---");

        Serial_no_Label.setFont(new java.awt.Font("Ubuntu", 2, 19)); // NOI18N
        Serial_no_Label.setText("Serial Number  ---");

        Dimensions_Label.setFont(new java.awt.Font("Ubuntu", 2, 19)); // NOI18N
        Dimensions_Label.setText("Dimensions  ---");

        Seating_capacity_label.setFont(new java.awt.Font("Ubuntu", 2, 19)); // NOI18N
        Seating_capacity_label.setText("Seating Capacity  ---");

        Mileage_Label.setFont(new java.awt.Font("Ubuntu", 2, 19)); // NOI18N
        Mileage_Label.setText("Mileage  ---");

        Top_Speed_Label.setFont(new java.awt.Font("Ubuntu", 2, 19)); // NOI18N
        Top_Speed_Label.setText("Top Speed  ---");

        Engine_Label.setFont(new java.awt.Font("Ubuntu", 2, 19)); // NOI18N
        Engine_Label.setText("Engine  ---");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 30)); // NOI18N
        jLabel4.setText("           WELCOME!!");

        Weight_Label.setFont(new java.awt.Font("Ubuntu", 2, 19)); // NOI18N
        Weight_Label.setText("Weight (lbs)  ---");

        Category_Label.setFont(new java.awt.Font("Ubuntu", 2, 19)); // NOI18N
        Category_Label.setText("Category  ---");

        Fuel_capacity_Label.setFont(new java.awt.Font("Ubuntu", 2, 19)); // NOI18N
        Fuel_capacity_Label.setText("Fuel Tank Capacity  ---");

        Transmission_Label.setFont(new java.awt.Font("Ubuntu", 2, 19)); // NOI18N
        Transmission_Label.setText("Transmission  ---");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 2, 19)); // NOI18N
        jLabel5.setText("Gear  ---");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 2, 19)); // NOI18N
        jLabel6.setText("Price  ---");

        Generation_Label.setFont(new java.awt.Font("Ubuntu", 2, 19)); // NOI18N
        Generation_Label.setText("Generation  ---");

        Year_Label.setFont(new java.awt.Font("Ubuntu", 2, 19)); // NOI18N
        Year_Label.setText("Year  ---");

        Image_Label.setFont(new java.awt.Font("Ubuntu", 2, 19)); // NOI18N
        Image_Label.setText("Image  ---");

        Browse_upload_btn.setText("Browse and Upload");
        Browse_upload_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Browse_upload_btnActionPerformed(evt);
            }
        });

        Creat_car_btn.setText("Create Your Car!");
        Creat_car_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Creat_car_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Model_Label)
                            .addComponent(Color_Label)
                            .addComponent(Serial_no_Label)
                            .addComponent(Dimensions_Label)
                            .addComponent(Seating_capacity_label)
                            .addComponent(Mileage_Label)
                            .addComponent(Top_Speed_Label)
                            .addComponent(Engine_Label)
                            .addComponent(Weight_Label)
                            .addComponent(Category_Label))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Color_Field)
                            .addComponent(Serial_no_Field)
                            .addComponent(Dimensions_Field)
                            .addComponent(Seating_capacity_Field)
                            .addComponent(Mileage_Field)
                            .addComponent(Top_Speed_Field)
                            .addComponent(Engine_Field)
                            .addComponent(Weight_Field)
                            .addComponent(Category_Field, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(Model_Field))
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Fuel_capacity_Label)
                                    .addComponent(Transmission_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(Generation_Label)
                                    .addComponent(Year_Label))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Fuel_Capacity_Field)
                                    .addComponent(Transmission_Field)
                                    .addComponent(Gear_Field)
                                    .addComponent(Price_Field)
                                    .addComponent(Generation_Field)
                                    .addComponent(Year_Field, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Image_Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                                .addComponent(Browse_upload_btn)
                                .addGap(160, 160, 160)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Car_product_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(557, 557, 557)
                .addComponent(Creat_car_btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(38, 38, 38)
                .addComponent(Car_product_label)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Model_Label)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Model_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Fuel_capacity_Label)
                        .addComponent(Fuel_Capacity_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Color_Label)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Color_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Transmission_Label)
                        .addComponent(Transmission_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Serial_no_Label)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Serial_no_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(Gear_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Dimensions_Label)
                        .addComponent(Dimensions_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(Price_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Seating_capacity_label)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Seating_capacity_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Generation_Label)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Mileage_Label)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Mileage_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Year_Label)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Top_Speed_Label)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Top_Speed_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Image_Label)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Engine_Label)
                            .addComponent(Engine_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Weight_Label)
                            .addComponent(Weight_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Category_Label)
                            .addComponent(Category_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Generation_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Year_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Browse_upload_btn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(Creat_car_btn)
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    //Used Getter and Setter to get and set the the attributes
    private void Creat_car_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Creat_car_btnActionPerformed
        // TODO add your handling code here:
        Car_Object.setModel(Model_Field.getText());
        Car_Object.setColor(Color_Field.getText());
        Car_Object.setSerial_Number(Serial_no_Field.getText());
        Car_Object.setDimensions(Dimensions_Field.getText());
        Car_Object.setSeating_Capacity(Seating_capacity_Field.getText());
        Car_Object.setMileage(Mileage_Field.getText());
        Car_Object.setTop_Speed(Top_Speed_Field.getText());
        Car_Object.setEngine(Engine_Field.getText());
        Car_Object.setWeight(Weight_Field.getText());
        Car_Object.setCategory(Category_Field.getText());
        Car_Object.setFuel_Tank_Capacity(Fuel_Capacity_Field.getText());
        Car_Object.setTransmission(Transmission_Field.getText());
        Car_Object.setGear(Gear_Field.getText());
        Car_Object.setPrice(Price_Field.getText());
        Car_Object.setGeneration(Generation_Field.getText());
        Car_Object.setYear(Year_Field.getText());
        
        JOptionPane.showMessageDialog(null,"Created your car successfully!!!");
        
    }//GEN-LAST:event_Creat_car_btnActionPerformed

    private void Browse_upload_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Browse_upload_btnActionPerformed
        // TODO add your handling code here:
        JFileChooser choose_image=new JFileChooser(); //We create an object of JFileChooser to select the file for the image
        choose_image.showOpenDialog(null);
        File f=choose_image.getSelectedFile();//We store the selected image in f
        String test = f.getAbsolutePath();//We get the absolute path of the stored image file f
        Car_Object.setImage_path(f.getPath());//We are extracting the path of the image
        Browse_upload_btn.setText(f.getName());
    }//GEN-LAST:event_Browse_upload_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Browse_upload_btn;
    private javax.swing.JLabel Car_product_label;
    private javax.swing.JTextField Category_Field;
    private javax.swing.JLabel Category_Label;
    private javax.swing.JTextField Color_Field;
    private javax.swing.JLabel Color_Label;
    private javax.swing.JButton Creat_car_btn;
    private javax.swing.JTextField Dimensions_Field;
    private javax.swing.JLabel Dimensions_Label;
    private javax.swing.JTextField Engine_Field;
    private javax.swing.JLabel Engine_Label;
    private javax.swing.JTextField Fuel_Capacity_Field;
    private javax.swing.JLabel Fuel_capacity_Label;
    private javax.swing.JTextField Gear_Field;
    private javax.swing.JTextField Generation_Field;
    private javax.swing.JLabel Generation_Label;
    private javax.swing.JLabel Image_Label;
    private javax.swing.JTextField Mileage_Field;
    private javax.swing.JLabel Mileage_Label;
    private javax.swing.JTextField Model_Field;
    private javax.swing.JLabel Model_Label;
    private javax.swing.JTextField Price_Field;
    private javax.swing.JTextField Seating_capacity_Field;
    private javax.swing.JLabel Seating_capacity_label;
    private javax.swing.JTextField Serial_no_Field;
    private javax.swing.JLabel Serial_no_Label;
    private javax.swing.JTextField Top_Speed_Field;
    private javax.swing.JLabel Top_Speed_Label;
    private javax.swing.JTextField Transmission_Field;
    private javax.swing.JLabel Transmission_Label;
    private javax.swing.JTextField Weight_Field;
    private javax.swing.JLabel Weight_Label;
    private javax.swing.JTextField Year_Field;
    private javax.swing.JLabel Year_Label;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
