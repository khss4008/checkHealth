package com.example.api.controller;

import javax.validation.Valid;

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

	@Autowired
	public CheckController(Codef codef) {
		super();
		this.codef = codef;
	}

	@GetMapping("/getHealthCheckData")
	@ApiOperation(value = "값을 가져오는지 확인한다", notes = "확인하자")
	public ResponseEntity<?> findEmail() throws Exception {
		codef.getHealthCheckData();
		return new ResponseEntity<String>(HttpStatus.OK);
	}

}
