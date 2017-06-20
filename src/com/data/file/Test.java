package com.data.file;

public class Test {

    private Long id;//主键

    private String batchNumber;//批次

    private String commContractCode;//委托合同编号

    private Long houseId;//房源ID

    private String propertyAddress;//物业地址



    private String commContractStartDate;//委托合同有效期起始日期

    private String commContractEndDate;//委托合同有效期终止日期

    private String commPeriodYear;//委托周期

    private Integer freeDays;//免租期

    private String commPrice;//委托价格


    private String rentContractCode;//租赁合同编号

    private String rentContractStartDate;//租赁合同有效期起始日期

    private String rentContractEndDate;//租赁合同有效期截止日期

    private String rentContractFinishDate;//租赁合同实际终止时间

    private String rentPrice;//出租价格



    private String rentKindStr;//出租种类

    private Integer lastRentOutForm;//上一租户退租形

    private String lastRentOutDate;//前租户退租日期

    private String payKindStr;//支付方式

    private String rentMoneyIsGetStr;//房租收取情况


    private String equipmentAmount;//配置电器金额

    private String equipmentAverageAmount;//本次电器配置扣减金额

    private String furnitureAmount;//配置家具金额

    private String furnitureAverageAmount;//本次家具配置扣减金额

    private String cleaningFee;//保洁费


    private String lockFee;//换锁费

    private String utilityFee;//水电燃气费

    private String upkeepFee;//维修费

    private String remainingPenaltyFee;//业主剩余违约金

    private String unpayFee;//未交房租


    private Integer vacantDays;//二次出租空置天数

    private String vacantAmount;//二次空置天数金额

    private String penalty;//租户应付违约金额

    private String imbalanceAchievement;//未发生差价业绩

    private String restPenalty;//剩余违约金


    private Integer houseVacantDays;//房源空置时间

    private Integer currentyearFreeDays;//当年免租天数

    private Integer contractMonth;//签约月数

    private String cost;//成本

    private String normalCleaningFee;//保洁费用（正常出租）


    private String normalLockFee;//换锁费用（正常出租）

    private String normalUpkeepFee;//维修费用（正常出租）

    private String allAllocationFee;//配置费

    private String penaltyAchievement;//违约金业绩

    private String rentFreeAchievement;//免租期业绩


    private String priceDiff;//差价

    private String totalPriceDiffAchievement;//总差价业绩

    private String overDepositAchievement;//超出押金差价业绩

    private String commissionPriceDiffAchievement;//本次提佣差价业绩

    private String totalPerformance;//总业绩


    private String commissionReceivablePerformance;//应收计佣业绩(总业绩未达4500按90%计算)

    private String monthPlanAchievement;//本月计提业绩

    private String noSpreadAchievement;//未提差价业绩(总业绩未达4500按90%计算)

    private Long getBigareaId;//收房归属大区

    private Long getAreaId;//收房归属区域


    private Long getMendianId;//收房归属门店

    private Long getGroupId;//收房归属小组

    private String getGroupLeaderName;//收房组长姓名

    private String getGroupLeaderEmployee;//收房组长员工编号

    private String getJujianAgentName;//居间经纪人姓名（收房）


    private String getAgentEmployee;//收房经纪人员工编号

    private String getReceivablePerformanceAchievement;//收房应收业绩

    private String getMonthPlanAchievement;//收房本月计提业绩

    private Long outBigareaId;//出房归属大区

    private Long outAreaId;//出房归属区域


    private Long outMendianId;//出房归属门店

    private Long outGroupId;//出房归属小组

    private String outGroupLeaderName; //出房组长姓名

    private String outGroupAgentEmployee;//出房组长员工编号

    private String outJujianAgentName;//居间经纪人姓名（出房）


    private String outAgentEmployee;//出房经纪人员工编号

    private String outReceivablePerformanceAchievement;//出房应收业绩

    private String outMonthPlanAchievement;//出房本月计提业绩

}
