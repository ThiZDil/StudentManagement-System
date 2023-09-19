package com.example.MyfirstApp.domain.utill;

import com.example.MyfirstApp.domain.dto.error.ErrorResponse;
import com.example.MyfirstApp.domain.dto.student.DbException;
import com.example.MyfirstApp.domain.exception.BaseException;
import com.example.MyfirstApp.domain.exception.DataNotFoundException;
import com.example.MyfirstApp.domain.exception.ValidationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ExceptionHandler {
    public ErrorResponse handleException(Exception exp) {

        ErrorResponse errorResponse = new ErrorResponse();

        try {
            throw exp;
        } catch (ValidationException ex) {
            errorResponse.setResponseCode(ex.getCode());
            errorResponse.setResponseDescription(ex.getMessage());

        } catch (DataNotFoundException ex) {
            errorResponse.setResponseCode(ex.getCode());
            errorResponse.setResponseDescription(ex.getMessage());

        } catch (DbException ex) {
            errorResponse = new ErrorResponse(); // todo
        } catch (BaseException ex) {
            errorResponse = new ErrorResponse(); // todo
        } catch (Exception ex) {
            errorResponse.setResponseCode(DomainStatus.COMMON_ERROR.getCode());

        }

        return errorResponse;
    }
}
