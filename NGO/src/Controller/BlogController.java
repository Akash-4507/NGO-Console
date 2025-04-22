package Controller;

import model.Blog;

import java.time.LocalDate;
import java.util.List;

public interface BlogController {

    String addBlog(Blog blog);
    String updateBlog(int id,String b_title, String b_author, String b_content, String b_description, LocalDate postedDate);
    String deleteBlog(int id);
    List<Blog> getAllBlogs();
}
