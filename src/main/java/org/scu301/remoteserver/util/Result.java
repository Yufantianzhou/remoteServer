package org.scu301.remoteserver.util;

import lombok.Data;

import java.util.Optional;

@Data
public class Result {
    protected int code;
    protected String message;
    protected long timestamp;

    public Result(int code, String message) {
        this.code = code;
        this.message = message;
        this.timestamp = System.currentTimeMillis();
    }

    public static Result ok() {
        return new Result(200, "success");
    }

    public static Result err(String message) {
        return new Result(500, message);
    }

    public static Result err(int code, String message) {
        return new Result(code, message);
    }

    public static<T> Result of(Optional<T> data) {
        return Response.ok(data);
    }

    public static<T> Result of(boolean ok, String elseMessage) {
        if (ok) return ok();
        return err(elseMessage);
    }
}
