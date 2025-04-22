package Repositories;

import model.Blog;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BlogDb {
    private static final List<Blog> blogs = new ArrayList<Blog>();

    public String addBlogDb(Blog blog) {
        blogs.add(blog);
        return "Blog added";
    }

    public String updateBlogDb(int id,String b_title, String b_author, String b_content, String b_description, LocalDate postedDate) {
        for (int i = 0; i < blogs.size(); i++) {
            if (blogs.get(i).getB_id() == id) {
                blogs.get(i).setB_title(b_title);
                blogs.get(i).setB_author(b_author);
                blogs.get(i).setB_content(b_content);
                blogs.get(i).setB_description(b_description);
                blogs.get(i).setPostedDate(postedDate);
                return "Blog updated successfully";
            }
        }
        return "Blog not found";
    }


    public String deleteBlogDb(int id) {
        Iterator<Blog> iterator = blogs.iterator();
        while (iterator.hasNext()) {
            Blog blog = iterator.next();
            if (blog.getB_id() == id) {
                iterator.remove();
                return "Blog deleted successfully.";
            }
        }
        return "Blog ID not found.";
    }


    public List<Blog> getAllBlogDb() {
        return blogs;
    }
}
