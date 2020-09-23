package com.fuhao.service.impl;

import com.fuhao.bean.TblTodo;
import com.fuhao.mapper.TblTodoMapper;
import com.fuhao.service.TblTodoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 待办事项 服务实现类
 * </p>
 *
 * @author hao
 * @since 2020-09-21
 */
@Service
public class TblTodoServiceImpl extends ServiceImpl<TblTodoMapper, TblTodo> implements TblTodoService {

}
