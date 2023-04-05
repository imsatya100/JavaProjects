package demo.json;

import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONExtract {
	@SuppressWarnings("unchecked")
	public static void extract(JSONObject json) throws Exception{
		System.out.println("===============Product Details====================");
		System.out.println("Product Key  : "+json.get("productKey"));
		System.out.println("User Id      : "+json.get("userId"));
		System.out.println("==================================================");
		System.out.println("===============Signer Details====================");
		JSONArray signerInfo = (JSONArray) json.get("signerinfo");
		Iterator<JSONObject> itr = signerInfo.iterator();
		while(itr.hasNext()){
			JSONObject signer = itr.next();
			System.out.println();
			System.out.println("---------------"+signer.get("signerLabel")+"---------------");
			System.out.println("No of Orders  : "+signer.get("signerOrder"));
			String mandatory = (String) signer.get("mandatory");
			String addToAddressBook = (String) signer.get("addToAddressBook");
			String logicRequired = (String) signer.get("logicRequired");
			String rejection = (String) signer.get("rejectionCommentsRequired");
			String attachPhoto = (String) signer.get("attachPhotoAtApproval");
			
			//is_Mandatory
			if(mandatory.equalsIgnoreCase("Y")){
				System.out.println("Mandatory  : Yes");
			}//if
			else{
				System.out.println("Mandatory  : No");
			}//else
			
			//is addToAddressBook
			if(addToAddressBook.equalsIgnoreCase("Y")){
				System.out.println("Add To Address Book  : Yes");
			}//if
			else{
				System.out.println("Add To Address Book  : No");
			}//else
			
			System.out.println("Cooments for Signer : "+signer.get("commentsForSigner"));
			
			
			//logicRequired
			if(logicRequired.equalsIgnoreCase("Y")){
				System.out.println("Logic Required  : Yes");
			}//if
			else{
				System.out.println("Logic Required  : No");
			}//else
			
			//rejection
			if(rejection.equalsIgnoreCase("Y")){
				System.out.println("Rejection Comments Required : Yes");
			}//if
			else{
				System.out.println("Rejection Comments Required  : No");
			}//else
			
			
			//attachPhoto
			if(attachPhoto.equalsIgnoreCase("Y")){
				System.out.println("Attach Photo At Approval  : Yes");
			}//if
			else{
				System.out.println("Attach Photo At Approval  : No");
			}//else
			
			
			JSONObject signature = (JSONObject) signer.get("signatureOptions");
			System.out.println();
			System.out.println("---------------Signature Options---------------");
			String type = (String) signature.get("type");
			String draw = (String) signature.get("draw");
			String create = (String) signature.get("create");
			String upload = (String) signature.get("upload");
			String mouse = (String) signature.get("mouse");
			String mobileSigning = (String) signature.get("mobileSigning");
			
			//type
			if(type.equalsIgnoreCase("Y")){
				System.out.println("Type  : Yes");
			}//if
			else{
				System.out.println("Type  : No");
			}//else
			
			//draw
			if(draw.equalsIgnoreCase("Y")){
				System.out.println("Draw  : Yes");
			}//if
			else{
				System.out.println("Draw  : No");
			}//else
			
			//create
			if(create.equalsIgnoreCase("Y")){
				System.out.println("Create  : Yes");
			}//if
			else{
				System.out.println("Create  : No");
			}//else
			
			//upload
			if(upload.equalsIgnoreCase("Y")){
				System.out.println("Upload  : Yes");
			}//if
			else{
				System.out.println("Upload  : No");
			}//else
			
			//mouse
			if(mouse.equalsIgnoreCase("Y")){
				System.out.println("Mouse  : Yes");
			}//if
			else{
				System.out.println("Mouse  : No");
			}//else
			
			//mobileSigning
			if(mobileSigning.equalsIgnoreCase("Y")){
				System.out.println("Mobile Signing  : Yes");
			}//if
			else{
				System.out.println("Mobile Signing  : No");
			}//else
			System.out.println("--------------------------------------------------------");
			System.out.println();
			System.out.println("Full Name  : "+signer.get("fullname"));
			System.out.println("Role       : "+signer.get("role"));
			System.out.println("Email-ID   : "+signer.get("email"));
			
			String fullySigned = (String) signer.get("sendFullySignedDoctoSigner") ;
			if(fullySigned.equalsIgnoreCase("Y")){
				System.out.println("Send Fully Signed Docto Signer  : Yes");
			}//if
			else{
				System.out.println("Send Fully Signed Docto Signer  : No");
			}//else
			
			JSONObject authentication = (JSONObject) signer.get("authenticationType");
			System.out.println("\n---------------Authentication Type---------------");
			System.out.println("Type              : "+authentication.get("type"));
			System.out.println("Code At View      : "+authentication.get("codeAtView"));
			System.out.println("Code At Signing   : "+authentication.get("codeAtSigning"));
			System.out.println("---------------------------------------------------\n");
			JSONObject documents = (JSONObject) signer.get("documentsRequiredFromSigner");
			System.out.println("Document Required From Signer  : Max "+documents.get("max")+" Min "+documents.get("min"));
			
			JSONArray field = (JSONArray) signer.get("fieldType");
			Iterator<JSONObject> fielditr = field.iterator();
			while(fielditr.hasNext()){
				JSONObject fieldType = fielditr.next();
				System.out.println("\n---------------Field Details---------------");
				System.out.println("Type        : "+fieldType.get("type"));
				if(Boolean.parseBoolean((String) fieldType.get("mandatory"))){
					System.out.println("Mandatory   : Yes");	
				}//if
				else{
					System.out.println("Mandatory   : No");	
				}//else
				
				System.out.println();
				JSONArray position = (JSONArray) fieldType.get("positionAtDoc");
				Iterator<JSONObject> positionitr = position.iterator();
				while(positionitr.hasNext()){
					JSONObject positionDoc = positionitr.next();
					System.out.println("\n---------------Position At Doc---------------");
					String dropPositions= (String) positionDoc.get("dropPositions");
					String pageNo = (String) positionDoc.get("pageNo");
					if(dropPositions!=null){
						System.out.println("Drop Positions        : "+dropPositions);
						
					}//if
					else{
						System.out.println("Page No               : "+pageNo);
						
					}
					System.out.println("Top                   : "+positionDoc.get("top"));
					System.out.println("left                  : "+positionDoc.get("left"));
					System.out.println("Height                : "+positionDoc.get("height"));
					System.out.println("Width                 : "+positionDoc.get("width"));
					
					
					
				}//inner_inner_while_loop				
			}//inner_while_loop
			
			System.out.println("\nPhone No   : "+signer.get("phone"));
			System.out.println("\n==================================================\n");
			
		}//while_loop
		
		String sendNow = (String) json.get("sendNow");
		String sendSms = (String) json.get("sendSms");
		
		//sendNow
		if(sendNow.equalsIgnoreCase("Y")){
			System.out.println("Send Now   : Yes");
		}//if
		else{
			System.out.println("Send Now   : No");
		}//else
			
		//sendSms
		if(sendSms.equalsIgnoreCase("Y")){
			System.out.println("Send SMS   : Yes");
		}//if
		else{
			System.out.println("Send SMS   : No");
		}//else
		
		System.out.println("Method          : "+json.get("method"));
		System.out.println("Company Id      : "+json.get("comapnyId"));
		System.out.println("Request Name    : "+json.get("requestName"));
		
		String userName = (String) json.get("requiredUserNamePasswordAuthentication");
		String allowSigners = (String) json.get("allowSignersToSeePreviousSignersData");
		String mulsigners = (String) json.get("multipleSignaturesForSameEmail");
		String rcvSign = (String) json.get("receiveSignedDocAfterRequestCompletion");
		
		//userName
		if(userName.equalsIgnoreCase("Y")){
			System.out.println("Required User Name Password Authentication  : Yes");
		}//if
		else{
			System.out.println("Required User Name Password Authentication  : No");
		}//else
			
		//allowSigners
		if(allowSigners.equalsIgnoreCase("Y")){
			System.out.println("Allow Signers To See Previous Signers Data   : Yes");
		}//if
		else{
			System.out.println("Allow Signers To See Previous Signers Data   : No");
		}//else
		
		//mul_signers
		if(mulsigners.equalsIgnoreCase("Y")){
			System.out.println("Multiple Signatures For Same Email   : Yes");
		}//if
		else{
			System.out.println("Multiple Signatures For Same Email   : No");
		}//else
			
		//rcvSign
		if(rcvSign.equalsIgnoreCase("Y")){
			System.out.println("Receive Signed Doc After Request Completion   : Yes");
		}//if
		else{
			System.out.println("Receive Signed Doc After Request Completion   : No");
		}//else
		
		System.out.println("Send Signed To Others    : "+json.get("SendSignedDocToOthers"));
		String autoArc = (String) json.get("autoArchiveAfterFullySigned");
		
		//autoArc
		if(autoArc.equalsIgnoreCase("Y")){
			System.out.println("Auto Archive After Fully Signed  : Yes");
		}//if
		else{
			System.out.println("Auto Archive After Fully Signed  : No");
		}//else
		System.out.println("Send Reminders                   : "+json.get("sendReminders"));
		System.out.println("Set Expiry Date                  : "+json.get("setExpiryDate"));
		System.out.println("Signature Verification Required  : "+json.get("signatureVerificationRequired"));
		System.out.println("Transaction-Id                   : "+json.get("transactionId"));
		System.out.println("Redirect-Uri                     : "+json.get("redirectUri"));			
			
			

	}//extract()
}//class
