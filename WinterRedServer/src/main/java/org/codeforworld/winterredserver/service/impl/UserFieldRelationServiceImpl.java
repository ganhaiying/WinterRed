package org.codeforworld.winterredserver.service.impl;

import org.codeforworld.winterredserver.entity.UserFieldRelation;
import org.codeforworld.winterredserver.mapper.UserFieldRelationMapper;
import org.codeforworld.winterredserver.service.UserFieldRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 订阅用户领域关系表 服务实现类
 * </p>
 *
 * @author kfzx-ganhy
 * @since 2020-07-25
 */
@Service
public class UserFieldRelationServiceImpl extends ServiceImpl<UserFieldRelationMapper, UserFieldRelation> implements UserFieldRelationService {

    @Resource
    private UserFieldRelationMapper userFieldRelationMapper;

    @Override
    public List<UserFieldRelation> queryUserFieldRelation(UserFieldRelation userFieldRelation) {
        return userFieldRelationMapper.queryUserFieldRelation(userFieldRelation);
    }
}
