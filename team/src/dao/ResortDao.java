package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.DataBase;
import dto.ResortDto;

public class ResortDao extends DataBase{
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	
	// 기존 저장된 숙소를 조회(가져온 객체 : 숙소명, 숙소 정보, 숙소의 주소, 숙소 주인명, 숙소 등급, 숙소 가격, 숙소 평균 등급)
	
	public List<ResortDto> selectResort() {
		List<ResortDto> list = new ArrayList<>();
		try {
			conn = dbConnection();
			String sql = "select * from resort";	// SQL문을 이용해서 생성한 테이블을 조회
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			ResortDto rd = null;
			while (rs.next())
			{
				String name = rs.getString("name");
				String info = rs.getString("info");
				String address = rs.getString("address");
				String admin = rs.getString("admin");
				String grade = rs.getString("grade");
				int price = rs.getInt("price");
				int averageNumber = rs.getInt("averageNumber");	// 가지고 올 기존 컬럼들
				
				rd = new ResortDto();
				rd.setName(name);
				rd.setInfo(info);
				rd.setAddress(address);
				rd.setAdmin(admin);
				rd.setGrade(grade);
				rd.setPrice(price);
				rd.setAverageNumber(averageNumber);	// 새로 생성한 resort 객체의 속성을 설정함
				list.add(rd);
			}
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}finally {
			
			close(conn,rs,psmt);
			
		}
		return list;
	}
	
	// 기존 저장된 숙소의 데이터를 삭제(가져온 객체 : 숙소명, 숙소 정보, 숙소의 주소, 숙소 주인명, 숙소 등급, 숙소 가격, 숙소 평균 등급)
	
	public void deleteResort(String name2) {
		try {
			conn = dbConnection();
			
			String sql = "delete from resort where name = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name2);
			psmt.executeUpdate();
			psmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// 기존 저장된 숙소의 데이터를 수정(가져온 객체 : 숙소명, 숙소 정보, 숙소의 주소, 숙소 주인명, 숙소 등급, 숙소 가격, 숙소 평균 등급)
	public void updateResort(String originalName, ResortDto rd) {
		try {
			conn = dbConnection();
			
			String sql = "update resort set name = ? , info = ?, address = ?, admin = ?, grade = ?, price = ? averageNumber = ?  where name = ? ";
			
			// 기존에 있던 이름(primary key)을 수정하기 위해 조건을 지정하고 바꿀 컬럼명들을 지정)
			
			psmt = conn.prepareStatement(sql); // 데이터베이스(SQL)와 자바를 연동
			psmt.setString(1, rd.getName());
			psmt.setString(2, rd.getInfo());
			psmt.setString(3, rd.getAddress()); 
			psmt.setString(4, rd.getAdmin());
			psmt.setString(5, rd.getGrade());
			psmt.setInt(6, rd.getPrice());
			psmt.setInt(7, rd.getAverageNumber()); // 변경할 데이터들
			psmt.setString(8, originalName); 	// 조건을 지정할 기존 이름
			psmt.executeUpdate();
			psmt.close();
			conn.close();
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		
	}
	
	public ResortDto getResortDto(String originalName) {
		ResortDto rd = null;
		try {
			conn = dbConnection();
			
			String sql = "select * from resort where name = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, originalName);
			rs = psmt.executeQuery();
			if(rs.next()) {
				rd = new ResortDto();
				rd.setName(rs.getString("name"));
				rd.setAddress(rs.getString("address"));
				rd.setInfo(rs.getString("info"));
				rd.setAddress(rs.getString("address"));
				rd.setAdmin(rs.getString("admin"));
				rd.setGrade(rs.getString("grade"));
				rd.setPrice(rs.getInt("price"));
				rd.setAverageNumber(rs.getInt("averagenumber"));
			} 
		}catch(SQLException e) {
		}
		return rd;
	}
	
	// 기존 저장된 숙소의 데이터를 수정(가져온 객체 : 숙소명, 숙소 정보, 숙소의 주소, 숙소 주인명, 숙소 등급, 숙소 가격, 숙소 평균 등급)
		public void updateResort(ResortDto rd) {
			try {
				conn = dbConnection();
				
				String sql = "INSERT INTO resort  VALUES (?, ?, ?, ?, ?, ?, ?)";
				
				// 기존에 있던 이름(primary key)을 수정하기 위해 조건을 지정하고 바꿀 컬럼명들을 지정)
				
				psmt = conn.prepareStatement(sql); // 데이터베이스(SQL)와 자바를 연동
				psmt.setString(1, rd.getName());
				psmt.setString(2, rd.getInfo());
				psmt.setString(3, rd.getAddress()); 
				psmt.setString(4, rd.getAdmin());
				psmt.setString(5, rd.getGrade());
				psmt.setInt(6, rd.getPrice());
				psmt.setInt(7, rd.getAverageNumber()); // 변경할 데이터들
				psmt.executeUpdate();
				psmt.close();
				conn.close();
				
			}catch(Exception e) {
				
				e.printStackTrace();
				
			}
			
			
		}
	
	

}
