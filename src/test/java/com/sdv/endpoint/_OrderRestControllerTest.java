package com.sdv.endpoint;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class _OrderRestControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@Autowired
    private WebApplicationContext webApplicationContext;
	
	@Before
	public void setUp() {
		mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	void logicGetTestOrder() throws Exception {
		this.mvc.perform(get("/api/test/order"))
        .andExpect(status().isOk())
        .andExpect(content().json("{\"id\":1,\"items\":[{\"id\":1,\"name\":\"Pen\",\"sumPerItem\":21.7,\"amount\":4,\"totalSum\":86.8},{\"id\":1,\"name\":\"Pen\",\"sumPerItem\":21.7,\"amount\":4,\"totalSum\":86.8},{\"id\":2,\"name\":\"Pencil\",\"sumPerItem\":16.7,\"amount\":3,\"totalSum\":50.100002}],\"orderRowCount\":3,\"orderItemCount\":2,\"orderTotalSum\":223.70001}"));
	}

}
