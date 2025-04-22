package Controller;

import Repositories.BlogDb;
import model.Blog;

import java.time.LocalDate;
import java.util.List;

public class BlogControllerImpl implements BlogController {


    private static final BlogDb blogDb = new BlogDb();

    @Override
    public String addBlog(Blog blog) {
        return blogDb.addBlogDb(blog);
    }

    @Override
    public String updateBlog(int id, String b_title, String b_author, String b_content, String b_description, LocalDate postedDate) {
        return blogDb.updateBlogDb(id, b_title, b_author, b_content, b_description,postedDate);
    }

    @Override
    public String deleteBlog(int id) {
        return blogDb.deleteBlogDb(id);
    }

    @Override
    public List<Blog> getAllBlogs() {
        return blogDb.getAllBlogDb();
    }
}
