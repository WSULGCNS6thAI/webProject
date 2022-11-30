package com.mysite.sbb.question;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RequiredArgsConstructor
@Controller
public class QuestionController {
    private final QuestionRepository questionRepository;

    @RequestMapping("/question/list")
    public String list(Model model)  {
        List<Question> questionList = this.questionRepository.findAll();
        model.addAttribute("quesionList", questionList);
        return "question_list";
    }
}
