package dao;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import dto.ResortDto;

public class ResortService {

	Scanner scanner = new Scanner(System.in)
	ResortDao rd = new ResortDao();
	private String name;
	private String info;
	private String address;
	private String admin;
	private String grade;
	private int price;
	private int averageNumber;
	ResortDao dao = new ResortDao();
	
	private void updateresort() {
		
		System.out.println("예약하실 숙소를 확인하세요");
		System.out.println("1. 숙소 조회  2. 저장된 숙소 삭제 3. 숙소 정보 수정 4. 저장된 숙소 수정 ");
		System.out.println("번호를 입력하세요");
		String number = scanner.nextLine();
		while(!Pattern.matches("^[1-4]", number)||number.length()!=1) {
			System.out.println("번호를 다시 입력해주세요");
		}
		int number2 = Integer.parseInt(number);
		
		switch(number2) {
		case 1: list();
		case 2:
		case 3:
		case 4:
		}
	}
	
	public void list() {
		System.out.println("                      ** 숙소 조회 **                 ");
		List<ResortDto> list = dao.selectResort();
		System.out.println(String.format("%7s%10s%5s%10s%10s%10s%10s","이름","정보","주소","관리자","등급","가격","평점"));
		for(int i = 0; i < list.size(); i++) {
			ResortDto rd = list.get(i);
			String name = rd.getName();
			String info = rd.getInfo();
			String address = rd.getAddress();
			String admin = rd.getAdmin();
			String grade = rd.getGrade();
			int price = rd.getPrice();
			int averageNumber = rd.getAverageNumber();
			System.out.println(String.format("%7s%10s%5s%10s%10s%10s%10s",name,info,address,admin,grade,price,averageNumber));
		}
		
	}
	
	public void deleteResort() {
		System.out.println("                      ** 숙소 삭제 **                 ");
		List<ResortDto> list = dao.selectResort();
		System.out.println(String.format("%7s%10s%5s%10s%10s%10d%10d",name,info,address,admin,grade,price,averageNumber));
		
		list();
		System.out.println("삭제할 숙소의 이름을 입력해주세요");
		System.out.print("숙소 이름:");
		String resortName = scanner.next();
		dao.deleteResort(resortName);
		System.out.println("삭제되었습니다.");
		list();
			
			
			
		}
		
	}

	public void updateResortㅣ() {
	System.out.println("                      ** 숙소 업데이트 **                 ");
	List<ResortDto> list = dao.selectResort();
	System.out.println(String.format("%7s%10s%5s%10s%10s%10d%10d",name,info,address,admin,grade,price,averageNumber));
	
	list();
	System.out.println("수정할 숙소의 이름을 입력해주세요");
	System.out.print("숙소 이름:");
	String resortName = scanner.next();
	System.out.println("바꿀 내용을 지정해주세요.");
	System.out.println("1. 이름 2. 주소 3. 정보 4. ")
	
	//----------------수정
	System.out.println("변경되었습니다.");
	list();
		
		
		
	}
	
}

