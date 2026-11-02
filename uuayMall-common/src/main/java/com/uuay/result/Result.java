package com.uuay.result;

import lombok.Data;

@Data
public class Result<T> {
    private Integer code;
    private String Message;
    private T data;

    public Result<T> success() {
        Result<T> result = new Result<>();
        result.code = 1;
        return result;
    }
    
    public Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.code = 1;
        result.data = data;
        return result;
    }

    public Result<T> error(String message) {
        Result<T> result = new Result<>();
        result.code = 0;
        return result;
    }

}
