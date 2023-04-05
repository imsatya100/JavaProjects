package struts.demo;

import java.io.File;

import com.opensymphony.xwork2.ActionSupport;

public class DemoStrutsExample6 extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private File uploadedFile;
	private String uploadedFileContentType;
	private String uploadedFileNAme;
	public File getUploadedFile() {
		return uploadedFile;
	}
	public void setUploadedFile(File uploadedFile) {
		this.uploadedFile = uploadedFile;
	}
	public String getUploadedFileContentType() {
		return uploadedFileContentType;
	}
	public void setUploadedFileContentType(String uploadedFileContentType) {
		this.uploadedFileContentType = uploadedFileContentType;
	}
	public String getUploadedFileNAme() {
		return uploadedFileNAme;
	}
	public void setUploadedFileNAme(String uploadedFileNAme) {
		this.uploadedFileNAme = uploadedFileNAme;
	}
	
	public String execute(){
		return SUCCESS;
	}
	public String display(){
		return NONE;
	}
	
}
