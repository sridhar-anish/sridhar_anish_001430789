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
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JComponent;
public class View_JPanel extends javax.swing.JPanel {

    /**
     * Creates new form View_JPanel
     */
    public View_JPanel(Car_Details Car_Object) {
        initComponents();
        display_car(Car_Object);
        
        //We create an object of ImageIcon and get the path of the image.
        ImageIcon car_image=new ImageIcon(Toolkit.getDefaultToolkit().getImage(Car_Object.getImage_path()));
        Image car_img=car_image.getImage();// Created an object of type Image
        Image car_img1=car_img.getScaledInstance(500,500,java.awt.Image.SCALE_SMOOTH);//Scaled the image
        ImageIcon car_i=new ImageIcon(car_img1);//Created an object of ImageIcon
        Image_Label.setIcon(car_i);//The selected image is set to the Image_Label
    }
    
    //This function displays the value passed to the attributes
    private void display_car(Car_Details Car_Object)
    {   
        Image_Label.setIcon(new ImageIcon(Car_Object.getImage_path()));
        String Car_Model=Car_Object.getModel();
        Model_Field.setText(Car_Model);
        String Car_Color=Car_Object.getColor();
        Color_Field.setText(Car_Color);
        String Car_Serial_no=Car_Object.getSerial_Number();
        Serial_no_Field.setText(Car_Serial_no);
        String Car_Dimensions=Car_Object.getDimensions();
        Dimensions_Field.setText(Car_Dimensions);
        String Car_Seating_capacity=Car_Object.getSeating_Capacity();
        Seating_capacity_Field.setText(Car_Seating_capacity);
        String Car_Mileage=Car_Object.getMileage();
        Mileage_Field.setText(Car_Mileage);
        String Car_Top_Speed=Car_Object.getTop_Speed();
        Top_Speed_Field.setText(Car_Top_Speed);
        String Car_Engine=Car_Object.getEngine();
        Engine_Field.setText(Car_Engine);
        String Car_Weight=Car_Object.getWeight();
        Weight_Field.setText(Car_Weight);
        String Car_Category=Car_Object.getCategory();
        Category_Field.setText(Car_Category);
        String Car_Fuel_Tank_Capacity=Car_Object.getFuel_Tank_Capacity();
        Fuel_Capacity_Field.setText(Car_Fuel_Tank_Capacity);
        String Car_Transmission=Car_Object.getTransmission();
        Transmission_Field.setText(Car_Transmission);
        String Car_Gear=Car_Object.getGear();
        Gear_Field.setText(Car_Gear);
        String Car_Price=Car_Object.getPrice();
        Price_Field.setText(Car_Price);
        String Car_Generation=Car_Object.getGeneration();
        Generation_Field.setText(Car_Generation);
        String Car_Year=Car_Object.getYear();
        Year_Field.setText(Car_Year);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Car_product_label = new javax.swing.JLabel();
        Model_Label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Color_Field = new javax.swing.JTextField();
        Model_Field = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Serial_no_Field = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
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

        Car_product_label.setFont(new java.awt.Font("Ubuntu", 1, 27)); // NOI18N
        Car_product_label.setText("View Your Car!");

        Model_Label.setFont(new java.awt.Font("Ubuntu", 2, 19)); // NOI18N
        Model_Label.setText("Model  ---");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 2, 19)); // NOI18N
        jLabel1.setText("Color  ---");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 2, 19)); // NOI18N
        jLabel2.setText("Serial Number  ---");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 2, 19)); // NOI18N
        jLabel3.setText("Dimensions  ---");

        Seating_capacity_label.setFont(new java.awt.Font("Ubuntu", 2, 19)); // NOI18N
        Seating_capacity_label.setText("Seating Capacity  ---");

        Mileage_Label.setFont(new java.awt.Font("Ubuntu", 2, 19)); // NOI18N
        Mileage_Label.setText("Mileage  ---");

        Top_Speed_Label.setFont(new java.awt.Font("Ubuntu", 2, 19)); // NOI18N
        Top_Speed_Label.setText("Top Speed  ---");

        Engine_Label.setFont(new java.awt.Font("Ubuntu", 2, 19)); // NOI18N
        Engine_Label.setText("Engine  ---");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 30)); // NOI18N

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

        Image_Label.setBackground(java.awt.Color.gray);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1084, 1084, 1084))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Model_Label)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(Seating_capacity_label)
                                    .addComponent(Mileage_Label)
                                    .addComponent(Top_Speed_Label)
                                    .addComponent(Engine_Label)
                                    .addComponent(Weight_Label)
                                    .addComponent(Category_Label))
                                .addGap(78, 78, 78)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Color_Field)
                                    .addComponent(Serial_no_Field)
                                    .addComponent(Dimensions_Field)
                                    .addComponent(Seating_capacity_Field)
                                    .addComponent(Mileage_Field)
                                    .addComponent(Top_Speed_Field)
                                    .addComponent(Engine_Field)
                                    .addComponent(Weight_Field)
                                    .addComponent(Category_Field, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                                    .addComponent(Model_Field)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Fuel_capacity_Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addComponent(Fuel_Capacity_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Transmission_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Transmission_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Gear_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Year_Label)
                                    .addComponent(jLabel6)
                                    .addComponent(Generation_Label))
                                .addGap(113, 113, 113)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Generation_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Price_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Year_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Image_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(506, 506, 506)
                        .addComponent(Car_product_label, javax.swing.GroupLayout.PREFERRED_SIZE, 1032, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Car_product_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Model_Label)
                            .addComponent(Model_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(Price_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Generation_Label)
                                .addComponent(Generation_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(Color_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Serial_no_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Dimensions_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Seating_capacity_label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Seating_capacity_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Mileage_Label)
                            .addComponent(Mileage_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Top_Speed_Label)
                            .addComponent(Top_Speed_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Engine_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Engine_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Weight_Label)
                            .addComponent(Weight_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Category_Label)
                            .addComponent(Category_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Fuel_capacity_Label)
                            .addComponent(Fuel_Capacity_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Transmission_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Transmission_Label))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Gear_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Year_Label)
                            .addComponent(Year_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(Image_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Car_product_label;
    private javax.swing.JTextField Category_Field;
    private javax.swing.JLabel Category_Label;
    private javax.swing.JTextField Color_Field;
    private javax.swing.JTextField Dimensions_Field;
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
    private javax.swing.JTextField Top_Speed_Field;
    private javax.swing.JLabel Top_Speed_Label;
    private javax.swing.JTextField Transmission_Field;
    private javax.swing.JLabel Transmission_Label;
    private javax.swing.JTextField Weight_Field;
    private javax.swing.JLabel Weight_Label;
    private javax.swing.JTextField Year_Field;
    private javax.swing.JLabel Year_Label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}