package blogPost;

import java.util.ArrayList;
import java.util.List;

public class Blog {




    private List<BlogPost> listBlogPost = new ArrayList<>();

    public void addEntry(BlogPost blogPost){
       listBlogPost.add(blogPost);
    }

    public void changeItem(int index, BlogPost BlogPost) {
        listBlogPost.set(index, BlogPost);
    }

    public void removeItem(int index){
        listBlogPost.remove(index);
    }


    @Override
    public String toString() {
        return "Blog{" +
                "listBlogPost=" + listBlogPost + listBlogPost.size() +
                '}';
    }
}
