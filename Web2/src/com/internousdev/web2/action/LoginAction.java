/*package com.internousdev.web2.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.web2.DAO.LoginDAO;
import com.internousdev.web2.DTO.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {
	private String username;
	private String nickname;
	private String password;
	private List<LoginDTO> loginDTOList = new ArrayList<LoginDTO>();
	private Map<String, Object> session;

	public String execute(){
		String ret = ERROR;
		LoginDAO dao = new LoginDAO();

		loginDTOList = dao.select(username,  nickname, password);
		if(this.username.equals(loginDTOList.get(0).getUsername())
		&& this.nickname.equals(loginDTOList.get(0).getNickname())
		&& this.password.equals(loginDTOList.get(0).getPassword())){
			session.put("loginDTOList", loginDTOList);
			ret = SUCCESS;
		}else{
			ret = ERROR;
		}
		return ret;
	}

	public String getUsername(){
		return username;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getNickname(){
		return nickname;
	}

	public void setNickname(String nickname){
		this.nickname = nickname;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public List<LoginDTO> getLoginDTOList(){
		return loginDTOList;
	}

	public void setLoginDTOList(List<LoginDTO> loginDTOList){
		this.loginDTOList = loginDTOList;
	}

	public Map<String, Object> getSession(){
		return session;
	}

	public void setSession(Map<String, Object> session){
		this.session = session;
	}


}
*/

package com.internousdev.web2.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.web2.DAO.LoginDAO;
import com.internousdev.web2.DTO.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport implements SessionAware {
	private String username;
	private String nickname;
	private String password;
	private List<LoginDTO> loginDTOList = new ArrayList<LoginDTO>();
	private Map<String, Object> session;


	public String execute(){
		String ret = ERROR;
		LoginDAO dao = new LoginDAO();

		loginDTOList = dao.select(username, nickname, password);
		if(this.username.equals(loginDTOList.get(0).getUsername())
	    && this.nickname.equals(loginDTOList.get(0).getNickname())
	    && this.password.equals(loginDTOList.get(0).getPassword())){
			session.put("loginDTOList", loginDTOList);
			ret = SUCCESS;
		}else{
			ret = ERROR;
		}
		return ret;
	}





	public String getUsername(){
		return username;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getNickname(){
		return nickname;
	}

	public void setNickname(String nickname){
		this.nickname = nickname;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public List<LoginDTO> getLoginDTOList(){
		return loginDTOList;
	}

	public void setLoginDTOList(List<LoginDTO> loginDTOList){
		this.loginDTOList = loginDTOList;
	}

	public Map<String,Object> getSession(){
		return session;
	}

	public void setSession(Map<String, Object> session){
		this.session = session;
	}


}
