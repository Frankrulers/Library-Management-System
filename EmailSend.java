/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author HP
 */
public class EmailSend {
    
   public void send(){
        try{
            String host="smtp.gmail.com";
            String user="shubhamladha85@gmail.com";
            String pass="beinghp1";
            String to="shubham.ladha@vitap.ac.in";
            String from="shubhamladha85@gmail.com";
            String subject="Issue book";
            String messageText="Book has been issued";
            boolean sessionDebug=false;
            Properties props=System.getProperties();
            props.put("mail.smtp.starttis.enable","true");
            props.put("mail.smtp.host",host);
            props.put("mail.smtp.port","587");
            props.put("mail.smtp.auth","true");
            props.put("mail.smtp.starttls.enable","true");
            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session mailSession=Session.getDefaultInstance(props,null);
            mailSession.setDebug(sessionDebug);
            Message msg=new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address={new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO,address);
            msg.setSubject(subject);
            msg.setSentDate(new Date());
            msg.setText(messageText);
            Transport transport=mailSession.getTransport("smtp");
            transport.connect(host,user,pass);
            transport.sendMessage(msg,msg.getAllRecipients());
            transport.close();
            System.out.println("message sent sucessfully");              
        }
        catch(Exception e){
        System.out.println(e);
        }
    }
    public void send2(){
        try{
            String host="smtp.gmail.com";
            String user="shubhamladha85@gmail.com";
            String pass="beinghp1";
            String to="shubham.ladha@vitap.ac.in";
            String from="shubhamladha85@gmail.com";
            String subject="Retuen Book";
            String messageText="Book has been returned";
            boolean sessionDebug=false;
            Properties props=System.getProperties();
            props.put("mail.smtp.starttis.enable","true");
            props.put("mail.smtp.host",host);
            props.put("mail.smtp.port","587");
            props.put("mail.smtp.auth","true");
            props.put("mail.smtp.starttls.enable","true");
            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session mailSession=Session.getDefaultInstance(props,null);
            mailSession.setDebug(sessionDebug);
            Message msg=new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address={new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO,address);
            msg.setSubject(subject);
            msg.setSentDate(new Date());
            msg.setText(messageText);
            Transport transport=mailSession.getTransport("smtp");
            transport.connect(host,user,pass);
            transport.sendMessage(msg,msg.getAllRecipients());
            transport.close();
            System.out.println("message sent sucessfully");              
        }
        catch(Exception e){
        System.out.println(e);
        }
    }
    public static void main(String args[])
    {
     EmailSend em=new EmailSend();
     em.send();
    }
    
}
