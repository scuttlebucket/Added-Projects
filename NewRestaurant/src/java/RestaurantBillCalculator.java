//  RestaurantBillCalculator.java
// Calculates a table's bill.

//**** TODO ******  PROVIDE IMPORT STATEMENT Modify the import Statements so that only classes used are actually imported

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import javax.swing.*;



public class RestaurantBillCalculator extends JFrame
{
   // JLabel for Restaurant
   private JLabel restaurantJLabel;

   // JPanel to display waiter information
   private JPanel waiterJPanel;

   // JLabel and JTextField for table number
   private JLabel tableNumberJLabel;
   private JTextField tableNumberJTextField;

   // JLabel and JTextField for waiter name
   private JLabel waiterNameJLabel;
   private JTextField waiterNameJTextField;

   // JPanel to display menu items
   private JPanel menuItemsJPanel;

   // JLabel and JComboBox for beverage
   private JLabel beverageJLabel;
   private JComboBox beverageJComboBox;

   // JLabel and JComboBox for appetizer
   private JLabel appetizerJLabel;
   private JComboBox appetizerJComboBox;

   // JLabel and JComboBox for main course
   private JLabel mainCourseJLabel;
   private JComboBox mainCourseJComboBox;

   // JLabel and JComboBox for dessert
   private JLabel dessertJLabel;
   private JComboBox dessertJComboBox;

   // JButton for calculate bill
   private JButton calculateBillJButton;

   // JLabel and JTextField for subtotal
   private JLabel subtotalJLabel;
   private JTextField subtotalJTextField;

   // JLabel and JTextField for tax
   private JLabel taxJLabel;
   private JTextField taxJTextField;

   // JLabel and JTextField for total
   private JLabel totalJLabel;
   private JTextField totalJTextField;

   // constant for tax rate
   private final static double TAX_RATE = 0.05;

   // declare instance variables for database processing
   private Connection myConnection;
   private Statement myStatement;
   private ResultSet myResultSet;

   // declare instance variable ArrayList to hold bill items
   private ArrayList billItems = new ArrayList();

   // constructor
   public RestaurantBillCalculator( 
      String databaseUserName, String databasePassword )
   {
      createUserInterface(); // set up GUI  

      // TODO: code to connect to the database

   } // end constructor

