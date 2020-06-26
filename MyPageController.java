package jp.co.internous.node.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.internous.node.model.domain.MstUser;
import jp.co.internous.node.model.mapper.MstUserMapper;
import jp.co.internous.node.model.session.LoginSession;

@Controller
@RequestMapping("node/mypage")
public class MyPageController {

	@Autowired
	private MstUserMapper userMapper;

	@Autowired
	protected LoginSession loginSession;

	@RequestMapping("/")
	public String mypage(Model m) {
		MstUser user = userMapper.findByUserNameAndPassword(loginSession.getUserName(), loginSession.getPassword());
		m.addAttribute("user", user);
		m.addAttribute("loginSession", loginSession);
		return "my_page";
	}
}
