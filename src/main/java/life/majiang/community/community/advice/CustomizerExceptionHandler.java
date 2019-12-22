package life.majiang.community.community.advice;

import life.majiang.community.community.exception.CustomizerException;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class CustomizerExceptionHandler {

    @ExceptionHandler(Exception.class)
    ModelAndView handle(Throwable e, Model model) {

        if (e instanceof CustomizerException) {
            model.addAttribute("message", e.getMessage());

        } else {
            model.addAttribute("message", "The page may not exist or has expired!");
        }
        return new ModelAndView("error");
    }

}
