package com.wz.controller;

import com.wz.UserService;
import com.wz.domain.Users;
import com.wz.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
@Api(value = "提供用户的登录和注册接口",tags = "用户管理")
@CrossOrigin
public class UserController {

    @Autowired

    private UserService userService;


    @ApiOperation("用户登录接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "string",name = "username", value = "用户登录账号",required = true),
            @ApiImplicitParam(dataType = "string",name = "password", value = "用户登录密码",required = true)
    })
    @GetMapping("/login")
    public ResultVO login(@RequestParam("username") String name,
                          @RequestParam(value = "password") String pwd){
        ResultVO resultVO = userService.checkLogin(name, pwd);
        System.out.println(resultVO.getMsg());
        return resultVO;
    }





    @ApiOperation("用户注册接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "string",name = "username", value = "用户注册账号",required = true),
            @ApiImplicitParam(dataType = "string",name = "password", value = "用户注册密码",required = true)
    })
    @PostMapping("/regist")
    public ResultVO regist(@RequestBody Users user){
        ResultVO resultVO = userService.userResgit(user.getUsername(), user.getPassword());
        return resultVO;
    }

}
