package com.console.web;

import com.console.entity.SysUser;
import com.console.service.SysUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 商品分类
 *
 * @author Stylesmile
 * @date 2019/01/06
 */
@RestController
public class SysUserController {

    @Resource
    private SysUserService sysUserService;

    /**
     * 根据父节点id查询
     *
     * @return list
     */
    @GetMapping("/list")
    @ResponseBody
    public ResponseEntity<List<SysUser>> queryCategoryListByPid() {
        //return ResponseEntity.status(HttpStatus.OK).body(sysUserService.list(Wrapper()) )
        Map map = new HashMap();
        return ResponseEntity.status(HttpStatus.OK).body((List<SysUser>) sysUserService.listByMap(map));
    }
//    @GetMapping("/list1")
//    @ResponseBody
//    public ResponseEntity<List<SysUser>> queryCategoryListByPid(@RequestParam("pid") Long pid) {
//            //return ResponseEntity.status(HttpStatus.OK).body(sysUserService.list(Wrapper()) )
//        Wrapper<SysUser> querySysUser = new EntityWrapper<>();
//        return ResponseEntity.status(HttpStatus.OK).body(sysUserService.list(querySysUser));
//    }
}
