package GC.Lab23Grades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;





@Controller
public class GradeController {

        @Autowired
		private GradeDao gradeDao;
		
		@RequestMapping("/")
		public String Hompage(Model model) {
			List <Grade> listOfgrades= gradeDao.findAll();
			System.out.println(listOfgrades);
			model.addAttribute("grades", listOfgrades);
			
			return "Homepage";
		}
		
		@RequestMapping("/grades/add")
		public String addGrade(Grade grade) {
			gradeDao.create(grade);
			return "GradeForm";
		}
		
		@PostMapping("/grades/add")
		public String submitAdd (Model model, @RequestParam ("id") Long id,
			@RequestParam ("name") String name,
			@RequestParam ("type") String type,
			@RequestParam ("score") double score,
			@RequestParam ("total") double total){
				
				model.addAttribute( "name", name);
				model.addAttribute("type", type);
				model.addAttribute("score", score);
				model.addAttribute("total", total);
				model.addAttribute("id", id);
			
			
			return "Confirm";
		}

		
		@RequestMapping("/grades/delete")
		public String remove(@RequestParam("id") Long id) {
			gradeDao.delete(id);
			return "redirect: /Homepage";
		}
		
	

		
	
}