   // create and position GUI components; register event handlers
   private void createUserInterface()
   {
      // get content pane for attaching GUI components
      Container contentPane = getContentPane();

      // enable explicit positioning of GUI components 
      contentPane.setLayout( null );

      // **** TODO ****** set up restaurantJLabel


      // **** TODO ****** set up waiterJPanel

      // **** TODO ****** set up menuItemsJPanel

            public void actionPerformed( ActionEvent event ) 
            {
               calculateBillJButtonActionPerformed( event );
            }

         } // end anonymous inner class

      ); // end addActionListener
      
      // **** TODO ****** set up subtotalJLabel


      // **** TODO ****** set up subtotalJTextField
      subtotalJTextField = new JTextField();


      // **** TODO ****** set up taxJLabel


      // **** TODO ****** set up taxJTextField


      // **** TODO ****** set up totalJLabel

      // **** TODO ****** set up totalJTextField

      // **** TODO ****** set properties of application's window

      // **** TODO ****** ensure database connection is closed
      // **** TODO ****** when user quits application
      addWindowListener(

         new WindowAdapter()anonymous inner class
         {
            //  event handler called when close button is clicked
            public void windowClosing( WindowEvent event )
            {
               frameWindowClosing( event );
            }

         } //  end anonymous inner class

      ); // end addWindowListener

   } // end method createUserInterface

   // **** TODO ****** set up waiterJPanel
   private void createWaiterJPanel()
   {
      // **** TODO ****** set up waiterJPanel


      // **** TODO ****** set up tableNumberJLabel

      // **** TODO ****** set up tableNumberJTextField

      // **** TODO ****** set up waiterNameJLabel

      // **** TODO ****** set up waiterNameJTextField

   } // end method createWaiterJPanel

   // **** TODO ****** create menuItemsJPanel
   private void createMenuItemsJPanel()
   {
      //  set up menuItemsJPanel
      menuItemsJPanel = new JPanel();
      menuItemsJPanel.setBounds( 20, 152, 232, 152 );
      menuItemsJPanel.setBorder( BorderFactory.createTitledBorder( 
         BorderFactory.createEtchedBorder(), "Menu Items" ) );
      menuItemsJPanel.setLayout( null );

      //  set up beverageJLabel
      beverageJLabel = new JLabel();
      beverageJLabel.setBounds( 8, 24, 80, 24 );
      beverageJLabel.setText( "Beverage:" );
      menuItemsJPanel.add( beverageJLabel );

      // set up beverageJComboBox
      beverageJComboBox = new JComboBox();
      beverageJComboBox.setBounds( 88, 24, 128, 25 );
      menuItemsJPanel.add( beverageJComboBox );
      beverageJComboBox.addItemListener(

         new ItemListener()  // **** TODO ****** anonymous inner class
         {
            // **** TODO ****** event handler called when item in beverageJComboBox
            // **** TODO ****** is selected
            public void itemStateChanged( ItemEvent event )
            {
               beverageJComboBoxItemStateChanged( event );
            }

         } // end anonymous inner class

      ); // end addItemListener

      // **** TODO ****** add items to beverageJComboBox


      // **** TODO ****** set up appetizerJLabel


      // **** TODO ****** set up appetizerJComboBox

      // **** TODO ****** add items to appetizerJComboBox


      // **** TODO ****** set up mainCourseJLabel

      // **** TODO ****** set up mainCourseJComboBox
      mainCourseJComboBox = new JComboBox();

      // **** TODO ****** add items to mainCourseJComboBox


      // **** TODO ****** set up dessertJLabel


   } // end method createMenuItemsJPanel

   // **** TODO ****** add items to JComboBox
   private void loadCategory(
      String category, JComboBox categoryJComboBox )
   {
            
   } // end method loadCategory

   // **** TODO ****** user select beverage
   private void beverageJComboBoxItemStateChanged( ItemEvent event )
   {
      
   } // end method beverageJComboBoxItemStateChanged

   // **** TODO ****** user select appetizer
   private void appetizerJComboBoxItemStateChanged( ItemEvent event )
   {
      
   } // end method appetizerJComboBoxItemStateChanged

   // **** TODO ****** user select main course
   private void mainCourseJComboBoxItemStateChanged( 
      ItemEvent event )
   {
      
   } // end method mainCourseJComboBoxItemStateChanged

   // **** TODO ****** user select dessert
   private void dessertJComboBoxItemStateChanged( ItemEvent event )
   {
      
   } // end method dessertJComboBoxItemStateChanged

   // **** TODO ****** user click Calculate Bill JButton
   private void calculateBillJButtonActionPerformed( 
      ActionEvent event )
   {
      
   } // end method calculateBillJButtonActionPerformed

   // **** TODO ****** calculate subtotal
   private double calculateSubtotal()
   {
      return 0;

   } // end method calculateSubtotal

   // **** TODO ****** user close window
   private void frameWindowClosing( WindowEvent event )
   {
      
   }  // end method frameWindowClosing

   // **** TODO ****** method main
   public static void main( String[] args ) 
   {
      // **** TODO ****** check command-line arguments
      if ( args.length == 2 )
      {
         // **** TODO ****** get command-line arguments
         String databaseUserName = args[ 0 ];
         String databasePassword = args[ 1 ];

         // **** TODO ****** create new RestaurantBillCalculator
         RestaurantBillCalculator application = 
            new RestaurantBillCalculator ( 
               databaseUserName, databasePassword );
      }
      else
      {
         System.out.println( "Usage: java " + 
            "RestaurantBillCalculator databaseUserName databasePassword" );
      }

   } // end method main

} // end class RestaurantBillCalculator

