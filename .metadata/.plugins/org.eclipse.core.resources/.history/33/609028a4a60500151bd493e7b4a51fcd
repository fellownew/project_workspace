package kr.co.taommall.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import kr.co.taommall.common.vo.SingleUpload;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/upload")
public class FileuploadController {
	private String imageDir = "C:\\JAVA\\apache-tomcat-7.0.59\\webapps\\spring_mvc_05_fileUpload\\upimage";
	private String uploadDir = "C:\\JAVA\\apache-tomcat-7.0.59\\webapps\\spring_mvc_05_fileUpload\\upload";
	
	@RequestMapping("/singleup.do")
	public String singleUpload(SingleUpload svo,ModelMap map) throws IllegalStateException, IOException{
			MultipartFile upfile = svo.getUpfile();
			if(upfile!=null && !upfile.isEmpty()){
				String fileName = upfile.getOriginalFilename();
				File file = new File(imageDir,fileName);
				upfile.transferTo(file);
				map.addAttribute("filename",fileName);
				map.addAttribute("filesize",upfile.getSize());
				map.addAttribute("title",svo.getTitle());
				map.addAttribute("info",svo.getInfo());
			}else{
				map.addAttribute("title","업로드된 파일이 없습니다.");
			}
		return "/singleup/response.jsp";
	}
	
	@RequestMapping("/singleup2.do")
	public String singleUpload(@RequestParam("title") String title,@RequestParam("upfile")MultipartFile upfile,@RequestParam String info,ModelMap map) throws IllegalStateException, IOException{
			System.out.println(title+upfile);
		if(upfile!=null && !upfile.isEmpty()){
			String fileName = upfile.getOriginalFilename();
			long size = upfile.getSize();
			File file = new File(imageDir,fileName);
			upfile.transferTo(file); //임시저장소에 있는 파일을 실제 저장소(저장장치)에 옮기는 작업.
			map.addAttribute("filename",fileName);
			map.addAttribute("filesize",size);
			map.addAttribute("title",title);
			map.addAttribute("info",info);
		}else{
			map.addAttribute("title","업로드된 파일이 없습니다.");
		}
		return "/singleup/response.jsp";
	}
	
}
