package com.example.demo;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.example.ai.MockDeal;
import com.example.mapper.HistoryDayStockMapper;
import com.example.mapper.HistoryStockMapper;
import com.example.mapper.RobotAccountMapper;
import com.example.mapper.RobotSetMapper;
import com.example.mapper.TradingRecordMapper;
import com.example.model.HistoryDayStockDo;
import com.example.model.HistoryStockDo;
import com.example.model.RobotAccountDo;
import com.example.model.RobotSetDo;
import com.example.model.TradingRecordDo;
import com.example.model.ths.HistoryRsDate;
import com.example.service.GuPiaoService;
import com.example.service.task.DataTask;
import com.example.service.task.MonitorTask;
import com.example.service.task.RealTimeTask;
import com.example.uitls.ReadApiUrl;
import com.example.uitls.RedisUtil;

import Ths.JDIBridge;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { GupiaoApplication.class })
public class DateTestServiceTest {
	private static String appSecret = "bb888ac7199ba68c327c8a0e44fbf0ee6b65b5b0f490beb39a209a295e132a4f";

	@Autowired
	private RobotSetMapper robotSetMapper;
	@Autowired
	private RobotAccountMapper robotAccountMapper;
	@Autowired
	private TradingRecordMapper tradingRecordMapper;
	
	@Autowired
	private HistoryStockMapper historyStockMapper;
	@Autowired
	private GuPiaoService guPiaoService;
	@Autowired
	private RealTimeTask realTimeTask;

	@Resource
	private RedisUtil redisUtil;
	@Autowired
	private ReadApiUrl readApiUrl;
	@Autowired
	private MonitorTask monitorTask;
	
	@Autowired
	private HistoryDayStockMapper historyDayStockMapper;
	
	private String number="sh600305";
	
	@Autowired
	private DataTask dataTask;

	
	//@Test
	public void TestDay() {
		guPiaoService.updateDayStockByThs();
	}
	
	@Test
	public void Test60Day() {
		realTimeTask.updateHistoryTask1();
	}

}
