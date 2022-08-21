package co.sol.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.sol.dto.KakaoDTO;
import co.sol.service.KakaoService;

@Controller
public class KaKaoController {
	
    @Autowired
    private KakaoService kakaoService;
	
    @RequestMapping("/login")
    public String home(@RequestParam(value = "code", required = false) String code, 
    		HttpSession session) throws Exception{
        System.out.println("#########" + code);
        String access_Token = kakaoService.getAccessToken(code);
        
        //DTO로 변경
        KakaoDTO userInfo = kakaoService.getUserInfo(access_Token);
        
        System.out.println("###access_Token#### : " + access_Token);
        /*System.out.println("###userInfo#### : " + userInfo.get("email"));
        System.out.println("###nickname#### : " + userInfo.get("nickname"));*/ 
        
        System.out.println("###userInfo#### : " + userInfo.getK_email());
        System.out.println("###nickname#### : " + userInfo.getK_name()); 
        
        session.setAttribute("userInfo", userInfo);
        return "myPage";
    }
}
