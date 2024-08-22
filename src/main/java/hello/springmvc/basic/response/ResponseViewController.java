package hello.springmvc.basic.response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseViewController {

	@RequestMapping("/response-view-v1")
	public ModelAndView responseViewV1() {
		ModelAndView mav = new ModelAndView("response/hello")
			.addObject("data", "hello!");

		return mav;
	}

	@RequestMapping("/response-view-v2")
	public String responseViewV2(Model model) {
		model.addAttribute("data", "hello");
		ModelAndView mav = new ModelAndView("response/hello")
			.addObject("data", "hello!");

		return "response/hello";
	}

	/**
	 * api 와 view 경로가 같으면 ->
	 * @param model
	 */
	@RequestMapping("/response/hello")
	public void responseViewV3(Model model) {
		model.addAttribute("data", "hello");
	}
}
