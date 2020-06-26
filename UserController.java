package jp.co.internous.node.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.internous.node.model.domain.MstUser;
import jp.co.internous.node.model.form.UserForm;
import jp.co.internous.node.model.mapper.MstUserMapper;
import jp.co.internous.node.model.session.LoginSession;

@Controller
@RequestMapping("/node/user")
public class UserController {

	@Autowired
	private MstUserMapper userMapper;
	
	@Autowired
	private LoginSession loginSession;
	
//登録画面(register_user.html)へ遷移
	@RequestMapping("/")
	public String index(Model m) {
		m.addAttribute("loginSession", loginSession);
		return "register_user";
	}
	
//重複エラーダイアログ(dialog_duplicated_user_name.html)へ遷移
	@RequestMapping("/duplicatedUserName")
	@ResponseBody
	public boolean duplicatedUserName(@RequestParam String userName) {
	long count = userMapper.findCountByUserName(userName);
	return count > 0;
	}
		
//ユーザー登録(dialog_input_user.confirm.html)へ遷移
	@RequestMapping("/register")
	@ResponseBody
	public boolean register(@RequestBody UserForm f) {
		MstUser user = new MstUser(f);
		long count = userMapper.insert(user);
		return count > 0;
	}
}
