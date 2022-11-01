package com.example.api.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import javax.validation.Valid;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import com.chron.api.util.JWTUtil;
import com.example.codef.Codef;
import com.example.service.CheckService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
@RequestMapping("/api/userInfo")
public class CheckController {

//	@Autowired
//	private JWTUtil jwtUtil;
	Codef codef;
	CheckService checkService;
	@Autowired
	public CheckController(Codef codef, CheckService checkService) {
		super();
		this.codef = codef;
		this.checkService = checkService;
	}
	///api/userInfo/getNutrientsData
	@GetMapping("/getHealthCheckData")
	@ApiOperation(value = "건강검진 내역을 가져오는지 확인한다", notes = "확인하자")
	public ResponseEntity<?> getHealthCheckData() throws Exception {
		codef.getHealthCheckData();
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	


	@GetMapping("/getNutrientsData")
	@ApiOperation(value = "nutrients 값을 가져오는지 확인한다", notes = "확인하자")
	public ResponseEntity<?> getNutrientsData() throws Exception {
		String myKey = "93ee3acbb162464d845f";
		//10개 데이터 json으로 가져오기
		URL url = new URL("http://openapi.foodsafetykorea.go.kr/api/" + myKey + "/C003/json/1/1");
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
		String result = br.readLine();
		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = (JSONObject)jsonParser.parse(result);
		System.out.println(jsonObject);
		checkService.insertSupplement();
		return new ResponseEntity<String>(HttpStatus.OK);
	}

}
