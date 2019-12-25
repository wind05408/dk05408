package com.dp.vo;

import com.dp.enums.BizLineEnum;
import lombok.Data;

/**
 * @Description: TODO
 * @Author dk05408
 * @Date 2019/12/24
 **/
@Data
public class PublishProductParam {
    private BizLineEnum bizLineEnum;
    private String bizType;
    private Long productId;
}
