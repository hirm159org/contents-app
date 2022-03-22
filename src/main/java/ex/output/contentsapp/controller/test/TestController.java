package ex.output.contentsapp.controller.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ex.output.contentsapp.controller.test.dto.TestDto;
import ex.output.contentsapp.service.test.TestService;

@RestController
public class TestController {

	@Autowired
	private TestService testSv;

	@RequestMapping("/")
	public List<TestDto> init() {
		return testSv.initTest();
	}

}
