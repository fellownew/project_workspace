package kr.co.taommall.mail;


import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.Properties;
import java.util.Random;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {
	
	public String sendMail(String email,String plainText) throws Exception{
		int number = 0;
        try {
        	MessageDigest md5 = MessageDigest.getInstance("MD5");
			md5.update(plainText.getBytes());
			byte[] digest01 = md5.digest();
			for(int i=0;i<digest01.length;i=i+2){
				number= number +Math.abs(digest01[i])*Math.abs(digest01[i+1]);
			}
        	System.out.println(email);
            String[] emailList = {email};
            String emailFromAddress = "taomall";// 메일 보내는 사람
            String emailMsgTxt = "인증번호는"+number+" 입니다."; // 내용
            String emailSubjectTxt = "따옴몰 인증번호";// 제목
            // 메일보내기 
            postMail(emailList, emailSubjectTxt, emailMsgTxt, emailFromAddress);
            System.out.println("메일전송 완료 \n"+number);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return String.valueOf(number);
    }
     
    //https://www.google.com/settings/security/lesssecureapps 
    private void postMail(String recipients[], String subject, String message, String from) throws MessagingException, UnsupportedEncodingException {
        
    	boolean debug = false;
     
        String SMTP_HOST_NAME = "gmail-smtp.l.google.com";
         
        // Properties 설정
        Properties props = new Properties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.starttls.enable","true");
        props.put("mail.smtp.host", SMTP_HOST_NAME);
        props.put("mail.smtp.auth", "true");
  
        Authenticator auth = new SMTPAuthenticator();
        Session session = Session.getDefaultInstance(props, auth);
  
        session.setDebug(debug);
  
        // create a message
        Message msg = new MimeMessage(session);
  
        // set the from and to address InternetAddress(메일주소, 보내는사람 이름, 문자셋)
        InternetAddress addressFrom = new InternetAddress(recipients[0],"taommall","UTF-8");
        msg.setFrom(addressFrom);
  
        InternetAddress[] addressTo = new InternetAddress[recipients.length];
        for (int i = 0; i < recipients.length; i++) {
            addressTo[i] = new InternetAddress(recipients[i]);
        }
        msg.setRecipients(Message.RecipientType.TO, addressTo);
  
        // Setting the Subject and Content Type
        msg.setSubject(subject);
        msg.setContent(message, "text/html;charset=utf-8");
        Transport.send(msg);

    }
  
    /**
     * 구글 사용자 메일 계정 아이디/패스 정보
     */
    private class SMTPAuthenticator extends javax.mail.Authenticator {
        public PasswordAuthentication getPasswordAuthentication() {
            String username =  "91kosta@gmail.com"; // gmail 사용자;
            String password = "1q2w3e4r!!"; // 패스워드;
            return new PasswordAuthentication(username, password);
        }
    }
}