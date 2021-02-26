package com.newland.mrs.impl.handler;

import com.newland.mrs.api.entity.MrsRequestInfo;
import com.newland.mrs.api.entity.MrsResponseInfo;

/**
 * AbstractMrsHandler
 * mrs接口处理抽象
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-29 17:23
 **/
public abstract class AbstractMrsHandler {

    /**
     * 接口调用
     * @param requestInfo 请求信息
     * @return 返回信息
     */
    public abstract MrsResponseInfo handle(MrsRequestInfo requestInfo);
}
