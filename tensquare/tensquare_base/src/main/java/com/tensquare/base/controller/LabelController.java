package com.tensquare.base.controller;

import com.tensquare.base.pojo.Label;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/*** 标签控制层 */
@RestController
@RequestMapping("/label")
public class LabelController {
    @Autowired
    private com.tensquare.base.service.LabelService labelService;

    /*** 查询全部列表 * @return */
    @RequestMapping(method = RequestMethod.GET)
    public Result findAll() {
//        int i = 1/0;        //模拟异常
        return new Result(true, StatusCode.OK, "查询成功", labelService.findAll());
    }

    /*** 根据ID查询标签 * @param id * @return */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result findById(@PathVariable String id) {
        return new Result(true, StatusCode.OK, "查询成功了", labelService.findById(id));
    }

    /*** 增加标签*/
    @RequestMapping(method = RequestMethod.POST)
    public Result add(@RequestBody Label label) {
        labelService.add(label);
        return new Result(true, StatusCode.OK, "增加成功");
    }

    /*** 修改标签 * @param label * @return */
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result update(@RequestBody Label label, @PathVariable String id) {
        label.setId(id);
        labelService.update(label);
        return new Result(true, StatusCode.OK, "修改成功");
    }

    /*** 删除标签 * @param id * @return */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result deleteById(@PathVariable String id) {
        labelService.deleteById(id);
        return new Result(true, StatusCode.OK, "删除成功");
    }
}