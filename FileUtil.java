package com.webjjang.util.file;

import java.io.File;

public class FileUtil {

	//파일이 존재하는지 확인하는 메소드
	public static boolean exist(File file)throws Exception{
		return file.exists();
	}
	
	//파일이 존재하는지 확인하는 메소드
	public static boolean exist(String fileName)throws Exception{
		return toFile(fileName).exists();
	}
	
	//문자열을 파일겍체로 만들어 주는 메소드
	public static File toFile(String fileName) throws Exception{
		return new File(fileName);
	}
	
	//파일 삭제
	public static boolean delete(File file) throws Exception{
		return file.delete();
	}
	
	//파일의 정보를 문자열로 넣어주면 지워주는 메소드
	//파일은 realPath 정보의 파일명을 넘겨야 함 
	public static boolean remove(String fileName)throws Exception {
		//1.문자열을 파일객체로 만듦 2.존재유무 확인 3.삭제 후 리턴 
		File file = toFile(fileName);
		//파일이 존재하지 않은 경우 예외 발생 
		if(!exist(file)) throw new Exception("파일 변경 중 원본 파일 제거 오류 : 이전 파일이 존재하지 않습니다.");
		//파일이 존재하는 경우
		if(!delete(file)) throw new Exception("파일 변경 중 원본 파일 제거 오류 : 이전 파일 삭제 불가능");
		System.out.println("FileUtil.remove()_파일이 삭제 되었습니다.");
		return true;
	}
	
}
