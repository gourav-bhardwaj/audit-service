package com.hackathon.ewallet.auditservice.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hackathon.ewallet.auditservice.entity.Transaction;
import com.hackathon.ewallet.auditservice.serviceImpl.AuditServiceImpl;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = AuditServiceController.class)
@ExtendWith(SpringExtension.class)
public class AuditServiceControllerTest {

    @MockBean
    AuditServiceImpl service;

    @Autowired
    ObjectMapper mapper;

    @Autowired
    MockMvc mockMvc;

    void getAuditDetailsFromStartToEnd() {
        // Mock the service method response
//        List<Transaction> transactionDtoList = getEmployeeList();
//        Mockito.when(service.getAuditDetailsFromStartToEnd(Mockito.anyString(), Mockito.anyString(), Mockito.anyLong()))
//                .thenReturn(transactionDtoList);
//
//        // Perform the get employees REST call
//        ResultActions response = this.mockMvc.perform(get("/auditDetails/users/1")
//                        .param("")
//                .contentType(MediaType.APPLICATION_JSON));
//
//        // Asserting the response expectations
//        response.andExpect(status().isOk())
//                .andExpect(jsonPath("$[0].employeeName").value("Employee_1"))
//                .andExpect(jsonPath("$[9].employeeName").value("Employee_10"));
    }

    private List<Transaction> getEmployeeList() {
        List<Transaction> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Transaction obj = new Transaction();
            obj.setId(101l + i);
            obj.setAmount(1290.0 + i);
            list.add(obj);
        }
        return list;
    }

}
