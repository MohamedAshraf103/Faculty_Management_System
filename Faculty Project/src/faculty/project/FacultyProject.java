
package faculty.project;

import javax.swing.JOptionPane;

public class FacultyProject {

    public static void main(String[] args) {
       callSplash(); 
    }
    
    public static void callSplash()
    {
         SplashScreen s;
        s=new SplashScreen();
        s.setVisible(true);
        try{
            for(int i=0;i<=100;i++)
            {
                Thread.sleep(100);
                s.loadingValue.setText(i+"%");
                if(i==10)
                {
                    s.loadingLabel.setText("Loading On Modules....");
                }
                if(i==20)
                {
                    s.loadingLabel.setText("Connection On Modules....");
                }
                if(i==50)
                {
                      s.loadingLabel.setText("Loading Database....");
                }
                if(i==70)
                {
                    s.loadingLabel.setText("Connected Successful.....");                
                }
                if(i==80)
                {
                      s.loadingLabel.setText("Launching Application....");
                }
                s.loadingBar.setValue(i);
            }
           s.dispose();
            new LoginFrame().setVisible(true);
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        
        }   

    }
    
}
