package com.hwj.basic.common.activityrule.service;

import com.hwj.basic.common.activityrule.dto.ActivityRuleTextDTO;
import com.hwj.basic.result.RpcResult;

public interface ActivityRuleTextWriteService {

    /**
     * 新增活动规则文案
     * @param activityRuleTextDTO
     * @return
     */
    RpcResult<ActivityRuleTextDTO> create(ActivityRuleTextDTO activityRuleTextDTO);

    /**
     * 修改活动规则文案
     * @param activityRuleTextDTO
     * @return
     */
    RpcResult<ActivityRuleTextDTO> update(ActivityRuleTextDTO activityRuleTextDTO);


    /**
     * 根据id删除活动规则文案
     * @param id
     * @return
     */
    RpcResult<ActivityRuleTextDTO> delete(Long id);
}
