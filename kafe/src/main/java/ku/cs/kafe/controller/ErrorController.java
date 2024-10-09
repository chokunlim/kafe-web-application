package ku.cs.kafe.controller;

/**
 * Name: Puri Limwongrujirat
 * Student ID: 6510450844
 */

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
public class ErrorController {


    @ExceptionHandler(Throwable.class)
    @ResponseStatus
    public String exception(final Throwable throwable, final Model model) {
        return "error";
    }
}
