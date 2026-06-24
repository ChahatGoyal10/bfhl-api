package com.chahat.bfhl.api.service;

import com.chahat.bfhl.api.dto.RequestDTO;
import com.chahat.bfhl.api.dto.ResponseDTO;

public interface BfhlService {
    ResponseDTO process(RequestDTO request);
}