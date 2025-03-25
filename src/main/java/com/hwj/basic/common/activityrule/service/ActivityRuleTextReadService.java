package com.hwj.basic.common.activityrule.service;

import com.hwj.basic.common.activityrule.dto.ActivityRuleTextDTO;
import com.hwj.basic.result.RpcResult;

public interface ActivityRuleTextReadService {

    /**
     * 根据id查询
     * @param id
     * @return
     */
    RpcResult<ActivityRuleTextDTO> queryById(Long id);

    /**
     * 根据活动id查询
     * @param activityId
     * @return
     */
    RpcResult<ActivityRuleTextDTO> queryByActivityId(Long activityId);

    /**
     * 根据 文案规则 来查询
     * @param ruleText
     * @return
     */
    RpcResult<ActivityRuleTextDTO> queryByRuleText(String ruleText);
}
