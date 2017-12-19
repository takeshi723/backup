/*
package com.internousdev.web2.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.web2.DTO.LoginDTO;
import com.internousdev.web2.util.DBConnector;

public class LoginDAO {
	public String username;
	public String nickname;
	public String password;

	public List<LoginDTO> loginDTOList = new ArrayList<LoginDTO>();

	public List<LoginDTO> select(String username, String nickname, String password){
        DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "select * from users where username = ? and nickname = ? and password = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, nickname);
			ps.setString(3, password);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				LoginDTO dto = new LoginDTO();
				dto.setUsername(rs.getString("username"));
				dto.setNickname(rs.getString("nickname"));
				dto.setPassword(rs.getString("password"));
				loginDTOList.add(dto);
			}

			if(loginDTOList.size() <=0){
				LoginDTO dto = new LoginDTO();
				dto.setUsername("該当無し");
				dto.setNickname("該当無し");
				dto.setPassword("該当無し");
				loginDTOList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return loginDTOList;
	}
}
*/

package com.internousdev.web2.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.web2.DTO.LoginDTO;
import com.internousdev.web2.util.DBConnector;

public class LoginDAO {
	public String username;
	public String nickname;
	public String password;

	public List<LoginDTO> loginDTOList = new ArrayList<LoginDTO>();

	public List<LoginDTO> select(String username, String nickname, String password){
		com.internousdev.web2.util.DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "select * from users where username = ? and nickname = ? and password = ?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, nickname);
			ps.setString(3, password);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				LoginDTO dto = new LoginDTO();
				dto.setUsername(rs.getString("username"));
				dto.setNickname(rs.getString("nickname"));
				dto.setPassword(rs.getString("password"));
				loginDTOList.add(dto);
			}

			if(loginDTOList.size() <=0){
				LoginDTO dto = new LoginDTO();
				dto.setUsername("該当無し");
				dto.setNickname("該当無し");
				dto.setPassword("該当無し");
				loginDTOList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return loginDTOList;
	}

}