package org.codeforworld.winterredserver.service.impl;

import org.codeforworld.winterredserver.entity.CheckPlat;
import org.codeforworld.winterredserver.mapper.CheckPlatMapper;
import org.codeforworld.winterredserver.service.CheckPlatService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 核查平台表 服务实现类
 * </p>
 *
 * @author kfzx-ganhy
 * @since 2020-07-25
 */
@Service
public class CheckPlatServiceImpl extends ServiceImpl<CheckPlatMapper, CheckPlat> implements CheckPlatService {

    @Resource
    private CheckPlatMapper platMapper;

    @Override
    public List<CheckPlat> queryCheckPlat(CheckPlat checkPlat) {
        return platMapper.queryCheckPlat(checkPlat);
    }
}
