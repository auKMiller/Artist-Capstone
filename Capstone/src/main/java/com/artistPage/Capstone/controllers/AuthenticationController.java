package com.artistPage.Capstone.controllers;

import com.artistPage.Capstone.models.User;
import com.artistPage.Capstone.models.data.UserRepository;
import com.artistPage.Capstone.models.dto.RegisterFormDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.Optional;

@Controller
public class AuthenticationController {

    @Autowired
    UserRepository userRepository;

    private static final String userSessionKey = "user";

    public User getUserFromSession(HttpSession session){
        Integer userId = (Integer) session.getAttribute(userSessionKey);
        if (userId == null){
            return null;
        }
        Optional<User> user = userRepository.findById(userId);
        if (user.isEmpty()){
            return null;
        }
        return user.get();
    }

    private static void setUserInSession(HttpSession session, User user){
        session.setAttribute(userSessionKey, user.getId());
    }
    //Gets the register.html file and returns it.
    @GetMapping("/register")
    public String displayRegistrationForm(Model model){
        model.addAttribute(new RegisterFormDTO());
        model.addAttribute("title", "Register");
        return "register";
    }
    //The form process handler.
    @PostMapping("/register")
    public String processRegistrationForm(@ModelAttribute @Valid RegisterFormDTO registerFormDTO,
                                          Errors errors, HttpServletRequest request, Model model){
        if(errors.hasErrors()){
            model.addAttribute("title", "Register");
            return "register";
        }
        User existingUser = userRepository.findByUsername(registerFormDTO.getUsername());
        if(existingUser != null){
            errors.rejectValue("username", "username.alreadyexists", "A user with that username already exists");
            model.addAttribute("title", "Register");
            return "register";
            }
        String password = registerFormDTO.getPassword();
        String verifyPassword = registerFormDTO.getVerifyPassword();
        if(!password.equals(verifyPassword)){
            errors.rejectValue("password", "password.mismatch", "Passwords do not match");
            model.addAttribute("title", "Register");
            return "register";
        }
        User newUser= new User(registerFormDTO.getUsername(), registerFormDTO.getPassword());
        userRepository.save(newUser);
        setUserInSession(request.getSession(), newUser);

        return "redirect:";
    }

}
